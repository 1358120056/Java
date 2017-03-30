/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AliAyberk
 */
public class Bayi {
    private int bayi_id,calisan_sayisi;
    private String bayi_adi,bayi_adres="";

    public int getBayi_id() {
        return bayi_id;
    }

    public void setBayi_id(int bayi_id) {
        this.bayi_id = bayi_id;
    }

    public int getCalisan_sayisi() {
        return calisan_sayisi;
    }

    public void setCalisan_sayisi(int calisan_sayisi) {
        this.calisan_sayisi = calisan_sayisi;
    }

    public String getBayi_adi() {
        return bayi_adi;
    }

    public void setBayi_adi(String bayi_adi) {
        this.bayi_adi = bayi_adi;
    }

    public String getBayi_adres() {
        return bayi_adres;
    }

    public void setBayi_adres(String bayi_adres) {
        this.bayi_adres = bayi_adres;
    }
    
    public Bayi(int id,String ad,String adres,int isci_sayisi){
        this.bayi_adi=ad;
        this.bayi_adres=adres;
        this.bayi_id=id;
        this.calisan_sayisi=isci_sayisi;
    }
    public Bayi(int id,String ad,int isci_sayisi){
        this.bayi_adi=ad;
        this.bayi_id=id;
        this.calisan_sayisi=isci_sayisi;
    }
}
