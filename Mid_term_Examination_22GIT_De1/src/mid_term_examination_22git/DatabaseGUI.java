package mid_term_examination_22git;

import com.vku.common.Database;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DatabaseGUI extends JFrame {

    private JTextField txtURL, txtSQL;
    private JButton btnExecute, btnReset, btnCancel;
    private JTextArea txtResult;

    public DatabaseGUI() {
        setTitle("Database Query Executor");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
        txtURL = new JTextField("jdbc:sqlserver://localhost\\SQLEXPRESS;database=DoAnCk;integratedSecurity=true;");
        txtSQL = new JTextField("SELECT * FROM Sach");
        btnExecute = new JButton("Execute");
        btnReset = new JButton("Reset");
        btnCancel = new JButton("Cancel");
        txtResult = new JTextArea(10, 50);
        txtResult.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(txtResult);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JLabel("Database URL:"));
        panel.add(txtURL);
        panel.add(new JLabel("SQL Query:"));
        panel.add(txtSQL);
        panel.add(btnExecute);
        panel.add(btnReset);
        panel.add(btnCancel);
        panel.add(scrollPane);

        add(panel);

        btnExecute.addActionListener(new ExecuteButtonListener());
        btnReset.addActionListener(e -> resetFields());
        btnCancel.addActionListener(e -> cancelProgram());
    }

    private void resetFields() {
        txtURL.setText("");
        txtSQL.setText("");
        txtResult.setText("");
    }

    private void cancelProgram() {
        System.exit(0);
    }

  private class ExecuteButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String url = txtURL.getText();
        String sql = txtSQL.getText();
        
        // Thực hiện truy vấn
        executeQuery(url, sql);
    }
}
private void executeQuery(String url, String sql) {
    try (Connection connection = Database.getConnection(url)) {
        Statement statement = connection.createStatement();
        
        // Kiểm tra loại truy vấn và thực thi tương ứng
        if (sql.trim().toLowerCase().startsWith("select")) {
            ResultSet rs = statement.executeQuery(sql);
            displayResults(rs);
            saveResultsToXML(rs);
        } else if (sql.trim().toLowerCase().startsWith("delete")) {
            int updateCount = statement.executeUpdate(sql);
            txtResult.setText("DELETE query executed successfully. Rows affected: " + updateCount);
            
            // Nếu có dòng bị ảnh hưởng, thực hiện truy vấn SELECT để hiển thị dữ liệu mới
            if (updateCount > 0) {
                String selectQuery = "SELECT * FROM Sach";
                ResultSet rs = statement.executeQuery(selectQuery);
                displayResults(rs);
            }
        } else {
            // Thực hiện các loại truy vấn khác ở đây (ví dụ: INSERT, UPDATE)
            int updateCount = statement.executeUpdate(sql);
            txtResult.setText("Query executed successfully. Rows affected: " + updateCount);
        }
    } catch (SQLException ex) {
        txtResult.setText("SQL Error: " + ex.getMessage());
    } catch (Exception ex) {
        txtResult.setText("Error: " + ex.getMessage());
    }
}

    private void displayResults(ResultSet rs) throws SQLException {
        StringBuilder results = new StringBuilder();
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        for (int i = 1; i <= columnCount; i++) {
            results.append(rsmd.getColumnName(i)).append("\t");
        }
        results.append("\n");

        while (rs.next()) {
            for (int i = 1; i <= columnCount; i++) {
                results.append(rs.getString(i)).append("\t");
            }
            results.append("\n");
        }

        txtResult.setText(results.toString());
    }

    private void saveResultsToXML(ResultSet rs) throws Exception {
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();

        Element rootElement = doc.createElement("Results");
        doc.appendChild(rootElement);

        while (rs.next()) {
            Element row = doc.createElement("Row");
            rootElement.appendChild(row);

            for (int i = 1; i <= columnCount; i++) {
                String columnName = rsmd.getColumnName(i);
                String value = rs.getString(i);

                Element column = doc.createElement(columnName);
                column.appendChild(doc.createTextNode(value));
                row.appendChild(column);
            }
        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("results.xml"));

        transformer.transform(source, result);

        JOptionPane.showMessageDialog(this, "Results saved to results.xml");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DatabaseGUI().setVisible(true);
        });
    }
}
