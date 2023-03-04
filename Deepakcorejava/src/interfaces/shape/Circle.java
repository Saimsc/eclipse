package interfaces.shape;

public class Circle implements Shape{
 private float radius;
 public Circle() {
	 
 }
 public Circle(float radius) {
	 this.radius=radius;
 }
 public double getArea() {
	 return (3.14*radius*radius);
 }
 public double getPerimeter() {
	 return (2*3.14*radius);
 }
 public String toString() {
	 return "[radius="+radius+",Area="+getArea()+",perimeter="+getPerimeter()+"]";
 }
}
