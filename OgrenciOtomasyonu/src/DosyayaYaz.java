import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;

@SuppressWarnings("serial")
public class DosyayaYaz implements Serializable{
	public static void OgrenciYaz(Ogrenci o,int indis){
		File yazilacakDosya=new File("OgrenciBilgileri.txt");
		FileOutputStream outputDegisken=null;
		RandomAccessFile ra=null;
		ObjectOutputStream yazici = null;
		try{
			ra=new RandomAccessFile(yazilacakDosya, "rw");
			ra.seek(indis*363);
			outputDegisken=new FileOutputStream(yazilacakDosya);
			yazici=new ObjectOutputStream(outputDegisken);
			yazici.writeObject(o);
			ra.close();
			
		}
		catch(FileNotFoundException e){
			System.out.print("Dosya bulunamadi Hata:" +e.getMessage());
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try{
				yazici.close();
			}
			catch(Exception e){
				System.out.println("Bir hata olustu !!!");
			}
		}
	}
	public static void OgrenciYaz(Ogrenci o){
		File yazilacakDosya=new File("OgrenciBilgileri.txt");
		FileOutputStream outputDegisken=null;
		ObjectOutputStream yazici = null;
		try{
			
			outputDegisken=new FileOutputStream(yazilacakDosya,true);
			yazici=new ObjectOutputStream(outputDegisken);
			yazici.writeObject(o);
			
		}
		catch(FileNotFoundException e){
			System.out.print("Dosya bulunamadi Hata:" +e.getMessage());
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try{
				yazici.close();
			}
			catch(Exception e){
				System.out.println("Bir hata olustu !!!");
			}
		}
	}
	public static void OgretmenYaz(Ogretmen o){
		File yazilacakDosya=new File("OgretmenBilgileri.txt");
		FileOutputStream outputDegisken=null;
		ObjectOutputStream yazici = null;
		try{
			
			outputDegisken=new FileOutputStream(yazilacakDosya,true);
			yazici=new ObjectOutputStream(outputDegisken);
			yazici.writeObject(o);
			
		}
		catch(FileNotFoundException e){
			System.out.print("Dosya bulunamadi Hata:" +e.getMessage());
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try{
				yazici.close();
			}
			catch(Exception e){
				System.out.println("Bir hata olustu !!!");
			}
		}
	}
	
}
