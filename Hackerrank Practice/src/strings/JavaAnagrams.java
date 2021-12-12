package strings;

import java.util.*;

public class JavaAnagrams {
	 
	    //Function is to check whether two strings are anagram of each other or not.
	    public static boolean isAnagram(String a,String b)
	    {
	
	         
	        char c[]=a.toCharArray();
	        char d[]=b.toCharArray();
	        
	        Arrays.sort(c);
	        Arrays.sort(d);
	        
	        if(Arrays.equals(c,d))
	        return true;
	        return false;
		}
	

//    static boolean isAnagram(String a, String b) {
//        boolean visited=false;
//        if(a.length()==b.length()){
//            for(int i=0;i<a.length();i++){
//            	char c=a.charAt(i);
//                  
//            	for(int j=0;j<b.length();j++){
//            	if(c==b.charAt(j) && !visited){
//            		visited=true;
//                    return true;
//                  }
//               }
//               }
//        }
//        return false;
        
        //     boolean visited[]=new boolean[b.length()];
        //     if(a.length()==b.length()){
        //    for(int i=0;i<a.length();i++)
        //      { 
        //     for(int j=0;j<b.length();j++){
        //         if(a.charAt(i)==b.charAt(j)){
        //         visited[j]=true;
        //         return true;
        //     }
        //         else return false;
        //      }     
        //     }
        //  }   
        //     return false;
    


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

	}

}
