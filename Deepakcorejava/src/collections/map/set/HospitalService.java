package collections.map.set;
import java.util.*;
public class HospitalService {
	private List<Hospital> hos = new ArrayList<Hospital>();
	
	   
	public HospitalService()
   {
	   
   }
   
   public int addHospital(Hospital h)
   {
	    hos.add(h);
	    return h.getHospitalCode();
   }
   
   public Map<Integer,String> getHospital()
   {
	   Map<Integer,String> hash = new HashMap<Integer,String>();
	   for(Hospital h : hos)
	   {
		   hash.put(h.getHospitalCode(), h.getHospitalName());
	   }
	   
	   return hash;
   }
   
   
   public Hospital getHospitalDetails(int code)
   {
	 
	   for(Hospital h : hos)
	   {
		   if(code==h.getHospitalCode())
			   return h;
	   }
	   return null;
   }

	
}
