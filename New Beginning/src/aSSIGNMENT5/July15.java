package aSSIGNMENT5;

import java.util.Scanner;
public class July15 {

	public static void main(String[] args) {
//		1. Write a java program that takes the value of N through keyboard and prints a table of the power of 2 that are less than or equal to 2N.
//		Enter a number
//		5
//		0   1
//		1   2
//		2   4
//		3   8
//		4   16
//		5   32
     
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int N=sc.nextInt();
//		for(int i=0;i<=N;i++) {
//			System.out.println(i+"  "+Math.pow(2, i));
//		}
		
//**		2. Given a set of n student’s examination marks (in the range 0 to 100). Write a java program to count the number of students that passed 
//		the examination. A pass is awarded for all marks of 40 and above.
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("ENTER TOTAL NUMBER OF STUDENTS: ");
//		int n=sc.nextInt();
//		int count=0;
//		for(int i=1;i<=n;i++) {
//			System.out.println("ENTER THE MARKS: ");
//			int mark=sc.nextInt();
//			if(mark>=40) {
//				count++;
//			}		
//		}
//		System.out.println("THE NO. OF STUDENTS PASSED IS: "+count);
		
//**impdoubt(d)		3. Write a java program that displays all the numbers from 100 to 1,000, ten per line, that are
//		divisible by 5 and 6. Numbers are separated by exactly one space.
		
		int count=0;
		for(int i=100;i<=1000;i++) {
			if(i%5==0 && i%6==0) {
				 System.out.print(i+" ");
			count++;	 
				}
           if(count%10==0 && count>=10 ) {
           System.out.println();
           count=0;
           }
		}
		
//imp		
//**LAST		4. Write a java program that reads an unspecified number of integers, determines how many positive and negative values have been read,
//		and computes the total and average of the input values (not counting zeros). Your program ends with the input 0. Display the average as a 
//		floating-point number. Here is a sample run:
//			Enter an integer, the input ends if it is 0: 1 2 -1 3 0
//			The number of positives is 3
//			The number of negatives is 1
//			The total is 5.0
//			The average is 1.25
//			Enter an integer, the input ends if it is 0: 0
//			No numbers are entered except 0
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter an integer, the input ends if it is 0:");
//		int n=sc.nextInt();
//		int sum=0, num=0, pos=0, neg=0;
//		if(n==0) {
//			System.out.println("No numbers are entered except 0");
//		}
//		else {
//			while(n!=0) {
//				num++;
//				sum+=n;
//		    if(n>0)  pos++;
//		    else neg++;
//		    
//			n=sc.nextInt();
//			}
//		   double avg=sum/num;
//		   System.out.println("The number of positives is"+pos);
//		   System.out.println("The number of negatives is"+neg);
//		   System.out.println("The total is"+sum);
//		   System.out.println("The average is"+avg);
//		}
		
		
//		5. Given a set of n numbers. Write a java program that adds these numbers and returns the resultant sum and compute the average. Assume n
//		is greater than or equal to zero.
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter how many numbers you want to enter: ");
//		int n=sc.nextInt();
//		int sum=0;
//		for(int i=1;i<=n;i++) {
//			System.out.println("Enter the numbers: ");
//			int m=sc.nextInt();
//			sum+=m;
//		}
//		double avg=sum/n;
//		System.out.println("Sum of the numbers: "+sum);
//		System.out.println("Average of these numbers: "+avg);
		
//	6. Write a java program to compute the harmonic mean
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter how many numbers you want to enter: ");
//		int n=sc.nextInt();
//		double H=0;
//		for(int i=1;i<=n;i++) {
//			System.out.println("Enter the value of m"+i);
//			int m=sc.nextInt();
//			H+=1/m;
//		}
//		double HM=n/H;
//		System.out.println("Harmonic mean of these no.s: "+HM);		

	
//	7. Write a java program to compute the sum of the first n terms (n>=1) of the series.
//	S=1-3+5-7+9- .........
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the no.of terms: ");
//		int n=sc.nextInt();
//		int sum=0;
//		for(int i=1;i<=n;i++) {
//			
//			if(i%2==0) sum-=(2*i-1);
//			else sum+=(2*i-1);
//			
//		}
//		System.out.println(sum);
		                         //or
//		Scanner sc=new Scanner(System.in);
//		int i,sign=1,term=0,sum=0,m=1;
//		System.out.println("Enter the range");
//		int n=sc.nextInt();
//		for(i=1;i<=n;i++)
//		{
//		term=1;
//		term=sign*m;
//		sum+=term;
//		m+=2;
//		sign*=-1;
//		}
//		System.out.println("The sum is= "+sum);
		
//		8. Input a number n, write a java program to compute n factorial (written as n!) where n>=0.
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter n");
//		int n=sc.nextInt();
//		int factorial=1;
//		for(int i=n;i>=1;i--) {
//			factorial*=i;
//		}
//		System.out.println(factorial);
		
		
	}

}
