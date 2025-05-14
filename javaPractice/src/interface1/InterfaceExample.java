package interface1;
interface drawable{
	void draw(); 
}

public class InterfaceExample {

	public static void main(String[] args) {
		drawable a=new rectangle();
		a.draw();
	}
}

class rectangle implements drawable{
	@Override
	public void draw() {
		System.out.println("Drawing rectangle");			
	}
}
class circle implements drawable{

	@Override
	public void draw() {
		System.out.println("Drawing circle");

	}

}




