package connstructors;

public class DefaultConstructor {
	int a;
	int b;
	// here we are creating constructor without passing any parameters
	public  DefaultConstructor() {
		a=10;
		b=20;
	}
	public static void main(String[] args) {
		DefaultConstructor obj1=new DefaultConstructor();
		System.out.println(obj1.a);
		System.out.println(obj1.b);	
		
	}
}
