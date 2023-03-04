package ipl.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ipl.entities.Team;


public class TeamDAOImpl {
	public List<Team> getAllTeams() throws SQLException
	{
		List<Team> teamList=new ArrayList<Team>();
		Connection con = null;
		try
		{
			con = ConnectionHub.getConnection();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from team");
			while(rs.next())
			{
				Team team=new Team();
				team.setId(rs.getInt(1));
				team.setName(rs.getString(2));
				team.setCity(rs.getString(3));
				team.setState(rs.getString(4));
				teamList.add(team);
			}
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
	return teamList;
	}

	public int insertTeam(Team team) throws ClassNotFoundException, SQLException
	{
		int row=0;
		Connection con = ConnectionHub.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into team (id,name,city,state) values(?,?,?,?)");
		ps.setInt(1, team.getId());
		ps.setString(2, team.getName());
		ps.setString(3, team.getCity());
		ps.setString(4, team.getState());
	    row=ps.executeUpdate();
	    System.out.println(row+" team added");
	    con.close();
	    return row;
	}
	public  int deleteTeamById(int id) throws SQLException, ClassNotFoundException
	{
	int row=0;
	Connection con=ConnectionHub.getConnection();
	PreparedStatement ps=con.prepareStatement("delete from team where id=?");
	ps.setInt(1,id);
	row=ps.executeUpdate();
	con.close();
	return row;
	}
	public Team getTeamById(int id) throws ClassNotFoundException, SQLException
	{
		Team team=null;
		Connection con=ConnectionHub.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from team where id=?");
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		rs.next();
		team=new Team();
		team.setId(rs.getInt(1));
		team.setName(rs.getString(2));
		team.setCity(rs.getString(3));
		team.setState(rs.getString(4));
		return team;
	}
	}