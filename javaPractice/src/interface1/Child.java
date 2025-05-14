package interface1;


public class Child implements  Drawablecase{
	public static void main(String[] args) {
		int a=10;
		System.out.println(a);
		Drawablecase d=new Child();
		
		d.draw();
		
	}

	@Override
	public void draw() {
		System.out.println("Drawing");
		
	}

}
