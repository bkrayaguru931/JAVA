package aSSIGNMENT1n2;

import java.util.Scanner;

public class July5 {

	public static void main(String[] args) {
		
//     3. Write a java program that reads a number in feet, converts it to meters, and displays the
//			result. One foot is 0.305 meter.
//			Here is a sample run:
//			Enter a value for feet: 16.5
//			16.5 feet is 5.0325 meters
		
		System.out.println("Enter the value for feet: ");
			Scanner sc=new Scanner(System.in);
			double f=sc.nextDouble();
			double m= f*0.303;
			System.out.println(+f+"feet is " +m+ "meters");
			

	}

}
