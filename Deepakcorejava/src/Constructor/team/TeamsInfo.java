package Constructor.team;

public class TeamsInfo {

	public static void main(String[] args) {
	Team t1=new Team(1,"sunrisers hyderabad","hyderabad","telangana");
	Team t2=new Team();
    t2.setTeam_ID(2);
    t2.setTeam_name("royal challengers banglore");
    t2.setCity("banglore");
    Team t3= new Team(3,"Mumbai indians","mumbai","maharashtra");
    Team t4= new Team(4,"kolkata knight riders","kolkata","west bengal");
    Team t5= new Team();
    t5.setTeam_ID(5);
    t5.setTeam_name("rising pune super giants");
    t5.setState("maharashtra");
    Team t6= new Team(6,"kings xi punjab","mohali","punjab");
    Team t7=new Team();
    t7.setTeam_ID(7);
    t7.setTeam_name("gujarat lions");
    t7.setCity("rajkot");
    Team t8= new Team(8,"delhi daredevils","delhi","newdelhi");
    System.out.println(t1.toString());
    System.out.println(t2.getTeam_ID()+","+t2.getTeam_name()+","+t2.getCity());
    System.out.println(t3.getTeam_ID()+","+t3.getTeam_name()+","+t3.getState());
    System.out.println(t4.toString());
    System.out.println(t5.toString());
    System.out.println(t6.getTeam_ID()+","+t6.getTeam_name()+","+t6.getCity());
    System.out.println(t7.getTeam_ID()+","+t7.getTeam_name()+","+t7.getCity());
    System.out.println(t8.toString());
    
    }

}
