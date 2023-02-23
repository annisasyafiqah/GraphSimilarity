/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package similarity;

import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonCheck2docs = new javax.swing.JLabel();
        lblCheckMore = new javax.swing.JLabel();
        lblCheck2doc = new javax.swing.JLabel();
        ButtonCheckmore = new javax.swing.JLabel();
        minusButton = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        bgMainMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        ButtonCheck2docs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonCheck.png"))); // NOI18N
        ButtonCheck2docs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonCheck2docsMouseClicked(evt);
            }
        });
        getContentPane().add(ButtonCheck2docs);
        ButtonCheck2docs.setBounds(130, 310, 140, 40);

        lblCheckMore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Check more than 2 Documents.png"))); // NOI18N
        getContentPane().add(lblCheckMore);
        lblCheckMore.setBounds(80, 370, 270, 30);

        lblCheck2doc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Check 2 Documents.png"))); // NOI18N
        getContentPane().add(lblCheck2doc);
        lblCheck2doc.setBounds(120, 280, 180, 30);

        ButtonCheckmore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonCheck.png"))); // NOI18N
        ButtonCheckmore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonCheckmoreMouseClicked(evt);
            }
        });
        getContentPane().add(ButtonCheckmore);
        ButtonCheckmore.setBounds(130, 400, 140, 40);

        minusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Minus.png"))); // NOI18N
        minusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minusButtonMouseClicked(evt);
            }
        });
        getContentPane().add(minusButton);
        minusButton.setBounds(730, 0, 30, 30);

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Close.png"))); // NOI18N
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });
        getContentPane().add(closeButton);
        closeButton.setBounds(760, 0, 30, 30);

        bgMainMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg-mainmenu.png"))); // NOI18N
        getContentPane().add(bgMainMenu);
        bgMainMenu.setBounds(0, 0, 800, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusButtonMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minusButtonMouseClicked

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void ButtonCheckmoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCheckmoreMouseClicked
           
        moreThanOne mto = new moreThanOne();
        mto.setVisible(true);
        mto.pack();
        mto.setLocationRelativeTo(null);
        
         //menutup Login Form
                this.dispose();
    }//GEN-LAST:event_ButtonCheckmoreMouseClicked

    private void ButtonCheck2docsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCheck2docsMouseClicked
        DocSimilarity ds = new DocSimilarity();
        ds.setVisible(true);
        ds.pack();
        ds.setLocationRelativeTo(null);
        
         //menutup Login Form
                this.dispose();
    }//GEN-LAST:event_ButtonCheck2docsMouseClicked

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButtonCheck2docs;
    private javax.swing.JLabel ButtonCheckmore;
    private javax.swing.JLabel bgMainMenu;
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel lblCheck2doc;
    private javax.swing.JLabel lblCheckMore;
    private javax.swing.JLabel minusButton;
    // End of variables declaration//GEN-END:variables
}