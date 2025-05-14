package arrays;
import java.util.Arrays;
public class CopyingAnArray{
	public static void main(String[] args) {
		String[] a= {"Lavanya","java","selenium"};
		String[] b;
		b=a.clone();
		b[2]="python";
		System.out.println(Arrays.toString(b));	
		String[] c=new String[3];
		c=Arrays.copyOf(a,3);
		System.out.println(Arrays.toString(c));
		
		
	}
}
