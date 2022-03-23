package Part_B;

/**
 * class implementing opClass, applying a cubing logic to objects
 * */
public class Cube implements OpClass{

	/**
	 * Takes object, transform it cast it in number and cubes it and return as an object
	 * @param ob object containing number to be squared
	 * @return object number cubed
	 * */
	public Object op(Object ob){
		Number ans = (Number) ob;
		ans = Math.pow(ans.doubleValue(),3);
		return ans;
	}
}
