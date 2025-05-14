package collectionFrameworkList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<Integer> a1= new ArrayList<Integer>(Arrays.asList(1,2,3));
		a1.add(10);
		a1.add(20);
		a1.add(30);
		System.out.println(a1);
		a1.remove(4);
		System.out.println("After removing 20: "+ a1);
		System.out.println("at index 1 : ["+a1.get(1)+"]");
		System.out.println(a1.contains(4));
		System.out.println(a1.size());
		ArrayList a2=new ArrayList();
		a2.add("Lavanya");
		a2.add(20);
		System.out.println(a2);
		
	}

}
