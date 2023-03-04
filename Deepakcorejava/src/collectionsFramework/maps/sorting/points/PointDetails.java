package collectionsFramework.maps.sorting.points;

import java.util.*;
public class PointDetails {

	public static void main(String[] args) {
		Point p1 = new Point("sai",0.2f,1.2f);
		Point p2 = new Point("dee",1.5f,0.12f);
		Point p3 = new Point("hello",0.35f,0.14f);
		
		List<Point> pList = new ArrayList<Point>();
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		DistanceCalculation calc = new DistanceCalculation();
		calc.getPointCombination(pList);
		calc.displayMap();
		calc.findMaxDistance();
		
		
		
		
	}

}
