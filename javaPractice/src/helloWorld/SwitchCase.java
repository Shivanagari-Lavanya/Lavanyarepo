package helloWorld;
import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
	
	System.out.println("1.for sunday\n2.for tuesday\n3.for wednesday");
	Scanner sc= new Scanner(System.in);
	int day= sc.nextInt();
	
	
	switch(day) {
	case 1:
		System.out.println("sunday");
		break;
	case 2:
		System.out.println("monday");
		break;
	case 3:
		System.out.println("tuesday");	
		break;
	default:
		System.out.println("not applicable");
	sc.close();
	}
	}
}
	