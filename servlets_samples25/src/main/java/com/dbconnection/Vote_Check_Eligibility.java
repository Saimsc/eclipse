package com.dbconnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Vote_Check_Eligibility
 */
@WebServlet("/Vote_Check_Eligibility")
public class Vote_Check_Eligibility extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Vote_Check_Eligibility() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		String name=request.getParameter("voter_name");
		try
		{
			int age=getAgeFromDB(name);
			out.write("<html><body>");
			if(age>=18)
			{
				out.write("<h1> welcome..." + name +"...you can vote </h1>");
			}
			else
			{
				out.write("<h1 style='color:red'>sorry...not eligible for voting</h1>");
				out.write("<h1> try after..."+(18-age)+"...years</h1>");
			}
			out.write("</body></html>");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
     public int getAgeFromDB(String name) throws ClassNotFoundException, SQLException{
    	 int age=0;
    	 Class.forName("com.mysql.cj.jdbc.Driver");
    	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/election","root","Sriniv@s9999");
    	 PreparedStatement ps=con.prepareStatement("select age from voter where name=?");
    	 ps.setString(1, name);
    	 ResultSet rs=ps.executeQuery();
    	 rs.next();
    	 age=rs.getInt(1);
    	 con.close();
    	 return age;
    	 
     }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
