package arrays;

import java.util.Arrays;

public class ReturnArrayFromMethods {
	public int[] ArrayValues(int[] values) {
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		System.out.println(values[3]);
		int[] arr2=new int[values.length];
		arr2[0]=values[0]*2;
		arr2[1]=values[1]*2;
		arr2[2]=values[2]*2;
		arr2[3]=values[3]*2;
		return arr2;
		
		
	}
	public static void main(String[] args) {
		int[] arr1={1,2,3,4};
		ReturnArrayFromMethods a=new ReturnArrayFromMethods();
		//a.ArrayValues(arr1);
		//System.out.println(Arrays.toString(arr1));
		int arr3[]=a.ArrayValues(arr1);
		System.out.println(Arrays.toString(arr3));
	}

}
