package day26encapsulation;

public class Encapsulation02 {
	
	private char ilkHarf = 'S';
	private double para = 23.75;
	private boolean emekli = false;
	
	// getter() ve Setter() methodlarını kısa yoldan oluşturmak için
	// variable "ilkHarf" üzerine sağ tıkla
	// Source==>Generate Getter and Setter... tıkla
	
	// Variable'a atanan değerin okunmasını istemiyorsanız 
	// o variable'la alakalı getter() oluşturmamalısınız.
	// Variable'a atanan değerin değiştirilmesini istemiyorsanız o variable ile alakalı
	// setter() oluşturmamalısınız.
	
	// mesela kendi email adresimizi girdik ve başkasının okuması görmesini istiyor, 
	// değiştirmesini istemiyorsak sadece getter() kullanır hiç Setter() kullanmazsanız 
	// setter() işaretlenmezse variable değerleri değiştirilemez demektir.
	// Bu tarz Class'lara "Immutable Class" denir.
	// Sadece Setter() kullanır Getter() kullanmazsanız okunamaz ama değiştirilebilir demektir.
	
	// başka bir class'taki variable'a object oluşturarak ulaşabilirim.
	

	public static void main(String[] args) {
		Encapsulation01 obj = new Encapsulation01();
		System.out.println(obj.getKimlikNo()); // başka klasstaki variable okuduk.
		
		obj.setKimlikNo("10000000");// başka bir class'taki variable değiştirdik. 
								    // bu değişiklik sadece bu Class'a özgüdür. asıl Classta değişiklik olmaz.
		System.out.println(obj.getKimlikNo()); 
		
		
		

	}

	public boolean isEmekli() {
		return emekli;
	}

	public void setEmekli(boolean emekli) {
		this.emekli = emekli;
	}

	public char getIlkHarf() {
		return ilkHarf;
	}

	public void setIlkHarf(char ilkHarf) {
		this.ilkHarf = ilkHarf;
	}

	public double getPara() {
		return para;
	}

	public void setPara(double para) {
		this.para = para;
	}

}
