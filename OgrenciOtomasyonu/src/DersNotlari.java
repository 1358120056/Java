import java.util.Scanner;

public class DersNotlari {
	public static void notOrtalamasi(Ogrenci o){
		o.ortlama_ders1=(o.ders1[0]+o.ders1[1])/2;
		o.ortlama_ders2=(o.ders2[0]+o.ders2[1])/2;
		o.ortlama_ders3=(o.ders3[0]+o.ders3[1])/2;
		o.ortlama_ders4=(o.ders4[0]+o.ders4[1])/2;
	}
	public void dersNotuGuncelleVize(Ogrenci o,Ogretmen ogr){
		Scanner s=new Scanner(System.in);
		System.out.println("1."+o.aldigiDers[0]+"\n"+"2."+o.aldigiDers[1]+"\n"+"3."+o.aldigiDers[2]+"\n"+"4."+o.aldigiDers[3]);
		int secim;
		System.out.println("Hangi ders guncellenecek :");
		secim=s.nextInt();
		
		System.out.print("Ders Notunu Giriniz : ");
		switch(secim){
			case 1:o.ders1[0]=s.nextInt();break;
			case 2:o.ders2[0]=s.nextInt();break;
			case 3:o.ders3[0]=s.nextInt();break;
			case 4:o.ders4[0]=s.nextInt();break;
		}
//		s.close();
		System.out.println("Ýþlem Baþarýlý.");
	}
	public void dersNotuGuncelleFinal(Ogrenci o,Ogretmen ogr){
		Scanner s=new Scanner(System.in);
		System.out.println("1."+o.aldigiDers[0]+"\n"+"2."+o.aldigiDers[1]+"\n"+"3."+o.aldigiDers[2]+"\n"+"4."+o.aldigiDers[3]);
		System.out.println("Hangi ders guncellenecek :");
		int secim=s.nextInt();
		System.out.print("Ders Notunu Giriniz : ");
		switch(secim){
			case 1:o.ders1[1]=s.nextInt();break;
			case 2:o.ders2[1]=s.nextInt();break;
			case 3:o.ders3[1]=s.nextInt();break;
			case 4:o.ders4[1]=s.nextInt();break;
		}
//		s.close();
		System.out.println("Ýþlem Baþarýlý.");
	}
	public void notlariGoster(Ogrenci o){
		//ders1
		if(o.ders1[0]!=-1 && o.ders1[1]!=-1){
			System.out.print(o.aldigiDers[0]+" vize : "+o.ders1[0] +"  final : "+ o.ders1[1]+ " Ortalama : "+o.ortlama_ders1);
			if((o.ortlama_ders1>=35) && (o.ders1[1]>=50)){
				System.out.println(" bu dersi gectiniz ");
			}
			else{
				System.out.println("  bu dersten kaldýnýz ");
			}
		}
		else if(o.ders1[0]!=-1){
			System.out.println(o.aldigiDers[0]+" vize : "+o.ders1[0]);
		}
		else{
			System.out.println("Sýnav sonucu okunmadý yada sýnava girmediniz");
		}
		//ders2
		if(o.ders2[0]!=-1 && o.ders2[1]!=-1){
			System.out.print(o.aldigiDers[1]+" vize : "+o.ders2[0] +"  final : "+ o.ders2[1]+ " Ortalama : "+o.ortlama_ders2);
			if((o.ortlama_ders2>=35) && (o.ders2[1]>=50)){
				System.out.println(" bu dersi gectiniz ");
			}
			else{
				System.out.println("  bu dersten kaldýnýz ");
			}
		}
		else if(o.ders2[0]!=-1){
			System.out.println(o.aldigiDers[1]+" vize : "+o.ders2[0]);
		}
		else{
			System.out.println("Sýnav sonucu okunmadý yada sýnava girmediniz");
		}
		//ders3
		if(o.ders3[0]!=-1 && o.ders3[1]!=-1){
			System.out.print(o.aldigiDers[2]+" vize : "+o.ders3[0] +"  final : "+ o.ders3[1]+ " Ortalama : "+o.ortlama_ders3);
			if((o.ortlama_ders3>=35) && (o.ders3[1]>=50)){
				System.out.println(" bu dersi gectiniz ");
			}
			else{
				System.out.println("  bu dersten kaldýnýz ");
			}
		}
		else if(o.ders3[0]!=-1){
			System.out.println(o.aldigiDers[2]+" vize : "+o.ders3[0]);
		}
		else{
			System.out.println("Sýnav sonucu okunmadý yada sýnava girmediniz");
		}
		//ders4
		if(o.ders4[0]!=-1 && o.ders4[1]!=-1){
			System.out.print(o.aldigiDers[3]+" vize : "+o.ders4[0] +"  final : "+ o.ders4[1]+ " Ortalama : "+o.ortlama_ders4);
			if((o.ortlama_ders4>=35) && (o.ders4[1]>=50)){
				System.out.println(" bu dersi gectiniz ");
			}
			else{
				System.out.println("  bu dersten kaldýnýz ");
			}
		}
		else if(o.ders4[0]!=-1){
			System.out.println(o.aldigiDers[3]+" vize : "+o.ders4[0]);
		}
		else{
			System.out.println("Sýnav sonucu okunmadý yada sýnava girmediniz");
		}
	}
}
