package polymorphismExample;

public class Dog extends AnimalSound{
	public void sound() {
		System.out.println("BOW BOW ");
	}
	public static void main(String [] args) {
		Dog d=new Dog();
		d.sound();
		
	}
	public void eat(int i) {
		// TODO Auto-generated method stub
		
	}

}
