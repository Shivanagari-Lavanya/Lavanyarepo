package practice;
import java.util.Scanner;

public class AddingNum {
	public static void main(String[] args) {
		int a;
		int b;
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of a: ");
		a=sc.nextInt();
		System.out.print("Enter value of b: ");
		b=sc.nextInt();
		result=a+b;
		System.out.println("The value of a+b: "+result);
		sc.close();	
	}

}
