//		3. Write the methods with the following headers
//		// Return the reversal of an integer, i.e., reverse(456) returns 654
//		public static int reverse(int number)
//		// Return true if number is a palindrome
//		public static boolean isPalindrome(int number)
//		Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal
//		is the same as itself. Write a java program that prompts the user to enter an integer
//		and reports whether the integer is a palindrome.
package aSSIGNMENT6;

import java.util.Scanner;

public class Qn3 {
	
	public static int reverse(int number) {
		int temp;
		int rev=0;
		while(number>0) {
			temp=number%10;
			rev=rev*10+temp;
			number/=10;
			}
	return rev;
	}
	
	public static boolean isPalindrome(int number) {
		if(number==reverse(number)) 
		return true;
		else return false;
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		System.out.println(reverse(a));
		System.out.println(isPalindrome(a));
		

	}

}
