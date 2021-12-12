//1.    Design a Simple Calculator using methods in java containing the following functionalities, namely, with Addition, Subtraction, Multiplication,
//Remainder, Division and Square Root. The signature of the methods are given below.


package aSSIGNMENT6;

import java.util.Scanner;

public class Jul20_Qn1 {
	
	public static int additionSimple(int x, int y) {
		return (x+y);
	}
	public static int subtractionSimple(int x, int y) {
		return (x-y);
	}
	public static int multiplicationSimple(int x, int y) {
		return (x*y);
	}
    public static double divisionSimple(int x, int y) {
		 return(y/x);
	 }
    public static int remainderSimple(int x, int y) {
    	return (x%y);
    }
    public static double squareRootSimple(int n) {
    	return(Math.sqrt(n));
    }
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter two Numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int add=additionSimple(a, b);
		int sub=subtractionSimple(a,b);
		int mul=multiplicationSimple(a,b);
		double div=divisionSimple(b,a);
		int rem=remainderSimple(a,b);
		double sqrta=squareRootSimple(a);
		double sqrtb=squareRootSimple(b);
		
		System.out.println(add+" "+sub+" " + mul+" " + div+" "+rem+" "+ sqrta+" "+sqrtb);

	}

}
