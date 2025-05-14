package javaPractice;

public class Spliystring2 {

	public static void main(String[] args) {
		String str1= "apple,ball,cat,dog";
		String[] a = str1.split(",");
		int len = a.length;
		int i=0;
		while(i<len) {
			System.out.println(a[i]);
			i++;	
		}
		//concatenate two strings
		String str2="egg,fan,gun";
		String str3= str1+str2;
		System.out.println(str3);
		
		
		
		
	}
}