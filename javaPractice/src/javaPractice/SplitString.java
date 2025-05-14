package javaPractice;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Java,Selenium,testNG,maven" ;
		String[] str= s1.split(",");
		
		System.out.println("result = ");
		
		//using for loop
		for(int i=0; i< str.length; i++)   {
			System.out.println(str[i]);
		}
		
		//using while loop
		int a=str.length;
		int i=0;
		while(i<a){
			System.out.println(str[i]);
			i++;
		}
		

	}

	

}
