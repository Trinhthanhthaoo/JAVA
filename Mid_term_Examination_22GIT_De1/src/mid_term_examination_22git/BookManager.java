/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid_term_examination_22git;
import com.vku.dao.BookDAO;
import com.vku.model.Book;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.File;
public class BookManager extends JFrame {

    private JTextField txtMaSach, txtTenSach, txtNhaXuatBan, txtSoLuong, txtURL, txtSQL;
    private JTable tblShowData;
    private JButton btnLoadXML, btnSaveXML;

    public BookManager() {
        setTitle("Book Manager");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
        txtMaSach = new JTextField(20);
        txtTenSach = new JTextField(20);
        txtNhaXuatBan = new JTextField(20);
        txtSoLuong = new JTextField(20);
        txtURL = new JTextField(40);
        txtSQL = new JTextField(40);

        JButton btnUpdate = new JButton("Update");
        btnUpdate.addActionListener(this::jButton1ActionPerformed);

        btnLoadXML = new JButton("Load from XML");
        btnLoadXML.addActionListener(this::loadFromXML);

        btnSaveXML = new JButton("Save to XML");
        btnSaveXML.addActionListener(this::saveToXML);

        tblShowData = new JTable(); // Initialize with a suitable table model
        JScrollPane scrollPane = new JScrollPane(tblShowData);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JLabel("Ma Sach:"));
        panel.add(txtMaSach);
        panel.add(new JLabel("Ten Sach:"));
        panel.add(txtTenSach);
        panel.add(new JLabel("Nha Xuat Ban:"));
        panel.add(txtNhaXuatBan);
        panel.add(new JLabel("So Luong:"));
        panel.add(txtSoLuong);
        panel.add(new JLabel("Database URL:"));
        panel.add(txtURL);
        panel.add(new JLabel("SQL Query:"));
        panel.add(txtSQL);
        panel.add(btnUpdate);
        panel.add(btnLoadXML);
        panel.add(btnSaveXML);
        panel.add(scrollPane);

        add(panel);
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        try {
            String maSach = txtMaSach.getText();
            String tenSach = txtTenSach.getText();
            String nhaXuatBan = txtNhaXuatBan.getText();
            int soLuong = Integer.parseInt(txtSoLuong.getText());

            Book book = new Book(maSach, tenSach, nhaXuatBan, soLuong);

            if (BookDAO.update(book)) {
                JOptionPane.showMessageDialog(this, "Cập nhật dữ liệu thành công!", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
                showDataToJTable();
            } else {
                JOptionPane.showMessageDialog(this, "Cập nhật dữ liệu thất bại!", "Hệ thống", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Cập nhật dữ liệu thất bại!", "Hệ thống", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadFromXML(ActionEvent evt) {
        try {
            File xmlFile = new File("results.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);

            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("Row");

            if (nList.getLength() > 0) {
                Element element = (Element) nList.item(0);
                txtMaSach.setText(element.getElementsByTagName("masach").item(0).getTextContent());
                txtTenSach.setText(element.getElementsByTagName("Tensach").item(0).getTextContent());
                txtNhaXuatBan.setText(element.getElementsByTagName("Nhaxuatban").item(0).getTextContent());
                txtSoLuong.setText(element.getElementsByTagName("Soluong").item(0).getTextContent());
            } else {
                JOptionPane.showMessageDialog(this, "No data found in XML!", "Load from XML", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error loading from XML: " + e.getMessage(), "Load from XML", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void saveToXML(ActionEvent evt) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            Element rootElement = doc.createElement("Results");
            doc.appendChild(rootElement);

            Element row = doc.createElement("Row");
            rootElement.appendChild(row);

            Element maSach = doc.createElement("masach");
            maSach.appendChild(doc.createTextNode(txtMaSach.getText()));
            row.appendChild(maSach);

            Element tenSach = doc.createElement("Tensach");
            tenSach.appendChild(doc.createTextNode(txtTenSach.getText()));
            row.appendChild(tenSach);

            Element nhaXuatBan = doc.createElement("Nhaxuatban");
            nhaXuatBan.appendChild(doc.createTextNode(txtNhaXuatBan.getText()));
            row.appendChild(nhaXuatBan);

            Element soLuong = doc.createElement("Soluong");
            soLuong.appendChild(doc.createTextNode(txtSoLuong.getText()));
            row.appendChild(soLuong);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("results.xml"));

            transformer.transform(source, result);

            JOptionPane.showMessageDialog(this, "Saved to results.xml successfully!", "Save to XML", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error saving to XML: " + e.getMessage(), "Save to XML", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void showDataToJTable() {
        // Implement this method to refresh the JTable with the latest data
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BookManager().setVisible(true);
        });
    }
}

