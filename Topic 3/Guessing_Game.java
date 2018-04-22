package demo;
import java.util.Scanner;
public class Guessing_Game {

	public static void main(String[] args) {
		//This is my work. Raymond Lawson.
		//declare variables
		int number = (int)(Math.random() * 10000 + 1);
		int timesGuessed = 1;
		int minNumber = 1;
		int maxNumber = 10000;
		int guess;
		//create Scanner for input
		Scanner input = new Scanner(System.in);
		System.out.println("Hello! Welcome to the Guessing Game! Guess a number between 1 and 10000");
		guess = input.nextInt();
		//math
		while (number != guess)
		{
			timesGuessed += 1;
			if(guess > number)
			{
				maxNumber = guess - 1;
				System.out.println("Too High! Guess a number between " + minNumber + " and " + maxNumber + ".");
				guess = input.nextInt();
			}
			else
			{
				minNumber = guess + 1;
				System.out.println("Too low! Guess a number between " + minNumber + " and " + maxNumber + ".");
				guess = input.nextInt();
			}
		}
		if (timesGuessed != 1)
		{
			System.out.println("You win! It only took you " + timesGuessed + " guesses!");
			
		}
		else
		{
			System.out.println("You win! It only took you 1 guess!");
		}

	}

}
