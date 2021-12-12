import java.util.*;

public class Stonepaperscisor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rnd = new Random();

		System.out.println("\t\t\t\t\tROCK\tPAPER\tSCISSOR\t\t\t\t\n\n");
		System.out.println("\t\t\t\t  Welcome!! To The World Of WINNERS\t\n");
		System.out.println("********************************************************************************************************************************");
		System.out.print("Enter your name here: ");
		String player_name=sc.next(); 
		System.out.println("\n*****************************************************************************************************************");
		System.out.print(player_name+",enter how many times you want to play: ");
		int n=sc.nextInt(),i=1,cc=0,cp=0;
		while(i<=n) {
			String options = "RPS";
			char computer = options.charAt(rnd.nextInt(options.length()));
			System.out.println("\n*************************************************************************************************************************");
			System.out.print(player_name+", please enter your choice:R for ROCK, P for paper and S for Scissor: ");
			
			char player=sc.next().charAt(0);
			System.out.println("The computer chose "+computer+" and "+player_name+" chose "+player+"\n");
			
			System.out.println("*****************************************************************************************************************************************");
			
			if((player=='R' && computer=='R')||(player=='P'&& computer=='P')||(player=='S'&& computer=='S')) {
				System.out.println("Draw");
			}
			else if((player=='R' && computer=='S')||(player=='S'&& computer=='P')||(player=='P' && computer=='R')) {
				cp++;
				System.out.println(player_name+" got "+cp+" points");
			}
			else if((player=='S' && computer=='R')||(player=='P'&& computer=='S')||(player=='R' && computer=='P')) {
				cc++;
				System.out.println("Computer got "+cc+" points");
			}
			if(n-i==0) {
				System.out.println(player_name+", you have no choices left.");
				break;
			}
			else {
				int choice=n-i;
				System.out.println(player_name+", you have "+choice+" choices left");
			}
			i++;
		}
		if(cp>cc)
			System.out.println(player_name+" is the winner.");
		else if(cc>cp)
			System.out.println("Computer is the winner");
		else
			System.out.println("Match is draw!! Please try again later.");
		sc.close();
	}



}
