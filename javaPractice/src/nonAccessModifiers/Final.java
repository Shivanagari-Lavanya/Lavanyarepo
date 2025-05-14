package nonAccessModifiers;

public class Final {
 final String name= "Lavanya";
 public static void main(String[] args) {
	 Final n= new Final();
	 
	 System.out.println(n.name);
	// n.name= "s.Lavanya"; we cannot assign value to variable which is declared with final keyword
	 
 }
}
