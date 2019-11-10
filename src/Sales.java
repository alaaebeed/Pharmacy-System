
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alaa
 */
public class Sales extends javax.swing.JFrame {

    PreparedStatement ps;
    ResultSet rs = null;

    public Sales() {
        initComponents();
        showTableData();
        getSum();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabelWelcome = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        totalBill = new javax.swing.JButton();
        tPrice = new javax.swing.JTextField();
        cureName = new javax.swing.JTextField();
        cureCode = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        rPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBill = new javax.swing.JTable();
        addToBill = new javax.swing.JButton();
        billDelete = new javax.swing.JButton();
        clearAction = new javax.swing.JButton();
        home = new javax.swing.JButton();
        billNumber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel6.setBackground(new java.awt.Color(110, 136, 246));

        jLabelWelcome.setFont(new java.awt.Font("Noto Sans Mono CJK KR Bold", 1, 24)); // NOI18N
        jLabelWelcome.setForeground(new java.awt.Color(253, 251, 251));
        jLabelWelcome.setText("Sales");

        jLabelClose.setBackground(new java.awt.Color(255, 250, 250));
        jLabelClose.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(254, 254, 254));
        jLabelClose.setText("X");
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMin.setBackground(new java.awt.Color(255, 250, 250));
        jLabelMin.setFont(new java.awt.Font("Liberation Mono", 1, 36)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(254, 254, 254));
        jLabelMin.setText("-");
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Cure Name:");

