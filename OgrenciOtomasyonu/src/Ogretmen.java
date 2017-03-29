import java.io.Serializable;

@SuppressWarnings("serial")
public class Ogretmen extends Insan implements Serializable {//Ogretmen ekliyor
	String verdigiDers;
	public Ogretmen(){
		
	}
	public Ogretmen(String isim,String soyadi,int yas,String verdigiDers){
		super(isim,soyadi,yas);
		this.verdigiDers=verdigiDers;
	}
}
