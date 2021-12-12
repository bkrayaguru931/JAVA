package aSSIGNMENT6;
//8. A regular polygon is an n-sided polygon in which all sides are of the same length and
//all angles have the same degree (i.e., the polygon is both equilateral and equiangular).
//The formula for computing the area of a regular polygon is

//Write a method that returns the area of a regular polygon using the following
//header:
//public static double area(int n, double side)Write a java main method that prompts the
//user to enter the number of sides and the side of a regular polygon and displays its
//area. Here is a sample run:
//Enter the number of sides: 5
//Enter the side: 6.5
//The area of the polygon is 72.69017017488385

import java.util.Scanner;

public class Qn8 {

	public static double area(int n, double s) {
		return (n*s*s)/(4*Math.tan(Math.PI/n));
	}
	public static void main(String[] args) {
		
             Scanner sc=new Scanner (System.in);
             System.out.println("Enter the number of sides: ");
             int side=sc.nextInt();
             System.out.println("Enter the side: ");
             double sideleng=sc.nextDouble();
             double Area=area(side,sideleng);
             System.out.println("The area of the polygon is "+Area);
	}

}
