package collectionsFramework.maps.sorting.points;

public class Point {
	private String name;
	private float x,y;
	
	public Point() {
		
	}
	
	public Point(String name,float x,float y) {
		this.name=name;
		this.x=x;
		this.y=y;
	}

	public String getName() {
		return name;
	}

	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return name+"(" + x + "," + y +")";
	}
	

}
