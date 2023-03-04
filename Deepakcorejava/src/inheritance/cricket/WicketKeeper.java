package inheritance.cricket;

public class WicketKeeper extends Player {
	private int noOfMatches;
	private int noOfCatches;
	private int noOfStumps;
	public WicketKeeper() {
		
	}
	public WicketKeeper(int jerseyID,String name,int noOfMatches,int noOfCatches,int noOfStumps)
	{
		super(jerseyID,name);
		this.noOfMatches=noOfMatches;
		this.noOfCatches=noOfCatches;
		this.noOfStumps=noOfStumps;
	}
	public int getNoOfMatches() {
		return noOfMatches;
	}
	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}
	public int getNoOfCatches() {
		return noOfCatches;
	}
	public void setNoOfCatches(int noOfCatches) {
		this.noOfCatches = noOfCatches;
	}
	public int getNoOfStumps() {
		return noOfStumps;
	}
	public void setNoOfStumps(int noOfStumps) {
		this.noOfStumps = noOfStumps;
	}
	public String toString() {
		return  "Batsman[JerseyID="+getJerseyID()+",Name="+getName()+",noOfMatches="+noOfMatches+",noOfCatches="+noOfCatches+",noOfStumps="+noOfStumps+"]";
				 
				
	}
}
