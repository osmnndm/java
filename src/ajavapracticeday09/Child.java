package ajavapracticeday09;

public class Child extends Parent {
	
	@Override
	public String toString() {
		return"Ben Child Class'taki toStringMetodu";
	}
	
	@Override
	public void parentIsimYazdir() {
		System.out.println("Ben Child Class");
		
	}
}
