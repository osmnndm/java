package ajavapracticeday05;

public class OCASorusu {

	public static void main(String[] args) {
		// main yazıp kntr space yaparsak main methodu oluşturuyor
		
		String str = "M "; // M
		str = str.concat("E "); // M E
		String add = "S "; // S
		str = str.concat(add); // M E S
		str.replace("S", "T"); // herhangi bir yere tayin edilmedğinden dolayı hiç bir etkisi yok
		str = str.concat(add); // M E S S
		System.out.println(str);
		System.out.println();
		
//		******
		
		String names = "Aydin Erkan Bayram Ersin";
		names += names.replace("Erkan", " ");
		
		System.out.println(names);
		System.out.println();
		
//		******
		
		String name = "Cevdet";
		name += "Ahmet";
		System.out.println(name);
		System.out.println();
		
//		******
		
		int num = 23;
		num = num + 12;
		num+= 5;
		System.out.println(++num); // öncesine ++ koyarsanız direk bulunduğu yere rakam eklenir
		// num++ ==> önce ata sonra ekle            ++num==> önce ekle sonra ata    
		System.out.println();
		
//		******
		
		int num2=32;
		num2 = 12;
		System.out.println(num2++);
		
	}
		
		
		
	}


