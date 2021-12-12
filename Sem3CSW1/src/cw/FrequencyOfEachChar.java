package cw;
import java.util.Scanner;
public class FrequencyOfEachChar {

	public static void main(String[] args) {
		
		System.out.println("Enter the String: ");
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		 int n = str.length();
	        int[] freq = new int[26];
	 
	        for (int i = 0; i < n; i++)
	            freq[str.charAt(i) - 'a']++;
	 
	        for (int i = 0; i < n; i++) {
	            if (freq[str.charAt(i) - 'a'] != 0) {
	 
	               
	                System.out.print(str.charAt(i));
	                System.out.println(freq[str.charAt(i)-'a'] + " ");
	                freq[str.charAt(i)-'a'] = 0;

	        }

          }
	}
} 
