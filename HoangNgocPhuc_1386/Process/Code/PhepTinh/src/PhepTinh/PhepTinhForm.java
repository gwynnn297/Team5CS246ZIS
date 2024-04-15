/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PhepTinh;

/**
 *
 * @author tt
 */
public class PhepTinhForm extends javax.swing.JFrame {

    /**
     * Creates new form PhepTinhForm
     */
    public PhepTinhForm() {
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

        anhNen = new javax.swing.JLabel();
        tieuDe = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        phepTinh = new javax.swing.JMenu();
        itemCong = new javax.swing.JMenuItem();
        itemTru = new javax.swing.JMenuItem();
        itemNhan = new javax.swing.JMenuItem();
        itemChia = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itemThoat = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Phép Tính");
        setLocation(new java.awt.Point(300, 300));

        anhNen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/logoDT-70.png"))); // NOI18N

        tieuDe.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        tieuDe.setText("DUY TAN UNIVERSITY");

        jMenuBar1.setLocation(new java.awt.Point(300, 300));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(144, 40));

        phepTinh.setText("Phép tính");
        phepTinh.setMaximumSize(new java.awt.Dimension(73, 32767));
        phepTinh.setMinimumSize(new java.awt.Dimension(73, 23));
        phepTinh.setName(""); // NOI18N

        itemCong.setBackground(new java.awt.Color(100, 100, 100));
        itemCong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Add.png"))); // NOI18N
        itemCong.setText("Phép cộng");
        itemCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCongActionPerformed(evt);
            }
        });
        phepTinh.add(itemCong);

        itemTru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Minus.png"))); // NOI18N
        itemTru.setText("Phép trừ");
        itemTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTruActionPerformed(evt);
            }
        });
        phepTinh.add(itemTru);

        itemNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Multiplication.png"))); // NOI18N
        itemNhan.setText("Phép nhân");
        itemNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNhanActionPerformed(evt);
            }
        });
        phepTinh.add(itemNhan);

        itemChia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Division.png"))); // NOI18N
        itemChia.setText("Phép chia");
        itemChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemChiaActionPerformed(evt);
            }
        });
        phepTinh.add(itemChia);

        jMenuBar1.add(phepTinh);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Account.png"))); // NOI18N
        jMenu4.setText("Tài khoản");

        itemThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Fire Exit.png"))); // NOI18N
        itemThoat.setText("Thoát");
        itemThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemThoatActionPerformed(evt);
            }
        });
        jMenu4.add(itemThoat);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(anhNen, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tieuDe))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(tieuDe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(anhNen)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNhanActionPerformed
        new PhepNhan().setVisible(true);
        
    }//GEN-LAST:event_itemNhanActionPerformed

    private void itemChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemChiaActionPerformed
        // TODO add your handling code here:
        new PhepChia().setVisible(true);
    }//GEN-LAST:event_itemChiaActionPerformed

    private void itemTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTruActionPerformed
        // TODO add your handling code here:
        new PhepTru().setVisible(true);
    }//GEN-LAST:event_itemTruActionPerformed

    private void itemCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCongActionPerformed
        // TODO add your handling code here:
        new PhepCong().setVisible(true);
    }//GEN-LAST:event_itemCongActionPerformed

    private void itemThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_itemThoatActionPerformed

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
            java.util.logging.Logger.getLogger(PhepTinhForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhepTinhForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhepTinhForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhepTinhForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhepTinhForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anhNen;
    private javax.swing.JMenuItem itemChia;
    private javax.swing.JMenuItem itemCong;
    private javax.swing.JMenuItem itemNhan;
    private javax.swing.JMenuItem itemThoat;
    private javax.swing.JMenuItem itemTru;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu phepTinh;
    private javax.swing.JLabel tieuDe;
    // End of variables declaration//GEN-END:variables
}
