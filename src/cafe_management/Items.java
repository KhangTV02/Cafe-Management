package cafe_management;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.SQLException;
import org.apache.commons.dbutils.DbUtils;
import javax.swing.table.DefaultTableModel;

public class Items extends javax.swing.JFrame {

    public Items() {
        initComponents();
        ShowProduct();
    }
    ResultSet Rs = null, Rs1 = null;
    Connection Con = null;
    Statement st = null, st1 = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PrNameTb = new javax.swing.JTextField();
        PriceTb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PrCatCb = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        FillterCb = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        Addbtn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        Editbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProductList = new javax.swing.JTable();
        Refreshbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Cafe List");

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Category");

        PrNameTb.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PrNameTb.setForeground(new java.awt.Color(255, 51, 0));

        PriceTb.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PriceTb.setForeground(new java.awt.Color(255, 51, 0));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Name");

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Price($)");

        PrCatCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cafe", "Milk", "Coctail", "Tea", "Soda" }));
        PrCatCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrCatCbActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("TK Cafe Management");

        FillterCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cafe", "Milk", "Coctail", "Tea", "Soda" }));
        FillterCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FillterCbActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("Type");

        Addbtn.setBackground(new java.awt.Color(204, 204, 204));
        Addbtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Addbtn.setForeground(new java.awt.Color(255, 51, 0));
        Addbtn.setText("Add");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });

        Deletebtn.setBackground(new java.awt.Color(204, 204, 204));
        Deletebtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Deletebtn.setForeground(new java.awt.Color(255, 51, 0));
        Deletebtn.setText("Delete");
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });

        Editbtn.setBackground(new java.awt.Color(204, 204, 204));
        Editbtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Editbtn.setForeground(new java.awt.Color(255, 51, 0));
        Editbtn.setText("Edit");
        Editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditbtnActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(null);
        jScrollPane2.setAutoscrolls(true);

        ProductList.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        ProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Category", "Price($)"
            }
        ));
        ProductList.setRowHeight(29);
        ProductList.setRowSelectionAllowed(false);
        ProductList.setSelectionBackground(new java.awt.Color(255, 255, 255));
        ProductList.setShowGrid(false);
        ProductList.setShowHorizontalLines(true);
        ProductList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ProductList);

        Refreshbtn.setBackground(new java.awt.Color(204, 204, 204));
        Refreshbtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Refreshbtn.setForeground(new java.awt.Color(255, 51, 0));
        Refreshbtn.setText("Refresh");
        Refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(261, 261, 261)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Deletebtn)
                                .addGap(38, 38, 38)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FillterCb, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(Addbtn)
                                .addGap(14, 14, 14)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PrNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(95, 95, 95)
                        .addComponent(jLabel5)
                        .addGap(188, 363, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(PrCatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Editbtn)
                            .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Refreshbtn)
                            .addComponent(jLabel7))
                        .addGap(37, 37, 37))))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(208, 208, 208))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PriceTb, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PrCatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PrNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Deletebtn)
                    .addComponent(Addbtn)
                    .addComponent(Editbtn))
                .addGap(23, 23, 23)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FillterCb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Refreshbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE))
        );

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Logout");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("View Selling");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("View List Sellers");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(224, 224, 224)
                .addComponent(jLabel3)
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int PrNum;

    private void CountProd() {
        try {
            st1 = Con.createStatement();
            Rs1 = st1.executeQuery("select Max {PNum} from ProductTb1");
            Rs1.next();
            PrNum = Rs1.getInt(1) + 1;
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    private void ShowProduct() {
        DefaultTableModel model = (DefaultTableModel) ProductList.getModel();
        model.setRowCount(0);
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost/cafedb?" + "user=root");
            Statement st = Con.createStatement();
            ResultSet Rs = st.executeQuery("select * from ProductTb1");
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getInt(1), Rs.getString(2), Rs.getString(3), Rs.getInt(4)});
            }
        } catch (Exception e) {
        }
    }

    private void FillterProducts() {
        DefaultTableModel model = (DefaultTableModel) ProductList.getModel();
        model.setRowCount(0);
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost/cafedb?" + "user=root");
            Statement st = Con.createStatement();
            ResultSet Rs = st.executeQuery("select * from ProductTb1 where Category='" + FillterCb.getSelectedItem().toString() + "'");
            while (Rs.next()) {

                model.addRow(new Object[]{Rs.getInt(1), Rs.getString(2), Rs.getString(3), Rs.getInt(4)});
            }
        } catch (Exception e) {
        }
    }
    private void PrCatCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrCatCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrCatCbActionPerformed

    private void FillterCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FillterCbActionPerformed
        FillterProducts();
    }//GEN-LAST:event_FillterCbActionPerformed

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        if (PrNameTb.getText().isEmpty() || PriceTb.getText().isEmpty() || PrCatCb.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
            try {
                CountProd();
                Con = DriverManager.getConnection("jdbc:mysql://localhost/cafedb?" + "user=root");

                // Use a CallableStatement to call the stored procedure
                String storedProcedureCall = "{CALL AddItem(?, ?, ?)}";
                try (CallableStatement cst = Con.prepareCall(storedProcedureCall)) {
                    cst.setString(1, PrNameTb.getText());
                    cst.setString(2, PrCatCb.getSelectedItem().toString());
                    cst.setInt(3, Integer.valueOf(PriceTb.getText()));
                    cst.executeUpdate();
                }

                JOptionPane.showMessageDialog(this, "Item Added!!");
                Con.close();
                DefaultTableModel model = (DefaultTableModel) ProductList.getModel();
                model.setRowCount(0);
                ShowProduct();
            } catch (Exception ex) {
                System.out.println("Connection not successful");
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_AddbtnActionPerformed

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        if (PrNameTb.getText().isEmpty() || PriceTb.getText().isEmpty() || PrCatCb.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
            try {
                CountProd();
                Con = DriverManager.getConnection("jdbc:mysql://localhost/cafedb?" + "user=root");

                // Use a CallableStatement to call the stored procedure
                String storedProcedureCall = "{CALL DeleteItem(?)}";
                try (CallableStatement cst = Con.prepareCall(storedProcedureCall)) {
                    cst.setInt(1, key);
                    cst.executeUpdate();
                }

                JOptionPane.showConfirmDialog(this, "Delete this item ?");
                Con.close();
                DefaultTableModel model = (DefaultTableModel) ProductList.getModel();
                model.setRowCount(0);
                ShowProduct();
            } catch (Exception ex) {
                System.out.println("Connection not successful");
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeletebtnActionPerformed

    private void EditbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditbtnActionPerformed
        if (PrNameTb.getText().isEmpty() || PriceTb.getText().isEmpty() || PrCatCb.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
            try {
                CountProd();
                Con = DriverManager.getConnection("jdbc:mysql://localhost/cafedb?" + "user=root");

                // Use a CallableStatement to call the stored procedure
                String storedProcedureCall = "{CALL UpdateItem(?, ?, ?, ?)}";
                try (CallableStatement cst = Con.prepareCall(storedProcedureCall)) {
                    cst.setInt(1, key);
                    cst.setString(2, PrNameTb.getText());
                    cst.setString(3, PrCatCb.getSelectedItem().toString());
                    cst.setInt(4, Integer.valueOf(PriceTb.getText()));
                    cst.executeUpdate();
                }

                JOptionPane.showMessageDialog(this, "Item Updated!!");
                Con.close();
                DefaultTableModel model = (DefaultTableModel) ProductList.getModel();
                ShowProduct();
            } catch (Exception ex) {
                System.out.println("Connection not successful");
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditbtnActionPerformed
    int key = 0;
    private void ProductListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductListMouseClicked
        DefaultTableModel model = (DefaultTableModel) ProductList.getModel();
        int myindex = ProductList.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(myindex, 0).toString());
        PrNameTb.setText(model.getValueAt(myindex, 1).toString());
//         PrCatCb.setText(model.getValueAt(myindex, 2).toString());
        PriceTb.setText(model.getValueAt(myindex, 3).toString());
    }//GEN-LAST:event_ProductListMouseClicked

    private void RefreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshbtnActionPerformed
        PrNameTb.setText("");
        PriceTb.setText("");
        ShowProduct();        // TODO add your handling code here:
    }//GEN-LAST:event_RefreshbtnActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        Selling SellingFrame = new Selling();
        SellingFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        ViewSells ViewSellsFrame = new ViewSells();
        ViewSellsFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JButton Editbtn;
    private javax.swing.JComboBox<String> FillterCb;
    private javax.swing.JComboBox<String> PrCatCb;
    private javax.swing.JTextField PrNameTb;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JTable ProductList;
    private javax.swing.JButton Refreshbtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
