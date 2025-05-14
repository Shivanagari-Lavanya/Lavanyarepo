package arrays;

import java.util.Arrays;

public class PassingArrayToMethods {
	public void ArrayValues(int[] values) {
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		System.out.println(values[3]);
	}
	public static void main(String[] args) {
		int[] arr1={1,2,3,4};
		PassingArrayToMethods a=new PassingArrayToMethods();
		a.ArrayValues(arr1);
		System.out.println(Arrays.toString(arr1));
	}

}
