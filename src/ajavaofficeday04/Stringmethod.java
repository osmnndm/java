package ajavaofficeday04;

public class Stringmethod {
	
	public static void main(String[] args) {
		
		// concat() methodu concatination yapmamızı sağlar.Yani stringleri berleştirir
		
		String str1 = "ankara";
		String str2 = "van";
		System.out.println(str1.concat(str2));
		System.out.println(str1+str2);
		
		// replace() Stringdeki istenilen karakterlerin başka bir karakter ile değiştirmemizi sağlar.
		
		String str3 = "karete";
		System.out.println(str3.replace("a", "o"));
		
		// valueOf() iki farklı kullanımı var.
		// 1) String içindeki int karakterleri matematiksel işlem yapmamızı sağlar.
		
		String butce1 = "12000";
		String butce2 = "13000";	
		System.out.println(Integer.valueOf(butce1) + Integer.valueOf(butce2));
		
		// 2) int içindeki karakterlere STring özelliği katar.
		
		int yas1 = 12;
		int yas2 = 15;
		System.out.println(yas1 + yas2);
		System.out.println(String.valueOf(yas1)+String.valueOf(yas2));
	}

}
