package nonAccessModifiers;

public class AbstractChild extends AbstractParent {
	
	public static void main(String[] args) {
		AbstractChild an= new AbstractChild();
		an.animal();
		an.animalname();
		System.out.println(an.age);	
		
	}
	@Override
	public void animal() {
		System.out.println("sucessfully implemented abstract methods");
		
	}
	public void animalname() {
		System.out.println("Dog");
	}

}

