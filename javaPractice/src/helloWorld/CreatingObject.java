package helloWorld;
public class CreatingObject {
	int a=10;//instance variable
	static int b=20;//class variable (static variables)
public static void main(String[] args) {
		int c=30;//local variable
		System.out.println("local variable: "+c);
		CreatingObject c1=new CreatingObject();		
		System.out.println("Instance Variable :"+c1.a);
		System.out.println("Class variables: "+b);
		c1.a=30;
		b=40;
		System.out.println("After changing Instance Variable :"+c1.a);
		System.out.println("After changing Class variables: "+b);
		CreatingObject d=new CreatingObject();
		System.out.println("After creating new object Instance Variable :"+d.a);
		System.out.println("After creating new object Static Variable :"+b);	
		
	}

}
