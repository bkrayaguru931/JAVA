package aSSIGNMENT3;
import java.util.Scanner;
public class July13 {

	public static void main(String[] args) {
		//import java.util.Scanner;

		//public class Java13 {
		//
//			public static void main(String[] args) {
//**imp
//	14. Write a java program that plays the popular scissor-rock-paper game.
//				(A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.) The program
//				randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. The program prompts
//				the user to enter a number 0, 1, or 2 and displays a message indicating whether the user or the
//				computer wins, loses, or draws.
//				Here are sample runs:
//				scissor (0), rock (1), paper (2): 1
//				The computer is scissor. You are rock. You won
//				scissor (0), rock (1), paper (2): 2
//				The computer is paper. You are paper too. It is a draw
				
//......................................................................................//
//		int i = (int)Math.random();                                                     //
//		double d =  Math.random();                                                      //
//		System.out.println(i);                                                          //
//		System.out.println(d);                                                          //
//		If you need integer randoms, you need first to multyply the result of random    //
//......................................................................................//
//	Scanner sc=new Scanner(System.in);
//			 System.out.println("scissor(0), rock(1), paper(2): ");
//				int you=sc.nextInt();
//				int min=0;
//				int max=2;
//				int comp=min+(int)(Math.random()*(max-min+1));
//				switch(you) {
//				case 0:System.out.println("You are Scissor");break;
//				case 1:System.out.println("You are Rock");break;
//				case 2:System.out.println("You are Paper");break;
//				}
//				switch(comp) {
//				case 0:System.out.println("The Computer is Scissor");break;
//				case 1:System.out.println("The Computer is Rock");break;
//				case 2:System.out.println("The Computer is Paper");break;
//				}
//				if(you==0 && comp==2 || you==1 && comp==0 || you==2 && comp==1) {
//					System.out.println("YOU WON");
//				}
//				else if(you==comp) {
//					System.out.println("DRAW");
//				}
//				else {
//					System.out.println("COMP WON");
//				}
//  15. Write a java program that prompts the user to enter a point (x, y) and checks whether the point is
//  within the circle centered at (0, 0) with radius 10. For example, (4, 5) is inside the circle and (9, 9)
//  is outside the circle,
//				Two sample runs are shown below.
//				Enter a point with two coordinates: 4 5
//				Point (4.0, 5.0) is in the circle
//				Enter a point with two coordinates: 9 9
//				Point (9.0, 9.0) is not in the circle
            
//      Scanner sc=new Scanner(System.in);
//      System.out.println("Enter a point with two coordinates: ");
//      double x=sc.nextDouble();
//      double y=sc.nextDouble();
//      double r=10;
//      double d=Math.pow((x*x+y*y),0.5 );
//      if(d<r) {
                    //or
//      if(Math.sqrt(x*x+y*y)<10) {
//    	  System.out.println("Point ("+x+","+y+") is in the Circle.");
//      }
//      else {
//    	  System.out.println("Point ("+x+","+y+") is not in the Circle.");
//      }
		                  
                         //Qn16 skipped

//		17. Write a java program that prompts the user to enter an integer and determines whether it is 
//		divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6, but 
//		not both.
//		Here is a sample run of this program:
//		Enter an integer: 10
//		Is 10 divisible by 5 and 6? false
//		Is 10 divisible by 5 or 6? true
//		Is 10 divisible by 5 or 6, but not both? True	
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("ENTER AN INTEGER: ");
//		int n=sc.nextInt();
//		System.out.println("Is "+n+" divisible by 5 and 6?");
//		if(n%5==0 && n%6==0) {
//		  System.out.println("true");
//			}
//		else {System.out.println("false");
//		}
//		System.out.println("Is "+n+" divisible by 5 or 6?");
//		if(n%5==0 || n%6==0) {
//			  System.out.println("true");
//				}
//			else {System.out.println("false");
//			}
//		System.out.println("Is  "+n+"  divisible by 5 or 6, but not both?");
//		if(n%5==0 ^ n%6==0) {
//			  System.out.println("true");
//				}
//			else {System.out.println("false");
//			}
                           //or
//		boolean x=n%5==0 && n%6==0;System.out.println("Is "+n+" divisible by 5 and 6?"+x);
//		boolean y=n%5==0 || n%6==0;System.out.println("Is "+n+" divisible by 5 or 6?"+y);
//		boolean z=n%5==0 ^ n%6==0;System.out.println("Is  "+n+"  divisible by 5 or 6, but not both?"+z);
	

//18. Write a java program which displays an appropriate name for a person, using a combination of nested ifs 
//and compound conditions. Ask the user for a gender, first name, last name and age. If the person is female 
//and 20 or over, ask if she is married. If so, display "Mrs." in front of her name. If not, display "Ms." in 
//front of her name. If the female is under 20, display her first and last name. If the person is male and 20
//or over, display "Mr." in front of his name. Otherwise, display his first and last name. Note that asking a
//person if they are married should only be done if they are female and 20 or older, which means you will have 
//a single if and else nested inside one of your if statements. Also, did you know that with an if statements 
//(or else), the curly braces are optional when there is only one statement inside?
//What is your gender (M or F): F
//First name: Gita
//Last name: Pattanayak
//Age: 32
//Are you married, Gita (y or n)? y
//Then I shall call you Mrs. Gita Pattanayak.
//What is your gender (M or F): F
//First name: Anjali
//Last name: Mishra
//Age: 48
//Are you married, Anjali(y or n)? n
//Then I shall call you Ms. Anjali.
//What is your gender (M or F): M
//First name: Ashok
//Last name: Mohanty
//Age: 23
//Then I shall call you Mr. Ashok.
//What is your gender (M or F): M
//First name: Rahul
//Last name: Pati
//Age: 15
//Then I shall call you Rahul Pati

//      Scanner sc=new Scanner(System.in);
//      System.out.println("What is your gender (M or F): ");
//      char gender=sc.next().charAt(0);
//      System.out.println("First name: ");
//      String fname=sc.next();
//      System.out.println("Last name: ");
//      String lname=sc.next();
//      System.out.println("Age: ");
//      int age=sc.nextInt();
//      if(gender=='F') {
//    	  if(age>=20) {
//    	  
//    	  System.out.println("Are you Married: ");
//    	  char status=sc.next().charAt(0);
//          if(status=='Y')  {
//    	  System.out.println("Then I shall call you Mrs." +fname+" "+lname);
//          }
//          else {
//    	  System.out.println("Then I shall call you Ms." +fname+" "+lname);
//           }
//    	  }
//      else {
//    	  System.out.println("Then I shall call you "+fname+" "+lname);
//      }
//    		  
//      }
//      
//      else if(gender=='M' && age>=20) {
//    	  System.out.println("Then I shall call you Mr. " +fname+" "+lname);
//      }
//      else {
//    	  System.out.println("Then I shall call you "+fname+" "+lname);  
//      }
		
		
	}
}

