package Constructor.cricket;

public class Cricket1 {

	public static void main(String[] args) {
		Player1 p1=new Player1(225,"dhoni",10500,50,78,15000,150,400);
		Player1 p2=new Player1(226,"tendulkar",9000,35,61,14000,23,79);
		Player1 p3=new Player1(227,"kohli",17000,25,53,23000,40,75);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	

     Player1 p=p1;
     if(p2.getStrikeRate()>p.getStrikeRate())
    	 p=p2;
     if(p3.getStrikeRate()>p.getStrikeRate())
    	 p=p3;
     System.out.println("*****Highest strike rate player details*****");
     System.out.println(p);
	}
}