
public class Concatenation01 {

	public static void main(String[] args) {
		
		
	System.out.println("Ali"+"Can"); // AliCan
	
	System.out.println("Ali" +" "+"Can"); // Ali Can
	
	System.out.println("Ali"+" Can"); // Ali Can
	System.out.println("Ali"+ " "+ "Can"); // Ali Can
	
	System.out.println(3+"4"); // en az birisi String ise toplama değil Concatenation yapılır.
							// 34 bu sayı değildir.
	
	
	System.out.println("3"+4+5);// sonuc 345 tir java soldan sağa çalışır.
	System.out.println("3"+(4+5)); //sonuç 39 olur. işlem önceliğine göre önce parantez olur.
	
	System.out.println(3+4+"5"); // sonuc 75
	System.out.println(3+4+"5"+6); // 756
	
	System.out.println(2*3+"4"+6/2);// sonuc 643
	
	System.out.println("2*3"+4+5); // sonuc 2*345
		
		
		

	}

}
