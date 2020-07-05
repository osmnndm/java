package areplitGiris;

public class ReplitGiris05 {

	
		
//		Dairenin Çevresini ve Alanını hesaplayan Java kodunu yazınız. (r=7.5)
//		Not: Pi sayısı =  Math.PI 
//
//		Beklenen Çıktı: 
//		Dairenin Çevresi = 47.12388980384689
//		Daire Alanı = 176.71458676442586
		
		private static final double radius = 7.5;
		  public static void main(String[] args) {
		      
		      double cev=2*Math.PI*radius;
		      double alan=Math.PI*radius*radius;
		      
		      System.out.println("Daire Çevresi = "+cev);
		      System.out.println("Daire Alanı = "+alan);

	}

}
