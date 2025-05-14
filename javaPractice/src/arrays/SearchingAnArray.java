package arrays;
import java.util.Arrays;
//for searing in array we need to sort the array first
public class SearchingAnArray {
	public static void main(String[] args) {
		int arr[]= {6,8,2,5,1,0,4,9,3};
		String[] b= {"Lavanya","Java","Selenium"};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("The index of 4 is :"+Arrays.binarySearch(arr, 4));
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		System.out.println("The index of Java is :"+Arrays.binarySearch(b, "Java"));
		
	}

}
