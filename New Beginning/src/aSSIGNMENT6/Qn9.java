package aSSIGNMENT6;
import java.util.Scanner;
// 9. Given the two fractions a/b and c/d, write a java program using method that will compute
//their sum in terms of the smallest common denominator.
public class Qn9 {

	public static int lcm(int b,int d) {
		int x=b;
		int y=d;
		while(y>0) {
			int rem=y%x;
			x=y;
			y=rem;
		}
		int gcd=x;
		return (b*d)/gcd;
	}
	
	public static double scd(int a,int b,int c,int d) {
		int x=lcm(b,d);
		a=a*(x/a);
		b=b*(x/b);
		double sum=a+b;
	
	return sum/x;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two fractional numbers (a/b) and (c/d):");
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				int d = sc.nextInt();
				double scd=scd ( a, b, c, d);
				System.out.println(a+"/"+b+" + "+c+"/"+d+" = "+scd);
	}

}
