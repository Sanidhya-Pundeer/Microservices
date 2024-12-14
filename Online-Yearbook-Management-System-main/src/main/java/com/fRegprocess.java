package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.*;

/**
 * Servlet implementation class fRegprocess
 */
public class fRegprocess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fRegprocess() {
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
			String id=request.getParameter("fID");
			String name=request.getParameter("fName");
			String pass1=request.getParameter("fPass");

			Statement st=con.createStatement();
			String qu="Select *from faculty";
			ResultSet rs=st.executeQuery(qu);
			int flag=1;
			while(rs.next()){
				if(id.equals(rs.getString(1))){
					response.sendRedirect("Error.jsp");
					flag=0;
					break;
				}
			}
			if (flag==1) {
				PreparedStatement pst=con.prepareStatement("insert into faculty values(?,?,?)");
				pst.setString(1, id);
				pst.setString(2,name);
				pst.setString(3, pass1);
				pst.execute();
				response.sendRedirect("success.jsp");
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
