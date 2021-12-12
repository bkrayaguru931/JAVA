package aSSIGNMENT5;

import java.util.Scanner;
public class July16 {

	public static void main(String[] args) {
	
//		9. For a given x and a given n, write a java program to compute xn/n!.	

//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the values of x and n to calculate x^n/n!: ");
//		int x=sc.nextInt();
//		int n=sc.nextInt();
//		int f=1;
//		for(int i=n;i>=1;i--) {
//			f*=i;
//			}
//		System.out.println((Math.pow(x, n))/f);
		
                          //Qn 10,11,12(imp)nextpg
		
//**imp	13. Write a java program to generate and print the first n terms of the Fibonacci sequence
//	where n>=1.The first few terms are: 0, 1, 1, 2, 3, 5, 8, 13, ......
//	Example: If n=1, it will display as: Fibonacci Series is: 0
//	If n=2, it will display as: Fibonacci Series is: 0, 1
//	If n=3, it will display as: Fibonacci Series is: 0, 1, 1 ....
//	If n=10, it will display as: Fibonacci Series is: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter the number of terms: ");
//		int n=sc.nextInt();
//		int a=0;
//		int b=1;
//		for(int i=1;i<=n;i++) {
//			System.out.print(a + " ");
//			int c=a+b;
//			a=b;
//			b=c;
//		}
		
//**doubt		14. Write a java program to generate and print the first n terms of the Fibonacci numbers
//		using an efficient algorithm.
		
//		15. Suppose you save $100 each month into a savings account with the annual interest rate
//		5%. So, the monthly interest rate is 0.05 / 12 = 0.00417.
//		After the first month, the value in the account becomes
//		100 * (1 + 0.00417) = 100.417
//		After the second month, the value in the account becomes
//		(100 + 100.417) * (1 + 0.00417) = 201.252
//		After the third month, the value in the account becomes
//		(100 + 201.252) * (1 + 0.00417) = 302.507
//		and so on.
//		Write a java program that prompts the user to enter an amount (e.g., 100), the annual interest
//		rate (e.g., 5), and the number of months (e.g., 6) and displays the amount in the savings
//		account after the given month.
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter an amount: ");
//          double amount=sc.nextInt();
//        System.out.println("enter anual interest rate: ");
//          double rate=sc.nextInt();
//         double  mrate=rate/1200;
//          System.out.println("enter no. of months: ");
//          int month=sc.nextInt();
//       double  savingamnt=0;
//          for(int i=1;i<=month;i++) {
//        	  savingamnt = (amount+ savingamnt)*(1+mrate);
//          }
//          System.out.println(savingamnt);
		
//**imp	16. Write a java program that accepts a positive integer n and reverses the order of its digits.
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a number");
//	int n=sc.nextInt();
//	int rev=0;
//	while(n>0) {
//		int temp=n%10;
//		rev=temp+(rev*10);
//		n=n/10;
//	}
//	System.out.println(rev);
		
	
	
//**doubt	17. Write a java program to compute the square root of a number using Newton’s method
		
//	18. Using Newton’s method, write a java program that takes integers N and k as commandline
//	arguments and prints the k th root of N
		
//	19. Write a java program that puts the binary representation of a positive integer N into a
//	String s
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a positive integer: ");
//	int n=sc.nextInt();
//	String s="";
//		while(n>0) {
//			int temp=n%2;
//			s=temp+s;
//			n=n/2;
//		}
//         System.out.println(s);
		
	
//**imp
//		20. Write a java program that reads an integer and displays all its smallest factors in
//	increasing order. For example, if the input integer is 120, the output should be as follows: 2, 2,
//	2, 3, 5
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a positive integer: ");
//		int n=sc.nextInt();
//		int index=2;
//		while(n/index!=1) {
//			if(n%index==0) {
//				System.out.print(index+",");
//				n=n/index;
//			}
//			else index++;
//				
//			}
//		System.out.println(n+".");
		
//		21. Write a java program GCD that finds the greatest common divisor (gcd) of two integers
//		using Euclid’s algorithm, which is an iterative computation based on the following
//		observation: if x is greater than y, then if y divides x, the gcd of x and y is y; otherwise, the gcd
//		of x and y is the same as the gcd of x % y and y.
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter two numbers: ");
//		int x=sc.nextInt();
//		int y=sc.nextInt();
//		while(y>0) {
//			int rem=x%y;
//			x=y;
//			y=rem;
//		}
//		System.out.println("GCD = "+x);
		
		
//		22. Write a java program to check a number n is prime or not. The number to be inputted
//		through keyboard.		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the no.");
//		int n=sc.nextInt();
//		boolean isPrime=true;
//		for(int i=2;i<n;i++) {
//			if(n%i==0) {
//				isPrime=false;
//				break;
//			}
//			
//		}
//		if(n<2) isPrime=false;
//		System.out.println(isPrime);
		
//		23. Write a java program called PrimeCounter that takes a commandline argument N and
//		finds the number of primes less than or equal to N.
		
//		24. Write a java program that takes a command-line argument N and prints out all integers
//		less than or equal to N that can be expressed as the sum of two cubes in two different ways. In
//		other words, find distinct positive integers a, b, c, and d such that a3 + b3 = c3 + d3 . Use four
//		nested for loops.
		
		

	}

}
