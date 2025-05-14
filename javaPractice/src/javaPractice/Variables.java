package javaPractice;

public class Variables {
	int a=20; // Instance variables/Non static
	static int b= 30;  //static variable

	public static void main(String[] args) {
		
		int c= 40; //local variable
		System.out.println("local variable=" + c);
		
		Variables v= new Variables();
		System.out.println("Non static variable=" + v.a);//we need to create object to call Instance variables
		
		System.out.println("Static variable=" + b); // Static variables can be called directly
		v.a= 50;
		v.b= 60;
		
		System.out.println(v.a);
		
		System.out.println(v.b);
		
		Variables v1= new Variables();	
		
		System.out.println(v1.a);
		
		System.out.println(v1.b);
		
	 {
		int a= 999; // block variable
		//int b= 50;
		System.out.println("Block varaible=" +a);
		System.out.println("Static variable=" + b); 
		}
		

	}

}
