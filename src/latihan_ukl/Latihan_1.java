/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_ukl;

/**
 *
 * @author H4NS
 */
public class Latihan_1 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan_1
     */
    public Latihan_1() {
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

        Formulir = new javax.swing.JLabel();
        NamaA = new javax.swing.JLabel();
        KelasA = new javax.swing.JLabel();
        TextAlamatA2 = new javax.swing.JTextField();
        TextNamaA1 = new javax.swing.JTextField();
        AlamatA = new javax.swing.JLabel();
        TextKelasA1 = new javax.swing.JTextField();
        Proses = new javax.swing.JButton();
        Nama = new javax.swing.JLabel();
        Alamat = new javax.swing.JLabel();
        Kelas = new javax.swing.JLabel();
        TextNama = new javax.swing.JTextField();
        TextKelas = new javax.swing.JTextField();
        TextAlamat = new javax.swing.JTextField();
        TextAlamatA1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Formulir.setText("Formulir");
        getContentPane().add(Formulir);
        Formulir.setBounds(280, 50, 48, 16);

        NamaA.setText("Nama");
        getContentPane().add(NamaA);
        NamaA.setBounds(80, 110, 33, 16);

        KelasA.setText("Kelas");
        getContentPane().add(KelasA);
        KelasA.setBounds(80, 150, 41, 16);

        TextAlamatA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextAlamatA2ActionPerformed(evt);
            }
        });
        getContentPane().add(TextAlamatA2);
        TextAlamatA2.setBounds(150, 190, 300, 22);
        getContentPane().add(TextNamaA1);
        TextNamaA1.setBounds(150, 110, 300, 22);

        AlamatA.setText("Alamat");
        getContentPane().add(AlamatA);
        AlamatA.setBounds(80, 190, 41, 16);

        TextKelasA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextKelasA1ActionPerformed(evt);
            }
        });
        getContentPane().add(TextKelasA1);
        TextKelasA1.setBounds(150, 150, 300, 22);

        Proses.setText("Proses");
        Proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesActionPerformed(evt);
            }
        });
        getContentPane().add(Proses);
        Proses.setBounds(250, 240, 71, 25);

        Nama.setText("Nama");
        getContentPane().add(Nama);
        Nama.setBounds(70, 290, 33, 16);

        Alamat.setText("Alamat");
        getContentPane().add(Alamat);
        Alamat.setBounds(70, 350, 40, 16);

        Kelas.setText("Kelas");
        getContentPane().add(Kelas);
        Kelas.setBounds(70, 320, 30, 16);
        getContentPane().add(TextNama);
        TextNama.setBounds(150, 290, 300, 22);
        getContentPane().add(TextKelas);
        TextKelas.setBounds(150, 320, 300, 22);
        getContentPane().add(TextAlamat);
        TextAlamat.setBounds(150, 350, 300, 22);

        TextAlamatA1.setBackground(new java.awt.Color(153, 153, 0));

        javax.swing.GroupLayout TextAlamatA1Layout = new javax.swing.GroupLayout(TextAlamatA1);
        TextAlamatA1.setLayout(TextAlamatA1Layout);
        TextAlamatA1Layout.setHorizontalGroup(
            TextAlamatA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        TextAlamatA1Layout.setVerticalGroup(
            TextAlamatA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        getContentPane().add(TextAlamatA1);
        TextAlamatA1.setBounds(0, 0, 650, 530);

        setBounds(0, 0, 667, 576);
    }// </editor-fold>//GEN-END:initComponents

    private void TextAlamatA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextAlamatA2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextAlamatA2ActionPerformed

    private void TextKelasA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextKelasA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextKelasA1ActionPerformed

    private void ProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesActionPerformed
        // TODO add your handling code here:
        String TextNamaA = TextNamaA1.getText();
        TextNama.setText(TextNamaA);
        String TextKelasA =TextKelasA1.getText();
        TextKelas.setText(TextKelasA);
        String TextAlamatA = TextAlamatA2.getText();
        TextAlamat.setText(TextAlamatA);
    }//GEN-LAST:event_ProsesActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alamat;
    private javax.swing.JLabel AlamatA;
    private javax.swing.JLabel Formulir;
    private javax.swing.JLabel Kelas;
    private javax.swing.JLabel KelasA;
    private javax.swing.JLabel Nama;
    private javax.swing.JLabel NamaA;
    private javax.swing.JButton Proses;
    private javax.swing.JTextField TextAlamat;
    private javax.swing.JPanel TextAlamatA1;
    private javax.swing.JTextField TextAlamatA2;
    private javax.swing.JTextField TextKelas;
    private javax.swing.JTextField TextKelasA1;
    private javax.swing.JTextField TextNama;
    private javax.swing.JTextField TextNamaA1;
    // End of variables declaration//GEN-END:variables
}