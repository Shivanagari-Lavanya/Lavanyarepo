package polymorphismExample;

public class Cat extends AnimalSound {
	public void sound() {
		
		//System.out.println("I am cat");
		System.out.println("MEOW");
	}
	
	public void sound(int nuberoftimes) {
		//System.out.println("I am cat");
		for(int i=0;i<nuberoftimes;i++) {
		System.out.println("MEOW");
		}
	}
	
	public static void main(String[] args) {
		Cat a=new Cat();
		a.sound();
		
		a.sound(3);
	}

}
