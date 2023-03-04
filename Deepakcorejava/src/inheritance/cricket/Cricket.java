package inheritance.cricket;

public class Cricket {
public static void main(String[]args) {
	Batsman b1=new Batsman(401,"virat",14500,74,104,17650,56,123);
	Bowler  b2=new Bowler(402,"dhoni",550,40,600);
	WicketKeeper w=new WicketKeeper(403,"kohli",225,260,25);
			System.out.println(b1);
			System.out.println(b2);
            System.out.println(w);
}

}
