package com;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ssLogin
 */
public class ssLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ssLogin() {
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
		String user1=request.getParameter("user");
		String pass1=request.getParameter("pass");

		Statement st=con.createStatement();
		String qu="Select *from student";
		ResultSet rs=st.executeQuery(qu);
		int flag=1;
		while(rs.next()){
			if(user1.equals(rs.getString(2)) && pass1.equals(rs.getString(3))){
				response.sendRedirect("shome.jsp");
				flag=0;
				break;
			}
		}
		if (flag==1) {
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
