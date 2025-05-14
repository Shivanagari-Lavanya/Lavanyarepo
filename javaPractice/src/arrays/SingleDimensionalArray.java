package arrays;

import java.util.Arrays;

public class SingleDimensionalArray {
	public static void main(String[] args) {
	int[] a= {1,3,6,9};
	int b[]= {7,3,9,0};
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	a[3]=10;
	System.out.println(Arrays.toString(a));;
	Arrays.sort(b);
	System.out.println(Arrays.toString(b));
	}
}
