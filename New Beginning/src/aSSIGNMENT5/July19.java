package aSSIGNMENT5;

import java.util.Scanner;
public class July19 {

	public static void main(String[] args) {
		                                      //12-19
		
//		12. Given two numbers d and e are suspected of being consecutive members of the Fibonacci sequence. Write a java program that will refute
//		or confirm this conjecture.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		while(c<x) {
			c=a+b;
			a=b;
			b=c;	
		}
		if(c==x && c==y) System.out.println("Numbers belongs to fibonacci");
		else System.out.println("Numbers not belongs to fibonacci");
		
//		13. Write a java program to generate the sequence where each member is the sum of the adjacent factorials.
//		f3=1! + 0!
//		f4=2! + 1!
//		f5=3! + 2!
//		Note that by definition 0! = 1.
		
		Scanner sc=new Sanner(System.in);
		System.out.println("Enter no of terms.");
		int a=
	}

}
