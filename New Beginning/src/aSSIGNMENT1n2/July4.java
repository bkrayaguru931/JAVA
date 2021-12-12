package aSSIGNMENT1n2;

import java.util.Scanner;
public class July4 {

	public static void main(String[] args) {
		
//		1. Write a java program that reads a Celsius degree in a double value from the console, then
//		converts it to Fahrenheit and displays the result. The formula for the conversion is as
//		follows:
//		fahrenheit = (9 / 5) * celsius + 32
//		Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
//		Here is a sample run:
//		Enter a degree in Celsius: 43
//		43 Celsius is 109.4 Fahrenheit
	
	  System.out.println("Enter a degree in Celsius:"); 
      Scanner sc=new Scanner(System.in);
      double c=sc.nextDouble();
      double f =(9.0/5)*c + 32;
      System.out.println(c+" Celsius is "+f+" Fahrenheit");
      

      
      
      
      
      
      
      
      
      
      

	}

}
