package collectionFrameworkList;
import java.util.*;

public class IteratorExample {
	public static void main(String[] args) {
		ArrayList<String> s= new ArrayList<String>();
		s.add(" L ");
		s.add(" A ");
		s.add(" v ");
		s.add(" A ");
		s.add(" N ");
		s.add(" Y ");
		s.add(" A ");
		Iterator<String> i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("-----------");
		for(String value:s) {
			System.out.println(value);
		}
		System.out.println("-----------");
		ArrayList<Integer> s1= new ArrayList<Integer>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);		
		for(int value:s1) {
			System.out.println(value);
		}
		
		
	}
	

}
