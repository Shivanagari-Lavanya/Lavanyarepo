package helloWorld;
import java.util.Scanner;
public class TakingInputFromUser {
public static void main(String[] args) {
	int x;
	String s;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter integer value : ");
	x=sc.nextInt();
	System.out.println("the output is:"+x);
	sc.nextLine();
	System.out.print("Enter string value : ");
	s=sc.nextLine();
	System.out.println("The String is: "+s);
	
	sc.close();
	
	
}
}
