package ajavaofficeday04;

import java.util.Arrays;
import java.util.Scanner;

public class StringSorusu07 {
	
//	Kullanıcıdan alınacak  iki kelimenin Anagram durumunu belirleyen
//	Java kodunu yazınız.
	// rats star, listen slient
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("İlk kelimeyi giriniz");
		String kelime1 = scan.next();
		
		System.out.println("İkinci kelimeyi giriniz");
		String kelime2 = scan.next();
				
		System.out.println(isAnagram(kelime1,kelime2));
		
		scan.close();
	}
		
//		StringBuilder obj = new StringBuilder();
//		String kelime3 = obj.append(kelime1).reverse().toString().toLowerCase();
//		
//		String kelime4 = kelime2.toLowerCase();
//		
//		System.out.println(kelime3.equals(kelime4));
		
//		İKİNCİ ÇÖZÜM
//		char[]arr1 = kelime1.replace(" ", "").toLowerCase().toCharArray();
//		char[]arr2 = kelime2.replace(" ", "").toLowerCase().toCharArray();
//		
//		Arrays.sort(arr1);
//		Arrays.sort(arr2);
//		System.out.println(arr1);
//		System.out.println(arr2);
//		
//		String str3 = String.valueOf(arr1);
//		String str4 = String.valueOf(arr2);
//		
//		System.out.println(str3.equals(str4));
//		
//		String str5 = Arrays.toString(arr1);
//		String str6 = Arrays.toString(arr2);
//		
//		System.out.println(str5.equals(str6));
		
//		ÜÇÜNCÜ ÇÖZÜM
		public static boolean isAnagram (String kelime1, String kelime2) {
		@SuppressWarnings("unused")
		boolean isAnagram1;
		
		char[] arr1 = kelime1.replace(" ", "").toLowerCase().toCharArray();
		char[] arr2 = kelime2.replace(" ", "").toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for (int i = 0; i < arr2.length; i++) {
			if(arr1[i]!=arr2[i]) {
				return isAnagram1=false;
		}
		}
		return isAnagram1 =  true;
	
	}
}
