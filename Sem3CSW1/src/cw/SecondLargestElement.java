package cw;
import java.util.*;
public class SecondLargestElement {

	public static void main(String[] args) {
		 System.out.println("Enter the number of elements you want to enter: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the elements: ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		 Arrays.sort(arr);
		 for(int i=0;i<n;i++) {
		 }
		 System.out.println("The second largest element of the array is: "+arr[n-2]);
	}

}
