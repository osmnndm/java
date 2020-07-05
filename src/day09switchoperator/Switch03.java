package day09switchoperator;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		
		// Kullanıcı ay ismini girsin
		// program kaçıncı ay olduğunu ekrana yazsın
		// büyük küçük harf hepsi için çalışsın
		// yanlış ay ismi girerse geçerli ay ismi giriniz diye mesaf versin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Ay ismini giriniz");
		String ay=scan.next();
		ay=ay.toLowerCase();
		
		switch (ay) {
		case "ocak":
			System.out.println("1.ay");
			break;
		case "şubat":
				System.out.println("2.ay");
			break;
		case "mart":
			System.out.println("3.ay");
			break;
		case "nisan":
			System.out.println("4.ay");
			break;
		case "mayıs":
			System.out.println("5.ay");
			break;
		case "haziran":
			System.out.println("6.ay");
			break;
		case "temmuz":
			System.out.println("7.ay");
			break;
		case "ağustos":
			System.out.println("8.ay");
			break;
		case "eylül":
			System.out.println("9.ay");
			break;
		case "ekim":
			System.out.println("10.ay");
			break;
		case "kasım":
			System.out.println("11.ay");
			break;
		case "aralık":
			System.out.println("12.ay");
			break;
		default:
			System.out.println("Geçerli bir ay ismi giriniz");
		
		}
		scan.close();
		
	}

}
