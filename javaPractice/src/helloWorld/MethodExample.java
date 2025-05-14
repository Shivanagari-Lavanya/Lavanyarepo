package helloWorld;

public class MethodExample {
	public void sum(int x,int y) {
		int z=x+y;
		System.out.println(z);

	}
	public static void main(String[] args) {
		int a=10;
		int b=30;
		MethodExample obj=new MethodExample();
		obj.sum(a, b);		
	}
}
