package exception.student;

public class Student {
  private int id;
  private String name,address;
  
  private static int idGen = 201;
  public Student() {
	  id = idGen++;			 
  }
public Student(String name, String address) {
	this();
	this.name = name;
	this.address = address;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
}
  
}
