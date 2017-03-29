import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Indexle implements Serializable{
	long no;
	int  index;
	String ad;
	
	public void ogrenciIndexle(long no, int adet){
		File f=new File("indexOgrenci.txt");
		try {
			FileOutputStream fo=new FileOutputStream(f,true);
			ObjectOutputStream oo=new ObjectOutputStream(fo);
			Indexle i=new Indexle();
			i.index=adet;
			i.no=no;
			oo.writeObject(i);
			oo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void ogretmenIndexle(String ad,int adet){
		File f=new File("indexOgretmen.txt");
		try {
			FileOutputStream fo=new FileOutputStream(f,true);
			ObjectOutputStream oo=new ObjectOutputStream(fo);
			Indexle i=new Indexle();
			i.index=adet;
			i.ad=ad;
			oo.writeObject(i);
			oo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int ogrenciIndexdondur(long no,int adet){
		File f=new File("indexOgrenci.txt");
		try {
			FileInputStream fo=new FileInputStream(f);
			ObjectInputStream oo=new ObjectInputStream(fo);
			Indexle i;
			for(int i1=0;i1<adet;i1++){
				i=(Indexle) oo.readObject();
				if(i.no==no){
					int r=i.index;
					oo.close();
					return r;
				}
			}
			
			oo.close();
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int donusDegeri = -1;
		return donusDegeri;
	}
	public int ogretmenIndexDondur(String ad,int adet){
		File f=new File("indexOgretmen.txt");
		try {
			FileInputStream fo=new FileInputStream(f);
			ObjectInputStream oo=new ObjectInputStream(fo);
			Indexle i=new Indexle();
			for(int i1=0;i1<adet;i1++){
				i=(Indexle) oo.readObject();
				if(i.ad==ad){
					return i.index;
				}
			}
			oo.close();
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
		
}

