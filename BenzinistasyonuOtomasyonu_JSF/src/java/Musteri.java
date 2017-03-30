/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AliAyberk
 */
public class Musteri {
    private String ad,soyad,plaka,tarih,urun;
    private int miktar,calisanId;
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

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getUrun() {
        return urun;
    }

    public void setUrun(String urun) {
        this.urun = urun;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public int getCalisanId() {
        return calisanId;
    }

    public void setCalisanId(int calisanId) {
        this.calisanId = calisanId;
    }

    
    
    
    public Musteri(String tarih,String plaka,String ad,String soyad,String urun,int miktar){
        this.ad=ad;
        this.soyad=soyad;
        this.plaka=plaka;
        this.tarih=tarih;
        this.urun=urun;
        this.miktar=miktar;
    }
     public Musteri(String tarih,String plaka,String ad,String soyad,String urun,int miktar,int id){
        this.ad=ad;
        this.soyad=soyad;
        this.plaka=plaka;
        this.tarih=tarih;
        this.urun=urun;
        this.miktar=miktar;
        this.calisanId=id;
    }
}
