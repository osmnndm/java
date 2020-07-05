package ajavapracticeokul_hamza;

public class Ogretmen1 {

	private String isim, brans, telefon;

	public Ogretmen1(String string, String string2,String string3) {
		
	}
	
	// public String toString yazıp sağ tıklayıp source'a gidip toString generate yapınca otomatık 
	// kendisi oluşturuyor.
	
	
	

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getBrans() {
		return brans;
	}

	public void setBrans(String brans) {
		this.brans = brans;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	@Override
	public String toString() {
		return "Ogretmen1 [isim=" + isim + ", brans=" + brans + ", telefon=" + telefon + "]";
	}

}
