package ajavapracticeday06;

import java.util.Scanner;

public class NestedIf {
	
	public static void main(String[] args) {
		
//		Kullanicidan 3 Numara isteyiniz 
//		ve bu numaralarin en buyuk ve en kucuk olanlarini konsola yazdiriniz

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tam sayı giriniz");
		int num1 = scan.nextInt();
		System.out.println("Bir tam sayı daha giriniz");
		int num2 = scan.nextInt();
		System.out.println("Bir tam sayı giriniz");
		int num3 = scan.nextInt();
		
		
		if(num1 >= num2  && num1 >= num3) {
            System.out.println(num1+" en buyuk sayidir");
            
            if(num2 >= num3) {
                System.out.println(num3+" en kucuk sayidir");
            }else {
                System.out.println(num2+" en kucuk sayidir");
            }
        }else if(num2 >= num1 && num2 >= num3) {
            
            System.out.println(num2 +" en buyuk sayidir");
            
            if(num1 >= num3) {
                System.out.println(num3+" en kucuk sayidir");
            }else {
                System.out.println(num1 +" en kucuk sayidir");
            }
            
        }else if(num3>=num2 && num3>=num1) {
        	System.out.println(num3 + " en büyük sayıdır");
        	if(num2>num1) {
        		System.out.println(num1 + " en küçük sayıdır");
        	}else {
        		System.out.println(num2 + " en küçük sayıdır");
        	}
        }

		
		
		
		scan.close();
		}
	}
