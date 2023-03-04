package inheritance.cricket;
//Blueprint class
public class Player {
private int jerseyID;
private String name;
public Player() {
	
}
public Player(int jerseyID,String name) {
	this.jerseyID =jerseyID;
	this.name=name;
	
}
public int getJerseyID() {
	return jerseyID;
}
public void setJerseyID(int jerseyID) {
	this.jerseyID = jerseyID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
