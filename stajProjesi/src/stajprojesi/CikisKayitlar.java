/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stajprojesi;

/**
 *
 * @author ayasi
 */
public class CikisKayitlar {
    private int id;
    private String cikisPlaka;
    private String cikisTarih;
    private String cikisSaat;
    
    public CikisKayitlar (int id, String cikisPlaka, String cikisTarih, String cikisSaat){
        this.id = id;
        this.cikisPlaka = cikisPlaka;
        this.cikisTarih = cikisTarih;
        this.cikisSaat = cikisSaat;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getCikisPlaka() {
        return cikisPlaka;
    }

    public void setCikisPlaka(String cikisPlaka) {
        this.cikisPlaka = cikisPlaka;
    }
    
    public String getCikisTarih() {
        return cikisTarih;
    }

    public void setCikisTarih(String cikisTarih) {
        this.cikisTarih = cikisTarih;
    }
    
    public String getCikisSaat() {
        return cikisSaat;
    }

    public void setCikisSaat(String cikisSaat) {
        this.cikisSaat = cikisSaat;
    }
}
