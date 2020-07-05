package day30exceptions;

public class TryCatch01 {
	
	public static void main(String[] args) {
		
		int num1 = 12;
		int num2 = 0;
		
		try {
			System.out.println(num1/num2);
		}catch(ArithmeticException e) { // e yazmazsak altını çizer.
			    						// ArithmeticException olası aritmatik tüm hataları yakalar.
										// istediğimiz kadar catch kullanabiliriz tek şartla
										// yukarıdaki alttakinin child'i olmak şartıyla.
										// catch'den sonra istersek finally yazabiliriz.
							// finally{} block Exception olsa da olmasa da her zaman çalışır.
			// finally{} block mutlaka try-catch block'dan sonra kullanılır.
			
			
			
			
			System.out.println("Sıfır ile bölme yapılamaz");
		}finally {
			System.out.println("İşleminiz bitmiştir");
		}
		
		// INTERVEİW SORUSU:
		// final, finally, finalize keyword'larının farkı nedir?
		// 1) finally{} (block) ==> try-catch block'dan sonra kullanılır. Exception olsa da olmasada çalışır.
		// 2) final;  (keyword) ==> Variable'larda final kullanılırsa, o variable'ın değeri değiştirilemez.
		// 	  			 mesela pi sayısı final yapıldığı zaman değeri değiştirilemez.
//						 final String code = "POS";
		//				 Method'larda final kullanılırsa, o methodun{} body kısmı değiştirilemez.yani
		//				 Overriding yapamam demektir.
		//				 Inheritance mümkün değildir.
		//				 Class'lard final kullanılırsa o Class extends edilemez.(parent olamaz)
		//			     public class Animal{} ==> public class Dog extends Animal{};
		// hatalı==>     public final class Animal{}==> public class Dog extends Animal{} olmaz.
		//		
		// 3) finalize() (method) ==> finalize() methodu, Garbage Collector'ın imha edeceği dataları 
		//				    imha edilecek hale getirir.
		//    çöpleri topla sonra atarım. Garbage collectore'a bak!!
		
	}
	

}
