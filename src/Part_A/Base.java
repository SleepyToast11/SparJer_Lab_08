package Part_A;

/** Base class to be extended by other classes*/
public class Base {

	/** keeps in memory number of time m1 is called across the program*/
	private static int m1Calls = 0;

	/** creates new base object and prints "Base constructor" */
	public Base(){
		System.out.println("\nBase constructor");
	}

	/** iterates m1calls counter and prints the number of time m1 has been called*/
	public void m1(){
		this.m1Calls++;
		System.out.println(m1Calls);
	}

	/** prints "from base" and the passed string */
	public void m2(String s){
		System.out.println("From base: " + s);
	}
}
