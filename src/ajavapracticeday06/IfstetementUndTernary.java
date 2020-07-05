package ajavapracticeday06;

import java.util.Scanner;

public class IfstetementUndTernary {
	
	public static void main(String[] args) {
		
//		Kullanicidan 2 Numara isteyiniz 
//		ve bu numaralarin en buyuk ve en kucuk olarak konsola yazdiriniz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tam sayı giriniz");
		int num1 = scan.nextInt();
		System.out.println("Bir tam sayı daha giriniz");
		int num2 = scan.nextInt();
//		
//		if(num1>=num2) {
//			System.out.println(num1 +" büyüktür "+ num2);
//		}else {
//			System.out.println(num2 +" büyüktür "+ num1);
//		}

		
		String result = num1 >= num2 ? num1+ " en buyuk sayidir \n"+ num2+" en kucuk sayidir":
            num2+" en buyuk sayidir \n"+num1+" en kucuk sayidir";
        System.out.println(result);
        
			scan.close();
	}

}
