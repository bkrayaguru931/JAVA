package aSSIGNMENT1n2;

import java.util.Scanner;
public class July7 {

	public static void main(String[] args) {
		
//**		4. Write a java program that reads an integer between 0 and 1000 and adds all the digits in the integer. For example, if an integer is 932, the sum of all its digits is 14.
//		Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
//		Here is a sample run:
//		Enter a number between 0 and 1000: 999
//		The sum of the digits is 27
		
//		System.out.println("Enter a no betn 0 to 1000: ");
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt(); 
//	    int temp=0;
//		int sum=0;
//		temp=n%10;
//		sum=sum+temp;
//		n=n/10;
//		temp=n%10;
//		sum=sum+temp;
//		n=n/10;
//		temp=n%10;
//		sum=sum+temp;
//		n=n/10;
//		System.out.println("Sum of digit: " + sum);
		
		                      //or
		
        System.out.println("Enter a no: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); 
	    int temp=0;
		int sum=0;
		while(n>0 && n<1000) {
			temp=n%10;
			sum=sum+temp;
			n=n/10;
			}
		System.out.println(sum);
	}

}
