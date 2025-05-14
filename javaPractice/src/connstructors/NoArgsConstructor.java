package connstructors;

public class NoArgsConstructor {
	int a=5;
	float b;
	// here we are not creating any separate constructor instead we are jst creating new object 
	// and calling this a and b using this new obj
	
	public static void main(String[] args) {
		NoArgsConstructor o = new NoArgsConstructor();
		System.out.println(o.a);
		System.out.println(o.b);
	}

}
