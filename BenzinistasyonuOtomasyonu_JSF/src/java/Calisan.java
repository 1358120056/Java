/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AliAyberk
 */
public class Calisan {
    private int id,password,sube,maas;
    private String isi,ad,soyad;
    private double satilan_urun_miktari,kazandirdigi_para;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getSube() {
        return sube;
    }

    public void setSube(int sube) {
        this.sube = sube;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
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

    public double getSatilan_urun_miktari() {
        return satilan_urun_miktari;
    }

    public void setSatilan_urun_miktari(double satilan_urun_miktari) {
        this.satilan_urun_miktari = satilan_urun_miktari;
    }

    public double getKazandirdigi_para() {
        return kazandirdigi_para;
    }

    public void setKazandirdigi_para(double kazandirdigi_para) {
        this.kazandirdigi_para = kazandirdigi_para;
    }
    
    
    
    
    
    public Calisan(int id,int password,int sube,int maas,String isi,String ad,String soyad){
        this.ad=ad;
        this.soyad=soyad;
        this.id=id;
        this.isi=isi;
        this.maas=maas;
        this.password=password;
        this.sube=sube;
    }
    
    public Calisan(int id,String ad,String soyad,String isi,int maas){
        this.ad=ad;
        this.soyad=soyad;
        this.id=id;
        this.isi=isi;
        this.maas=maas;
    }
}
