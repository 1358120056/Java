import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main implements Menu  {
	static Scanner s=new Scanner(System.in);
	static boolean ogrenciEkle=false;
	static boolean ogretmenEkle=false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			File f=new File("mevcut.txt");
			
			
			int girisSecenegi;
			int ogrenciAdet = 0;
			int ogretmenAdet = 0;
			
			if(f.exists()){//dosya varsa de�erler dosyadan al�n�r yoksa default olarak 0 al�r
				FileInputStream fos1 = new FileInputStream(f);
				DataInputStream bdos1 = new DataInputStream(fos1);
				ogrenciAdet = bdos1.readInt();
				ogretmenAdet = bdos1.readInt();
				fos1.close();
				bdos1.close();
			}
			
			
			while(true){
				
				System.out.println("\t\t��renci otomasyon Sistemi");
				System.out.println("0.��k��\n1.�grenci girisi\n2.Ogretmen girisi\n3.Admin girisi");

				girisSecenegi=s.nextInt();
				if(girisSecenegi==0){
					s.close();
					FileOutputStream fos = new FileOutputStream(f);
					DataOutputStream dos = new DataOutputStream(fos);
					
					dos.writeInt(ogrenciAdet);
					dos.writeInt(ogretmenAdet);
					
					fos.close();
					dos.close();
					System.exit(0);
				}
				else if(girisSecenegi==1){
					ogrenciMenu(ogrenciAdet);
				}
				else if(girisSecenegi==2){
					ogretmenMenu(ogrenciAdet, ogretmenAdet);
				}
				else if(girisSecenegi==3){
					adminMenu(ogrenciAdet,ogretmenAdet);
					if(ogrenciEkle){
						ogrenciEkle=false;
						ogrenciAdet++;
					}
					if(ogretmenEkle){
						ogretmenEkle=false;
						ogretmenAdet++;
					}
				}
				else{
					System.out.println("Yanl�� deger girdini :(");
				}
			}
		}
		catch(NoSuchElementException e){
			System.out.println("San�r�m bir hata olustu :(");
					//e.printStackTrace();
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("bir hata olustu :(");
			//e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("bir hata olustu :(");
			//e.printStackTrace();
		}
	}


	private static void adminMenu(int ogrenciAdet,int ogretmenAdet) {
		// TODO Auto-generated method stub
		System.out.println("1.��retmen ekle\n2.��renci ekle\n3.Ogrenci sil\n4.Ogretmen sil");
		System.out.println("seciminizi yapiniz");
		int sec=s.nextInt();
		if(sec==1){
			//TODO okuma s�ras�nda ogrenci numaras� yollanmal�
			System.out.print("��retmen adi :");
			String ad=s.next();
			System.out.print("��retmen soyadi :");
			String soyad=s.next();
			System.out.print("��retmen yasi :");
			int yas=s.nextInt();
			System.out.print("��retmenin verecegi ders :");
			String ders=s.next();
			Ogretmen o=new Ogretmen(ad,soyad,yas,ders);
			Indexle i=new Indexle();
			i.ogretmenIndexle(ad, ogretmenAdet);
			
			DosyayaYaz.OgretmenYaz(o);
		}
		else if(sec==2){
			System.out.print("��renci adi :");
			String ad=s.next();
			System.out.print("��renci soyadi :");
			String soyad=s.next();
			System.out.print("��renci yasi :");
			int yas=s.nextInt();
			System.out.print("��renci icin okul Numaras� belirleyin :");
			long no=s.nextLong();
			Ogrenci o=new Ogrenci(ad,soyad,yas,no);
			Indexle i=new Indexle();
			i.ogrenciIndexle(no, ogrenciAdet);
			ogrenciEkle=true;
			
			DosyayaYaz.OgrenciYaz(o);
		}
	//	else if(sec==3){
	//		System.out.println("silinecek ogrencinin nosunu veriniz :");
	//		long silinecekOgrNo=s.nextLong();
	//		
	//	}
	//	else if(sec==4){
	//		System.out.println("silinecek ogretmenin adini veriniz :");
	//		String silinecekOgrAd=s.next();
	//	}
	}

	private static void ogretmenMenu(int adet,int ogrAdet) {
		// TODO Auto-generated method stub
		System.out.println("1.Vize notu yaz\n2.Final notu yaz");
		System.out.println("seciminizi yapiniz");
		int sec = 0;
		sec=s.nextInt();
		System.out.print("��renci numarasini giriniz : ");
		//TODO
		long no;
		no=s.nextLong();
		if(sec==1){
			//TODO okuma s�ras�nda ogrenci numaras� yollanmal�
			Ogrenci o=null;
			Indexle i2=new Indexle();
			int indis=i2.ogrenciIndexdondur(no, adet);
			if(indis==-1){
				System.out.println("��renci Numaras� yanl��");
				return;
			}
			System.out.println("��retmen ismini giriniz :");
			String a=s.next();
			int indisOgretmen=i2.ogretmenIndexDondur(a, ogrAdet);
			Ogretmen ogr;
			ogr=DosyadanOku.OgretmenOku(indisOgretmen);
			o=DosyadanOku.OgrenciOku(indis);
			DersNotlari d= new DersNotlari();
			DersNotlari.notOrtalamasi(o);//static olsun diye static b�rakt�m
			d.notlariGoster(o);
			d.dersNotuGuncelleVize(o,ogr);
			DosyayaYaz.OgrenciYaz(o,indis);
		}
		else if(sec==2){
			Ogrenci o=null;
			Indexle i2=new Indexle();
			int indis=i2.ogrenciIndexdondur(no, adet);
			if(indis==-1){
				System.out.println("��renci Numaras� yanl��");
				return;
			}
			System.out.println("��retmen ismini giriniz :");
			String a=s.next();
			int indisOgretmen=i2.ogretmenIndexDondur(a, ogrAdet);
			Ogretmen ogr;
			ogr=DosyadanOku.OgretmenOku(indisOgretmen);
			o=DosyadanOku.OgrenciOku(indis);
			DersNotlari d= new DersNotlari();
			DersNotlari.notOrtalamasi(o);//static olsun diye static b�rakt�m
			d.notlariGoster(o);
			d.dersNotuGuncelleFinal(o,ogr);
			DosyayaYaz.OgrenciYaz(o,indis);
		}
		
	}

	private static void ogrenciMenu(int adet) {
		// TODO Auto-generated method stub
		System.out.println("1.Ders Se�imi\n2.Notlar� G�r\n3.Dersi veren ��retmenleri g�r");
		System.out.println("seciminizi yapiniz");
		int sec=s.nextInt();
		System.out.print("okul numaranizi giriniz : ");
		//TODO
		long no=s.nextLong();
		
		if(sec==1){
			//TODO okuma s�ras�nda ogrenci numaras� yollanmal�
			Ogrenci o=null;
			Indexle i=new Indexle();
			int index=i.ogrenciIndexdondur(no,adet);
			if(index==-1){
				System.out.println("��renci Numaras� yanl��");
				return;
			}
			o=DosyadanOku.OgrenciOku(index);
			o.ogrenciDersSecimi();
			DosyayaYaz.OgrenciYaz(o,index);
		}
		else if(sec==2){
			Ogrenci o=null;
			Indexle i=new Indexle();
			int index=i.ogrenciIndexdondur(no,adet);
			if(index==-1){
				System.out.println("��renci Numaras� yanl��");
				return;
			}
			o=DosyadanOku.OgrenciOku(index);
			DersNotlari d= new DersNotlari();
			DersNotlari.notOrtalamasi(o);//static olsun diye static b�rakt�m
			d.notlariGoster(o);
		}
/*		else if(sec==3){
			Ogrenci o=null;
			o=DosyadanOku.OgrenciOku();
			
		}
*/
	}




}
