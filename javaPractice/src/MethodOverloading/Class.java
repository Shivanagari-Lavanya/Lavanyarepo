package MethodOverloading;

////CHILD CLASS////

public class Class extends Class1 {
	
	void sub(int x, int y) {
		int z= x*y;
		System.out.println("Multiply of two numbers: " + z);
	} 
	
	public static void main(String[] args) {
		
		Class addition= new Class();
		addition.add(10, 20);
		
		addition.add(10, 20, 30);
		
		//overriding
		Class subtract= new Class();
		subtract.sub(90, 10);
		
	}

}
