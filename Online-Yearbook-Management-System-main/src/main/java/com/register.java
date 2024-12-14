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
 * Servlet implementation class register
 */
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
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
		String name=request.getParameter("name");
		String pass1=request.getParameter("pass");

		Statement st=con.createStatement();
		String qu="Select *from student";
		ResultSet rs=st.executeQuery(qu);
		int flag=1;
		while(rs.next()){
			if(id.equals(rs.getString(1))){
				response.sendRedirect("errori.jsp");
				flag=0;
				break;
			}
		}
		if (flag==1) {
			PreparedStatement pst=con.prepareStatement("insert into student values(?,?,?)");
			pst.setString(1, id);
			pst.setString(2,name);
			pst.setString(3, pass1);
			pst.execute();
			response.sendRedirect("succ.html");
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
