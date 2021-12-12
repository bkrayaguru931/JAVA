package aSSIGNMENT5;

import java.util.Scanner;
public class July17 {
//	int fact(int zz) {
//		if (zz==0)
//		return 1;
//		else
//		return zz*fact(zz-1) ;
//		}

	public static void main(String[] args) {
//IMP		
//**doubt(d)		10. Write a java program to evaluate the function sin(x) as defined by the infinite series
//		expansion. sin (x) = x- x 3 /3! + x 5 /5! - x 7 /7! +... The acceptable error for computation is 10-6 .
		
//	Scanner sc=new Scanner(System.in);
//	double x;
//	System.out.println("Enter the value of x in radians: ");
//	x=sc.nextDouble();
//	double tsin=x;
//	double error=0.000001;
//	double term=x;
//	int i=1;
//	while(Math.abs(term)>error) {
//		i+=2;
//		term=-term*(x*x)/(i*(i-1));
//		tsin+=term;
//	}
//	System.out.println("The value of sin("+x+")= "+tsin);
	

		
//**imp	11. Write a java program to evaluate the function cos(x) as defined by the infinite series
//	       expansion. cos (x) =1- x 2 /2! + x 4 /4! - x 6 /6! +.... The acceptable error for computation is 10 -6.
		
//		Scanner sc=new Scanner(System.in);
//		double x;
//		System.out.println("Enter the value of x in radians: ");
//		x=sc.nextDouble();
//		double tcos=1;
//		double error=0.000001;
//		double term=1;
//		int i=0;
//		while(Math.abs(term)>error) {
//			i+=2;
//			term=-term*(x*x)/(i*(i-1));
//			tcos+=term;
//		}
//		System.out.println("The value of cos("+x+")= "+tcos);
		

//**doubt	12. Assume that x is a positive variable of type double. Write a code fragment that uses the
//	     Taylor series expansion to set the value of sum to e x = 1 + x + x 2 /2! + x 3 /3! + ......
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the value of x :");
//		double x;
//		x=sc.nextDouble();
//		double sum=0.0;
//		double term;
//		for(int i=0;i<=100;i++) {
//			   for(int j=x;j>=1;j--)
//			    term=Math.pow(x, i)/
//		}
//		System.out.println("Value of e^"+x+" ="+sum);
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the value of x : ");
//		double x=sc.nextDouble();
//		double sum = 0.0;
//		double term = 1.0;
//		for (int i = 1;i<=50 ; i++)
//		{
//		sum = sum + term;
//		term = term * x / i*(i+1);
//		}
//		System.out.println("Value of e^"+x+" ="+sum);

		//**
//		System.out.println("e("+x+") = "+sum);
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the value of x : ");
//		double x=sc.nextDouble();
//		double sum = 0.0;
//		double term = 1.0;
//		for (int i = 1; sum != sum + term; i++)
//		{
//		sum = sum + term;
//		term = term * x / i;
//		}
//		System.out.println("e("+x+") = "+sum);
		
		                                    //HOME WORK QUESTIONS
//		1. Write a java program that reads a list of numbers and makes a count of the number of negatives and the number of non-negative members
//		in the set.
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter how many numbers you want to enter: ");
//		int n=sc.nextInt();
//		System.out.println("Enter the numbers");
//		int num,nonneg=0,neg=0;
//		for(int i=1;i<=n;i++) {
//			  num=sc.nextInt();
//				num++;
//				if(num>=0) nonneg++;
//				else neg++;
//		}
//		System.out.println("the number of negatives= "+neg);
//		System.out.println("the number of nonnegatives= "+nonneg);
		

		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("n= ");
//		int n=sc.nextInt();
//		int sum=0;
//		for(int i=1;i<=n;i++) {
//			sum+=i*i;
//		}
//		System.out.println(sum);
		
//**doubt  3. Write a java program to generate the first n terms of the sequence without using multiplication.
//		1 2 4 8 16 32 ……….                                                 //forloop k andar 
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int term=1; 
//		
//		System.out.print("1 ");
//		for(int i=0;i<=n;i++) {
//		    term*=2;
//		    System.out.print(term+" ");
//		}
		
//		4. Write a java program to prints out n values of the sequence
//		1 -1 1 -1 1 -1 ………
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("n= ");
//		int n=sc.nextInt(); 
//		for(int i=1;i<=n;i++) {
//			if(i%2==0)System.out.print("-1 ");
//			else System.out.print("1 ");
//		}
		
//**    5. For a given n, write a java program to compute 1/n!.
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("n= ");
//		int n=sc.nextInt();
//		int nf=1;
//		for(int i=n;i>=1;i--) {
//			nf*=i;
//		}
//		double ans=1.0/nf;
//		System.out.println(ans);
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("n= ");
//		int n=sc.nextInt();
//		double nf=1;
//		for(int i=n;i>=1;i--) {
//			nf*=1.0/i;
//		}
//		System.out.println(nf);
		
//**	6. Write a java program to determine whether or not a number n is a factorial number.
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number: ");
//		int n=sc.nextInt();
//		boolean isFactorial=false;
//		for(int i=2;i<=n-2;i++) {
//			 n/=i;
//			if(n%i==0) {
//				isFactorial=true;
//			}
//		}
//		if(n==1) isFactorial=true;
//		System.out.println(isFactorial);
		
		
		
	}

}
