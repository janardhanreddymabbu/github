package assignment1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Excersice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		maingame();
		
		String decesion = scan.nextLine();
		
		 if(decesion.equalsIgnoreCase("y")){
			System.out.println(decesion);
			restart();
		}
		if (decesion.equalsIgnoreCase("n")){
			System.out.println("Thank YOu");
			System.exit(0);
		}
	        
		
        
		}
	
		
	
	
	
	 public static void maingame(){
		 Scanner scan = new Scanner (System.in);
			System.out.println("Welcome to Chips game!!");
			System.out.println("What is the name of the first player?  ");
			String player1 = scan.nextLine();
			System.out.println("What is the name of the second player?  ");
			String player2 = scan.nextLine();
			 
			while(player1.equalsIgnoreCase(player2))
			{
				System.out.println("Both players cannot be named "+player1+".  Enter a different name:");
				player2 = scan.nextLine();
				
			}
			        
			         
			 
		
			System.out.println("How many chips does the initial pile contain?  ");
			int intl_chips = scan.nextInt();
			
			while(intl_chips<3||intl_chips % 2 == 0){
			if(intl_chips<3){
				System.out.println("You have to start with at least with 3 chips.  Choose another number: ");
				intl_chips = scan.nextInt();
				
			}
			else if(intl_chips % 2 == 0){
				System.out.println("You have to start with an odd number of chips.  Choose another number:");
				intl_chips = scan.nextInt();
				
			}
			}
			
			String winner =  startgame(player1,player2,intl_chips);
			
			System.out.println	("Winner is:  " + winner);	
			
			System.out.println("Want to play again Y/N?");
			
			
			
			
			
			
			
	 }
	@SuppressWarnings("resource")
	public static String startgame (String player1,String player2,int intl_chips) {
		
		int ply1chips =0;
		int ply2chips =0;
		int current_chips = intl_chips;
		String winner = null;
		for (int x =0; x<= current_chips; )
		{
			int half ;
			
			if ((int) Math.ceil((current_chips)/2)<2){
				half =1;
			}else half = (int) Math.ceil((current_chips)/2);
				
				
			
		System.out.println(player1+" has " + ply1chips +".");
		System.out.println(player2+" has " + ply2chips +".");
		System.out.println("It is your turn, "+ player1 );
		System.out.println("There are "+current_chips+ " chips remaining. " );
		System.out.println("You may take any number of chips from 1 to " +half+ ".  How many will you take, "+player1+"?");
		System.out.println("How many will you take," + player1 +"? ");
		Scanner scan = new Scanner (System.in);
		ply1chips = scan.nextInt();
		while(ply1chips<1||ply1chips>half){
		if(ply1chips<1){
			System.out.println("Illegal move: you must take at least one chip. ");
			ply1chips = scan.nextInt();
		}
		else if(ply1chips>half){
			System.out.println("Illegal move: you may not take more than "+half+" chips.");
			ply1chips = scan.nextInt();
			
		}
		}
		
		current_chips = current_chips -ply1chips;
		if (current_chips == 0){ 
			winner= player1;
			
			      break;
		         
			
		}
		
		//half = (int) Math.ceil((current_chips)/2);
		
		if ((int) Math.ceil((current_chips)/2)<2){
			half =1;
		}else half = (int) Math.ceil((current_chips)/2);
		
		System.out.println(player1+" has " + ply1chips +".");
		System.out.println(player2+" has " + ply2chips +".");
		System.out.println("It is your turn, "+ player2 );
		System.out.println("There are "+current_chips+ " chips remaining. " );
		System.out.println("You may take any number of chips from 1 to " +(half)+ ".  How many will you take, "+player2+"?");
		System.out.println("How many will you take," + player2 +"? ");
		
		ply2chips = scan.nextInt();
		
		while(ply2chips<1||ply2chips>half){
		if(ply2chips<1){
			System.out.println("Illegal move: you must take at least one chip. ");
			ply2chips = scan.nextInt();
		}
		else if(ply2chips>half){
			System.out.println("Illegal move: you may not take more than "+half+" chips.");
		ply2chips = scan.nextInt();
		
		}
		}
		
		current_chips = current_chips -ply2chips;
		
		if (current_chips == 0){ 
			winner= player2;
			break;
		}
		}
		
		return winner;
		
	}
	public static void restart(){
		System.out.println("**************************************************");
		System.out.println("******************* New Game *********************");
		System.out.println("**************************************************");
		
		maingame();
	}	

}
