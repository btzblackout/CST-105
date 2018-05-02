package demo;
import java.util.Scanner;
import java.io.*;

public class Programming_Exercise_5 {

	public static void main(String[] args)throws IOException 
	{
		//This is my work, Raymond Lawson
		
		//Create instance of the file
		FileReader fr = new FileReader("test.txt");
		BufferedReader br = new BufferedReader (fr);
		
		//Declare variables
		char[][] matrix = new char[20][45];
		String text = "";
		
		//Create Scanner
		Scanner input = new Scanner(br);
			
		//Row-major ordered array
		for (int row = 0; row < matrix.length; row++) 
		{
			for (int column = 0; column < matrix[row].length; column++) 
			{ 
				matrix[row][column] = (char) br.read(); 	
				System.out.print(matrix[row][column]);
			}
			System.out.println();
		}
		//Column-major ordered String
		for (int column = 0; column < matrix[0].length; column++) 
		{
			for (int row = 0; row < matrix.length; row++) 
			{
				text = (text + matrix[row][column]); 
			} 	
		}
		System.out.print(text);
		input.close();
}


}
