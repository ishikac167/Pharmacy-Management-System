/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

/**
 *
 * @author OWNER
 */
public class NewJFrame2 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame2
     */
    public NewJFrame2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        companytabpic = new javax.swing.JLabel();
        brandtab = new javax.swing.JLabel();
        purchasehistpic = new javax.swing.JLabel();
        invoicetabpic = new javax.swing.JLabel();
        admintabpic = new javax.swing.JLabel();
        companytab = new javax.swing.JButton();
        purchasehist = new javax.swing.JButton();
        addbrand = new javax.swing.JButton();
        viewstockstab = new javax.swing.JButton();
        invoicetab = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ADmintab = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setMinimumSize(new java.awt.Dimension(810, 470));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));

        companytabpic.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Desktop\\Hetu\\PROJECT\\medical-cross-health-pharmacy-logo-829822.jpg")); // NOI18N
        companytabpic.setText("jLabel1");

        brandtab.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Desktop\\Hetu\\PROJECT\\herbal-capsule-logo-design-template-vector-21072290.jpg")); // NOI18N

        purchasehistpic.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Desktop\\Hetu\\PROJECT\\customer-linear-icon-modern-outline-customer-logo-concept-wh-customer-linear-icon-modern-outline-customer-logo-concept-white-133515252.jpg")); // NOI18N

        invoicetabpic.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Desktop\\Hetu\\PROJECT\\530-invoice-templates.jpg")); // NOI18N

        admintabpic.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Desktop\\Hetu\\PROJECT\\Pharmacy Project +Database + Jars\\Pharmacy-Management-System\\src\\img\\Untitled.png")); // NOI18N

        companytab.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        companytab.setText("ADD A COMPANY");
        companytab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companytabActionPerformed(evt);
            }
        });

        purchasehist.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        purchasehist.setText("PURCHASE HISTORY");

        addbrand.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addbrand.setText("ADD A BRAND");

        viewstockstab.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        viewstockstab.setText("VIEW STOCKS");
        viewstockstab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewstockstabActionPerformed(evt);
            }
        });

        invoicetab.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        invoicetab.setText("INVOICE");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("                                                   PHARMACY MANAGEMENT SYSTEM");

        ADmintab.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ADmintab.setText("ADMIN");
        ADmintab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADmintabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(invoicetabpic, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(invoicetab, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(companytabpic, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(companytab)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brandtab, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(purchasehistpic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(viewstockstab, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(purchasehist, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(admintabpic, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ADmintab, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(brandtab, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(companytabpic, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(companytab, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(invoicetabpic)
                                    .addComponent(purchasehistpic)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(invoicetab, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(addbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewstockstab, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(purchasehist, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(admintabpic, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ADmintab, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 810, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void companytabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companytabActionPerformed
         companyform company=new companyform();
        company.setVisible(true);
    }//GEN-LAST:event_companytabActionPerformed

    private void viewstockstabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewstockstabActionPerformed
viewstocks stock=new viewstocks();
        stock.setVisible(true);        
    }//GEN-LAST:event_viewstockstabActionPerformed

    private void ADmintabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADmintabActionPerformed
        adminlogin alogin=new adminlogin();
        alogin.setVisible(true);        
    }//GEN-LAST:event_ADmintabActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADmintab;
    private javax.swing.JButton addbrand;
    private javax.swing.JLabel admintabpic;
    private javax.swing.JLabel brandtab;
    private javax.swing.JButton companytab;
    private javax.swing.JLabel companytabpic;
    private javax.swing.JButton invoicetab;
    private javax.swing.JLabel invoicetabpic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton purchasehist;
    private javax.swing.JLabel purchasehistpic;
    private javax.swing.JButton viewstockstab;
    // End of variables declaration//GEN-END:variables
}
