// import java.io.*;
// import javax.servlet.*;
// import javax.servlet.http.*;
// import java.sql.*;

// public class LoginServlet extends HttpServlet {

//     public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
//         // Set response content type
//         response.setContentType("text/html");
//         PrintWriter out = response.getWriter();
        
//         // Read form data
//         String firstName = request.getParameter("firstName");
//         String lastName = request.getParameter("lastName");
//         String username = request.getParameter("username");
//         String password = request.getParameter("password");
        
//         // JDBC driver name and database URL
//         String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//         String DB_URL = "jdbc:mysql://localhost/mydatabase";
        
//         // Database credentials
//         String USER = "username";
//         String PASS = "password";
        
//         Connection conn = null;
//         PreparedStatement stmt = null;
        
//         try {
//             // Register JDBC driver
//             Class.forName(JDBC_DRIVER);
            
//             // Open a connection
//             conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
//             // Insert user data into the database
//             String sql = "INSERT INTO users (first_name, last_name, username, password) VALUES (?, ?, ?, ?)";
//             stmt = conn.prepareStatement(sql);
//             stmt.setString(1, firstName);
//             stmt.setString(2, lastName);
//             stmt.setString(3, username);
//             stmt.setString(4, password);
            
//             int rowsInserted = stmt.executeUpdate();
//             if (rowsInserted > 0) {
//                 out.println("User registered successfully!");
//             }
//         } catch (SQLException se) {
//             se.printStackTrace();
//         } catch (Exception e) {
//             e.printStackTrace();
//         } finally {
//             // Clean-up environment
//             try {
//                 if (stmt != null) {
//                     stmt.close();
//                 }
//             } catch (SQLException se2) {
//                 se2.printStackTrace();
//             }
//             try {
//                 if (conn != null) {
//                     conn.close();
//                 }
//             } catch (SQLException se) {
//                 se.printStackTrace();
//             }
//         }
//     }
// }
