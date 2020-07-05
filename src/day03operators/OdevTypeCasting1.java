package day03operators;

public class OdevTypeCasting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Niçin hata veriyor?
		// Bu hatayı iki farklı yolla çözünüz.
		// float num1=3.23
		// double num2=3.23
		
		float num1=3.23f;
		double num2=num1;
		System.out.println(num2);
		
		double num3=3.235345353457897897983;
		float num4=(float) num3;
		System.out.println(num4);
		
	}

}
