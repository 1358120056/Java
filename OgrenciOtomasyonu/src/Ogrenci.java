import java.io.Serializable;
import java.util.Scanner;

@SuppressWarnings("serial")
public class Ogrenci extends Insan implements Serializable {
	String aldigiDers[]=new String[4];//Maksimum 4 ders alýyor ogrenciler
	int ders1[]=new int[2],ders2[]=new int[2],ders3[]=new int[2],ders4[]=new int[2];//dersler bir vize bir final þeklinde 0.indis vize 1indis final
	double ortlama_ders1,ortlama_ders2,ortlama_ders3,ortlama_ders4;
	long okulNumarasi;
	public Ogrenci(){
		
	}
	public Ogrenci(String ad,String soyad,int yas,long okulNo){
		super(ad,soyad,yas);
		this.okulNumarasi=okulNo;
		ders1[0]=-1;
		ders2[0]=-1;
		ders3[0]=-1;
		ders4[0]=-1;
		ders1[1]=-1;
		ders2[1]=-1;
		ders3[1]=-1;
		ders4[1]=-1;
		ortlama_ders1=-1;
		ortlama_ders2=-1;
		ortlama_ders3=-1;
		ortlama_ders4=-1;
	}
	public void ogrenciDersSecimi(){
		System.out.println("Dersler\n1.Devreler ve Sistemler\n2.Lojik Devre Tasarimi\n3.Veri Yapilari");
		System.out.println("4.Nesneye Yönelik Programlama\n5.Olasýlýk Teorisi ve Ýstatisstik\n6.Differantial Equations");
		System.out.println("Almak istediginiz deslerin kodunu teker teker girip entera basýnýz (4 adet ders almak zorunlu)");
		Scanner s1=new Scanner(System.in);
		for(int i=0;i<4;i++){
			int dersKodu=s1.nextInt();
			switch(dersKodu){
			case 1:aldigiDers[i]="Devreler ve Sistemler";break;
			case 2:aldigiDers[i]="Lojik Devre Tasarimi";break;
			case 3:aldigiDers[i]="Veri Yapilari";break;
			case 4:aldigiDers[i]="Nesneye Yönelik Programlama";break;
			case 5:aldigiDers[i]="Olasýlýk Teorisi ve Ýstatisstik";break;
			case 6:aldigiDers[i]="Differantial Equations";break;
			default : System.out.print("Yanlýþ deger girdiniz!! Tekrar giriniz : ");i--;break;
			}
		}
		System.out.println("Ders alma iþlemi baþarýyla tamamlandý");
//		s1.close();
	}
}