        totalBill.setText("get Total");
        totalBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBillActionPerformed(evt);
            }
        });

        cureCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cureCodeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Total Price");

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Cure Code");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Amount:");

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Retial Price:");

        tableBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CureCode", "CureName", "Amount", "RetialPrice", "TotalPrice"
            }
        ));
        tableBill.getTableHeader().setReorderingAllowed(false);
        tableBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBillMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBill);

        addToBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java/icons/addBill.png"))); // NOI18N
        addToBill.setText("Add To bill");
        addToBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToBillActionPerformed(evt);
            }
        });

        billDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java/icons/clear.png"))); // NOI18N
        billDelete.setText("Remove from Bill");
        billDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billDeleteActionPerformed(evt);
            }
        });

        clearAction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java/icons/clean.png"))); // NOI18N
        clearAction.setText("clean");
        clearAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionActionPerformed(evt);
            }
        });

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java/icons/home.png"))); // NOI18N
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        billNumber.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        billNumber.setForeground(new java.awt.Color(253, 251, 251));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabelWelcome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelMin))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rPrice)
                            .addComponent(amount)
                            .addComponent(cureCode)
                            .addComponent(cureName)
                            .addComponent(tPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(totalBill, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(addToBill, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(billDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clearAction, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))))
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addGap(157, 157, 157))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(567, 567, 567)
                .addComponent(billNumber)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabelWelcome)
                        .addGap(230, 230, 230)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cureCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cureName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalBill)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(billNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(home)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addToBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(billDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearAction, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(461, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addToBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToBillActionPerformed
        // TODO add your handling code here:
        String cure_code = cureCode.getText();
        String cure_name = cureName.getText();
        String amnt = amount.getText();
        String r_Price = rPrice.getText();
        String t_Price = tPrice.getText();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        formatter.format(date);
        Date time = date;
        PreparedStatement ps;
        String query = "INSERT INTO `Bill`(`cureCode`, `cureName`, `amount`, `rPrice`,`tPrice`, `date`) VALUES (?,?,?,?,?,?)";
        String queryI = "UPDATE `CureInfo` SET amount=amount-? WHERE code=?";
        String queryII = "INSERT INTO `salesReview`(`cureCode`, `cureName`, `amount`, `rPrice`, `tPrice`, `date`) VALUES (?,?,?,?,?,?)";
        try {
            ps = DbConnect.getconnection().prepareStatement(query);
            ps.setString(1, cure_code);
            ps.setString(2, cure_name);
            ps.setString(3, amnt);
            ps.setString(4, r_Price);
            ps.setString(5, t_Price);
            ps.setString(6, formatter.format(date));
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Done !");
            }
            ps = DbConnect.getconnection().prepareStatement(queryI);
            ps.setString(1, amnt);
            ps.setString(2, cure_code);
            ps.executeUpdate();
            ps = DbConnect.getconnection().prepareStatement(queryII);
            ps.setString(1, cure_code);
            ps.setString(2, cure_name);
            ps.setString(3, amnt);
            ps.setString(4, r_Price);
            ps.setString(5, t_Price);
            ps.setString(6, formatter.format(date));
            ps.executeUpdate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        showTableData();
        getSum();
    }//GEN-LAST:event_addToBillActionPerformed

    private void tableBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBillMouseClicked
        // TODO add your handling code here:
        int i = tableBill.getSelectedRow();
        TableModel model = tableBill.getModel();
        cureCode.setText(model.getValueAt(i, 0).toString());
        cureName.setText(model.getValueAt(i, 1).toString());
        amount.setText(model.getValueAt(i, 2).toString());
        rPrice.setText(model.getValueAt(i, 3).toString());
        tPrice.setText(model.getValueAt(i, 4).toString());
    }//GEN-LAST:event_tableBillMouseClicked

    private void billDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billDeleteActionPerformed
        // TODO add your handling code here:
        String cure_code = cureCode.getText();
        String amnt = amount.getText();

        PreparedStatement ps;
        String query = "DELETE FROM `Bill` WHERE `cureCode`=?";
        String queryI = "UPDATE `CureInfo` SET amount=amount+? WHERE code=?";

        try {
            ps = DbConnect.getconnection().prepareStatement(query);
            ps.setString(1, cure_code);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Done !");
            }
            ps = DbConnect.getconnection().prepareStatement(queryI);
            ps.setString(2, amnt);
            ps.setString(1, cure_code);
            ps.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        showTableData();
        getSum();
    }//GEN-LAST:event_billDeleteActionPerformed

    //Search with jtext field 
    private void cureCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cureCodeActionPerformed
        // TODO add your handling code here:
        ResultSet rs = null;
        String cure_name = "cureName";
        String amnt = "amount";
        String tabs_number = "tabsNumber";
        String r_Price = "retialPrice";
        String t_Price = "totalPrice";
        rs = find(cureCode.getText());
        try {
            if (rs.next()) {
                cureName.setText(rs.getString("cureName"));
                amount.setText(rs.getString("amount"));
                rPrice.setText(rs.getString("retialPrice"));
                tPrice.setText(rs.getString("totalPrice"));

            } else {
                JOptionPane.showMessageDialog(null, "NO Cure for this codes");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_cureCodeActionPerformed

    private void clearActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionActionPerformed

        String query = "DELETE  FROM `Bill`";
        try {
            ps = DbConnect.getconnection().prepareStatement(query);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Done !");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        showTableData();
        getSum();
    }//GEN-LAST:event_clearActionActionPerformed

    private void totalBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBillActionPerformed

    }//GEN-LAST:event_totalBillActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(Sales.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        Home home = new Home();
        home.setVisible(true);
        home.pack();
        home.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    public ResultSet find(String s) {
        try {
            String query = "SELECT  `cureName`,`amount`, `tabsNumber`,`retialPrice`, `totalPrice` FROM `CureInfo` WHERE `code`=?";
            ps = DbConnect.getconnection().prepareStatement(query);
            ps.setString(1, s);
            rs = ps.executeQuery();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return rs;
    }

    public void showTableData() {
        try {
            PreparedStatement ps;
            ResultSet rs;
            String query = "SELECT `cureCode`, `cureName`, `amount`, `rPrice`, `tPrice` FROM `Bill`";
            ps = DbConnect.getconnection().prepareStatement(query);
            rs = ps.executeQuery();
            tableBill.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void getSum() {
        int sum = 0;
        for (int i = 0; i < tableBill.getRowCount(); i++) {
            sum = sum + Integer.parseInt(tableBill.getValueAt(i, 4).toString());
        }

        total.setText(Integer.toString(sum));
    }

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToBill;
    private javax.swing.JTextField amount;
    private javax.swing.JButton billDelete;
    private javax.swing.JLabel billNumber;
    private javax.swing.JButton clearAction;
    private javax.swing.JTextField cureCode;
    private javax.swing.JTextField cureName;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    public javax.swing.JLabel jLabelWelcome;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rPrice;
    private javax.swing.JTextField tPrice;
    private javax.swing.JTable tableBill;
    private javax.swing.JTextField total;
    private javax.swing.JButton totalBill;
    // End of variables declaration//GEN-END:variables
}
