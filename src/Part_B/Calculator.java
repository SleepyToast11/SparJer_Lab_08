package Part_B;

import java.util.ArrayList;
/*
 * Name: Jerome Sparnaay
 * Date: March 22, 2022
 * Description: application of a simple strategy pattern in the form of a calculator
 */



/**
 * Test program calculator which contains application of
 * OpClass interface's and a test for it
 * */
public class Calculator {

	/**
	 * test program creating an arraylist of multiple arraylists, one for
	 * each classes of OpClass, which each contains multiple types of numbers
	 * @param args command line arguments
	 * */
	public static void main(String[] args){
			ArrayList arr = new ArrayList<>();
			arr.add((int) 5.0);
			arr.add((byte) 3);
			arr.add((double) 1.5);

			ArrayList applied = new ArrayList<>();
			applied.add(apply(arr, new Square()));
			applied.add(apply(arr, new Cube()));
			applied.add(apply(arr, new Square()));
		for (int i = 0; i < 3; i++) {
				System.out.println(applied.get(i));
		}
	}

	/**
	 * Applies logic of class to numbers of an arraylist
	 * @param nums Arraylist of number to be
	 * @param opCl Class of logic to be applied
	 * */
	public static ArrayList<Number> apply(ArrayList<Number> nums, OpClass opCl){
		ArrayList<Number> result = new ArrayList<>();
		for (Number num : nums){
			result.add((Number) (opCl.op(num)));
		}
		return result;
	}
}