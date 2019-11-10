
import javax.swing.JFrame;
import javax.swing.*;

/**
 * @author alaa
 */
public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        newRepo = new javax.swing.JButton();
        updateAnddelete = new javax.swing.JButton();
        sales = new javax.swing.JButton();
        salesReview = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        warning = new javax.swing.JButton();
        activityLog = new javax.swing.JButton();
        logOut = new javax.swing.JButton();
        exite = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabelWelcome = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 173, 239));

        newRepo.setForeground(new java.awt.Color(1, 1, 1));
        newRepo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java/icons/repo.png"))); // NOI18N
        newRepo.setText("New Repository");
        newRepo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newRepoMouseClicked(evt);
            }
        });
        newRepo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newRepoActionPerformed(evt);
            }
        });

        updateAnddelete.setForeground(new java.awt.Color(7, 2, 2));
        updateAnddelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java/icons/pdate-icon.png"))); // NOI18N
        updateAnddelete.setText("Update & Delete");
        updateAnddelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAnddeleteActionPerformed(evt);
            }
        });

        sales.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 14)); // NOI18N
        sales.setForeground(new java.awt.Color(1, 1, 1));
        sales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java/icons/sales.png"))); // NOI18N
        sales.setText("  Sales");
        sales.setToolTipText("Sales");
        sales.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesActionPerformed(evt);
            }
        });

        salesReview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java/icons/salesReview.png"))); // NOI18N
        salesReview.setText("Sales Review");
        salesReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesReviewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newRepo, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateAnddelete, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sales, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salesReview, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateAnddelete, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(salesReview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newRepo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        jPanel2.setBackground(new java.awt.Color(0, 173, 239));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        warning.setForeground(new java.awt.Color(5, 0, 0));
        warning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java/icons/waring.png"))); // NOI18N
        warning.setText("  warnings");
        warning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warningActionPerformed(evt);
            }
        });

        activityLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java/icons/activityLog.png"))); // NOI18N
        activityLog.setText("Activity Log");
        activityLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityLogActionPerformed(evt);
            }
        });

        logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java/icons/logOut.png"))); // NOI18N
        logOut.setText("Log out");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        exite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java/icons/exitI.png"))); // NOI18N
        exite.setText("Exit");
        exite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exiteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(warning, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(activityLog, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exite, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(warning, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(activityLog, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(580, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(110, 136, 246));

        jLabelWelcome.setFont(new java.awt.Font("Noto Sans Mono CJK KR Bold", 1, 24)); // NOI18N
        jLabelWelcome.setForeground(new java.awt.Color(253, 251, 251));
        jLabelWelcome.setText("1");

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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabelWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose)
                .addGap(18, 18, 18))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelWelcome)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newRepoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newRepoMouseClicked
        // TODO add your handling code here:
        NewRpository repo = new NewRpository();
        repo.setVisible(true);
        repo.pack();
        repo.setLocationRelativeTo(null);
        repo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        repo.setExtendedState(repo.MAXIMIZED_BOTH); 
        this.dispose();
    }//GEN-LAST:event_newRepoMouseClicked

    private void salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesActionPerformed
        // TODO add your handling code here:
        Sales sales = new Sales();
        sales.setVisible(true);
        sales.pack();
        sales.setLocationRelativeTo(null);
        sales.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        sales.setDefaultCloseOperation(sales.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_salesActionPerformed

    private void newRepoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRepoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newRepoActionPerformed

    private void updateAnddeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAnddeleteActionPerformed
        // TODO add your handling code here:
        UpdateAndDelete update = new UpdateAndDelete();
        update.setVisible(true);
        update.pack();
        update.setLocationRelativeTo(null);
        update.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        update.setExtendedState(update.MAXIMIZED_BOTH); 

        this.dispose();
    }//GEN-LAST:event_updateAnddeleteActionPerformed

    private void salesReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesReviewActionPerformed
        // TODO add your handling code here:
        SalesReview review = new SalesReview();
        review.setVisible(true);
        review.pack();
        review.setLocationRelativeTo(null);
        review.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        review.setExtendedState(review.MAXIMIZED_BOTH); 
        this.dispose();
    }//GEN-LAST:event_salesReviewActionPerformed

    private void warningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warningActionPerformed
        // TODO add your handling code here:
        Warnings warnings = new Warnings();
        warnings.setVisible(true);
        warnings.pack();
        warnings.setLocationRelativeTo(null);
        warnings.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        warnings.setExtendedState(warnings.MAXIMIZED_BOTH); 
        this.dispose();
    }//GEN-LAST:event_warningActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
        LogIn log = new LogIn();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();    
    }//GEN-LAST:event_logOutActionPerformed

    private void exiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exiteActionPerformed
        // TODO add your handling code here:
                System.exit(0);

        
    }//GEN-LAST:event_exiteActionPerformed

    private void activityLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityLogActionPerformed
        // TODO add your handling code here:
          ActivityLog log = new ActivityLog();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        log.setExtendedState(log.MAXIMIZED_BOTH); 
        this.dispose();
    }//GEN-LAST:event_activityLogActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activityLog;
    private javax.swing.JButton exite;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    public javax.swing.JLabel jLabelWelcome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton logOut;
    private javax.swing.JButton newRepo;
    private javax.swing.JButton sales;
    private javax.swing.JButton salesReview;
    private javax.swing.JButton updateAnddelete;
    private javax.swing.JButton warning;
    // End of variables declaration//GEN-END:variables
}
