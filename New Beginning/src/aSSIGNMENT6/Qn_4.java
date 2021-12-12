package aSSIGNMENT6;
//4. Write a method that returns the number of days in a year using the following header:
//	public static int numberOfDaysInAYear(int year)
//	Write a java program that displays the number of days in year from 2000 to 2020.
public class Qn_4 {
	
	public static int numberOfDaysInAYear(int year) {
		
		if((year%100!=0 && year%4==0) || year%400==0) {
		return 366;
	}
		else return 365;
	
	}
	public static void main(String[] args) {

		for(int i=2000;i<=2020;i++) {
			System.out.println(i+" has"+numberOfDaysInAYear(i)+" days.");
		}

	}

}
