package abstraction.student;

public abstract class Student {
 private int id;
 private String name;
 private static int idgen=200;
 public Student() {
	 id=++idgen;
 }
	 public Student(String name) {
		this();
		 this.name=name;
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
	public abstract float findPercentage();
}


