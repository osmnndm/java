package areplitConditionalStatement;

import java.util.Scanner;

public class Cs05 {

	public static void main(String[] args) {
		
//		1 ile 12 arasında girilen sayıdan ve yıldan  yılın hangi ayı olduğunun ve  o yıl bu ayın kaç gün olduğunu hesaplayan Java kodunu yazınız.
//
//		Test Data:
//		2
//		2016
//		 
//		Beklenen çıktı:
//		2016 yili Subat ayi 29 gun
//
//		Test Data:
//		4
//		1998
//
//		Beklenen Çıktı:
//		1998 yili Nisan ayi 30 gun
		
		  Scanner input = new Scanner(System.in);
		  System.out.println("1-12 arası bir ay rakamı giriniz");
	        int month = input.nextInt();
	        System.out.println("Bir yıl değeri giriniz");
	        int year = input.nextInt();
	        
	      switch(month){
	        case 1:
	          System.out.println(year+" yili Ocak ayi 31 gun");
	          break;
	          case 2:
	            String subat=(year%4==0) ? (year%100==0 && year%400!=0 ? " yili Subat ayi 28 gun":" yili Subat ayi 29 gun"): " yili Subat ayi 28 gun";
	              System.out.println(year+subat);
	          break;
	          case 3:
	          System.out.println(year+" yili Mart ayi 31 gun");
	          break;
	          case 4:
	          System.out.println(year+" yili Nisan ayi 30 gun");
	          break;
	          case 5:
	          System.out.println(year+" yili Mayis ayi 31 gun");
	          break;
	          case 6:
	          System.out.println(year+" yili Haziran ayi 30 gun");
	          break;
	          case 7:
	          System.out.println(year+" yili Temmuz ayi 31 gun");
	          break;
	          case 8:
	          System.out.println(year+" yili Agustos ayi 31 gun");
	          break;
	          case 9:
	          System.out.println(year+" yili Eylul ayi 30 gun");
	          break;
	          case 10:
	          System.out.println(year+" yili Ekim ayi 31 gun");
	          break;
	          case 11:
	          System.out.println(year+" yili Kasim ayi 30 gun");
	          break;
	          case 12:
	          System.out.println(year+" yili Aralik ayi 31 gun");
	          break;
	          default:
	            System.out.println("yalnış rakam girdiniz tekrar deneyiniz");
	      }
	        
	        
		input.close();

	}

}
