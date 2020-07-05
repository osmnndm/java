package ajavapracticeday07;

public class HastaRunner {
	
	public static void main(String[] args) {
		
		Hasta hasta1 = new Hasta();
		Case durum = new Case();
		
		durum.setActualCase("Covid-19");
		durum.setEmergency("normal");
		
		System.out.println("şuanki durumu: "+durum.getActualCase());
		System.out.println("Aciliyet durumu: "+durum.getEmergency());
		
		durum.setActualCase("Romatizma");
		durum.setEmergency("normal");
		
		hasta1.setIsim("Nevzat");
		hasta1.setSoyİsim("Toprak");
		hasta1.setSuankiDurum(durum);
		
		System.out.println("Hastanın ismi: "+hasta1.getIsim());
		System.out.println("Hastanın soyismi: "+hasta1.getSoyİsim());
		System.out.println("Hastanın durumu: "+ hasta1.getSuankiDurum().getEmergency());
		System.out.println("Hastanın aciliyeti: "+hasta1.getSuankiDurum().getEmergency());
	}
	

}
