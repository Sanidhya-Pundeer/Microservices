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
 * Servlet implementation class update
 */
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update() {
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
			String id=request.getParameter("id");
			String aname=request.getParameter("aname");
			String apos=request.getParameter("apos");
			String nname=request.getParameter("nname");
			String npos=request.getParameter("npos");
			
			Statement sst=con.createStatement();
			String qu="Select *from achi";
			ResultSet rs=sst.executeQuery(qu);
			int flag=0;
			while (rs.next()) {
				if (rs.getInt(1)==Integer.parseInt(id)) {
					PreparedStatement st=con.prepareStatement("update achi set aname=?,apos=? where sid=? and aname=? and apos=?");
					st.setString(1,nname);
					st.setString(2, npos);
					st.setString(3, id);
					st.setString(4,aname);
					st.setString(5, apos);
					st.execute();
					flag=1;
					response.sendRedirect("succ.html");	
					break;
				}
			}	
			
			if (flag==0) {
				response.sendRedirect("errori.jsp");
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
