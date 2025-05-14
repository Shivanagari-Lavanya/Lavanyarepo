package Methods;

public class MethodOverloading {
	
	public static void main(String[] args) {
		MethodOverloading ex= new MethodOverloading();
			ex.add(10, 20);	
		}
	
	// same method name different arguments
		public void add(int x, int y) {
			int z=  x+y;	
			System.out.println(z);
		}
		
		public void add(String x, String y) {
			String z=  x+y;
			System.out.println(z);
		}
}



