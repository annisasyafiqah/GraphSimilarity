package similarity;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import edu.stanford.nlp.classify.*;

public class DocSimilarity1 extends javax.swing.JFrame {

    protected final JFileChooser openFileChooser;
    StringBuilder sb = new StringBuilder();
    JFileChooser Chooser = new JFileChooser();
    FileReader fileReader;
    File ff;
    FileReader fr = null;
    JFileChooser jf = new JFileChooser();
    
    public DocSimilarity1() {
        initComponents();
        this.setLocationRelativeTo(null);

        openFileChooser = new JFileChooser();
        openFileChooser.setCurrentDirectory(new File(""));
        openFileChooser.setFileFilter(new FileNameExtensionFilter("txt", "docx"));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        closeButton = new javax.swing.JLabel();
        minusButton = new javax.swing.JLabel();
        Count = new javax.swing.JLabel();
        Open1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Open2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtText1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtText2 = new javax.swing.JTextArea();
        txtAddress2 = new javax.swing.JTextField();
        txtAddress1 = new javax.swing.JTextField();
        finalResult = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tbfreq = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        TbToken = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        finalResult1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(889, 679));
        setUndecorated(true);
        getContentPane().setLayout(null);

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Close.png"))); // NOI18N
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });
        getContentPane().add(closeButton);
        closeButton.setBounds(850, 0, 30, 30);

        minusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Minus.png"))); // NOI18N
        minusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minusButtonMouseClicked(evt);
            }
        });
        getContentPane().add(minusButton);
        minusButton.setBounds(820, 0, 30, 30);

        Count.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button Count.png"))); // NOI18N
        Count.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CountMouseClicked(evt);
            }
        });
        getContentPane().add(Count);
        Count.setBounds(380, 380, 140, 40);

        Open1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Open1.png"))); // NOI18N
        Open1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Open1MouseClicked(evt);
            }
        });
        getContentPane().add(Open1);
        Open1.setBounds(70, 170, 100, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Check 2 Document’s Similarity.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 60, 360, 30);

        Open2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Open2.png"))); // NOI18N
        Open2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Open2MouseClicked(evt);
            }
        });
        getContentPane().add(Open2);
        Open2.setBounds(490, 170, 100, 20);

        txtText1.setColumns(20);
        txtText1.setForeground(new java.awt.Color(51, 51, 51));
        txtText1.setLineWrap(true);
        txtText1.setRows(5);
        txtText1.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtText1.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        jScrollPane2.setViewportView(txtText1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(60, 210, 350, 160);

        txtText2.setColumns(20);
        txtText2.setLineWrap(true);
        txtText2.setRows(5);
        txtText2.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        jScrollPane3.setViewportView(txtText2);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(480, 210, 350, 160);
        getContentPane().add(txtAddress2);
        txtAddress2.setBounds(590, 170, 240, 20);
        getContentPane().add(txtAddress1);
        txtAddress1.setBounds(170, 170, 240, 20);

        finalResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalResultActionPerformed(evt);
            }
        });
        getContentPane().add(finalResult);
        finalResult.setBounds(470, 620, 100, 32);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 0));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/similarity percentage.png"))); // NOI18N
        jLabel10.setText("Presentase Kemiripan");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(460, 600, 130, 16);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 680, 860, 0);

        Tbfreq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Daftar Kata", "Doc 1", "Doc 2"
            }
        ));
        jScrollPane4.setViewportView(Tbfreq);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(520, 460, 280, 120);

        TbToken.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Doc 1", "Doc 2"
            }
        ));
        jScrollPane5.setViewportView(TbToken);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(90, 460, 290, 120);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/the calculation results.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(280, 600, 140, 10);

        finalResult1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalResult1ActionPerformed(evt);
            }
        });
        getContentPane().add(finalResult1);
        finalResult1.setBounds(300, 620, 100, 32);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 7.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 889, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void finalResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finalResultActionPerformed

    private void finalResult1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalResult1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finalResult1ActionPerformed

    private void CountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CountMouseClicked

        ArrayList<String> wordsList1 = new ArrayList<>();
        ArrayList<String> wordsList2 = new ArrayList<>();
        ArrayList<ArrayList<String>> wordsList = new ArrayList<ArrayList<String>>();
        wordsList.add(wordsList1);
        wordsList.add(wordsList2);
        
        //mengganti semua huruf kapital menjadi kecil/normalisation
        String Text1 = txtText1.getText().toLowerCase();
        String Text2 = txtText2.getText().toLowerCase();

//        POSExample pos = new POSExample();
//        pos.jenisKata(Text1);
        
        //menghitung weight dari setiap term
//        Weight calculator = new Weight();
//        for (int i = 0; i < wordsList1.size(); i++) {
//            double weight1 = calculator.weight(wordsList1, wordsList, wordsList1.get(i));
//            System.out.println("Weight = " + weight1);
//        }
//        for (int i = 0; i < wordsList2.size(); i++) {
//            double weight2 = calculator.weight(wordsList2, wordsList, wordsList2.get(i));
//            System.out.println("weight = " + weight2);
//        }

    }//GEN-LAST:event_CountMouseClicked

    private void Open1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Open1MouseClicked

        int Open = jf.showOpenDialog(null);

        if (Open == JFileChooser.APPROVE_OPTION) {
            try {
                ff = jf.getSelectedFile();
                txtAddress1.setText(ff.getAbsolutePath());
                System.out.println(ff);
                JOptionPane.showMessageDialog(rootPane, "Sukses dibuka");
                fr = new FileReader(ff);
                txtText1.read(fr, "");
            } catch (Exception ex) {

            } finally {
                try {
                    fr.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "File gagal dibuka! ");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No file choosen!");
        }
    }//GEN-LAST:event_Open1MouseClicked

    private void Open2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Open2MouseClicked

        int Choose = jf.showOpenDialog(null);

        if (Choose == JFileChooser.APPROVE_OPTION) {
            try {
                ff = jf.getSelectedFile();
                txtAddress2.setText(ff.getAbsolutePath());
                System.out.println(ff);
                JOptionPane.showMessageDialog(rootPane, "Sukses dibuka");
                fr = new FileReader(ff);
                txtText2.read(fr, "");

            } catch (Exception ex) {

            } finally {
                try {
                    fr.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "File gagal dibuka! ");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No file choosen!");
        }

    }//GEN-LAST:event_Open2MouseClicked

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void minusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusButtonMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minusButtonMouseClicked

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
            java.util.logging.Logger.getLogger(DocSimilarity1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DocSimilarity1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DocSimilarity1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DocSimilarity1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DocSimilarity1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Count;
    private javax.swing.JLabel Open1;
    private javax.swing.JLabel Open2;
    private javax.swing.JTable TbToken;
    private javax.swing.JTable Tbfreq;
    private javax.swing.JLabel closeButton;
    private javax.swing.JTextField finalResult;
    private javax.swing.JTextField finalResult1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel minusButton;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtAddress2;
    protected javax.swing.JTextArea txtText1;
    protected javax.swing.JTextArea txtText2;
    // End of variables declaration//GEN-END:variables
}