package inheritance.cricket;


public class Bowler extends Player{
	private int runsGiven;
	private int wicketsTaken;
	private int ballsBowled;
	public Bowler() {
		
	}
	public Bowler(int jerseyID,String name,int runsGiven,int wicketsTaken,int ballsBowled)
	{
		super(jerseyID,name);
		this.runsGiven=runsGiven;
		this.wicketsTaken=wicketsTaken;
		this.ballsBowled=ballsBowled;
	}
	public int getRunsGiven() {
		return runsGiven;
	}
	public void setRunsGiven(int runsGiven) {
		this.runsGiven = runsGiven;
	}
	public int getWicketsTaken() {
		return wicketsTaken;
	}
	public void setWicketsTaken(int wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}
	public int getBallsBowled() {
		return ballsBowled;
	}
	public void setBallsBowled(int ballsBowled) {
		this.ballsBowled = ballsBowled;
	}
	public float getEconomy() {
		return (float)runsGiven/ballsBowled;
	}
	public String toString() {
		return "Batsman[JerseyID="+getJerseyID()+",Name="+getName()+",runsGiven="+runsGiven+",ballsBowled="+ballsBowled+",wicketsTaken="
				+ wicketsTaken+",Economy="+getEconomy()+"]";				
	}			
	}
	

