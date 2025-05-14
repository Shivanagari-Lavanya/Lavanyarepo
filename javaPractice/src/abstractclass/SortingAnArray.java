package abstractclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingAnArray {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>(Arrays.asList(6,3,7,2,9,1));
		System.out.println("Array list before sorting : "+a1);
		Collections.sort(a1);
		System.out.println("Array list after sorting  : "+a1);
	}

}

