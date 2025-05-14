package practice;

import java.util.Scanner;

public class AddUsingMethods {
	public void sum(int x,int y) {
		int a = x+y;
		System.out.println("Sum is :" +a);
		}
	public void sub(int x,int y) {
		int b = x-y;
		System.out.println("Sum is :" +b);
		}
	public void mul(int x,int y) {
		int a = x*y;
		System.out.println("Sum is :" +a);
		}
	public void div(int x,int y) {
		int a = x/y;
		System.out.println("Sum is :" +a);
		}
	public void per(int x,int y) {
		int a = x%y;
		System.out.println("Sum is :" +a);
		}
	
	public static void main(String[] args) {
		AddUsingMethods a= new AddUsingMethods();
		Scanner s = new Scanner(System.in);
		int num1;
		int num2;
		String opp;
		System.out.println("Which option you want to perform + ,-,*,/, % : " );
		opp=s.next();
		if(opp.equals("+")) {
		System.out.println("Enter num1 : ");
		num1=s.nextInt();
		System.out.println("Enter num2 : ");
		num2=s.nextInt(); ;
		a.sum(num1,num2);
		}
		else if(opp.equals("-")) {
			System.out.println("Enter num1 : ");
			num1=s.nextInt();
			System.out.println("Enter num2 : ");
			num2=s.nextInt(); ;
			a.sub(num1,num2);
		}
		else if(opp.equals("*")) {
			System.out.println("Enter num1 : ");
			num1=s.nextInt();
			System.out.println("Enter num2 : ");
			num2=s.nextInt(); ;
			a.mul(num1,num2);
			}
		else if(opp.equals("/")) {
			System.out.println("Enter num1 : ");
			num1=s.nextInt();
			System.out.println("Enter num2 : ");
			num2=s.nextInt(); ;
			a.div(num1,num2);
			}
		else if(opp.equals("%")) {
			System.out.println("Enter num1 : ");
			num1=s.nextInt();
			System.out.println("Enter num2 : ");
			num2=s.nextInt(); ;
			a.per(num1,num2);
			}
		s.close();		
		
	}	

}
