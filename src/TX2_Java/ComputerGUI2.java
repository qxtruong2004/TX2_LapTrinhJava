package TX2_Java;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ComputerGUI2 extends javax.swing.JFrame {
    //khởi tạo 1 biến đối tượng
    private ComputerManagerIMPL computerManagerIMPL;
    //khai báo một biến đối tượng frame của lớp JFrame
    private JFrame frame; 

    public ComputerGUI2() {
        computerManagerIMPL = new ComputerManagerIMPL();
        computerManagerIMPL.generateList(5);
        initComponents(); //khởi tạo giao diện
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Title = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_searchName = new javax.swing.JTextField();
        jButton_searchName = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_Sort = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jButton_ADD = new javax.swing.JButton();
        jButton_EDIT = new javax.swing.JButton();
        jButton_DELETE = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableModel = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_InoutID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_PriceInput = new javax.swing.JTextField();
        jTextField_NameInput = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_ColorInput = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_TotalInput = new javax.swing.JTextField();
        jTextField_MaterialInput = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField_StyleInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jLabel_Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_Title.setText("COMPUTER_MANAGER");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Enter computer information: ");

        jTextField_searchName.setToolTipText("");
        jTextField_searchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_searchNameActionPerformed(evt);
            }
        });

        jButton_searchName.setBackground(new java.awt.Color(0, 153, 0));
        jButton_searchName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_searchName.setForeground(new java.awt.Color(255, 255, 255));
        jButton_searchName.setText("Search");
        jButton_searchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Sort by:");

        jComboBox_Sort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acsending Price", "Desending Price", " " }));
        jComboBox_Sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_SortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_searchName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton_searchName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_Sort, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_searchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_searchName)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox_Sort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_ADD.setBackground(new java.awt.Color(20, 100, 244));
        jButton_ADD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_ADD.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ADD.setText("ADD");
        jButton_ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ADDActionPerformed(evt);
            }
        });

        jButton_EDIT.setBackground(new java.awt.Color(102, 51, 0));
        jButton_EDIT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_EDIT.setForeground(new java.awt.Color(255, 255, 255));
        jButton_EDIT.setText("EDIT");
        jButton_EDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EDITActionPerformed(evt);
            }
        });

        jButton_DELETE.setBackground(new java.awt.Color(255, 0, 0));
        jButton_DELETE.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_DELETE.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DELETE.setText("DELETE BY ID");
        jButton_DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DELETEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jButton_ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addComponent(jButton_EDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ADD)
                    .addComponent(jButton_EDIT)
                    .addComponent(jButton_DELETE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("List Computer");

        tableModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Total", "Color", "Material", "Style"
            }
        ));
        jScrollPane1.setViewportView(tableModel);
        loadTableData();

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Computer's Infomation");

        jLabel6.setText("ID");

        jTextField_InoutID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_InoutIDActionPerformed(evt);
            }
        });

        jLabel7.setText("Name");

        jLabel8.setText("Price");

        jTextField_PriceInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PriceInputActionPerformed(evt);
            }
        });

        jTextField_NameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NameInputActionPerformed(evt);
            }
        });

        jLabel9.setText("Total");

        jTextField_ColorInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ColorInputActionPerformed(evt);
            }
        });

        jLabel10.setText("Material");

        jLabel11.setText("Color");

        jTextField_TotalInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TotalInputActionPerformed(evt);
            }
        });

        jTextField_MaterialInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_MaterialInputActionPerformed(evt);
            }
        });

        jLabel12.setText("Style");

        jTextField_StyleInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_StyleInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(406, 406, 406)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField_InoutID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(jTextField_PriceInput))
                            .addComponent(jTextField_NameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_ColorInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jTextField_TotalInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_MaterialInput))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jTextField_StyleInput, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_InoutID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_TotalInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jTextField_ColorInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField_StyleInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_NameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_MaterialInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_PriceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //cập nhật dữ liệu bảng Jtable
    private void updateTableData(List<Computer> computers) {
        // lấy MH dl của JTable và ép kiểu về DefaultTableModel, cho phép ta thêm sửa xóa
        DefaultTableModel model = (DefaultTableModel) tableModel.getModel();
        model.setRowCount(0); //// Xóa tất cả các hàng hiện có trong mô hình bảng
        // Duyệt qua danh sách các đối tượng Computer và thêm từng đối tượng vào bảng
        for (Computer computer : computers) {
            model.addRow(new Object[]{computer.getProduct_id(), computer.getProduct_name(), computer.getProduct_price(), computer.getProduct_total(), computer.getColor(), computer.getMaterial(), computer.getStyle()});
        }
       
    }
    
    // tải và cập nhật dữ liệu từ danh sách máy tính (Computer) lên bảng (JTable)
    private void loadTableData() {
        List<Computer> computerList = computerManagerIMPL.getComputers();
        updateTableData(computerList);
    }


    private void jComboBox_SortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_SortActionPerformed
        sortActionPerformed(evt);
    }//GEN-LAST:event_jComboBox_SortActionPerformed

    //sap xep
    private void sortActionPerformed(ActionEvent evt) {
        String sortOption = jComboBox_Sort.getSelectedItem().toString(); //lấy giá trị được chọn từ JComboBox
        List<Computer> sortedList;
        if (sortOption.equals("Acsending Price")) { //ss giá trị lấy được
            sortedList = computerManagerIMPL.sortedComputer(1);
        } else {
            sortedList = computerManagerIMPL.sortedComputer(0);
        }
        updateTableData(sortedList);
    }

    //edit
    private void jButton_EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EDITActionPerformed
        try {
            //lấy ra các giá trị mà người dùng nhập
            int id = Integer.parseInt(jTextField_InoutID.getText());
            String name = jTextField_NameInput.getText();
            double price = Double.parseDouble(jTextField_PriceInput.getText());
            int total = Integer.parseInt(jTextField_TotalInput.getText());
            String color = jTextField_ColorInput.getText();
            String material = jTextField_MaterialInput.getText();
            String style = jTextField_StyleInput.getText();

            //Lấy danh sách máy tính hiện tại từ computerManagerIMPL.
            List<Computer> computers = computerManagerIMPL.getComputers();
            boolean found = false;
            for (Computer computer : computers) {
                if (computer.getProduct_id() == id) {
                    found = true;
                    break;
                }
            }
            if (!found) { //true
                JOptionPane.showMessageDialog(frame, "Not found ID", "Error", JOptionPane.ERROR_MESSAGE);
                jTextField_InoutID.setText("");
                jTextField_NameInput.setText("");
                jTextField_PriceInput.setText("");
                jTextField_ColorInput.setText("");
                jTextField_TotalInput.setText("");
                jTextField_MaterialInput.setText("");
                jTextField_StyleInput.setText("");
                return;//nếu id đã tồn tại thì không thêm vào danh sách nữa
            }
            else{
                Computer computer = new Computer(id, name, price, total, color, material, style);
                computerManagerIMPL.editComputer(computer);
                loadTableData();
                jTextField_InoutID.setText("");
                jTextField_NameInput.setText("");
                jTextField_PriceInput.setText("");
                jTextField_ColorInput.setText("");
                jTextField_TotalInput.setText("");
                jTextField_MaterialInput.setText("");
                jTextField_StyleInput.setText("");
            }
        } catch (NumberFormatException e) { //người dùng không nhập gì
            JOptionPane.showMessageDialog(frame, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_EDITActionPerformed

    //del
    private void jButton_DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DELETEActionPerformed
        try {
            int id = Integer.parseInt(jTextField_InoutID.getText()); 
             //Lấy danh sách máy tính hiện tại từ computerManagerIMPL.
            List<Computer> computers = computerManagerIMPL.getComputers();
            boolean flag = false;
            for (Computer c : computers) {
                if (c.getProduct_id() == id) {
                    computerManagerIMPL.delComputer(c);
                    loadTableData();
                    flag = true;
                }
                jTextField_InoutID.setText("");
            }
            if (!flag) {
                JOptionPane.showMessageDialog(frame, "Not found ID", "Error", JOptionPane.ERROR_MESSAGE);
                return;//nếu id đã tồn tại thì báo lỗi
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_DELETEActionPerformed

    private void jTextField_searchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_searchNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_searchNameActionPerformed

    private void jTextField_InoutIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_InoutIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_InoutIDActionPerformed

    private void jTextField_PriceInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PriceInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PriceInputActionPerformed

    private void jTextField_NameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NameInputActionPerformed

    private void jTextField_ColorInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ColorInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ColorInputActionPerformed

    private void jTextField_TotalInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TotalInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TotalInputActionPerformed

    private void jTextField_MaterialInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_MaterialInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_MaterialInputActionPerformed

    private void jTextField_StyleInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_StyleInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_StyleInputActionPerformed

    //tim kiem theo ten
    private void searchComputer(String name) {
        //Kết quả của tìm kiếm được lưu trữ trong danh sách searchResults.
        List<Computer> searchResults = computerManagerIMPL.searchComputers(name);
        updateTableData(searchResults);
    }
    private void jButton_searchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchNameActionPerformed
        String keyword = jTextField_searchName.getText();
        searchComputer(keyword);
    }//GEN-LAST:event_jButton_searchNameActionPerformed

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    //ham add
    private void jButton_ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ADDActionPerformed
        try {
        // Lấy dữ liệu từ các JTextField
        int id = Integer.parseInt(jTextField_InoutID.getText());
        String name = jTextField_NameInput.getText();
        double price = Double.parseDouble(jTextField_PriceInput.getText());
        int total = Integer.parseInt(jTextField_TotalInput.getText());
        String color = jTextField_ColorInput.getText();
        String material = jTextField_MaterialInput.getText();
        String style = jTextField_StyleInput.getText();

        // Kiểm tra xem id đã tồn tại chưa
        List<Computer> computers = computerManagerIMPL.getComputers();
        for (Computer computer : computers) {
            if (computer.getProduct_id() == id) {
                JOptionPane.showMessageDialog(frame, "ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Nếu id đã tồn tại thì không thêm vào danh sách nữa
            }
        }

        // Thêm máy tính mới vào danh sách và lưu vào tệp
        Computer computer = new Computer(id, name, price, total, color, material, style);
        computerManagerIMPL.addComputer(computer);
        loadTableData();

        // Xóa dữ liệu trong các JTextField sau khi thêm
        jTextField_InoutID.setText("");
        jTextField_NameInput.setText("");
        jTextField_PriceInput.setText("");
        jTextField_TotalInput.setText("");
        jTextField_ColorInput.setText("");
        jTextField_MaterialInput.setText("");
        jTextField_StyleInput.setText("");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(frame, "Invalid input. Please enter correct data types.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton_ADDActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ComputerGUI2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ADD;
    private javax.swing.JButton jButton_DELETE;
    private javax.swing.JButton jButton_EDIT;
    private javax.swing.JButton jButton_searchName;
    private javax.swing.JComboBox<String> jComboBox_Sort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField_ColorInput;
    private javax.swing.JTextField jTextField_InoutID;
    private javax.swing.JTextField jTextField_MaterialInput;
    private javax.swing.JTextField jTextField_NameInput;
    private javax.swing.JTextField jTextField_PriceInput;
    private javax.swing.JTextField jTextField_StyleInput;
    private javax.swing.JTextField jTextField_TotalInput;
    private javax.swing.JTextField jTextField_searchName;
    private javax.swing.JTable tableModel;
    // End of variables declaration//GEN-END:variables

    
}
