package ipl.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHub 
{

	public static Connection getConnection() throws ClassNotFoundException
	{
		Connection con=null;
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/msai","root","Sriniv@s9999");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	return con;
	}
	}