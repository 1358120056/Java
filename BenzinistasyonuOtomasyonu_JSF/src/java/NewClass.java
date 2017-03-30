
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AliAyberk
 */
@ManagedBean(name="user")

@SessionScoped
public class NewClass {

    
    private String outcomeDegeri="index",adres,plaka2,tarih2,tablePlaka[];
    private int password,id,sube,eklenecek_id,eklenecek_sifre;
    private int miktar,maas,eklenecek_sube;
    private double fiyat;
    private String musteri_adi,musteri_soyadi,plaka,urun,tarih,eklenecek_is;
    private  ArrayList<Musteri> mus=new ArrayList<Musteri>();
    private  ArrayList<Calisan> cal=new ArrayList<Calisan>();
    private  ArrayList<Bayi> bay=new ArrayList<Bayi>();
    private  ArrayList<Urun> uru=new ArrayList<Urun>();
    private ArrayList<Integer> urun_idleri=new ArrayList<Integer>();
    private ArrayList<String> urun_adlari=new ArrayList<String>();
    
    private ArrayList<SelectItem> urun_adlari2=new ArrayList<SelectItem>();
    
    public String getOutcomeDegeri() {
        return outcomeDegeri;
    }

    public void setOutcomeDegeri(String outcomeDegeri) {
        this.outcomeDegeri = outcomeDegeri;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getMusteri_adi() {
        return musteri_adi;
    }

    public void setMusteri_adi(String musteri_adi) {
        this.musteri_adi = musteri_adi;
    }

    public String getMusteri_soyadi() {
        return musteri_soyadi;
    }

    public void setMusteri_soyadi(String musteri_soyadi) {
        this.musteri_soyadi = musteri_soyadi;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getUrun() {
        return urun;
    }

    public void setUrun(String urun) {
        this.urun = urun;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }
    
    public int getId() {
        return id;
    }

    public int getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getEklenecek_id() {
        return eklenecek_id;
    }

    public void setEklenecek_id(int eklenecek_id) {
        this.eklenecek_id = eklenecek_id;
    }

    public int getEklenecek_sifre() {
        return eklenecek_sifre;
    }

    public void setEklenecek_sifre(int eklenecek_sifre) {
        this.eklenecek_sifre = eklenecek_sifre;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getEklenecek_is() {
        return eklenecek_is;
    }

    public void setEklenecek_is(String eklenecek_is) {
        this.eklenecek_is = eklenecek_is;
    }
    
    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
    public String getPlaka2() {
        return plaka2;
    }

    public void setPlaka2(String plaka2) {
        this.plaka2 = plaka2;
    }

    public String getTarih2() {
        return tarih2;
    }

    public void setTarih2(String tarih2) {
        this.tarih2 = tarih2;
    }

    public String[] getTablePlaka() {
        return tablePlaka;
    }

    public void setTablePlaka(String[] tablePlaka) {
        this.tablePlaka = tablePlaka;
    }

    public ArrayList<Musteri> getMus() {
        return mus;
    }

    public void setMus(ArrayList<Musteri> mus) {
        this.mus = mus;
    }

    public ArrayList<Calisan> getCal() {
        return cal;
    }

    public void setCal(ArrayList<Calisan> cal) {
        this.cal = cal;
    }

    public ArrayList<Bayi> getBay() {
        return bay;
    }

    public void setBay(ArrayList<Bayi> bay) {
        this.bay = bay;
    }

    public int getEklenecek_sube() {
        return eklenecek_sube;
    }

    public void setEklenecek_sube(int eklenecek_sube) {
        this.eklenecek_sube = eklenecek_sube;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public ArrayList<Urun> getUru() {
        return uru;
    }

    public void setUru(ArrayList<Urun> uru) {
        this.uru = uru;
    }

    public ArrayList<Integer> getUrun_idleri() {
        return urun_idleri;
    }

    public void setUrun_idleri(ArrayList<Integer> urun_idleri) {
        this.urun_idleri = urun_idleri;
    }

    public ArrayList<String> getUrun_adlari() {
        return urun_adlari;
    }

    public void setUrun_adlari(ArrayList<String> urun_adlari) {
        this.urun_adlari = urun_adlari;
    }

    public ArrayList<SelectItem> getUrun_adlari2() {
        return urun_adlari2;
    }

    public void setUrun_adlari2(ArrayList<SelectItem> urun_adlari2) {
        this.urun_adlari2 = urun_adlari2;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String giris(){
        
        return sifreKontrol();
        
    }
    private String sifreKontrol(){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/

            Statement st=con.createStatement();
            String sqlKomutu="SELECT PASSWORD,ISI,SUBE  FROM CALISANLAR WHERE ID="+id;
            ResultSet sonuc=st.executeQuery(sqlKomutu);
            int  sifre = 0;
            String meslek="";
            if(sonuc.next()){
                sifre=sonuc.getInt("PASSWORD");
                meslek=sonuc.getString("ISI");
                sube=sonuc.getInt("SUBE");
            }
            con.close();
            st.close();
            if(sifre==password){
                if(meslek.contains("CEO")){
                    outcomeDegeri="giris1";
                   
                }
                else if(meslek.contains("SUBE MUDURU")){
                    outcomeDegeri="giris2";
                    
                }
                else{
                    outcomeDegeri="giris3";
                    
                }
            }
            else{
                outcomeDegeri="index";
            }
            
        }
        catch(ClassNotFoundException | SQLException e){
        }
        return outcomeDegeri;
    }
    
    public String musteri_ekle(){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/
            PreparedStatement st;
            Statement st2=con.createStatement();
            Statement st3=con.createStatement();
            String sqlKomutu="INSERT INTO MUSTERILER(CALISAN_ID,MUSTERI_AD,MUSTERI_SOYAD,ARAC_PLAKA,URUN,TARIH,MIKTAR,SUBE,ODENEN_PARA) VALUES (?,?,?,?,?,?,?,?,?)";
            st = con.prepareStatement(sqlKomutu);
            st.setInt(1, id);
            st.setString(2, musteri_adi);
            st.setString(3, musteri_soyadi);
            st.setString(4, plaka);
            st.setString(5, urun);
            st.setString(6, tarih);
            st.setInt(7, miktar);
            st.setInt(8, sube);
            char c='\'';
            String sqlKomutu2="SELECT * FROM URUN WHERE URUN_ADI="+c+urun+c;
            ResultSet sonuc=st2.executeQuery(sqlKomutu2);
            if(sonuc.next()){
                fiyat=sonuc.getDouble("FIYAT");
                eklenecek_id=sonuc.getInt("ID");
                fiyat=fiyat*miktar;
                st.setDouble(9, fiyat);
            }
            boolean kosul=false;
            sqlKomutu2="SELECT KALAN_STOK FROM STOK WHERE URUN_ID="+eklenecek_id+" AND BAYI_NO="+sube;
            ResultSet sonuc2=st3.executeQuery(sqlKomutu2);
            if(sonuc2.next()){
                maas=sonuc2.getInt("KALAN_STOK");
                if(maas>miktar){
                    kosul=true;
                }
            }
            if(kosul){
                maas=maas-miktar;
                sqlKomutu2="UPDATE STOK SET KALAN_STOK="+maas+" WHERE URUN_ID="+eklenecek_id+" AND BAYI_NO="+sube;
                st2.execute(sqlKomutu2);
                st.executeUpdate();
            }
            st3.close();
            st2.close();
            con.close();
            st.close();
        }
        catch(ClassNotFoundException | SQLException e){
        }
        return giris();
    }
    public String calisanEkle(){
       try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/
            PreparedStatement st;
            String sqlKomutu="INSERT INTO CALISANLAR(ID,PASSWORD,SUBE,ISI,MAAS,AD,SOYAD) VALUES (?,?,?,?,?,?,?)";
            st = con.prepareStatement(sqlKomutu);
            
            st.setInt(1, eklenecek_id);
            st.setInt(2, eklenecek_sifre);
            st.setInt(3, sube);
            eklenecek_is="BENZINCI";
            st.setString(4, eklenecek_is );
            st.setInt(5, maas);
            st.setString(6, musteri_adi);
            st.setString(7, musteri_soyadi);
            
            st.executeUpdate();
            con.close();
            st.close();
        }
        catch(ClassNotFoundException | SQLException e){
        }
        return giris();
   }

    public String bayiEkle(){
       try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/
            PreparedStatement st;
            String sqlKomutu="INSERT INTO BAYILER(BAYI_ID,BAYI_CALISAN_SAYISI,BAYI_ADRES,BAYI_ADI) VALUES (?,?,?,?)";
            st = con.prepareStatement(sqlKomutu);
           //eklenecek_id=(int) (Math.random()%200);
            st.setInt(1, eklenecek_id);
            miktar=0;
            st.setInt(2, miktar);
            st.setString(3, adres);
            st.setString(4, musteri_adi );
            eklenecek_sube=eklenecek_id;
            st.executeUpdate();
            con.close();
            st.close();
        }
        catch(ClassNotFoundException | SQLException e){
        }
        return "mudur_ekle";
   }
  
    
    public String musteri_sil(){
       try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/
            Statement st=con.createStatement();
            String sqlKomutu="SELECT MUSTERI_AD,MUSTERI_SOYAD,ARAC_PLAKA,TARIH FROM MUSTERILER WHERE SUBE="+sube;
            ResultSet sonuc=st.executeQuery(sqlKomutu);
            mus.clear();
            plaka2="";
            tarih2="";
            while(sonuc.next()){
                musteri_adi=sonuc.getString("MUSTERI_AD");
                musteri_soyadi=sonuc.getString("MUSTERI_SOYAD");
                plaka=sonuc.getString("ARAC_PLAKA");
                tarih=sonuc.getString("TARIH");
                mus.add(new Musteri(tarih,plaka,musteri_adi, musteri_soyadi,urun,miktar));
            }
            con.close();
            st.close();
        }
        catch(ClassNotFoundException | SQLException e){
        }
        return "musteri_sil";
   }
    public String musteri_sil2(){
       try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/
            String sqlKomutu="DELETE FROM MUSTERILER WHERE SUBE=? AND ARAC_PLAKA=? AND TARIH=?";
            PreparedStatement st=con.prepareStatement(sqlKomutu);
            st.setInt(1, sube);
            st.setString(2, plaka2);
            st.setString(3, tarih2);            
            st.executeUpdate();
            con.close();
            st.close();
        }
        catch(ClassNotFoundException | SQLException e){
        }
        return giris(); 
    }

    public String calisan_gecmisi(){
       try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/
            Statement st=con.createStatement();
            String sqlKomutu="SELECT * FROM MUSTERILER WHERE SUBE="+sube+" AND CALISAN_ID="+id;
            ResultSet sonuc=st.executeQuery(sqlKomutu);
            mus.clear();
            while(sonuc.next()){
                musteri_adi=sonuc.getString("MUSTERI_AD");
                musteri_soyadi=sonuc.getString("MUSTERI_SOYAD");
                plaka=sonuc.getString("ARAC_PLAKA");
                tarih=sonuc.getString("TARIH");
                urun=sonuc.getString("URUN");
                miktar=sonuc.getInt("MIKTAR");
                mus.add(new Musteri(tarih,plaka,musteri_adi, musteri_soyadi,urun,miktar));
            }
            con.close();
            st.close();
        }
        catch(ClassNotFoundException | SQLException e){
        }
        return "personelGecmisi";
   }
   
    public String calisan_kov(){
       try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/
            Statement st=con.createStatement();
            String sqlKomutu="SELECT * FROM CALISANLAR WHERE SUBE="+sube;
            ResultSet sonuc=st.executeQuery(sqlKomutu);
            cal.clear();
            while(sonuc.next()){
                eklenecek_id=sonuc.getInt("ID");
                eklenecek_sifre=sonuc.getInt("PASSWORD");
                maas=sonuc.getInt("MAAS");
                eklenecek_is=sonuc.getString("ISI");
                musteri_adi=sonuc.getString("AD");
                musteri_soyadi=sonuc.getString("SOYAD");
                if(id!=eklenecek_id){
                cal.add(new Calisan(eklenecek_id,eklenecek_sifre,sube, maas,eklenecek_is,musteri_adi,musteri_soyadi));
                }
            }
            con.close();
            st.close();
        }
        catch(ClassNotFoundException | SQLException e){
        }
        return "calisanKov";
   }
    public String calisan_kov2(){
       try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/
            String sqlKomutu="DELETE FROM CALISANLAR WHERE ID=?";
            PreparedStatement st=con.prepareStatement(sqlKomutu);
            st.setInt(1, eklenecek_id);
            if(id!=eklenecek_id){
                st.executeUpdate();
            }
            con.close();
            st.close();
        }
        catch(ClassNotFoundException | SQLException e){
        }
        return giris(); 
    }
    
    public String istasyon_gecmisi(){
       try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/
            Statement st=con.createStatement();
            String sqlKomutu="SELECT * FROM MUSTERILER WHERE SUBE="+sube;
            ResultSet sonuc=st.executeQuery(sqlKomutu);
            mus.clear();
            plaka2="";
            tarih2="";
            while(sonuc.next()){
                musteri_adi=sonuc.getString("MUSTERI_AD");
                musteri_soyadi=sonuc.getString("MUSTERI_SOYAD");
                plaka=sonuc.getString("ARAC_PLAKA");
                tarih=sonuc.getString("TARIH");
                eklenecek_id=sonuc.getInt("CALISAN_ID");
                urun=sonuc.getString("URUN");
                miktar=sonuc.getInt("MIKTAR");
                mus.add(new Musteri(tarih,plaka,musteri_adi, musteri_soyadi,urun,miktar,eklenecek_id));
            }
            sqlKomutu="SELECT * FROM CALISANLAR WHERE SUBE="+sube;
            ResultSet sonuc2=st.executeQuery(sqlKomutu);
            cal.clear();
            while(sonuc2.next()){
                eklenecek_id=sonuc2.getInt("ID");
                eklenecek_sifre=sonuc2.getInt("PASSWORD");
                maas=sonuc2.getInt("MAAS");
                eklenecek_is=sonuc2.getString("ISI");
                musteri_adi=sonuc2.getString("AD");
                musteri_soyadi=sonuc2.getString("SOYAD");
                if(id!=eklenecek_id){
                    cal.add(new Calisan(eklenecek_id,eklenecek_sifre,sube, maas,eklenecek_is,musteri_adi,musteri_soyadi));
                }
            }
               /* sqlKomutu="SELECT URUN,MIKTAR FROM CALISANLAR WHERE SUBE="+sube+ " AND CALISAN_ID="+eklenecek_id;
                sonuc2=st.executeQuery(sqlKomutu);
                int kazanilan_para=0;
                ResultSet sonuc3;
                while(sonuc2.next()){
                    int a=sonuc2.getInt("MIKTAR");
                    String b=sonuc2.getString("URUN");
                    double c;
                    sqlKomutu="SELECT FIYAT FROM URUN WHERE URUN_ADI="+b;
                    sonuc3=st.executeQuery(sqlKomutu);
                    if(sonuc3.next()){
                        c=sonuc3.getDouble("FIYAT");
                        kazanilan_para+=(c*a);
                    } 
                }
                */
            
            con.close();
            st.close();
        }
        catch(ClassNotFoundException | SQLException e){
        }
        return "istasyonGecmisi";
   }
    
    
    
    
    public String bayi_sil(){
       try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/
            Statement st=con.createStatement();
            String sqlKomutu="SELECT * FROM BAYILER";
            ResultSet sonuc=st.executeQuery(sqlKomutu);
            bay.clear();
            while(sonuc.next()){
                eklenecek_id=sonuc.getInt("BAYI_ID");
                musteri_adi=sonuc.getString("BAYI_ADI");
                maas=sonuc.getInt("BAYI_CALISAN_SAYISI");
                if(sube!=eklenecek_id){
                  bay.add(new Bayi(eklenecek_id,musteri_adi,maas));
                }
            }
            con.close();
            st.close();
        }
        catch(ClassNotFoundException | SQLException e){
        }
        return "bayi_sil";
   }
    public String bayi_sil2(){
       try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/
            String sqlKomutu="DELETE FROM BAYILER WHERE BAYI_ID=?";
            PreparedStatement st=con.prepareStatement(sqlKomutu);
            st.setInt(1, eklenecek_id);
            Statement st2=con.createStatement();
            Statement st3=con.createStatement();
            Statement st4=con.createStatement();
            if(sube!=eklenecek_id){
                st.executeUpdate();
                sqlKomutu="DELETE FROM CALISANLAR WHERE SUBE="+eklenecek_id;
                st2.execute(sqlKomutu);
                sqlKomutu="DELETE FROM MUSTERILER WHERE SUBE="+eklenecek_id;
                st3.execute(sqlKomutu);
                sqlKomutu="DELETE FROM STOK WHERE BAYI_NO="+eklenecek_id;
                st4.execute(sqlKomutu);
            }
            st4.close();
            st3.close();
            st2.close();
            con.close();
            st.close();
        }
        catch(ClassNotFoundException | SQLException e){
        }
        return giris(); 
    }
    
    public String mudurEkle(){
       try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/
            PreparedStatement st;
            String sqlKomutu="INSERT INTO CALISANLAR(ID,PASSWORD,SUBE,ISI,MAAS,AD,SOYAD) VALUES (?,?,?,?,?,?,?)";
            st = con.prepareStatement(sqlKomutu);
            
            st.setInt(1, eklenecek_id);
            st.setInt(2, eklenecek_sifre);
            st.setInt(3, eklenecek_sube);
            st.setString(4, "SUBE MUDURU");
            st.setInt(5, maas);
            st.setString(6, musteri_adi);
            st.setString(7, musteri_soyadi);
            
            st.executeUpdate();
            con.close();
            st.close();
        }
        catch(ClassNotFoundException | SQLException e){
        }
        return giris();
   }
    
    
     public String mudur_kov(){
       try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/
            Statement st=con.createStatement();
            String sqlKomutu="SELECT * FROM CALISANLAR WHERE ISI='SUBE MUDURU'";
            ResultSet sonuc=st.executeQuery(sqlKomutu);
            cal.clear();
            while(sonuc.next()){
                eklenecek_id=sonuc.getInt("ID");
                eklenecek_sifre=sonuc.getInt("PASSWORD");
                maas=sonuc.getInt("MAAS");
                eklenecek_is=sonuc.getString("ISI");
                musteri_adi=sonuc.getString("AD");
                musteri_soyadi=sonuc.getString("SOYAD");
                if(id!=eklenecek_id){
                cal.add(new Calisan(eklenecek_id,eklenecek_sifre,sube, maas,eklenecek_is,musteri_adi,musteri_soyadi));
                }
            }
            con.close();
            st.close();
        }
        catch(ClassNotFoundException | SQLException e){
        }
        return "mudurKov";
   }
    public String mudur_kov2(){
       try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/
            String sqlKomutu1="SELECT SUBE FROM CALISANLAR WHERE ID="+eklenecek_id;
            Statement st1=con.createStatement();
            ResultSet sonuc=st1.executeQuery(sqlKomutu1);
            if(sonuc.next()){
                eklenecek_sube=sonuc.getInt("SUBE");
            }
            
            String sqlKomutu="DELETE FROM CALISANLAR WHERE ID=?";
            PreparedStatement st=con.prepareStatement(sqlKomutu);
            st.setInt(1, eklenecek_id);
            if(id!=eklenecek_id){
                st.executeUpdate();
            }
            con.close();
            st.close();
            st1.close();
        }
        catch(ClassNotFoundException | SQLException e){
        }
        return "mudur_ekle"; 
    }
    
    public String urun_Ekle(){
       try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/
            PreparedStatement st;
            String sqlKomutu="INSERT INTO URUN(ID,URUN_ADI,FIYAT) VALUES (?,?,?)";
            st = con.prepareStatement(sqlKomutu);
            
            st.setInt(1, eklenecek_id);
            st.setString(2, musteri_adi);
            st.setDouble(3, fiyat);
            
            boolean a=st.execute();
            int i=0;
            while((!a) && i<bayi_sayisi()){
                urunu_bayiye_ekle(i);
                i++;
            }
            con.close();
            st.close();
        }
        catch(ClassNotFoundException | SQLException e){
        }
        return giris();
   }
    private void urunu_bayiye_ekle(int i){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/
            PreparedStatement st;
            int bayi_id[]=bayi_idleri();
            String sqlKomutu="INSERT INTO STOK(BAYI_NO,URUN_ID,KALAN_STOK) VALUES(?,?,?)";
            st=con.prepareStatement(sqlKomutu);
            st.setInt(1, bayi_id[i]);
            st.setInt(2, eklenecek_id);
            st.setInt(3, 1000);
            st.executeUpdate();
            con.close();
            st.close();
        }catch(ClassNotFoundException | SQLException e){
        }
        
    }
    public int bayi_sayisi(){
        int bayiSayisi=0;
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/
            String sqlKomutu="SELECT * FROM BAYILER";
            Statement st=con.createStatement();
            ResultSet sonuc=st.executeQuery(sqlKomutu);
            while(sonuc.next()){
                bayiSayisi++;
            }
            con.close();
            st.close();
        }
        catch(ClassNotFoundException | SQLException e){
        }
        return bayiSayisi;
    }
    public int[] bayi_idleri(){
        int bayiidleri[]=new int[bayi_sayisi()];
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/
            String sqlKomutu="SELECT * FROM BAYILER";
            Statement st=con.createStatement();
            ResultSet sonuc=st.executeQuery(sqlKomutu);
            int i=0;
            while(sonuc.next()){
                bayiidleri[i]=sonuc.getInt("BAYI_ID");
                i++;
            }
            con.close();
            st.close();
        }
        catch(ClassNotFoundException | SQLException e){
        }
        return bayiidleri;
    }
    
    
    public String urun_sil(){
       try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/
            Statement st=con.createStatement();
            String sqlKomutu="SELECT * FROM URUN";
            ResultSet sonuc=st.executeQuery(sqlKomutu);
            uru.clear();
            while(sonuc.next()){
                eklenecek_id=sonuc.getInt("ID");
                fiyat=sonuc.getDouble("FIYAT");
                musteri_adi=sonuc.getString("URUN_ADI");
                if(id!=eklenecek_id){
                uru.add(new Urun(musteri_adi,eklenecek_id,fiyat));
                }
            }
            con.close();
            st.close();
        }
        catch(ClassNotFoundException | SQLException e){
        }
        return "urunSil";
   }
    public String urun_sil2(){
       try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/
            String sqlKomutu1="DELETE FROM URUN WHERE ID="+eklenecek_id;
            Statement st1=con.createStatement();
            st1.execute(sqlKomutu1);
            sqlKomutu1="DELETE FROM STOK WHERE URUN_ID="+eklenecek_id;
            st1.execute(sqlKomutu1);
            con.close();
            st1.close();
        }
        catch(ClassNotFoundException | SQLException e){
        }
        return giris(); 
    }
    
    public String urun_fiyat(){
       try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/
            Statement st=con.createStatement();
            String sqlKomutu="SELECT * FROM URUN";
            ResultSet sonuc=st.executeQuery(sqlKomutu);
            uru.clear();
            while(sonuc.next()){
                eklenecek_id=sonuc.getInt("ID");
                fiyat=sonuc.getDouble("FIYAT");
                musteri_adi=sonuc.getString("URUN_ADI");
                if(id!=eklenecek_id){
                uru.add(new Urun(musteri_adi,eklenecek_id,fiyat));
                }
            }
            con.close();
            st.close();
        }
        catch(ClassNotFoundException | SQLException e){
        }
        return "urunFiyat";
   }
    public String urun_fiyat2(){
       try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/
            String sqlKomutu1="UPDATE URUN SET FIYAT="+fiyat+" WHERE ID="+eklenecek_id;
            Statement st1=con.createStatement();
            st1.execute(sqlKomutu1);
            con.close();
            st1.close();
        }
        catch(ClassNotFoundException | SQLException e){
        }
        return giris(); 
    }
    
    public String bayi_stok(){
       try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/
            Statement st=con.createStatement();
            Statement st2=con.createStatement();
            String sqlKomutu2="SELECT * FROM STOK WHERE BAYI_NO="+sube;
            ResultSet sonuc2=st2.executeQuery(sqlKomutu2);
            uru.clear();
            while( sonuc2.next()){
                int urun_id=sonuc2.getInt("URUN_ID");
                String sqlKomutu="SELECT * FROM URUN WHERE ID="+urun_id;
                ResultSet sonuc=st.executeQuery(sqlKomutu);
                if(sonuc.next()){
                    fiyat=sonuc.getDouble("FIYAT");
                    musteri_adi=sonuc.getString("URUN_ADI");
                    int kalan=sonuc2.getInt("KALAN_STOK");
                  uru.add(new Urun(musteri_adi,urun_id,fiyat,kalan));
                }
            }
            con.close();
            st.close();
        }
        catch(ClassNotFoundException | SQLException e){
        }
        return "bayiStok";
   }
    
    
    
     public String urun_id_ad(){
       try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriTabani", "root", "1234");/**/
            Statement st=con.createStatement();
            String sqlKomutu="SELECT * FROM URUN";
            ResultSet sonuc=st.executeQuery(sqlKomutu);
            int i=0;
            urun_adlari.clear();
            urun_idleri.clear();
            urun_adlari2.clear();
            while(sonuc.next()){
                eklenecek_id=sonuc.getInt("ID");
                fiyat=sonuc.getDouble("FIYAT");
                musteri_adi=sonuc.getString("URUN_ADI");
                urun_adlari.add(musteri_adi);
                SelectItem a=new SelectItem(musteri_adi);
                urun_idleri.add(eklenecek_id);
                urun_adlari2.add(a);
                i++;
            }
            con.close();
            st.close();
            musteri_adi="";
            fiyat=0;
        }
        catch(ClassNotFoundException | SQLException e){
        }
        return "musteriEkle";
   }
}