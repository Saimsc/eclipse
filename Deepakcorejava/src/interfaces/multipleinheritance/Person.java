package interfaces.multipleinheritance;

public class Person {
private String name;
private int yearsOfBirth;
public Person() {
	
}
public Person(String name,int yearsOfBirth) {
	this.name=name;
	this.yearsOfBirth=yearsOfBirth;
}
public String getName() {
	return name;
}
public int getYearsOfBirth() {
	return yearsOfBirth;
}

}
