package day19arrays;

public class Odev1901 {

	public static void main(String[] args) {
		
		// Bir array’de herhangi iki elemanın aynı olup olmadığını kontroleden bir program yazınız.
		// Aynı eleman varsa “Aynı eleman var” 
		// yoksa “Aynı eleman yok” yazdırınız.
		
		int arr[]= {11,12,13,14,15,11,18};
		
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			for (int a=0; a<arr.length-1; a++){
				if(i<a || i>a ? arr[i]==arr[a]:false) {
					count++;
			}
			}
				}if(count>0) {
					System.out.println("Aynı eleman var");
				}else {
					System.out.println("Aynı eleman yok");
		}
			}

}
