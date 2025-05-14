package javaPractice;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number:");
		int num= sc.nextInt();
		int original = num;
		
		int rev=0;
		while(num!=0) {
			
			rev=rev*10 + num%10;
			num= num/10;
					
		}
		
		System.out.println(rev);
		System.out.println(original);
	
	if(rev==original) { System.out.println("palindrome"); }
	else {System.out.println("not a palindrome");}
	
	}
}
