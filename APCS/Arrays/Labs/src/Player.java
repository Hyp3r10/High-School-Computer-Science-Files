public class Player {
    // instance variables
	private String playerName;
	private int ftm;
	private int fta;
	private int fg2m;
	private int fg2a;
	private int fg3m;
	private int fg3a;
    // constructors
	public Player() {
		playerName = "";
		ftm = 0;
		fta = 0;
		fg2m = 0;
		fg2a = 0;
		fg3m = 0;
		fg3a = 0;
	}
	public Player(String playerName, int ftm, int fta, int fg2m, int fg2a, int fg3m, int fg3a) {
		this.playerName = playerName;
		this.ftm = ftm;
		this.fta = fta;
		this.fg2m = fg2m;
		this.fg2a = fg2a;
		this.fg3m = fg3m;
		this.fg3a = fg3a;
	}
    // accessor methods
	public String getPlayerName() {
		return playerName;
	}
	public int getFTM() {
		return ftm;
	}
	public int getFTA() {
		return fta;
	}
	public int getFG2M() {
		return fg2m;
	}
	public int getFG2A() {
		return fg2a;
	}
	public int getFG3M() {
		return fg3m;
	}
	public int getFG3A() {
		return fg3a;
	}
    // other methods
	public double getFTPercentage() {
		return ((double)ftm / fta) * 100;
	}
	public double getFG2Percentage() {
		return ((double)fg2m / fg2a) * 100;
	}
	public double getFG3Percentage() {
		return ((double)fg3m / fg3a) * 100;
	}
	public double getPointsScored() {
		return (ftm + (fg2m * 2) + (fg3m * 3));
	}
	@Override
	public String toString() {
		return "Name :: " + getPlayerName() + 
			 "\nFree Throws % :: " + getFTPercentage() + 
			 "\n2 pt Field Goal % :: " + getFG2Percentage() + 
			 "\n3 pt Field Goal % :: " + getFG3Percentage() + 
			 "\nTotal Points Scored ::" + getPointsScored();
	}
}