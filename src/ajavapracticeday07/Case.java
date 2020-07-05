package ajavapracticeday07;

public class Case {
	
//	Durum
//	Case sınıfı oluşturunuz ve içinde 2 String variable olsun ve private olsunlar
//	sonra getter ve setterlar kullanınız
//	String actualCase;// şu anki durumu
//	String emergency; // aciliyet durumu
	
	private String actualCase;
	private String emergency;

	
	public String getActualCase() {
		return actualCase;
	}



	public void setActualCase(String actualCase) {
		this.actualCase = actualCase;
	}



	public String getEmergency() {
		return emergency;
	}



	public void setEmergency(String emergency) {
		this.emergency = emergency;
	}

}
