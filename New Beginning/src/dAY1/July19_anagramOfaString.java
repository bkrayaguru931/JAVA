		
		//ANAGRAM--If both contais [same no of character same times repeat]  
		//Ex--  abbca
		//      baacb                 (both are anagram)

		//HOW TO CHECK->  
	//Method1- first check if length of both are same or not....if same then check character in 1st is present in second or not(check one by one)
	//          (time complexity=n^2)
	//Method2- Sort them and equate same or not
	//Method3- check how many times each character is available in 1st and 2nd string one by one , if they are exactly same then anagram

package dAY1;

import java.util.Arrays;

public class July19_anagramOfaString {
	
	public static boolean isAnagram(String a,String b) {

		har arr1[]=a.toCharArray();
    Arrays.sort(arr1);
    String a1=new String(arr1);
    
    char arr2[]=b.toCharArray();
    Arrays.sort(arr2);
    String b2=new String(arr2);
    
    if(a1==b2)  return true;
    else return false;
	}
	public static void main(String[] args) {

	
//           METHOD 1~~>(Time complexity=n^2)
		
//		String a="aab";                             
//		String b="abc";
		
//	boolean isAnagram =false;
//	boolean visited[]=new boolean[b.length()];
//	if(a.length()==b.length()) 
//	{	
//		for(int i=0;i<a.length();i++)
//		 {
//				char c=a.charAt(i);
//			     isAnagram=false;
//			for(int j=0;j<b.length();j++) 
//				{	
//					if(b.charAt(j)==c && !visited[j])
//					{
//				    visited[j]=true;
//					isAnagram=true;
//					break;
//					}
//				}
//			if(!isAnagram)
//				break;
//		  }
//	}
//			if(isAnagram) System.out.println("Anagram");
//			else System.out.println("Not Anagram");
		
		//METHOD 3 (Arange them in char array then equate)   (CharArray has 256 character in it acc to ACCII code)
//		                                                      toCharArray() -covert each char of the string into array
		
		
//		String a="aab";
//		String b="aba";
		
//		//using two array at a time
//		boolean isAnagram=true;
//		
//		int al[]=new int[256];
//		int bl[]=new int[256];
//		
//		for(char c:a.toCharArray()) {
//			int index=(int) c;                            //(converting char to int)
//			al[index]++;
//		}
//		for(char c:b.toCharArray()) {
//			int index=(int) c;                           
//			bl[index]++;
//		}
//		for(int i=0; i<256; i++) {
//		if(al[i]!=bl[i]) {
//			isAnagram=false;
//		}
//		}
//		if(isAnagram) System.out.println("Anagram");
//		else System.out.println("Not Anagram");
		
		
		//using one array
//        boolean isAnagram=true;
//		
//		int arr[]=new int[256];
//		
//		for(char c:a.toCharArray()) {
//			int index=(int) c;                            
//			arr[index]++;
//		}
//		for(char c:b.toCharArray()) {
//			int index=(int) c;                           
//			arr[index]--;
//		}
//		for(int i=0; i<256; i++) {
//		if(arr[i]!=0) {
//			isAnagram=false;
//		}
//		}
//		if(isAnagram) System.out.println("Anagram");
//		else System.out.println("Not Anagram");
		
		
		
		
		                                 //REVERSE THE WORDS OF A GIVEN STRING
		
		// I love Sachin, the Dambu --> Dambu the Sachin, love I
		
		String S="I love Sachin, the Dambu";
		String word[]=S.split(" ");
//		for(int i=word.length-1;i>=0;i--) {
//			     System.out.print( word[i]+" ");
//		}
		 System.out.println(word);                               
		//OR
		
		
		
	}

}
