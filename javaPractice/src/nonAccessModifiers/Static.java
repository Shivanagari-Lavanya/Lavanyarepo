package nonAccessModifiers;

public class Static {
	int a=10;
	static int b=20;//Static modifiers can be used by giving static keyword
	static int c=30;
	public static void main(String[] args) {
		Static obj=new Static();
		System.out.println("The value of a:" +obj.a);
		System.out.println("The value of b:" +Static.b );//they can be accessed by using class name
		System.out.println("The value of c:" +c );// can be accessed without class name
		b=40;
		System.out.println(b);
		Static o=new Static();
		System.out.println(Static.b);
	}
}
