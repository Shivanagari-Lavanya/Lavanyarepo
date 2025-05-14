package javaPractice;

import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a= new Scanner(System.in);
		
		int num =a.nextInt();
		
		String s= a.next();
		
		if(num>0){
			System.out.println(num);
		}
		else {
			System.out.println(s);
		}

	}
	
	Scanner sc= new Scanner(System.in);
	int i= sc.nextInt();
	

}
