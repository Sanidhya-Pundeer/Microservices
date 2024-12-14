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
 * Servlet implementation class view
 */
public class view extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public view() {
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
			
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String id=request.getParameter("id");
			Statement st=con.createStatement();
			String qu="Select *from achi";
			ResultSet rs=st.executeQuery(qu);
			int flag=0;
			out.println("<link rel=\"stylesheet\" href=\"styles_home.css\"><table style='border:3px solid black'><tr><td style='border:2px solid black'>Achievement</td><td style='border:2px solid black'>Position</td></tr>");
			
			while (rs.next()) {
				if (rs.getInt(1)==Integer.parseInt(id)) {
					PreparedStatement pst=con.prepareStatement("select *from achi where sid=?");
					pst.setString(1,id);
					ResultSet rst=pst.executeQuery();
						while (rst.next()) {
						out.println("<tr><td style='border:2px solid black'>"+rst.getString(2)+"</td>   <td style='border:2px solid black'>"+rst.getString(3)+"</td></tr>");
					}
					flag=1;
					break;
				} 
			}
			out.println("</table>");
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
