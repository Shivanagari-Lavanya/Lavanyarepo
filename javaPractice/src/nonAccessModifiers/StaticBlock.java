package nonAccessModifiers;

public class StaticBlock {
	static int a;
	static String name;
	static {
		a=10;
		name="Lavanya";
		System.out.println(name);//printing without main method by using static method
	}
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(name);
	}
	

}
