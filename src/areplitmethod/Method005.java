package areplitmethod;

public class Method005 {
	
//	girilen sayının tersini return eden java methodunu yazınız
	
	public static void main(String[] args) {
		
	System.out.println(sayi(3440));
		
	}
	
	public static int sayi (int say) {
		
	while(say>10) {
		int say1 = say%10;
		System.out.print(say1);
		say = say/10;
	}
	return say;	
	}

}
