package ipl.entities;

public class Player {

	private int playerid;
	private String name;
	private int age;
	private Team team ;
	public int getPlayerid()
	{
		return playerid;
	}
	public void setPlayerid(int playerid) 
	{
		this.playerid = playerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", name=" + name + ", age=" + age + ", team=" + team + "]";
	}
	
}
