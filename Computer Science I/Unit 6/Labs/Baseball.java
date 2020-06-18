public class Baseball extends SportsTeam
{
    // instance variables
    protected int numHomeRuns;
    protected int numRBIs;
    protected int numErrors;
    // default constructor
    public Baseball(String name)
    {
        super(name);
    }
    // second constructor
    public Baseball(String name, int gamesPlayed, int gamesWon, int gamesLost, int h, int r, int e)
    {
        super(name, gamesPlayed, gamesWon, gamesLost);
        numHomeRuns = h;
        numRBIs = r;
        numErrors = e;
    }
    // accessor method - getHomeRunsPerGame
    // calculates and returns the homeruns per game by
    // dividing number of homeruns by games played
    public double getHomeRunsPerGame()
    {
        return (double) numHomeRuns / getGamesPlayed();
    }
    // accessor method - getRBIsPerGame
    // calculates and returns the RBIs per game by
    // dividing the number of RBIs by games played
    public double getRBIsPerGame()
    {
        return (double) numRBIs / getGamesPlayed();
    }
    // accessor method - getErrorsPerGame
    // calculates and returns the errors per game by
    // dividing the number of errors by games played
    public double getErrorsPerGame()
    {
        return (double) numErrors / getGamesPlayed();
    }
    // toString method
    public String toString()
    {
        return super.toString() + 
            "\nNumber of Home Runs = " + numHomeRuns + 
            "\nNumber of RBIs = " + numRBIs + 
            "\nNumber of Errors = " + numErrors +
            "\nHome Runs Per Game = " + getHomeRunsPerGame() + 
            "\nRBIs Per Game = " + getRBIsPerGame() + 
            "\nErrors Per Game = " + getErrorsPerGame(); 
    }
}