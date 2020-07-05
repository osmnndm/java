package day08ternaryoperator;

public class TekAndCiftAnd {

	public static void main(String[] args) {
		
		// && işleminde hız kazanmak için ilk karşılaştırmaya bakar yanlış ise ikinci 
		// karşılaştırmaya bakmaya gerek duymadan direk false der. 
		// Bu yazılış yükü azaltır,hatayı azaltır.
		// & işleminde ise bütün karşılaştırmalar kullanılır.
		// & ile && aynı sonucu verir.

		
//		System.out.println(3<2 && 5>4);
//		System.out.println(3<2 && 5>4 && 6>4 && 1>4 && 5>7 && 4>4);
		
		System.out.println(3<2 & 5>4);
		
	}

}
