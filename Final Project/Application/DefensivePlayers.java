
public class DefensivePlayers extends NFLPlayer
{
    //declare variables
    int tackleCombinations, totalTackles, defensiveAssists, reception, yards, touchDowns;
    double sacks, average, yardsPerGame;

    //constructors
    DefensivePlayers()
    {
        this.tackleCombinations = 0;
        this.totalTackles = 0;
        this.defensiveAssists = 0;
        this.reception = 0;
        this.yards = 0;
        this.touchDowns = 0;
        this.sacks = 0;
        this.average = 0;
        this.yardsPerGame = 0;
    }
    DefensivePlayers(String name, String position, String birthPlace, String college, String experience,
                     String highSchool, String team, String height, double weight, int age, int number,
                     boolean available, String type, int tackleCombinations, int totalTackles, int defensiveAssists, int reception,
                     int yards, int touchDowns, double sacks, double average, double yardsPerGame)
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
        this.type = type;
        this.tackleCombinations = tackleCombinations;
        this.totalTackles = totalTackles;
        this.defensiveAssists = defensiveAssists;
        this.reception = reception;
        this.yards = yards;
        this.touchDowns = touchDowns;
        this.sacks = sacks;
        this.average = average;
        this.yardsPerGame = yardsPerGame;
    }

    //toString method
    public String toString()
    {
        return "Name: " + this.name + " " + "Position: " + this.position + " Age: " + this.age + " Plays for: " + this.team + "\n";
    }

    //getters and setters
    public int getTackleCombinations()
    {
        return tackleCombinations;
    }
    public void setTackleCombinations(int tackleCombinations)
    {
        this.tackleCombinations = tackleCombinations;
    }
    public int getTotalTackles()
    {
        return totalTackles;
    }
    public void setTotalTackles(int totalTackles)
    {
        this.totalTackles = totalTackles;
    }
    public int getDefensiveAssists()
    {
        return defensiveAssists;
    }
    public void setDefensiveAssists(int defensiveAssists)
    {
        this.defensiveAssists = defensiveAssists;
    }
    public int getReception()
    {
        return reception;
    }
    public void setReception(int reception)
    {
        this.reception = reception;
    }
    public int getYards()
    {
        return yards;
    }
    public void setYards(int yards)
    {
        this.yards = yards;
    }
    public int getTouchDowns()
    {
        return touchDowns;
    }
    public void setTouchDowns(int touchDowns)
    {
        this.touchDowns = touchDowns;
    }
    public double getSacks()
    {
        return sacks;
    }
    public void setSacks(double sacks)
    {
        this.sacks = sacks;
    }
    public double getAverage()
    {
        return average;
    }
    public void setAverage(double average)
    {
        this.average = average;
    }
    public double getYardsPerGame()
    {
        return yardsPerGame;
    }
    public void setYardsPerGame(double yardsPerGame)
    {
        this.yardsPerGame = yardsPerGame;
    }
}
