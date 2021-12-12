package cw;

import java.util.Scanner;

public class NumberOfOccuranceOfanElement {

	public static void main(String[] args) {
		
		 System.out.println("Enter the number of elements you want to enter: ");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			System.out.println("Enter the elements: ");
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				
			}
		System.out.println("Enter the element: ");
	}

}
