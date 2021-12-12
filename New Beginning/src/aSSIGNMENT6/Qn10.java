package aSSIGNMENT6;

//  10. Write a method that prints characters using the following header:
//public static void printChars(char ch1, char ch2, int numberPerLine)
//This method prints the characters between ch1 and ch2 with the specified numbers per
//line. Write a java program that prints ten characters per line from 1 to Z. Characters
//are separated by exactly one space.

public class Qn10 {
	
	public static void printChars(char ch1, char ch2, int numberPerLine) {
		
		int count=1;
		for(char ch=ch1;ch<=char ch2;ch++ ) {
			System.out.print(ch);
			count++;
			if(count%numberPerLine==0 && count>=numberPerLine) {
			System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		

	}

}

//if(N>0)
//{
//    printNos(N-1);
//    System.out.print(N+" ");
//}
//return; 