package Constructor.team;

public class Team {
private int team_ID;
private String team_name,city,state;
public Team() {
}
	public Team(int id,String n,String c,String s) {
		team_ID=id;
		team_name=n;
		city=c;
		state=s;
	}
	public void setTeam_ID(int id) {
		team_ID=id;
	}
		public void setTeam_name(String n) {
			team_name=n;	
	}
		public void setCity(String c) {
			city=c;
}
		public void setState(String s) {
			state=s;
}
		public int getTeam_ID() {
			return team_ID;
		}
		public String getTeam_name() {
			return team_name;
		}
		public String getCity() {
			return city;
		}
		public String getState() {
			return state;
		}
		public String toString() {
			return"Team ID:"+team_ID+"Name:"+team_name+
					"city:"+city+"state:"
					+state;}

		}
