package inheritance.cricket;
import java.text.DecimalFormat;
public class Batsman extends Player{
	private int runsScored;
	private int centuries;
	private int halfCenturies;
	private int ballsFaced;
    private int sixes;
    private int fours;
    public Batsman() {
    	//Auto-generated constructor 
    }
    public Batsman(int jerseyID,String name,int runsScored,int centuries,int halfCenturies,int ballsFaced,int sixes,int fours)
    {
    	/*setJerseyID(jerseyID);
    	setName(name);*/
    	super(jerseyID,name);//super keyword is used to access the variables from super class in inheritance instead of using setters
    	this.runsScored=runsScored;
    	this.centuries=centuries;
    	this.halfCenturies=halfCenturies;
    	this.ballsFaced=ballsFaced;
    	this.sixes=sixes;
    	this.fours=fours;
    }
	public int getRunsScored() {
		return runsScored;
	}
	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}
	public int getCenturies() {
		return centuries;
	}
	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}
	public int getHalfCenturies() {
		return halfCenturies;
	}
	public void setHalfCenturies(int halfCenturies) {
		this.halfCenturies = halfCenturies;
	}
	public int getBallsFaced() {
		return ballsFaced;
	}
	public void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}
	public int getSixes() {
		return sixes;
	}
	public void setSixes(int sixes) {
		this.sixes = sixes;
	}
	public int getFours() {
		return fours;
	}
	public void setFours(int fours) {
		this.fours = fours;
	}
	public float getStrikeRate() {
		float strikerate=(float)(runsScored*100)/ballsFaced;
		DecimalFormat d=new DecimalFormat("0.##");
		String s=d.format(strikerate);
		float strike=Float.parseFloat(s);
		return strike;
	}
	public int getRunsScoredInBoundaries() {
		return(4*fours+6*sixes);
	}
    public String toString()
    {
    	return "Batsman[JerseyID="+getJerseyID()+",Name="+getName()+",RunsScored="+runsScored+",centuries="+centuries+",halfcenturies="+halfCenturies+""
    			+ ",ballsFaced="+ballsFaced+",fours="+fours+",sixes="+sixes+",strikeRate="+getStrikeRate()+",RunsScoredInBoundaries="+getRunsScoredInBoundaries()+"]";
    			
   	 		
    }
}
