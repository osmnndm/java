package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// kullanıcıdan password girmesini isteyin 
		// password doğru ise ekrana "Password doğru" yazdırın
		// password yanlış ise " Password yanlış tekrar deneyin" yazdırın
		// doğru password = Java2020
		
		// iki memory var Stack ve Heap
		// Stack içinde primitive ve reference lar.
		// biz String oluşturduğumuzda java onu Heap'e koyar.
		// kullanıcının girdiği password ile java2020 in
		// değerler ve referencler Stack içinde aynı olması lazım
		// bu yüzden doğru şifreyi girmiş olsak bile reference adres uyuşmadığı için sonucu
		// yanlış olarak verecektir.
		// problemin çözümü java nın adreslere bakmasını engelleyeceğiz sadece değerlere bak 
		// diyeceğiz. == sembolünü kullanmıyoruz. String ismini yazdıktan sonra . koyup equals
		// seçiyoruz. equals içine "Java2020" yazıyoruz.
		// equals sadece değerleri kontrol eder, adresleri değil.
		// Stringlerin eşitliğini kontrol etmek istiyorsak asla!!! == sembolu kullanmıyoruz.
		// bunun yerine equals methodu kullanıyoruz.
		// "==" Stringin değerini ve adresini kontrol eder
		// "equals()" ise sadece değerleri kontrol eder.
		
		

		Scanner scan=new Scanner(System.in);
		System.out.println("Bir password giriniz");
		String pas=scan.next();
		
		if(pas.equals("Java2020")) {
			System.out.println("Password doğru");
		}else {
			System.out.println("Password yanlış tekrar deneyin");
		}
		
		scan.close();
		
	}

}
