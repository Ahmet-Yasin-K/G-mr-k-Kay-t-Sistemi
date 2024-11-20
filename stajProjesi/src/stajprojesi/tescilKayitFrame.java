/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ayasi
 */
package stajprojesi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class tescilKayitFrame extends javax.swing.JFrame {

    /**
     * Creates new form tescilKayitFrame
     */
    public tescilKayitFrame() {
        initComponents();
        radioBtnHidden.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtFieldAd = new javax.swing.JTextField();
        txtFieldSoyad = new javax.swing.JTextField();
        txtFieldBabaAdı = new javax.swing.JTextField();
        txtFieldKimlikNo = new javax.swing.JTextField();
        txtFieldPasaportNo = new javax.swing.JTextField();
        txtFieldAraçMarkası = new javax.swing.JTextField();
        txtFieldAraçModeli = new javax.swing.JTextField();
        txtFieldAraçModelYılı = new javax.swing.JTextField();
        txtFieldAraçTürü = new javax.swing.JTextField();
        txtFieldYükBilgisi = new javax.swing.JTextField();
        radioBtnDolu = new javax.swing.JRadioButton();
        radioBtnBoş = new javax.swing.JRadioButton();
        btnTescilKaydet = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtFieldTescilTarih = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtFieldTescilSaat = new javax.swing.JTextField();
        btnTescilExit = new javax.swing.JButton();
        radioBtnHidden = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Ad:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Soyad:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Baba Adı:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("TC Kimlik No:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Pasaport No:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Araç türü:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Araç Markası:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Araç Modeli:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Araç Model Yılı:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Yük Durumu:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Yük Bilgisi:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setText("Tescil Kayıt");

        txtFieldAd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtFieldSoyad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtFieldBabaAdı.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtFieldKimlikNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtFieldPasaportNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtFieldAraçMarkası.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtFieldAraçModeli.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtFieldAraçModeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldAraçModeliActionPerformed(evt);
            }
        });

        txtFieldAraçModelYılı.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtFieldAraçTürü.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtFieldYükBilgisi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        buttonGroup1.add(radioBtnDolu);
        radioBtnDolu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radioBtnDolu.setText("Dolu");
        radioBtnDolu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonGroup1.add(radioBtnBoş);
        radioBtnBoş.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radioBtnBoş.setText("Boş");
        radioBtnBoş.setContentAreaFilled(false);
        radioBtnBoş.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnTescilKaydet.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTescilKaydet.setText("Kaydet");
        btnTescilKaydet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTescilKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTescilKaydetActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Tarih:");

        txtFieldTescilTarih.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Saat:");

        txtFieldTescilSaat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnTescilExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTescilExit.setText("Ana Sayfaya Dön");
        btnTescilExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTescilExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTescilExitActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioBtnHidden);
        radioBtnHidden.setText("jRadioButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel13))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtFieldKimlikNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFieldBabaAdı, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtFieldAd)
                                .addComponent(txtFieldSoyad)
                                .addComponent(txtFieldPasaportNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(txtFieldTescilTarih)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtFieldTescilSaat, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(btnTescilKaydet)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(2, 2, 2)))
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(2, 2, 2)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtFieldAraçModeli, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFieldAraçModelYılı, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFieldYükBilgisi, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFieldAraçMarkası, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtFieldAraçTürü, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(radioBtnDolu)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(radioBtnBoş)
                                        .addGap(43, 43, 43))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnTescilExit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioBtnHidden)
                                .addGap(24, 24, 24)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtFieldAraçTürü, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFieldAraçMarkası, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtFieldAraçModeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtFieldAraçModelYılı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(radioBtnDolu)
                                    .addComponent(radioBtnBoş))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtFieldYükBilgisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtFieldTescilTarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)
                                    .addComponent(txtFieldTescilSaat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtFieldAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtFieldSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtFieldBabaAdı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtFieldKimlikNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtFieldPasaportNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTescilExit)
                            .addComponent(btnTescilKaydet))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioBtnHidden)
                        .addGap(31, 31, 31))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldAraçModeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldAraçModeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldAraçModeliActionPerformed

    private void btnTescilExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTescilExitActionPerformed
        mainFrame main = new mainFrame();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTescilExitActionPerformed

    private void btnTescilKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTescilKaydetActionPerformed
        Connection connection=null;
        DbHelper dbHelper=new DbHelper();
        PreparedStatement statement =null;
        
        String yük = "";
        if(radioBtnBoş.isSelected()){
            yük="Boş";
        }else if(radioBtnDolu.isSelected()){
            yük="Dolu";
        }
        
        try{
            connection = dbHelper.getConnection();
            String sql = "insert into tescilKayit (ad,soyad,babaAd,kimlikNo,pasaportNo,aracTür,marka,model,modelYılı,yükDurumu,yükBilgisi,tescilTarih,tescilSaat) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,txtFieldAd.getText());
            statement.setString(2,txtFieldSoyad.getText());
            statement.setString(3,txtFieldBabaAdı.getText());
            statement.setString(4,txtFieldKimlikNo.getText());
            statement.setString(5,txtFieldPasaportNo.getText());
            statement.setString(6,txtFieldAraçTürü.getText());
            statement.setString(7,txtFieldAraçMarkası.getText());
            statement.setString(8,txtFieldAraçModeli.getText());
            statement.setString(9,txtFieldAraçModelYılı.getText());
            statement.setString(10,(yük));
            statement.setString(11,txtFieldYükBilgisi.getText());
            statement.setString(12,txtFieldTescilTarih.getText());
            statement.setString(13,txtFieldTescilSaat.getText());

            int result = statement.executeUpdate();
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            try {
                statement.close();
                connection.close();
            } catch (SQLException ex) {
                
            }
        }
        
        txtFieldAd.setText("");
        txtFieldSoyad.setText("");
        txtFieldBabaAdı.setText("");
        txtFieldKimlikNo.setText("");
        txtFieldPasaportNo.setText("");
        txtFieldAraçTürü.setText("");
        txtFieldAraçMarkası.setText("");
        txtFieldAraçModeli.setText("");
        txtFieldAraçModelYılı.setText("");
        txtFieldYükBilgisi.setText("");
        txtFieldTescilTarih.setText("");
        txtFieldTescilSaat.setText("");
        radioBtnHidden.setSelected(true);
        
    }//GEN-LAST:event_btnTescilKaydetActionPerformed

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
            java.util.logging.Logger.getLogger(tescilKayitFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tescilKayitFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tescilKayitFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tescilKayitFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tescilKayitFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTescilExit;
    private javax.swing.JButton btnTescilKaydet;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton radioBtnBoş;
    private javax.swing.JRadioButton radioBtnDolu;
    private javax.swing.JRadioButton radioBtnHidden;
    private javax.swing.JTextField txtFieldAd;
    private javax.swing.JTextField txtFieldAraçMarkası;
    private javax.swing.JTextField txtFieldAraçModelYılı;
    private javax.swing.JTextField txtFieldAraçModeli;
    private javax.swing.JTextField txtFieldAraçTürü;
    private javax.swing.JTextField txtFieldBabaAdı;
    private javax.swing.JTextField txtFieldKimlikNo;
    private javax.swing.JTextField txtFieldPasaportNo;
    private javax.swing.JTextField txtFieldSoyad;
    private javax.swing.JTextField txtFieldTescilSaat;
    private javax.swing.JTextField txtFieldTescilTarih;
    private javax.swing.JTextField txtFieldYükBilgisi;
    // End of variables declaration//GEN-END:variables
}
