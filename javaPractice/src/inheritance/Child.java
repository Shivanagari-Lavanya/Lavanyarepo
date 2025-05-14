package inheritance;
//inheritance with overloading
public class Child extends Parent {
	public void add(int x,int y,int p) {
		int z;
		z=x+y+p;
		System.out.println("From Child class method  : "+z);
		
	}
	public static void main(String [] args) {
		Child b=new Child();
		b.add(10,20,70);
		b.add(20,50);
		
	}
	
}
