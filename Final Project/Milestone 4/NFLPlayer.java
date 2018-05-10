
public class NFLPlayer 
{
	/*Name: Raymond Lawson
	 *Date: 5/9/2018
	 *Course: Grand Canyon University (CST-105) 
	 *Document: NFLPlayer.java
	 *This is my work.
	 *Notes: This class only houses the "base" properties for the players. There will be an offensive
	 *and defensive class for their respective positions with their own properties as an extension of this class. 
	*/
	//Declare variables
	String name, birthPlace, college, experience, highSchool, team, height, position;
	double weight;
	int age, number;
	boolean available = true;
	
	//constructor without arguments
	public NFLPlayer()
	{
		this.name = "NA";
		this.position = "NA";
		this.birthPlace = "NA";
		this.college = "NA";
		this.experience = "NA";
		this.highSchool = "NA";
		this.team = "NA";
		this.height = "NA";
		this.weight = 0;
		this.age = 0;
		this.number = 0;
		this.available = false;
	}
	//constructor with arguments
	public NFLPlayer(String name, String position, String birthPlace, String college, String experience, String highSchool, String team, 
			String height, double weight, int age, int number, boolean available)
	{
		this.name = name;
		this.position = position;
		this.birthPlace = birthPlace;
		this.college = college;
		this.experience = experience;
		this.highSchool = highSchool;
		this.team = team;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.number = number;
		this.available = available;
	}
	
	//toString method
	public String toString() 
	{
		return "Name: " + this.name + " " + "Position: " + this.position + " Age: " + this.age + " Plays for: " + this.team + "\n"; 
	}
	//Getters and Setters
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getPosition()
	{
		return position;
	}
	public void setPosition (String position)
	{
		this.position = position;
	}
	public String getBirthPlace()
	{
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace)
	{
		this.birthPlace = birthPlace;
	}
	
	public String getCollege()
	{
		return college;
	}
	public void setCollege(String college)
	{
		this.college = college;
	}
	
	public String getExperience()
	{
		return experience;
	}
	public void setExperience(String experience)
	{
		this.experience = experience;
	}
	
	public String getHighSchool()
	{
		return highSchool;
	}
	public void setHighSchool(String highSchool)
	{
		this.highSchool = highSchool;
	}
	
	public String getTeam()
	{
		return team;
	}
	public void setTeam(String team)
	{
		this.team = team;
	}
	
	public String getHeight()
	{
		return height;
	}
	public void setHeight(String height)
	{
		this.height = height;
	}
	
	public double getWeight()
	{
		return weight;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getNumber()
	{
		return number;
	}
	public void setNumber(int number)
	{
		this.number = number;
	}
	
	public boolean getAvailable()
	{
		return available;
	}
	public void setAvailable (boolean available)
	{
		this.available = available;
	}
	
	//main method "driver" to test
	public static void main(String[] args)
	{
		//Testing the no-arg constructor
		NFLPlayer player1 = new NFLPlayer();
		
		System.out.println("Player 1 created with the default values:");
		System.out.println("Name: " + player1.name + ", " + "Birthplace: " + player1.birthPlace + ", " + "College: " + player1.college);
		System.out.println("Experience: " + player1.experience + ", " + "HighSchool: " + player1.highSchool + ", " + "Team: " + player1.team);
		System.out.println("Height: " + player1.height + "cm, " + "Weight: " + player1.weight + ", " + "Age: " + player1.age);
		System.out.println("Number: " + player1.number + ", " + "Available: " + player1.available);
		
		//Testing the argumentable constructor
		NFLPlayer player2 = new NFLPlayer("Raymond Lawson", "QB", "Frankfort, KY", "GCU", "2nd Year", "Greeneville High School", "My Team", "6ft 4in", 215, 23, 1, true);
		
		System.out.println("\n\nPlayer 2 created with custom values:");
		System.out.println("Name: " + player2.name + ", " + "Birthplace: " + player2.birthPlace + ", " + "College: " + player2.college);
		System.out.println("Experience: " + player2.experience + ", " + "HighSchool: " + player2.highSchool + ", " + "Team: " + player2.team);
		System.out.println("Height: " + player2.height + "cm, " + "Weight: " + player2.weight + ", " + "Age: " + player2.age);
		System.out.println("Number: " + player2.number + ", " + "Available: " + player2.available);
		
		//Testing some individual properties for their getters and setters.
		player2.age = 55;
		player2.name = "John Doe";
		player2.available = false;
		player2.college = "ETSU";
		player2.number = 21;
		
		System.out.println("\n\nPlayer 2 with altered values:");
		System.out.println("Name: " + player2.name + ", " + "Birthplace: " + player2.birthPlace + ", " + "College: " + player2.college);
		System.out.println("Experience: " + player2.experience + ", " + "HighSchool: " + player2.highSchool + ", " + "Team: " + player2.team);
		System.out.println("Height: " + player2.height + "cm, " + "Weight: " + player2.weight + ", " + "Age: " + player2.age);
		System.out.println("Number: " + player2.number + ", " + "Available: " + player2.available);
	}
}
