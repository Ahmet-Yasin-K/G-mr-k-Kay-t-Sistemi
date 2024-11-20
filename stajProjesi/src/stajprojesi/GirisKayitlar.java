/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stajprojesi;

/**
 *
 * @author ayasi
 */
public class GirisKayitlar {
    private int id;
    private String cekiciPlaka;
    private String dorsePlaka;
    private String yonBilgisi;
    private String girisTarihi;
    private String girisSaati;
    
    public GirisKayitlar(int id, String cekiciPlaka, String dorsePlaka, String yonBilgisi, String girisTarihi, String girisSaati){
        this.id = id;
        this.cekiciPlaka = cekiciPlaka;
        this.dorsePlaka = dorsePlaka;
        this.yonBilgisi = yonBilgisi;
        this.girisTarihi = girisTarihi;
        this.girisSaati = girisSaati;
}

public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCekiciPlaka() {
        return cekiciPlaka;
    }

    public void setCekiciPlaka(String cekiciPlaka) {
        this.cekiciPlaka = cekiciPlaka;
    }
    
    public String getDorsePlaka() {
        return dorsePlaka;
    }

    public void setDorsePlaka(String dorsePlaka) {
        this.dorsePlaka = dorsePlaka;
    }

    public String getYonBilgisi() {
        return yonBilgisi;
    }

    public void setYonBilgisi(String yonBilgisi) {
        this.yonBilgisi = yonBilgisi;
    }

    public String getGirisTarihi() {
        return girisTarihi;
    }

    public void setGirisTarihi(String girisTarihi) {
        this.girisTarihi = girisTarihi;
    }
    
    public String getGirisSaati() {
        return girisSaati;
    }

    public void setGirisSaati(String girisSaati) {
        this.girisSaati = girisSaati;
    }
}

