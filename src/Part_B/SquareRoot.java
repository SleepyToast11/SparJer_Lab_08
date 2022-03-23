package Part_B;

/**
 * class implementing opClass, applying a cubing logic to objects
 * */
public class SquareRoot implements OpClass{

	/**
	 * Takes object, transform it cast it in number and square-roots it and return as an object
	 * @param ob object containing number to be square-rooted
	 * @return object number square-rooted
	 * */
	public Object op(Object ob){
		Number ans = (Number) ob;
		ans = Math.pow(ans.doubleValue(), 0.5);
		return (Object) ans;
	}
}
