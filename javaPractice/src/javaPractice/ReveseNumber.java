package javaPractice;

import java.util.Scanner;

public class ReveseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int rev=0;
		int num =sc.nextInt();
		 while(num!=0) {
			 rev= rev*10 + num%10;
			 num=num/10;
		 }
		
		 System.out.println(rev);
	}

}
