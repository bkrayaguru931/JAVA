package cw;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		
		System.out.println("Enter a String : ");
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		int count=0;
		
//		char arr[]=str.toCharArray();
        for(int i=0;i<str.length();i++) {
        	if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u')
        	count++;
        }
        System.out.println("Number of Vowels"+ count);
	}

}
