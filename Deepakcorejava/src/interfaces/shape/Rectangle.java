package interfaces.shape;

public class Rectangle implements Shape{
	private float length,width;
	public Rectangle() {
		
	}
public Rectangle(float length,float width) {
	this.length=length;
	this.width=width;
	}
public double getArea() {
	return (length*width);
}
public double getPerimeter(){
	return 2*(length*width);
	}
public String toString() {
	return "Rectangle[length="+length+",width="+width+",Area="+getArea()+",perimeter="+getPerimeter()+"]";
}
}








