package demo;
import java.io.*;
import java.util.Scanner;
public class Programming_Exercise_4 
{
	// This is my work. Raymond Lawson.
	public static void main(String[] args)throws IOException 
	{
		//Create a file instance
		File file = new File("test.txt");
		//Create Scanner
		Scanner input = new Scanner(file);
		//Parse the file 
		while(input.hasNext())
		{
			//Declare variables
			String text = input.next();
			String pigLatin = text.toUpperCase();
			//Create a switch statement to determine the amount of white spaces between the original term and the pig-latin term
			switch (text.length())
				{
					case 1: System.out.print(text + "       "); break;
					case 2: System.out.print(text + "      "); break;
					case 3: System.out.print(text + "     "); break;
					case 4: System.out.print(text + "    "); break;
					case 5: System.out.print(text + "   "); break;
					case 6: System.out.print(text + "  "); break;
					case 7: System.out.print(text + " "); break;
					case 8: System.out.print(text); break;
					default: System.out.println("One of the words in the text file are too long to process.");
				}
			//If statement to check whether the word starts with a vowel or consonant
			if(pigLatin.charAt(0) == 'A' || pigLatin.charAt(0) == 'E' || pigLatin.charAt(0) == 'I' || pigLatin.charAt(0) == 'O' || pigLatin.charAt(0) == 'U')
			{
				System.out.println(pigLatin + "WAY");
			}
			else
			{
				System.out.println(pigLatin.substring(1) + pigLatin.substring(0, 1) + "AY");
			}
		}
			
		//Close the file
		input.close();
	}
}
