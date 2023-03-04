package class_object;

public class Student {
int id;
String name,dept;
int m1,m2,m3;
float calculatePercentage() {
	float percentage=(float)(m1+m2+m3)/3;
	return percentage;
}
	public String toString() {
		String s="ID:"+id+"\n"+"name:"+name+"\n"+"dept:"+dept+"\n"+"marks:"+m1+","+m2+","+m3+"\n"				
				+"percentage:"+calculatePercentage();
		return s;
		}
	
}
