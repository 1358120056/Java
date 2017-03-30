/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AliAyberk
 */
public class Urun {
    private int id;
    private double fiyat;
    private String ad;
    private int kalanStok;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getKalanStok() {
        return kalanStok;
    }

    public void setKalanStok(int kalanStok) {
        this.kalanStok = kalanStok;
    }
    
    
    public Urun(String ad,int id,double fiyat,int kalanStok){
        this.ad = ad;
        this.fiyat = fiyat;
        this.id = id;
        this.kalanStok = kalanStok;
    }
    
    public Urun(String ad,int id,double fiyat){
        this.ad = ad;
        this.fiyat = fiyat;
        this.id = id;
    }
}
