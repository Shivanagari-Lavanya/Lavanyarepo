package collectionFrameworkList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToAnotherList {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		System.out.println("first array  : " +l1);
		List<Integer> l2=new ArrayList<Integer>(Arrays.asList(1,2,3,7,8,9,10));
		System.out.println("second array : " +l2);
		List<Integer> l=new ArrayList<Integer>();
		l.addAll(l1);
		System.out.println("new array : "+l);
		l1.addAll(l2);
		System.out.println("first array after adding : " +l1);
		l1.removeAll(l2);
		System.out.println("first array after removing : " +l1);
		
//		l1.retainAll(l2);
//		System.out.println("After retaining : "+l1);
		
		

	}

}
