
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import sun.rmi.runtime.Log;


public class FileExplorer extends javax.swing.JFrame {
    public static void copyfile(File source, File dest) throws IOException{
        Files.copy(source.toPath(), dest.toPath());
    }
    
    
    public FileExplorer() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        word = new javax.swing.JLabel();
        excel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCopy = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnRename = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        btnDelete2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txtPath = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(114, 151, 188));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("File Manager");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1368, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.setForeground(new java.awt.Color(51, 62, 178));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(128, 171, 200));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/My-Pictures-icon.png"))); // NOI18N
        jLabel2.setText("Image");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Documents-icon.png"))); // NOI18N
        jLabel3.setText("Document");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Movies-icon.png"))); // NOI18N
        jLabel4.setText("Video");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        word.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        word.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Word-icon.png"))); // NOI18N
        word.setText("Word");
        word.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wordMouseClicked(evt);
            }
        });

        excel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        excel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Excel-icon.png"))); // NOI18N
        excel.setText("Excel");
        excel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excelMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/PC-a-icon.png"))); // NOI18N
        jLabel8.setText("This PC");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(word)
                    .addComponent(excel)
                    .addComponent(jLabel8))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(63, 63, 63)
                .addComponent(jLabel3)
                .addGap(52, 52, 52)
                .addComponent(jLabel4)
                .addGap(78, 78, 78)
                .addComponent(word)
                .addGap(68, 68, 68)
                .addComponent(excel)
                .addGap(75, 75, 75)
                .addComponent(jLabel8)
                .addGap(39, 39, 39))
        );

        btnCopy.setBackground(new java.awt.Color(128, 171, 200));
        btnCopy.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/folder-blue-copy-cloud-icon.png"))); // NOI18N
        btnCopy.setText("Copy");
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(128, 171, 200));
        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Save-icon.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnRename.setBackground(new java.awt.Color(128, 171, 200));
        btnRename.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRename.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Rename-icon.png"))); // NOI18N
        btnRename.setText("Rename");
        btnRename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenameActionPerformed(evt);
            }
        });

        btnDelete1.setBackground(new java.awt.Color(128, 171, 200));
        btnDelete1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Delete-icon.png"))); // NOI18N
        btnDelete1.setText("Delete");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        btnDelete2.setBackground(new java.awt.Color(128, 171, 200));
        btnDelete2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDelete2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit-new-document-icon.png"))); // NOI18N
        btnDelete2.setText("Create");
        btnDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete2ActionPerformed(evt);
            }
        });

        txtPath.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Search.png"))); // NOI18N

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(128, 171, 200));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/open-file-icon.png"))); // NOI18N
        jButton1.setText("Open");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(btnCopy)
                        .addGap(81, 81, 81)
                        .addComponent(btnDelete1)
                        .addGap(89, 89, 89)
                        .addComponent(btnRename)
                        .addGap(84, 84, 84)
                        .addComponent(btnDelete2)
                        .addGap(81, 81, 81)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCopy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRename, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Home", jPanel3);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        JFileChooser chooser = new JFileChooser();
