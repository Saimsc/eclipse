package collections.map.set;
import java.util.*;
public class HospitalFinder {
	public static void main(String[] args) {
		  List<String> treatment = new ArrayList<String>();
		    treatment.add("Cardiogram");
		    treatment.add("Echogram");
		    treatment.add("X-Ray");
		    treatment.add("ECG");
			
			
			Hospital h1 = new Hospital("Yashoda Hospitals", treatment , "Hari", "8765432876",
			"Jubilee Hills");
			Hospital h2 = new Hospital("Care Hospitals", treatment , "Ravi", "9785838876",
					"Jubilee Hills");
			Hospital h3 = new Hospital("Star Hospitals", treatment , "Kishore", "9765332872",
					"Jubilee Hills");
			Hospital h4 = new Hospital("Prime Hospital", treatment , "Madhavi", "8045452876",
					"Jubilee Hills");
			
			HospitalService hs = new HospitalService();
			
			hs.addHospital(h1);
			hs.addHospital(h2);
			hs.addHospital(h3);
			hs.addHospital(h4);
			
			System.out.println(hs.getHospital());
			
			System.out.println(hs.getHospitalDetails(h1.getHospitalCode()));
			System.out.println(hs.getHospitalDetails(h2.getHospitalCode()));
			System.out.println(hs.getHospitalDetails(h3.getHospitalCode()));
			System.out.println(hs.getHospitalDetails(h4.getHospitalCode()));
			
	}

}


