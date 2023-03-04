package Constructor.cricket;

import java.text.DecimalFormat;

public class Player1 {
	private int id;
	private String name;
	private int runsScored;
	private int centuries;
	private int halfCenturies;
	private int ballsFaced;
    private int sixes;
    private int fours;
    public Player1() {
    }
    
    	 public Player1(int id,String name,int runsScored,int centuries,int halfCenturies,int ballsFaced,int sixes,int fours)
    	    {
    		 this.id=id;
    		 this.name=name;
    		 this.runsScored=runsScored;
    	     this.centuries=centuries;
    	     this.halfCenturies=halfCenturies;
    	     this.ballsFaced=ballsFaced;
    	   	 this.sixes=sixes;
    	     this.fours=fours;
    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
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
	    	return "Batsman[ID="+id+",Name="+name+",RunsScored="+runsScored+",centuries="+centuries+",halfcenturies="+halfCenturies+""
	    			+ ",ballsFaced="+ballsFaced+",fours="+fours+",sixes="+sixes+",strikeRate="+getStrikeRate()+",RunsScoredInBoundaries="+getRunsScoredInBoundaries()+"]";
	    			
}
}
