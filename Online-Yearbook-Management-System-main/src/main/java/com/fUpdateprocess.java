package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class fUpdateprocess
 */
public class fUpdateprocess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fUpdateprocess() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
try {
			
			String driver="com.mysql.cj.jdbc.Driver";  
			String URL="jdbc:mysql://localhost/uni";
			String user="Riya";
			String pass="771078";
			Class.forName(driver);
			Connection con=DriverManager.getConnection(URL,user,pass);
			
			PrintWriter out=response.getWriter();
			String id=request.getParameter("sID");
			String aname=request.getParameter("sName");
			String apos=request.getParameter("sPass");
						
			Statement sst=con.createStatement();
			String qu="Select *from achi";
			ResultSet rs=sst.executeQuery(qu);
			int flag=0;
			while (rs.next()) {
				if (rs.getInt(1)==Integer.parseInt(id)) {
					PreparedStatement st=con.prepareStatement("update student set sname=?,spass=? where sid=?");
					st.setString(1,aname);
					st.setString(2, apos);
					st.setString(3, id);
				
					st.execute();
					flag=1;
					response.sendRedirect("success.jsp");	
					break;
				}
			}	
			
			if (flag==0) {
				response.sendRedirect("Error.jsp");
			}

		}catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
