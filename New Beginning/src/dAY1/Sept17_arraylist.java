package dAY1;

import java.util.*;

public class Sept17_arraylist {

	public static void main(String[] args) {
		//CWH lect
		
		ArrayList<Integer> l1=new ArrayList<>();
		ArrayList<Integer> l2=new ArrayList<>();
		
		
			l1.add(1);
			l1.add(3);
			l1.add(4);
			
			l2.add(23);
			l2.add(12);
			l2.add(41);
			
			l1.add(0,2);
			l1.addAll(l2);
			for(int i=0;i<l1.size();i++) {
				System.out.print(l1.get(i)+" ");
			}
			
//		int diff=Integer.MAX_VALUE;
//		System.out.print(diff);
	}

}
