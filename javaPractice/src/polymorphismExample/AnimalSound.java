
package polymorphismExample;

public class AnimalSound {
	public void sound() {
		System.out.println("animal sounds");
	}

	public static void main(String[] args) {
			AnimalSound a=new AnimalSound();
			a.sound();
			
			
			//overriding: child class has exact same method that of parent class(ignores the method in parent if same method is available in child)
			//same name , same parameters but different class
			Dog d= new Dog();
			d.sound();
			
			//overloading:sound() method has same name but has different parameters		
			Cat cat= new Cat();
			
			cat.sound();
			
			cat.sound(3);
			
		}
	
	
	

}
