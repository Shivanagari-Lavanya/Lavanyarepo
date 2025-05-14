package practice;
import java.util.Scanner;

public class OddWeird {
	public static void main(String[] args) {
		int a;
	    Scanner sc=new Scanner(System.in);
	    a=sc.nextInt();
	    if(a%2==0){
	        System.out.println("Not Weird");
	    }
	    else{
	        System.out.println("Weird");
	    }
	    sc.close();
	}
}


