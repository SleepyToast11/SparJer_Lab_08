package Part_A;

/** A separate class to compare the inner workings of
 * this and derived classes*/
public class Separate implements IType{

	/** Prints "Separate Constructor"*/
	public Separate(){
		System.out.println("\nSeparate Constructor");
	}

	/** Prints "Separate.m1"*/
	public void m1(){
		System.out.println("Separate.m1");
	}

	/** Prints from separate followed by string parameter
	 * @param s String to be printed with identifying string attached*/
	public void m2(String s) {
		System.out.println("from separate: " + s);
	}

	/**prints "Separate.m3"*/
	public void m3() {
		System.out.println("Separate.m3");
	}
}
