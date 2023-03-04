package collectionsFramework.maps.sorting.points;

import java.util.*;
public class DistanceCalculation {
	Map<String,Double> distanceMap = new HashMap<String,Double>();
	
	public void getPointCombination(List<Point> plist) {
		for(int i=0;i<plist.size();i++) {
			System.out.println("index"+i+":"+plist.get(i));
			Point s1 = plist.get(i);//here are point combinations so we take point as datatype and fetch one of the
			//point data from combination
			for(int j=0;j<plist.size();j++) {//
				Point s2= plist.get(j);
				                  //<---key------------------->   <----value-------->             
				distanceMap.put(s1.getName()+","+s2.getName(),findDistance(s1,s2));
		}
	}
	}
	
	public double findDistance(Point n1,Point n2) {
		double distance= 0.0;
		float x1 = n1.getX();
		float y1 = n1.getY();
		
		float x2 = n2.getX();
		float y2 = n2.getY();
		
		distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		
		return distance;
		
	}
	public void findMaxDistance() {
		double max = 0.0;
		Map.Entry<String,Double> MaxEntry = null;
		for(Map.Entry<String,Double> e : distanceMap.entrySet()) {
			double distance = e.getValue();
			if(distance>max) {
				max= distance;
				MaxEntry = e;
			}
		}
		System.out.println("max details info:"+MaxEntry);
	}
	public void displayMap() {
		for(Map.Entry<String,Double> e : distanceMap.entrySet()) {
			System.out.println(e);
		}
		System.out.println("=======================================================================");
	}
}

