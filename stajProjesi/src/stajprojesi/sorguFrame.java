package stajprojesi;

import java.awt.Component;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author ayasi
 */
public class sorguFrame extends javax.swing.JFrame {

    DefaultTableModel model;

    /**
     * Creates new form sorguFrame
     */
    public sorguFrame() {
        initComponents();
        populateGiris();
        populateTescil();
        populateCikis();
        populateXray();
        Component[] components = jLayeredPane1.getComponents();
        JScrollPane scrollPaneBoş = (JScrollPane) components[0];
        JScrollPane scrollPaneGiris = (JScrollPane) components[1];
        JScrollPane scrollPaneTescil = (JScrollPane) components[2];
        JScrollPane scrollPaneCikis = (JScrollPane) components[3];
        JScrollPane scrollPaneXray = (JScrollPane) components[4];
        
//        scrollPaneBoş.setVisible(true);
//        scrollPaneGiris.setVisible(false);
//        scrollPaneTescil.setVisible(false);
//        scrollPaneCikis.setVisible(false);
//        scrollPaneXray.setVisible(false);
    }
    
    

    public void populateGiris() {

        model = (DefaultTableModel) tblGiris.getModel();
        model.setRowCount(0);

        try {

            ArrayList<GirisKayitlar> girisKayitlar = getGirisKayitlar();
            for (GirisKayitlar kayit : girisKayitlar) {
                Object[] row = {kayit.getId(), kayit.getCekiciPlaka(), kayit.getDorsePlaka(), kayit.getYonBilgisi(), kayit.getGirisTarihi(), kayit.getGirisSaati()};
                model.addRow(row);

            }
        } catch (SQLException ex) {

        }
    }

