package Login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				PrintWriter out = response.getWriter();
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/iss", "root", "abhi");
				String n = request.getParameter("username");
				String p = request.getParameter("password");
				PreparedStatement ps = con.prepareStatement("Select uname from login where uname=? and password=?");
				ps.setString(1, n);
				ps.setString(2, p);
				ResultSet rs = ps.executeQuery();
				if (rs.next()){
					RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/welcome.jsp");
					rd.forward(request, response);
				}
				else {
					out.println("<div class='alert alert-danger text-center' role='alert'>");
					out.println("Login failed<br>");
					out.println("<a href='index.jsp'>Try Again!!!</a>");
					out.println("</div>");
;
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
