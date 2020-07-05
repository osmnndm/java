package ajavapracticeokul_hamza;

public class Ogretmen {
	
	private String isim, brans, telefon;

	public Ogretmen() {
		
	}
	
	// public String toString yazıp sağ tıklayıp source'a gidip toString generate yapınca otomatık 
	// kendisi oluşturuyor.
	@Override
	public String toString() {
		return "Ogretmen [isim=" + isim + ", brans=" + brans + ", telefon=" + telefon + "]";
	}
	
	

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

}
