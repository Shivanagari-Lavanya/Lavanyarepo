package nonAccessModifiers;

public class StaticMethod {
	int a=10;
	static int b=20;
	public static void display() {
		System.out.println("I am in static method");
	}
	public static void main(String[] args) {
		StaticMethod a1=new StaticMethod();
		System.out.println("The value of a is : "+a1.a);
		System.out.println("The value of b is : "+b);
		display();
		
	}
	

}
