package practice;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int result;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of a : ");
		a=sc.nextInt();
		System.out.print("Enter the value of b : ");
		b=sc.nextInt();
		System.out.println("press\n1 for addition\n2 for subtraction\n3 for multiplication\n4 for division");
		c=sc.nextInt();
		switch(c) {
		case 1:
			result=a+b;
			System.out.print("The Addition of a+b is : "+result);
			break;
		case 2:
			result=a-b;
			System.out.print("The Subtraction of a-b is : "+result);
			break;
		case 3:
			result=a*b;
			System.out.print("The multiplication of a*b is : "+result);	
			break;
		case 4:
			result=a/b;
			System.out.print("The division of a/b is : "+result);	
			break;
		default:
			System.out.println("Invalid Input");
		}

		sc.close();
		
		
	}

}
