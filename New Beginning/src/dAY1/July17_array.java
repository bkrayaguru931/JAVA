package dAY1;

import java.util.Scanner;

public class July17_array {

	public static void main(String[] args) {
		//syntax
		//int[] marks=new int[5];                 //(here 5= array lenght)
		//or        
		//int marks[]=new int[5];
		//or
//		int []marks;
//		marks=new int[5];
//        System.out.println(marks[0]);          //here 0 refers to place
        
//        int []age= {12, 34, 13,45, 5};
//        System.out.println(age[3]);
        
        double[]marks= {21.5 ,12.1 ,31.4};
        System.out.println(marks[1]);
        System.out.println(marks.length);
        
        
		//Displaying the Array using FOR LOOP[ARRAY TRAVERSION METHOD] (bcz you travel through the whole array)
        
		int []age= {12, 34, 13,45, 5};
//		for(int i=0;i<age.length;i++) {
//			System.out.println(age[i]);
//		}
//		//in reverse order
//		for(int i=age.length-1;i>=0;i--) {
//			System.out.println(age[i]);
//		}

		
		//**Displaying the Array using FOR-EACH LOOP**//
		for(int element:age) {
			System.out.println(element);
	}
          
		
		                              //QUESTIONS
//        int sum=0;
//        for(int i=0;i<age.length;i++) {
//        	System.out.println(age[i]);
//       sum+=age[i];
        
//        }
//        System.out.println(sum);
		
		//AVERAGE MARK OF STUDENTS Qn
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number of students: ");
//		int n=sc.nextInt();
//		int []marks=new int[n];
//		int totalmarks=0;
//		for(int i=0;i<n;i++) {
//			System.out.println("Enter the mark of student "+(i+1));
//			marks[i]=sc.nextInt();
//			totalmarks+=marks[i];
//		}
//		float avg=totalmarks/n;
//		System.out.println("Average mark of "+n+" students is = "+avg);
        
		
//1. Creat an array of 5 float and calculate their sum.
		
//		float []marks= {45.7f ,23.1f ,90.3f ,34.8f ,12.3f};
//		float sum=0;
//		for(float element:marks) {
//			sum+=element;
//		}
//		System.out.println(sum);
		
//		Scanner sc=new Scanner(System.in);
//            float num[]=new float[5];
//            float sum=0;
//            for(int i=0;i<5;i++) {
//            	num[i]=sc.nextFloat();
//            	sum+=num[i];
//            }
//		System.out.println(sum);
        
		
//2. 	Write a program to find out whether	a given integer is present in an array or not.
		
//		float []marks= {45.7f ,23.1f ,90.3f ,34.8f ,12.3f};
//		float num= 23.1f;
//		boolean isPresent=false;
//		for(float element:marks) {
//			if(num==element) {
//				isPresent=true;
//				break;
//			}
//		}
//		if(isPresent==true)System.out.println("the number is present in array");
//		else System.out.println("the number is not present in array");
		
		
				
		
		
		
		
		
		
		
		
		
		
		
	}

}
