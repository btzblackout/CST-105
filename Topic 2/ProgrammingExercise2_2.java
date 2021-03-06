package demo;
import java.util.Scanner;

public class ProgrammingExercise2_2 {

	public static void main(String[] args) {
		//This is my work <Raymond Lawson>
		
		//Declare the variables
		double fahrenheit, celsius, newFahrenheit, newCelsius;
		
		//Create the Scanner object for input
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a Fahrenheit degree to be converted to Celsius: ");
		fahrenheit = input.nextDouble();
		System.out.println("Please input a Celsius degree to be converted to Fahrenheit: ");
		celsius = input.nextDouble();
		
		//Perform the math
		newCelsius = (fahrenheit - 32) * 5 / 9;
		newFahrenheit = celsius * 9 / 5 + 32;
		
		//Output the answer
		System.out.println("The conversion from " + fahrenheit + "F " + "to Celsius is: " + newCelsius);
		System.out.println("The conversion from " + celsius + "C " + "to Fahrenheit is: " + newFahrenheit);

	}

}