package aSSIGNMENT4;

import java.util.Scanner;
public class July13 {

	public static void main(String[] args) {
//		1. Write a java program to input a string message and display it 10 times in the following manner.
//		Use a while loop. Let the string message be “Hello”.
//		Enter a message
//		Hello
//		1st Hello
//		2nd Hello
//		3rd Hello
//		4th Hello
//		5th Hello
//		6th Hello
//		7th Hello
//		8th Hello
//		9th Hello
//		10th Hello	
		
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a Message: ");
//	String s1=sc.next();
//	int n=1;
//	while(n<=10) {
//		System.out.println(n+"th "+s1);
//		n++;
//	}
		
//**LAST  2. Rewrite the above java program in such a way that takes the number of lines to print as a command-line argument. You may assume that 
//		the argument is less than 1000.
//		Hint: Use i % 10 and i % 100 to determine when to use st, nd, rd, or th for printing the ith Hello.
		
//		3. Write a java program that gets an integer from the user. Count from 0 to that number. Use a for loop to do it.
//		Count to: 20
//		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Count to: ");
//		int n=sc.nextInt();
//		for(int i=0;i<=n;i=i++) {
//			System.out.print(i+" ");
//		}
		
//		4. Write a java program that gets three integers from the user. Count from the first number to the second number in increments of the third 
//		number. Use a for loop to do it.
//		Count from: 4
//		Count to: 13
//		Count by: 3
//		4 7 10 13
		
//		Scanner sc=new Scanner(System.in);
//	    System.out.println("Count from: ");
//	    int a=sc.nextInt();
//	    System.out.println("Count to: ");
//	    int n=sc.nextInt();
//	    System.out.println("Count by: ");
//	    int x=sc.nextInt();
//	    for(int i=a; i<=n;i=i+x) {
//	    System.out.print(i+" ");
//	    }
		
//   5. Write a java program that uses a for loop. With the loop, make the variable x go from -2 to 2, counting by 0.5. 
//   (This means that x can't be an int.)
//				-2.0
//				-1.5
//				-1.0
//				-0.5
//				0.0
//				0.5
//				1.0
//				1.5
//				2.0
//		Scanner sc=new Scanner(System.in);
//		for(double i=-2;i<=2;i=i+0.5) {
//		System.out.println(i);
//		}
		
//		6. Write a java program that, using one for loop and one if statement, prints the integers from 1,000 to 2,000 with five integers per line.
//		Hint: Use the % operation.
		
//		for(int i=1000;i<=2000;i++) {
//			System.out.print(i+" ");
//			if(i%5==0) {
//				System.out.println();
//			}
//		}
		
//**LAST 7. Write a java program that takes an integer N as a command-line argument, uses Math.random() to print N uniform random values between 0 
//		and 1, and then prints their average value
		
//**imp		8. Write a java program to print the following output using loop.
//		1
//		121
//		1213121
//		121312141213121
//		1213121412131215121312141213121
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the no of line: ");
//		int n=sc.nextInt();
//		String s1=" ";
//		for(int i=1;i<=n;i++) {
//			s1=s1+i+s1;
//			System.out.println(s1);
//		}
		
//		9. If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
//		The sum of these multiples is 23. Write a java program to find the sum of all the multiples
//		of 3 or 5 below 100
		
//		System.out.print("Sum of all the multiples of 3 or 5 bellow 100=" );
//		int sum=0;
//		for(int i=1  ;i<=100;i++) {
//			if(i%3==0 || i%5==0) {
//				sum=sum+i;
//			}
//		}
//		System.out.println(sum);
		
//		10. Write a java program to print the multiplication table of a number entered by the user.
//		Enter a no. for which you want to find the multiplication table: 8
//		8x1=8
//		8x2=16
//		8x3=24
//		8x4=32
//		8x5=40
//		8x6=48
//		8x7=56
//		8x8=64
//		8x9=72
//		8x10=80
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a no. for which you want to find the multiplication table: ");
//		int n=sc.nextInt();
//		for(int i=1;i<=10;i++)
//			System.out.println(n+"X"+i+"="+n*i);
	}

}
