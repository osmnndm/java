package areplitmethod;

public class Method01 {
	
	static double num1,num2,num3;

	public static void main(String[] args) {
		
//		Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.
//
//		Test data:
//		12,24,34
//
//		Beklenen Çıktı:
//		12
		
//		sayi(num1,num2,num3);
		sayi(3,-2,5);
	}
	
	public static void sayi(double num1, double num2, double num3) {
		
		double kuc = 0;
		
		if(num1>=num2 && num2>=num3) {
			kuc=num3;
		}else if(num2>=num1 && num1>=num3){
			kuc=num3;
		}else if(num1>=num3 && num3>=num2) {
			kuc=num2;
		}else if(num2>=num3 && num3>=num1) {
			kuc=num1;
		}else if(num3>=num1 && num1>=num2) {
			kuc=num2;
		}else if(num3>=num2 && num2>=num1) {
			kuc=num1;
		}
			
		System.out.println(kuc);
		}
		
}
