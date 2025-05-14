package connstructors;
// this is also example of constructor overloading

public class TypesOfConstructor {
	//1.No Arguments Constructor
	int a=1;
	String b ="Type : NO Arguments";
	
	//2.Default Constructor
	public  TypesOfConstructor() { // class name is used
		 this.a= 2;
		this.b= "Type : Default";			
	}
	
	//3.Parameterized Constructor Constructor
	public  TypesOfConstructor(int a, String b) {
		this.a=a;
		this.b=b;					
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypesOfConstructor type1 = new TypesOfConstructor();
		System.out.println(type1.a);
		System.out.println(type1.b);
		TypesOfConstructor type2= new TypesOfConstructor(3,"Type : Parametrized");
		System.out.println(type2.a);
		System.out.println(type2.b);
		
	}

}



