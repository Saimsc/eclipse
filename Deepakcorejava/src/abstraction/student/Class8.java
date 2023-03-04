package abstraction.student;

import java.util.Arrays;

public class Class8 extends Student{
	private int marks[];
	public static int idgen=200;
	public Class8(){
		
	}
	public Class8(String name,int[] marks) {
		super(name);
		this.marks=marks;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
       
		this.marks = marks;
	}
    @Override
    public float findPercentage() {
    	int sum=0;
    	for(int i=0;i<marks.length;i++) {
    		sum +=marks[i];
    	}
    	float percentage=(float)sum/marks.length;
    	return percentage;
    }
    @Override
    public String toString() {
    	return"Class8 [getId="+getId()+",Name="+getName()+",marks="+Arrays.toString(marks)+",percentage="+findPercentage()+"]";
    }
}
