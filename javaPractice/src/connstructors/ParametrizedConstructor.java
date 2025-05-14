package connstructors;

public class ParametrizedConstructor {
	int a;
	int b;
	// in this parametrized const we are passing int x, int y as parameters
	public  ParametrizedConstructor(int x,int y) {
		a=x;
		b=y;
	}
	public static void main(String[] args) {
		ParametrizedConstructor obj1=new ParametrizedConstructor(10,20);
		System.out.println(obj1.a);
		System.out.println(obj1.b);				
	}
}
