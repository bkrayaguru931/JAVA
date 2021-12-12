package string;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Minimum_Indexed_Character {

  public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            String patt = br.readLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.printMinIndexChar(str, patt));
        }
    }
}// } Driver Code Ends


class Solution{
    
    // Function to find the character in patt which is present in str at min index
    public static String printMinIndexChar(String S, String patt){
        
        // Your code here
        int minIndex = Integer.MAX_VALUE;
        int n = S.length();
        int m = patt.length();
        
        for(int i = 0; i < n; i++){
            
            for(int j = 0; j < m; j++){
                
                if(patt.charAt(i)== S.charAt(j) && j < minIndex){
                minIndex = j;
                break;
                }
            }
        }
        
        if(minIndex!=Integer.MAX_VALUE)
         return Character.toString(S.charAt(minIndex));
        
        return "$";
        
        // you don't need to print anything
    
    }
    
}


