package assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excersice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		System.out.println("Welcome to Number game!!");
		System.out.println("Enter a number between 1 and 99 and try your luck!!");
		int input_num;
		//= scan.nextInt();
		 while (true) {
		        try {if (scan.nextInt() <100 &&
		        		scan.nextInt() > 0)
		        {
		        	input_num = scan.nextInt();
		        }
		            break;
		        }
		        catch (InputMismatchException e) {
		            System.out.print("Invalid input. Please reenter: ");
		            scan.nextLine();
		        }
		    }
		int  n = (int) (Math.random() * ( 99 - 1 ));
		
		for (int x =5; x>0;x--)
		{
		if (input_num <(n+10) &&
				input_num > (n-10))
		{
			//System.out.println("You won!!");
			
			x= -1;
		
		}
		else 
			
		{
			
			//System.out.println("The System Random number was :" + n );
			
			System.out.println("You loose!!");
			System.out.println("Its out of range try other number and You have "+(x-1)+ " chances Left!!");
			System.out.println("Please enter an other number");
			
			 input_num = scan.nextInt();
			 
			 if ((x-1) == 1)
				{System.out.println("You loose!! no more chances!!");
				System.out.println("The System Random number was :" + n );
				System.out.println("Game over!!");
				x=0;	
				}
		}
		if (x == -1)
		{
			System.out.println("You won!!");
			System.out.println("The System Random number was :" + n );
		}
		
		
		
		
		}
		
		
		
		
		

	}

}
