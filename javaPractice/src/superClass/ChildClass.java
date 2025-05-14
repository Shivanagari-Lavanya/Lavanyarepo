package superClass;

public class ChildClass extends ParentClass {
	
	int a=300;
	public void display(){
		ChildClass c=new ChildClass();
		System.out.println(super.a);
		System.out.println(c.b);
		
	}
	
	public static void main(String[] args) {
		ChildClass c1=new ChildClass();
		c1.display();
	}

}
