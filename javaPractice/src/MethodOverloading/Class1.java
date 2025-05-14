package MethodOverloading;

///PARENT CLASS

public class Class1 {
	
public static void main(String[] args) {
		
		
		//overriding
		Class subtract= new Class();
		subtract.sub(90, 10);
		
}

	//overloading: same name, different parameters
	void add(int x, int y) {
		 int z= x+y;
		 System.out.println("Addition of two numbers: " + z);
		 //return z;
		
	}
	
	void add(int x, int y, int z) {
		 int a= x+y+z;
		 System.out.println("Addition of two numbers: " + a);
		
	}	
	
	//overriding: same name, same parameters, different class - it overrides method of parent class and returns only output from child class
	void sub(int x, int y) {
		int z= x-y;
		System.out.println("Subtraction of two numbers: " + z);
	}
	
}
