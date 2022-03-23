package Part_A;

/** Derived Base class that also implements IType*/
public class Derived extends Base implements IType{

	/** Class constructor, that constructs
	 *  a base object and prints "Derived Constructor"*/
	public Derived(){
		System.out.println("Derived Constructor");
	}

	/** Prints "Derived.m1"*/
	public void m1() {
		System.out.println("Derived.m1");
	}

	/** prints "Derived.m3"*/
	public void m3() {
		System.out.println("Derived.m3");
	}
}
