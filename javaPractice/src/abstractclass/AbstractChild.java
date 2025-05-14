package abstractclass;

public class AbstractChild extends AbstractParent {
	public static void main(String[] args) {
		String flystring = fly();
		AbstractChild p = new AbstractChild();
		p.color();
		System.out.println(flystring);
	}

	public void color() {
		System.out.println("My color is green");
	}

}
