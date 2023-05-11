package com.project;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class MyServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Read form data from html
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        // JDBC driver name and database URL
        String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://u21409_5oLEJQbRj9:iVLaJej+UR@rgMLEvNYwmn6T@161.97.78.70:3306/s21409_mow";
        
        // Database credentials
        String USER = "u21409_5oLEJQbRj9";
        String PASS = "iVLaJej+UR@rgMLEvNYwmn6T";
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
            //something needs to be here 
            // connection
        
        // Data into tables 
        
        //exceptions
        

    }
}
