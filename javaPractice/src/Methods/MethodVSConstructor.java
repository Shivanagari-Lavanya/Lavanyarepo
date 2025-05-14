package Methods;

public class MethodVSConstructor {
	
 public int a;
int b;
int c;
	
	public MethodVSConstructor (int name, int number) {
		
		 this.a=name;
		 this.b= number;		 
		
	}	
			
		public int add(int a, int b){
			int c = a+b;
			return c;
			
		}

		public static void main(String[] args) {
			MethodExample addition = new MethodExample();
			System.out.println(addition.add(10, 20));
			int name;
			int number;
			
			
			MethodVSConstructor constructor = new MethodVSConstructor(10,20);
			System.out.println(constructor.a);
			
		}

	}



