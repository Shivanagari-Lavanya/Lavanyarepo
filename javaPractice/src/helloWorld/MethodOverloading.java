package helloWorld;
// method overloading=compile time Polymorphism
public class MethodOverloading {
	public static void main(String[] args) {
		int a =10;
		int b =20;
		MethodOverloading e1=new MethodOverloading();
		System.out.print("The sum of a+b is   : ");
		e1.sum(a,b);
		int d=30;
		int e=40;
		int f=50;
		System.out.print("The sum of d+e+f is : ");
		e1.sum(d,e,f);
		int g=10;
		int h=20;
		System.out.print("The sum of g+h is   : ");
		e1.sum(g, h);
	}
public void sum(int x,int y) {
	int z= x+y;
	System.out.println(z);	
}
public void sum(int x,int y,int z) {
	int k= x+y-z;
	System.out.println(k);	
}
}
