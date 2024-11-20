/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stajprojesi;

/**
 *
 * @author ayasi
 */
public class TescilKayitlar {
    private int id;
    private String ad;
    private String soyad;
    private String babaAd;
    private int kimlikNo;
    private int pasaportNo;
    private String aracTür;
    private String marka;
    private String model;
    private int modelYılı;
    private String yükDurumu;
    private String yükBilgisi;
    private String tescilTarih;
    private String tescilSaat;
    
    public TescilKayitlar(int id, String ad, String soyad, String babaAd, int kimlikNo, int pasaportNo, String aracTür, String marka, String model, int modelYılı,
            String yükDurumu, String yükBilgisi,  String tescilTarih, String tescilSaat){
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.babaAd = babaAd;
        this.kimlikNo = kimlikNo;
        this.pasaportNo = pasaportNo;
        this.aracTür = aracTür;
        this.marka = marka;
        this.model = model;
        this.modelYılı = modelYılı;
        this.yükDurumu = yükDurumu;
        this.yükBilgisi = yükBilgisi;
        this.tescilTarih = tescilTarih;
        this.tescilSaat = tescilSaat;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
    
    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    
    public String getBabaAd() {
        return babaAd;
    }

    public void setBabaAd(String babaAd) {
        this.babaAd = babaAd;
    }
    
    public int getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(int kimlikNo) {
        this.kimlikNo = kimlikNo;
    }
    
    public int getPasaportNo() {
        return pasaportNo;
    }

    public void setPasaportNo(int pasaportNo) {
        this.pasaportNo = pasaportNo;
    }
    
    public String getAracTür() {
        return aracTür;
    }

    public void setAracTür(String aracTür) {
        this.aracTür = aracTür;
    }
    
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public int getModelYılı() {
        return modelYılı;
    }

    public void setModelYılı(int modelYılı) {
        this.modelYılı = modelYılı;
    }
    
    public String getYükDurumu() {
        return yükDurumu;
    }

    public void setYükDurumu(String yükDurumu) {
        this.yükDurumu = yükDurumu;
    }
    
    public String getYükBilgisi() {
        return yükBilgisi;
    }

    public void setYükBilgisi(String yükBilgisi) {
        this.yükBilgisi = yükBilgisi;
    }
    
    public String getTescilTarih() {
        return tescilTarih;
    }

    public void setTescilTarih(String tescilTarih) {
        this.tescilTarih = tescilTarih;
    }
    
    public String getTescilSaat() {
        return tescilSaat;
    }

    public void setTescilSaat(String tescilSaat) {
        this.tescilSaat = tescilSaat;
    }
}
