package ipl.service;

import java.sql.SQLException;
import java.util.List;

import ipl.entities.Player;
import ipl.entities.Team;
import ipl.persistance.PlayerDAOImpl;
import ipl.persistance.TeamDAOImpl;

public class IPLservice {
	public List<Team> fetchAllTeams() throws SQLException
	{
		return new TeamDAOImpl().getAllTeams();
	}
	public int addTeam(Team team) throws ClassNotFoundException, SQLException
	{
		return new TeamDAOImpl().insertTeam(team);
	}
	public int deleteTeam(int teamid) throws ClassNotFoundException, SQLException
	{
		return new TeamDAOImpl().deleteTeamById(teamid);
	}
	public List<Player> viewTeamDetails(int id) throws ClassNotFoundException, SQLException
	{
		Team team=new Team();
		team.setId(id);
		return new PlayerDAOImpl().getAllPlayers(team);
	}
	}