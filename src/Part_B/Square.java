package Part_B;

/**
 * class implementing opClass, applying a cubing logic to objects
 * */
public class Square implements OpClass{

	/**
	 * Takes object, transform it cast it in number and squares it and return as an object
	 * @param ob object containing number to be squared
	 * @return object number squared
	 * */
	public Object op(Object ob){
		Number ans = (Number) ob;
		ans = Math.pow(ans.doubleValue(),2);
		return (Object) ans;
	}
}
