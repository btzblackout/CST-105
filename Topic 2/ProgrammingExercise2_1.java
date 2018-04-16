package demo;
import java.util.Scanner;

public class ProgrammingExercise2_1 
{

	public static void main(String[] args) 
	{
		//This is my work <Raymond Lawson>
		
		//Creating the variables for use
		int originalNumber;
		int placeholder1;
		int placeholder2;
		int placeholder3;
		int placeholder4;
		int placeholder5;
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		int fourthNumber;
		int fifthNumber;
		int total;
		
		//Creating the scanner for input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 5 digit positive integer");
		originalNumber = input.nextInt();
		
		//Math behind the program
		placeholder1 = originalNumber / 10;
		firstNumber = originalNumber % 10;
		
		placeholder2 = placeholder1 / 10;
		secondNumber = placeholder1 % 10;
		
		placeholder3 = placeholder2 / 10;
		thirdNumber = placeholder2 % 10;
		
		placeholder4 = placeholder3 / 10;
		fourthNumber = placeholder3 % 10;
		
		placeholder5 = placeholder4 / 10;
		fifthNumber = placeholder4 % 10;
		
		total = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
		
		//Output the answer
		System.out.println("The sum of " + fifthNumber + " + " + fourthNumber + " + " + thirdNumber + " + " + secondNumber + " + " + firstNumber + " is: " + total);
	}

}
