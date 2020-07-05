package ajavaofficehours01;

import java.util.Scanner;

public class IfOrnek {

	public static void main(String[] args) {
		
		// Kullanıcıdan yaşını ve kilosunu alalım
		// 18 yaşından küçük ise kan bağışı yapamasın
		// 18 yaşından büyük ve 50 kilodan zayıf ise kan bağışı yapamasın
		// 18 yaşından büyük ve 50 kilodan fazla ise kan bağışı yapabilsin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen yaşınızı giriniz");
		int yas=scan.nextInt();
		System.out.println("lütfen kilonuzu giriniz");
		int kilo=scan.nextInt();
		
//		if(yas>=18 && kilo>=50) {
//			System.out.println("Kan bağışında bulunabilirsiniz");
//		}else {
//			System.out.println("Maalesef sizden kan bağışı alamıyoruz");
//		}
//		scan.close();
		
		String result= (yas>=18) && (kilo>=50) ? "Kan bağışında bulunabilirsiniz": "Maalesef sizden kan bağışı alamıyoruz";
		System.out.println(result);
		scan.close();
	}

}
