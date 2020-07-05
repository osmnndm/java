package day14dowhileloop;

public class DoWhile02 {

	public static void main(String[] args) {
		
		// do-while ile while loop'larının farkı
		// do-while herhalükarda bir kere çalışır ama while koşulu taşımıyorsa çalışmaz.
		// while de condition önce kontrol edilir sonra iş yapılır.
		// do-while önce çalışır sonra kontrol edilir.
		
		int num=7;
		
		while (num<7) {
			System.out.println("While: "+num);// çalışmaz
			num++;
		}

		int num1=7;
		do {
			System.out.println("Do while: "+num1);// en az bir kere çalışır.
			num1++;
		}while(num1<7);
	}

}
