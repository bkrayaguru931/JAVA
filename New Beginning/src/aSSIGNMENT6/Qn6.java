package aSSIGNMENT6;

// 6. A palindromic prime is a prime number and also palindromic.
//For example, 131 is a prime and also a palindromic prime, as are 313 and 757. Write a
//java program using method that displays the first 100 palindromic prime numbers.
//Display 10 numbers per line, separated by exactly one space, as follows:
//2 3 5 7 11 101 131 151 181 191
//313 353 373 383 727 757 787 797 919 929
public class Qn6 {
	
	
	
	public static boolean isPalindrome(int n) {
		int temp;
		int rev=0;
		int m=n;
		while(n>0) {
			temp=n%10;
			rev=rev*10+temp;
			n/=10;
			}
	  if(m==rev) 
		return true;
		else return false;
		
		
//		String result=String.valueOf(n);
//		String temp=
	}
	
	public static boolean isPrime(int n) {
		if (n<2) return false;
		for(int i=2;i<n;i++) {
			if(n%i==0) 
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
		
		int n=100;
		int no=2;
		int count=0;
		while(count<n) {
			if(isPalindrome(no) && isPrime(no)) {
				System.out.print(no+" ");
			  
			if(count%10==0 && count>=10) {
				System.out.println();
			}
				count++;
			}
			no++;
			}
		
	}

}
