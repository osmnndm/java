package areplitmethod;

import java.util.Scanner;

public class Method03 {
	
	public static void main(String[] args) {
		
//		Kullanıcı tarafından girilen bir yılın  artık yıl olup olmadığını kontrol etmek için 
//		bir Java Methodu yazınız.
//
//		Test Data:
//		2017
//
//		Beklenen Çıktı: 
//		false
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir yıl giriniz");
		int yil=scan.nextInt();
		
		artik(yil);
		scan.close();
	}	

	public static void artik(int yil) {

	if(yil%100==0 && (yil%400==0)) {
		System.out.println(yil+ " Bu yil bir artık yildir");
	}else if((yil%100!=0) && (yil%4==0)){
		System.out.println(yil +" yılı bir artık yıldır");
}else {
	System.out.println(yil+" yılı artık bir yıl değildir");
}
	
	}


}
