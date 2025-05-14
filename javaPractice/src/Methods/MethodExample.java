package Methods;

public class MethodExample {
	// method
	public int add(int a, int b){ 
		int c = a+b;
		int d= 10;
		return c;
		
	}

	public static void main(String[] args) {
		MethodExample addition = new MethodExample();
		System.out.println(addition.add(10, 20));
		
	}

}