    public ArrayList<GirisKayitlar> getGirisKayitlar() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<GirisKayitlar> girisKayitlar = null;

        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from girisKayit");
            girisKayitlar = new ArrayList<GirisKayitlar>();
            while (resultSet.next()) {
                girisKayitlar.add(new GirisKayitlar(
                        resultSet.getInt("ID"),
                        resultSet.getString("cekiciPlaka"),
                        resultSet.getString("dorsePlaka"),
                        resultSet.getString("yonBilgisi"),
                        resultSet.getString("girisTarihi"),
                        resultSet.getString("girisSaati")
                ));
            }

        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
        return girisKayitlar;
    }

    public void populateTescil() {

        model = (DefaultTableModel) tblTescil.getModel();
        model.setRowCount(0);

        try {

            ArrayList<TescilKayitlar> tescilKayitlar = getTescilKayitlar();
            for (TescilKayitlar kayit : tescilKayitlar) {
                Object[] row = {kayit.getId(), kayit.getAd(), kayit.getSoyad(), kayit.getBabaAd(), kayit.getKimlikNo(), kayit.getPasaportNo(), kayit.getAracTür(),
                    kayit.getMarka(), kayit.getModel(), kayit.getModelYılı(), kayit.getYükDurumu(), kayit.getYükBilgisi(), kayit.getTescilTarih(), kayit.getTescilSaat()};
                model.addRow(row);

            }
        } catch (SQLException ex) {

        }
    }

    public ArrayList<TescilKayitlar> getTescilKayitlar() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<TescilKayitlar> tescilKayitlar = null;

        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from tescilKayit");
            tescilKayitlar = new ArrayList<TescilKayitlar>();
            while (resultSet.next()) {
                tescilKayitlar.add(new TescilKayitlar(
                        resultSet.getInt("ID"),
                        resultSet.getString("ad"),
                        resultSet.getString("soyad"),
                        resultSet.getString("babaAd"),
                        resultSet.getInt("kimlikNo"),
                        resultSet.getInt("pasaportNo"),
                        resultSet.getString("aracTür"),
                        resultSet.getString("marka"),
                        resultSet.getString("model"),
                        resultSet.getInt("modelYılı"),
                        resultSet.getString("yükDurumu"),
                        resultSet.getString("yükBilgisi"),
                        resultSet.getString("tescilTarih"),
                        resultSet.getString("tescilSaat")
                ));
            }

        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
        return tescilKayitlar;
    }

    public void populateCikis() {

        model = (DefaultTableModel) tblCikis.getModel();
        model.setRowCount(0);

        try {

            ArrayList<CikisKayitlar> cikisKayitlar = getCikisKayitlar();
            for (CikisKayitlar kayit : cikisKayitlar) {
                Object[] row = {kayit.getId(), kayit.getCikisPlaka(), kayit.getCikisTarih(), kayit.getCikisSaat()};
                model.addRow(row);

            }
        } catch (SQLException ex) {

        }
    }

    public ArrayList<CikisKayitlar> getCikisKayitlar() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<CikisKayitlar> cikisKayitlar = null;

        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from cikisKayit");
            cikisKayitlar = new ArrayList<CikisKayitlar>();
            while (resultSet.next()) {
                cikisKayitlar.add(new CikisKayitlar(
                        resultSet.getInt("ID"),
                        resultSet.getString("cikisPlaka"),
                        resultSet.getString("cikisTarih"),
                        resultSet.getString("cikisSaat")
                ));
            }

        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
        return cikisKayitlar;
    }

    public void populateXray() {

        model = (DefaultTableModel) tblXray.getModel();
        model.setRowCount(0);

        try {

            ArrayList<XrayKayitlar> xrayKayitlar = getXrayKayitlar();
            for (XrayKayitlar kayit : xrayKayitlar) {
                Object[] row = {kayit.getId(), kayit.getXraySevkPlaka(), kayit.getXraySevkNeden()};
                model.addRow(row);

            }
        } catch (SQLException ex) {

        }
    }

    public ArrayList<XrayKayitlar> getXrayKayitlar() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<XrayKayitlar> xrayKayitlar = null;

        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from xraySevk");
            xrayKayitlar = new ArrayList<XrayKayitlar>();
            while (resultSet.next()) {
                xrayKayitlar.add(new XrayKayitlar(
                        resultSet.getInt("ID"),
                        resultSet.getString("xraySevkPlaka"),
                        resultSet.getString("xraySevkNeden")
                ));
            }

        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
        return xrayKayitlar;
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
        btnSorgula = new javax.swing.JButton();
        btnSorgulaExit = new javax.swing.JButton();
        radioBtnGiris = new javax.swing.JRadioButton();
        radioBtnTescil = new javax.swing.JRadioButton();
        radioBtnCikis = new javax.swing.JRadioButton();
        radioBtnXray = new javax.swing.JRadioButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        scrollPaneBoş = new javax.swing.JScrollPane();
        tblBoş = new javax.swing.JTable();
        scrollPaneGiris = new javax.swing.JScrollPane();
        tblGiris = new javax.swing.JTable();
        scrollPaneTescil = new javax.swing.JScrollPane();
        tblTescil = new javax.swing.JTable();
        scrollPaneCikis = new javax.swing.JScrollPane();
        tblCikis = new javax.swing.JTable();
        scrollPaneXray = new javax.swing.JScrollPane();
        tblXray = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(772, 470));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Sorgulama Ekranı");

        btnSorgula.setText("Sorgula");
        btnSorgula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSorgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSorgulaActionPerformed(evt);
            }
        });

        btnSorgulaExit.setText("Ana Sayfaya Dön");
        btnSorgulaExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSorgulaExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSorgulaExitActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioBtnGiris);
        radioBtnGiris.setText("Giriş Kayıt");
        radioBtnGiris.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonGroup1.add(radioBtnTescil);
        radioBtnTescil.setText("Tescil Kayıt");
        radioBtnTescil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonGroup1.add(radioBtnCikis);
        radioBtnCikis.setText("Çıkış Kayıt");
        radioBtnCikis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonGroup1.add(radioBtnXray);
        radioBtnXray.setText("X-Ray Kayıt");
        radioBtnXray.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tblBoş.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrollPaneBoş.setViewportView(tblBoş);

        tblGiris.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Çekici Plaka", "Dorse Plaka", "Yön Bilgisi", "Giriş Tarihi", "Giriş Saati"
            }
        ));
        scrollPaneGiris.setViewportView(tblGiris);

        tblTescil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ad", "Soyad", "Baba Adı", "Kimlik No", "Pasaport No", "Araç Türü", "Araç Markası", "Araç Modeli", "Araç Model Yılı", "Yük Durumu", "Yük Bilgisi", "Tescil Tarihi", "Tescil Saati"
            }
        ));
        scrollPaneTescil.setViewportView(tblTescil);

        tblCikis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Çıkış Plaka", "Çıkış Tarihi", "Çıkış Saati"
            }
        ));
        scrollPaneCikis.setViewportView(tblCikis);

        tblXray.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "X-Ray Sevk Plaka", "X-Ray Sevk Neden"
            }
        ));
        scrollPaneXray.setViewportView(tblXray);

        jLayeredPane1.setLayer(scrollPaneBoş, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(scrollPaneGiris, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(scrollPaneTescil, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(scrollPaneCikis, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(scrollPaneXray, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneGiris)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scrollPaneTescil, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scrollPaneCikis, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scrollPaneXray, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scrollPaneBoş, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneGiris, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scrollPaneTescil, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scrollPaneCikis, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scrollPaneXray, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scrollPaneBoş, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(293, 293, 293)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addComponent(btnSorgula, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btnSorgulaExit))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(radioBtnGiris)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioBtnTescil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioBtnCikis)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioBtnXray)))
                        .addGap(0, 223, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLayeredPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBtnGiris)
                    .addComponent(radioBtnTescil)
                    .addComponent(radioBtnCikis)
                    .addComponent(radioBtnXray))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSorgula)
                    .addComponent(btnSorgulaExit))
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSorgulaExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSorgulaExitActionPerformed
        mainFrame main = new mainFrame();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSorgulaExitActionPerformed

    private void btnSorgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSorgulaActionPerformed
        

        if (radioBtnGiris.isSelected()) {
            scrollPaneGiris.setVisible(true);
            scrollPaneTescil.setVisible(false);
            scrollPaneCikis.setVisible(false);
            scrollPaneXray.setVisible(false);
        } else if (radioBtnTescil.isSelected()) {
            scrollPaneGiris.setVisible(false);
            scrollPaneTescil.setVisible(true);
            scrollPaneCikis.setVisible(false);
            scrollPaneXray.setVisible(false);
        } else if (radioBtnCikis.isSelected()) {
            scrollPaneGiris.setVisible(false);
            scrollPaneTescil.setVisible(false);
            scrollPaneCikis.setVisible(true);
            scrollPaneXray.setVisible(false);
        } else if (radioBtnXray.isSelected()) {
            scrollPaneGiris.setVisible(false);
            scrollPaneTescil.setVisible(false);
            scrollPaneCikis.setVisible(false);
            scrollPaneXray.setVisible(true);
        }
    }//GEN-LAST:event_btnSorgulaActionPerformed

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
            java.util.logging.Logger.getLogger(sorguFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sorguFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sorguFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sorguFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sorguFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSorgula;
    private javax.swing.JButton btnSorgulaExit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JRadioButton radioBtnCikis;
    private javax.swing.JRadioButton radioBtnGiris;
    private javax.swing.JRadioButton radioBtnTescil;
    private javax.swing.JRadioButton radioBtnXray;
    private javax.swing.JScrollPane scrollPaneBoş;
    private javax.swing.JScrollPane scrollPaneCikis;
    private javax.swing.JScrollPane scrollPaneGiris;
    private javax.swing.JScrollPane scrollPaneTescil;
    private javax.swing.JScrollPane scrollPaneXray;
    private javax.swing.JTable tblBoş;
    private javax.swing.JTable tblCikis;
    private javax.swing.JTable tblGiris;
    private javax.swing.JTable tblTescil;
    private javax.swing.JTable tblXray;
    // End of variables declaration//GEN-END:variables
}
