package aSSIGNMENT6;
// 5. Write a method to test whether a number is prime or not using the following header.
//public boolean isPrime(int number)
//Write a java program by using the above method to find the number of prime numbers
//less than 10000.
public class Qn5 {

	public static boolean isPrime(int number) {
		for(int i=2;i<number;i++) {
			if(number%i==0) 
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int count=0;
		
		for(int i=1;i<1000;i++) {
			if(isPrime(i)) {
			count++;
			}
		}
			System.out.println("Number of prime number between 1 to 1000 is: "+count);
		
	
	}
}
