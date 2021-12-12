package arrays;
import java.util.*;
 class BitonicPoint {

	public static int findBitonic(int[] arr, int n) {
		 Arrays.sort(arr);
		 
         return arr[n-1];
        
    }
	
	public static void main(String[] args) {
		
		
		int arr[] = {1,15,25,45,42,21,17,12,11};
        int n = arr.length;
        System.out.print("Bitonic point for the given array is " + findBitonic(arr, n));
	}
}
