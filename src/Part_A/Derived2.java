package Part_A;

/** Class that extends Derive*/
public class Derived2 extends Derived{

	/** Prints "Derived2 Constructor"*/
	public Derived2(){
		System.out.println("Derived2 Constructor");
	}

	/** Prints from derived2:  followed by param string s
	 * @param s string to be printed with an identify*/
	public void m2(String s){
		System.out.println("from derived2: " + s);
	}

	/** prints "Derived2.m4"*/
	public void m4(){
		System.out.println("Derived2.m4");
	}
}