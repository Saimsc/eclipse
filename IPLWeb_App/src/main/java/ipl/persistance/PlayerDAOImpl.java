package ipl.persistance;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ipl.entities.Player;
import ipl.entities.Team;


public class PlayerDAOImpl {
	public List<Player> getAllPlayers(Team team) throws ClassNotFoundException, SQLException
	{
		List<Player> playerList=new ArrayList<Player>();
		Connection con=ConnectionHub.getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from player where id="+team.getId());
		while(rs.next())
		{
			Player player=new Player();
			player.setPlayerid(rs.getInt(1));    
			player.setName(rs.getString(2));
			player.setAge(rs.getInt(3));
			int id=rs.getInt(4);
			team=new TeamDAOImpl().getTeamById(id);
			player.setTeam(team);
			playerList.add(player);
		}
		return playerList;
	}
}