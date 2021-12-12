package searching;

public class Main {

	public static void main(String[] args) {
		
		int nums[]= {12,45,89,12,40,23};
		int target=12;
		int ans=linearsearch(nums,target);
		System.out.println(ans);

	}
	
	static int linearsearch(int arr[],int target) {
		
		if(arr.length==0)
			return -1;
		for(int i=0;i<arr.length;i++) {
			int element=arr[i];
			if(element==target) {
				return arr[i];
			}
			
		}
		return -1;
	}

}
