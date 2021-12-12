package strings;
import java.util.*;
import java.io.*;

public class JavaStringReverse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
//		String reversed=new StringBuilder(A).reverse().toString();
//		System.out.println(A.equals(reversed) ? "Yes":"No");
		
		//or
		
		boolean check=false;
		for(int i=0;i<=A.length()/2;i++) {
			if(A.charAt(i)==A.charAt(A.length()-1-i)) 
				check=true;
			break;
		}
		if(check) System.out.println("Yes");
		else System.out.println("No");
	}

}
