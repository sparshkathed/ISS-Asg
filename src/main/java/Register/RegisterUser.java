package Register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterUser extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/iss", "root", "abhi");

                String username = request.getParameter("regUsername");
                String password = request.getParameter("regPassword");
                String confirmPassword = request.getParameter("confirmPassword");

                PreparedStatement checkStatement = (PreparedStatement) con.prepareStatement("SELECT * FROM login WHERE uname = ?");
                checkStatement.setString(1, username);
                if (checkStatement.executeQuery().next()) {
                    out.println("<font color=red size=18>Registration failed. Username already exists.</font>");
                }
                else {
                    // Insert the new user into the database
                    PreparedStatement insertStatement = con.prepareStatement("INSERT INTO login (uname, password) VALUES (?, ?)");
                    insertStatement.setString(1, username);
                    insertStatement.setString(2, password);
                    int rowsAffected = insertStatement.executeUpdate();

                    if (rowsAffected > 0) {
                        out.println("<font color=green size=18>Registration successful. You can now login.</font>");
                    } else {
                        out.println("<font color=red size=18>Registration failed. Please try again later.</font>");
                    }
                }

                
            } catch (SQLException e) {
                out.println("hi");
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
