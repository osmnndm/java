package day18statickeyword;

public class MyClass01 {
	
	
		 int x = 3;
		 int y = 5;
		 
		 MyClass01 (){
		  x += 1;
		  System.out.print("-x" + x);
		  
		 }

		 MyClass01 (int i ){
		  this();
		  this.y = i;
		  x += y;
		  System.out.print("-x" + x);
		  
		 }
		 MyClass01 (int i, int i2 ){
		  this(3);
		  this.x -= 4;
		  System.out.print("-x" + x);
		  
		 }
		 public static void main(String[]args) {
		  MyClass01 mc1= new MyClass01(4,3);
		  System.out.println(mc1.x);
		  System.out.println(mc1.y);
		 }
		}
	
	
	


