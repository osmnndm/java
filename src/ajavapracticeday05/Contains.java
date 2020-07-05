package ajavapracticeday05;

import java.util.Scanner;

public class Contains {
	
	public static void main(String[] args) {
		
	
//		Kullanicidan bir e-mail addressi  isteyiniz 
//		eger email id de "hotmail" varsa  "gmail" ile degistiriniz
//		e.g: mesutyaman@hotmail.com  ==> mesutyaman@gmail.com
				
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir mail adresi giriniz");
		String mail = scan.nextLine();
		
		if(mail.contains("hotmail")){
			mail = mail.replace("hotmail", "gmail");
			}
			System.out.println(mail);
			
			scan.close();
	}
}

