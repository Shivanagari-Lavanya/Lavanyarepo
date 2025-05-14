package arrays;

import java.util.Arrays;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{1,2,3}};
		System.out.println("First array : "+Arrays.deepToString(a));
		int[][] b= {{1,2,3,},{1,2,3}};
		System.out.println("Second Array: "+Arrays.deepToString(b));
		System.out.println(Arrays.deepEquals(a, b));
		
	}

}
