import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;

public class DosyadanOku {

	public static Ogrenci OgrenciOku(int indis){
		File yazilacakDosya=new File("OgrenciBilgileri.txt");
		FileInputStream outputDegisken=null;
		ObjectInputStream yazici = null;
		Ogrenci o=null;
		RandomAccessFile rand = null;
		try{
			
			outputDegisken=new FileInputStream(yazilacakDosya);
			yazici=new ObjectInputStream(outputDegisken);
			rand=new RandomAccessFile(yazilacakDosya, "r");
			rand.seek(indis*0);
			o=(Ogrenci) yazici.readObject();
			
		}
		catch(FileNotFoundException e){
			System.out.print("Dosya bulunamadi Hata:" +e.getMessage());
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try{
				yazici.close();
				rand.close();
			}
			catch(Exception e){
				System.out.println("Bir hata olustu !!!");
			}
		}
		return o;
	}
	public static Ogrenci OgrenciOku(){
		File yazilacakDosya=new File("OgrenciBilgileri.txt");
		FileInputStream outputDegisken=null;
		ObjectInputStream yazici = null;
		Ogrenci o=null;
		try{
			
			outputDegisken=new FileInputStream(yazilacakDosya);
			yazici=new ObjectInputStream(outputDegisken);
			o=(Ogrenci) yazici.readObject();
			return o;
		}
		catch(FileNotFoundException e){
			System.out.print("Dosya bulunamadi Hata:" +e.getMessage());
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
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
		return o;
	}
	public static Ogretmen OgretmenOku(){
		File yazilacakDosya=new File("OgretmenBilgileri.txt");
		FileInputStream outputDegisken=null;
		ObjectInputStream yazici = null;
		Ogretmen o=null;
		try{
			
			outputDegisken=new FileInputStream(yazilacakDosya);
			yazici=new ObjectInputStream(outputDegisken);
			o=(Ogretmen) yazici.readObject();
			return o;
			
		}
		catch(FileNotFoundException e){
			System.out.print("Dosya bulunamadi Hata:" +e.getMessage());
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
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
		return o;
	}
	public static Ogretmen OgretmenOku(int indis){
		
		
		File yazilacakDosya=new File("OgretmenBilgileri.txt");
		FileInputStream outputDegisken=null;
		ObjectInputStream yazici = null;
		Ogretmen o=null;
		RandomAccessFile rand = null;
		try{
			
			outputDegisken=new FileInputStream(yazilacakDosya);
			yazici=new ObjectInputStream(outputDegisken);
			rand=new RandomAccessFile(yazilacakDosya, "r");
			rand.seek(indis*0);
			o=(Ogretmen) yazici.readObject();
			return o;
			
		}
		catch(FileNotFoundException e){
			System.out.print("Dosya bulunamadi Hata:" +e.getMessage());
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
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
		return o;
	}
}
