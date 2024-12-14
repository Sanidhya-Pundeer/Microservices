package com;

import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class fLoginprocess
 */
public class fLoginprocess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fLoginprocess() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost/uni";//to be changed
			String user="Riya";//to be changed
			String pass="771078";//to be changed
			Connection con=DriverManager.getConnection(url,user,pass);
			String fID=request.getParameter("fID");
			String fPass=request.getParameter("fPass");
			PrintWriter out=response.getWriter();
			
			Statement st=con.createStatement();
			String qu="Select *from faculty";
			ResultSet rs=st.executeQuery(qu);
			int flag=1;
			while(rs.next()){
				if(fID.equals(rs.getString(1)) && fPass.equals(rs.getString(3))){
					response.sendRedirect("fHome.jsp");
					flag=0;
					break;
				}
			}
			if (flag==1) {
				response.sendRedirect("Error.jsp");
			}

			
			
			}
			catch(Exception e){
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
