
public class OffensivePlayers extends NFLPlayer
{
    //declare the variables
    int completions, attempts, yards,touchDowns, interceptions, sacks, reception;
    double percentage, attemptsPerGame, average, yardsPerGame, rating;

    //constructors
    public OffensivePlayers()
    {
        this.completions = 0;
        this.attempts = 0 ;
        this.percentage = 0;
        this.attemptsPerGame = 0;
        this.yards = 0;
        this.average = 0;
        this.yardsPerGame = 0;
        this.touchDowns = 0;
        this.interceptions = 0;
        this.sacks = 0;
        this.rating = 0;
    }

    public OffensivePlayers(String name, String position,String birthPlace, String college, String experience, String highSchool, String team,
                            String height, double weight, int age, int number, boolean available, String type, int completions, int attempts, double percentage,
                            double attemptsPerGame, int yards, double average, double yardsPerGame, int touchDowns, int interceptions, int sacks,
                            double rating, int reception)
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
        this.completions = completions;
        this.attempts = attempts  ;
        this.percentage = percentage;
        this.attemptsPerGame = attemptsPerGame;
        this.yards = yards;
        this.average = average;
        this.yardsPerGame = yardsPerGame;
        this.touchDowns = touchDowns;
        this.interceptions = interceptions;
        this.sacks = sacks;
        this.rating = rating;
        this.reception = reception;
    }

    //toString method
    public String toString()
    {
        return "Name: " + this.name + " " + "Position: " + this.position + " Age: " + this.age + " Plays for: " + this.team + "\n";
    }

    //getters and setters
    public int getCompletions()
    {
        return completions;
    }
    public void setCompletions (int completions)
    {
        this.completions = completions;
    }
    public int getAttempts()
    {
        return attempts;
    }
    public void setAttempts (int attempts)
    {
        this.attempts = attempts;
    }
    public double getPercentage()
    {
        return percentage;
    }
    public void setPercentage (double percentage)
    {
        this.percentage = percentage;
    }
    public double getAttemptsPerGame()
    {
        return attemptsPerGame;
    }
    public void setAttemptsPerGame (double attemptsPerGame)
    {
        this.attemptsPerGame = attemptsPerGame;
    }
    public int getYards()
    {
        return yards;
    }
    public void setYards (int yards)
    {
        this.yards = yards;
    }
    public double getAverage()
    {
        return average;
    }
    public void setAverage (double average)
    {
        this.average = average;
    }
    public double getYardsPerGame()
    {
        return yardsPerGame;
    }
    public void setYardsPerGame (double yardsPerGame)
    {
        this.yardsPerGame = yardsPerGame;
    }
    public int getTouchDowns()
    {
        return touchDowns;
    }
    public void setTouchDowns (int touchDowns)
    {
        this.touchDowns = touchDowns;
    }
    public int getInterceptions()
    {
        return interceptions;
    }
    public void setInterceptions (int interceptions)
    {
        this.interceptions = interceptions;
    }
    public int getSacks()
    {
        return sacks;
    }
    public void setSacks (int sacks)
    {
        this.sacks = sacks;
    }
    public double getRating()
    {
        return rating;
    }
    public void setRating (double rating)
    {
        this.rating = rating;
    }
    public int getReception()
    {
        return reception;
    }
    public void setReception(int reception)
    {
        this.reception = reception;
    }
}


