package day03operators;

public class DoubleInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// double 100.235 i int’e çevirip ekrana yazdiriniz.
		
		double num1=100.235;
		int num2=(int) num1;
		System.out.println(num2);
		
		// int data type’ında oluşturulan 5 sayısı ile double data type’ında oluşturulan 6.2 
		// sayısını toplayıp sonucu ekrana yazdırınız.
		
		int num3=5;
		double num4=6.2;
		System.out.println(num3+num4);
		
		// Ekranda ne görürüsünüz?
		
		int num5=5/2;
		System.out.println("int : " + num5);
		
		float num6=5f/2f;
		System.out.println("float : "+ num6);
		
		double num7=5d/2d;
		System.out.println("double : "+ num7);

		
		
		// ekranda ne görürürsünüz?
		
		int num8=5/3;
		System.out.println("int: "+num8);
		
		float num9=5f/3f;
		System.out.println("float "+num9);
		
		double num10=5d/3d;
		System.out.println("double "+num10);
		
	}

}
