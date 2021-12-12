package aSSIGNMENT6;

// 7. Twin primes are a pair of prime numbers that differ by 2. For example, 3 and 5 are twin
//primes, 5 and 7 are twin primes, and 11 and 13 are twin primes. Write a java program
//using method to find all twin primes less than 1,000.
public class Jul21_Qn7 {

	public static boolean isPrime(int n) {

		if(n<2) return false;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) 
				return false;
		}
			return true;
	}
	public static void main(String[] args) {
		
               for(int i=1;i<1000;i++) {
            	   if(isPrime(i) && isPrime(i+2)) {
            		   System.out.println(i+" "+(i+2));
            	   }
            	   
               }
	}

}
