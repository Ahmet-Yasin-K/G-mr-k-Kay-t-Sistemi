/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stajprojesi;

/**
 *
 * @author ayasi
 */
public class XrayKayitlar {
    private int id;
    private String xraySevkPlaka;
    private String xraySevkNeden;
    
    public XrayKayitlar (int id, String xraySevkPlaka, String xraySevkNeden ){
        this.id = id;
        this.xraySevkPlaka = xraySevkPlaka;
        this.xraySevkNeden = xraySevkNeden;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getXraySevkPlaka() {
        return xraySevkPlaka;
    }

    public void setXraySevkPlaka(String xraySevkPlaka) {
        this.xraySevkPlaka = xraySevkPlaka;
    }
    
    public String getXraySevkNeden() {
        return xraySevkNeden;
    }

    public void setXraySevkNeden(String xraySevkNeden) {
        this.xraySevkNeden = xraySevkNeden;
    }
}