//        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
//        int result = chooser.showOpenDialog(this);
//        if (result == JFileChooser.APPROVE_OPTION) {
//            String path = chooser.getSelectedFile().getAbsolutePath();
//            txtPath.setText(path);
//            txtArea.setText(listAllFiles(path,0));
//        }
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int result = chooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            String path = chooser.getSelectedFile().getAbsolutePath();
            txtPath.setText(path);
            txtArea.setText(displayDirectoryTree(new File(path), "", true));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete2ActionPerformed
        Create c = new Create();
        c.show();
    }//GEN-LAST:event_btnDelete2ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        try{
          File fi = new File(txtPath.getText());
          if(fi.delete()){
              JOptionPane.showMessageDialog(this, "Xóa file thành công");
              txtArea.setText("");
              txtPath.setText("");
          }
      }catch(Exception e){
          e.printStackTrace();
      }
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnRenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenameActionPerformed
        String newFileName = JOptionPane.showInputDialog(this, "Nhập tên file");
        try {
            // file cũ
            String path = txtPath.getText();
            // java corn
            File myFile = new File(txtPath.getText());
            //new file
            String newPath = myFile.getParent() + "\\" + newFileName;
            File newFile = new File(newPath);
            if(  myFile.renameTo(newFile)){
                txtPath.setText(newFile.getAbsolutePath());
                JOptionPane.showMessageDialog(this, "Đổi tên file thành công");
            }else{
                JOptionPane.showMessageDialog(this, "Đổi tên file thất bại");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRenameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String filePath = txtPath.getText();
        if(filePath.isEmpty()){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một vị trí để lưu file.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try (FileOutputStream fout = new FileOutputStream(filePath)){
            String s = txtArea.getText();
            byte[] b = s.getBytes();
            fout.write(b);
            JOptionPane.showMessageDialog(this, "Lưu dữ liệu thành công");
            txtArea.setText("");
            txtPath.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi lưu dữ liệu" + e.getMessage(), "Hệ thống", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        try {
            File sourceFile = new File(txtPath.getText());
            JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView());
            fileChooser.showSaveDialog(null);
            int result = fileChooser.showOpenDialog(this);

            if (result == JFileChooser.APPROVE_OPTION) {
                File destFile = fileChooser.getSelectedFile();
                copyfile(sourceFile, destFile);
                JOptionPane.showMessageDialog(this, "Copy file thành công");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnCopyActionPerformed

    private void excelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excelMouseClicked
       JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Documents", "xlsx");
    fileChooser.setFileFilter(filter);

    int result = fileChooser.showOpenDialog(null);

    if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        String filePath = selectedFile.getAbsolutePath();

        // Kiểm tra nếu là file Excel (xlsx)
        if (filePath.toLowerCase().endsWith(".xlsx")) {
            readXLSXFile(filePath);
            txtPath.setText(filePath);
        } else {
            JOptionPane.showMessageDialog(null, "Chọn một file Excel (xlsx) hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_excelMouseClicked

    private void wordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wordMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Word Documents", "docx");
        fileChooser.setFileFilter(filter);

        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();

            // Kiểm tra nếu là file Word (docx)
            if (filePath.toLowerCase().endsWith(".docx")) {
                readDocxFile(filePath);
                txtPath.setText(filePath);
            } else {
                JOptionPane.showMessageDialog(null, "Chọn một file Word (docx) hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_wordMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView());
        j.showSaveDialog(null);
        int result = j.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File fi = j.getSelectedFile();
            String f = fi.getPath();
            String line;
            txtPath.setText(f);
            try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
                StringBuilder content = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
                txtArea.setText(content.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        try {
            JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Image files", "png", "jpg");
            fileChooser.setFileFilter(filter);

            int result = fileChooser.showOpenDialog(null);
            System.out.println("Result: " + result);

            File selectedFile = null; // Declare outside the if block

            if (result == JFileChooser.APPROVE_OPTION) {
                selectedFile = fileChooser.getSelectedFile();
                System.out.println("Filepath: " + selectedFile.getAbsolutePath());

                if (!Desktop.isDesktopSupported()) {
                    System.out.println("Not supported");
                    return;
                } else {
                    Desktop desktop = Desktop.getDesktop();
                    desktop.open(selectedFile);
                }
            } else if (result == JFileChooser.CANCEL_OPTION) {
                System.out.println("Cancelled.");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Explorer2 e = new Explorer2();
        e.show();
        this.hide();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        try {
            JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Video files", "mp4", "avi", "mkv");
            fileChooser.setFileFilter(filter);

            int result = fileChooser.showOpenDialog(null);
            System.out.println("Result: " + result);

            File selectedFile = null; // Declare outside the if block

            if (result == JFileChooser.APPROVE_OPTION) {
                selectedFile = fileChooser.getSelectedFile();
                System.out.println("Filepath: " + selectedFile.getAbsolutePath());

                if (!Desktop.isDesktopSupported()) {
                    System.out.println("Not supported");
                    return;
                } else {
                    Desktop desktop = Desktop.getDesktop();
                    desktop.open(selectedFile);
                }
            } else if (result == JFileChooser.CANCEL_OPTION) {
                System.out.println("Cancelled.");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileExplorer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnDelete2;
    private javax.swing.JButton btnRename;
    private javax.swing.JButton btnSave;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JLabel excel;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtPath;
    private javax.swing.JLabel word;
    // End of variables declaration//GEN-END:variables
    private void readDocxFile(String filePath) {
        try {
            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());

            XWPFDocument document = new XWPFDocument(fis);

            List<XWPFParagraph> paragraphs = document.getParagraphs();

            StringBuilder content = new StringBuilder();

            for (XWPFParagraph para : paragraphs) {
                content.append(para.getText()).append("\n");
            }

            txtArea.setText(content.toString());

            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

  private void readXLSXFile(String file) {
    try {
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file));
        XSSFSheet sheet = workbook.getSheetAt(0);
        StringBuilder content = new StringBuilder();

        // Đọc tiêu đề cột và thêm vào content
        Row headerRow = sheet.getRow(0);
        for (Cell headerCell : headerRow) {
            content.append(String.format("%-20s", headerCell.toString())).append("\t");
        }
        content.append("\n");

        // Lặp qua từng hàng (bỏ qua hàng tiêu đề)
        for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
            Row row = sheet.getRow(rowIndex);
            if (row != null) {
                // Lặp qua từng ô trong hàng và thêm vào content
                for (Cell cell : row) {
                    content.append(String.format("%-20s", cell.toString())).append("\t");
                }
                content.append("\n"); // Xuống dòng sau khi kết thúc mỗi hàng
            }
        }

        // Hiển thị nội dung trong textarea
        txtArea.setText(content.toString());
    } catch (IOException e) {
        e.printStackTrace();
    }
}




    private String listAllFiles(String path, int level) {
        File myFile = new File(path);
        if (!myFile.exists()) {
            return "";
        }
        String result = " ";
        for (int i = 0; i < level; i++) {
            result += "\t";
        }
        result += myFile.getName() + "\n";
        if (myFile.isFile()) {
            return result;
        }

        for (File f : myFile.listFiles()) {
            result += listAllFiles(f.getAbsolutePath(), level + 1);
        }

        return result + "\n";
    }

//    private List<Path> findFilesByName(Path directoryPath, String fileNameToSearch) throws IOException {
//        List<Path> foundFiles = new ArrayList<>();
//        Files.walk(directoryPath)
//                .filter(path -> Files.isRegularFile(path) && path.getFileName().toString().equals(fileNameToSearch))
//                .forEach(foundFiles::add);
//        return foundFiles;
//    }

    private String displayDirectoryTree(File dir, String indent, boolean isLast) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent);
        if (isLast) {
            sb.append("└── ");
            indent += "    ";
        } else {
            sb.append("├── ");
            indent += "│   ";
        }
        sb.append(dir.getName()).append(" (").append(getDirectorySize(dir)).append(" bytes)").append("\n");

        File[] files = dir.listFiles();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                boolean last = (i == files.length - 1);
                if (files[i].isDirectory()) {
                    sb.append(displayDirectoryTree(files[i], indent, last));
                } else {
                    sb.append(displayFile(files[i], indent, last));
                }
            }
        }

        return sb.toString();
    }

  private long getDirectorySize(File dir) {
        long size = 0;
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    size += file.length();
                } else {
                    size += getDirectorySize(file);
                }
            }
        }
        return size;
    }


   private String displayFile(File file, String indent, boolean isLast) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent);
        if (isLast) {
            sb.append("└── ");
        } else {
            sb.append("├── ");
        }
        sb.append(file.getName()).append(" (").append(file.length()).append(" bytes)").append("\n");
        return sb.toString();
    }
    
}
