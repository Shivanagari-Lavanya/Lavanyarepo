package inheritance;

public class ChildClass extends ParentClass {
	int a=10;
	public void lavanya() {
		System.out.println("I am Lavanya");		
	}
	public void display() {
		System.out.println("I am in child class");	
	}
	public void lav() {
		super.display();
		
	}
	
public static void main(String[] args) {
	ChildClass obj2= new ChildClass();
	obj2.display();
	obj2.lavanya();
	System.out.println("The value of a in childclass  : "+obj2.a);
	System.out.println("The value of x in parentclass : "+obj2.x);	
	obj2.display();
	obj2.lav();
	
}
}
 