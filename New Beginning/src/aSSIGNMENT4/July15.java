package aSSIGNMENT4;

import java.util.Scanner;

public class July15 {

	public static void main(String[] args) {
//		11. Write a java program to find the difference between the sum of the squares of the first one hundred natural numbers and the square of
//		the sum.
		
//	   int sum1=0;
//	   int sum2=0;
//	   for(int i=1;i<=100;i++) {
//		  sum1+=i*i;
//		  sum2+=i;
//	   }
//	   sum2=sum2*sum2;
//	   System.out.println("The sum of the squares of the first hundred natural numbers is,"+sum1);
//	   System.out.println("The square of the sum of the first hundred natural numbers is,"+sum2);
//	   System.out.println("Hence the difference between the sum of the squares of the first hundred natural numbers and the square "
//	   		+ "of the sum is: "+(sum2-sum1));
		
//		12. Write a java program called FunctionGrowth that prints a table of the values log N, N, N log N, N2, N3, and 2N for N = 16, 32, 64, ..., 
//				2048. Use tabs (\t characters) to line up columns.
		
//		System.out.println("log N                   N           N log N             N^2       N^3         2^N ");
//		for(int N=16;N<=2048;N=N*2) {
//			
//			System.out.println(Math.log(N)+"\t"+ N +"\t"+N*Math.log(N)+"\t"+N*N+"\t"+N*N*N+"\t"+Math.pow(N, 2));
//			}
		
//		13. An integer n is divisible by 9 if the sum of its digits is divisible by 9. Write a java program
//		to display each digit, starting with the rightmost digit.
//		Your program should also determine whether or not the number is divisible by 9. Test it on the following numbers:
//		n = 154368
//		n = 621594
//		n = 123456
//		Hint: Use the % operator to get each digit; then use / to remove that digit. So 154368 % 10 gives 8 and 154368 / 10 gives 15436. The next 
//		digit extracted should be 6, then 3 and so on.
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter the number: ");
//		long n=sc.nextInt();
//		long num=n;
//		long sum=0;
//		long temp;
//		while(n>0) {
//			temp=n%10;
//			sum+=temp;
//			n/=10;
//			System.out.print(temp+" ");
//		}
//         if(sum%9==0)System.out.print("The No "+num+" is divisible by 9.");
//         else System.out.println("The No "+num+" is not divisible by 9.");
		
//**doubt		14. Write a java program to print largest power of two less than or equal to N.
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the value of n");
//		int n=sc.nextInt();
//	    int x=0;
//		int pow=1;
//		while(pow<=n)
//		{
//		x=pow;
//		pow*=2;
//		}
//		System.out.println(pow);

//		Scanner sc=new Scanner(System.in);
//		int n;
//		System.out.println("Enter the value of n");
//		n=sc.nextInt();
//		int x=0;
//		int v=1;
//		while(v<=n)
//		{
//		x=v;
//		v=v*2;
//		}
//		System.out.println(x);
		
		
		
		
		
		
		
		
		
		
		
		
		
//		15. Write a java program to print the below given pattern using while loop as well as for loop in two different programs.
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
		
//		for(int j=1;j<=4;j++) {
//		for(int i=1;i<=5;i++)System.out.print("* ");
//		System.out.println();}
		
//		int j=1;
//		while(j<=4) {
//			int i=1;
//		while(i<=5) {
//			System.out.print("* ");
//			i++;
//		}
//		System.out.println();
//		j++;
//		}
		
//		16. Write the java programs to print the following four patterns using for loop using four different programs.
//		(a)
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
//		for(int j=1;j<=5;j++) {
//		for(int i=1;i<=j;i++) {System.out.print("* ");
//		}
//		System.out.println();
//		}
		
//	 (b)   1
//		   1 2
//		   1 2 3
//		   1 2 3 4
//		   1 2 3 4 5
		
//		for(int j=1;j<=5;j++) {
//			for(int i=1;i<=j;i++) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
		
//		(c)
//		1
//		2 2
//		3 3 3
//		4 4 4 4
//		5 5 5 5 5
		
//		for(int j=1;j<=5;j++) {
//			for(int i=1;i<=j;i++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
//		(d)
//		1
//		2 3
//		4 5 6
//		7 8 9 10
//		11 12 13 14 15
		
//		int n=1;
//		for(int j=1;j<=5;j++) {
//			for(int i=1;i<=j;i++) {
//				System.out.print(n+" ");
//				n++;
//			}
//			System.out.println();
//		}
		
//**imp		17. Write a java program to print the following pattern using nested loops.
//		* * * * * * * * * * 1
//		* *   *   *   *   * 2
//		*   *     *     *   3
//		* *   *       *     4
//		*       *         * 5
//		* * *     *         6
//		*           *       7
//		* *   *       *     8
//		*  *            *   9
//		* *    *          * 10
		
//		for(int j=1;j<=10;j++) {
//		for(int i=1;i<=10;i++) {
//			if(i%j==0 || j%i==0)System.out.print("* ");
//			else System.out.print(" ");
//		}
//		System.out.println(j);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
