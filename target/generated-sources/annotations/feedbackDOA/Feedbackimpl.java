package feedbackDOA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import feedback.FeedbackEntity;

public class Feedbackimpl {
	private Connection con;

	    private static final String DB_URL = "jdbc:mysql://localhost:3306/lawtech";
	    private static final String DB_USER = "root";
	    private static final String DB_PASSWORD = "Kokoaunty123!";

	    public void insertData(FeedbackEntity c) {
	        Connection con = null; // Declare connection outside the try block
	        PreparedStatement PS = null;

	        try {
	            try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

	            String sql = "INSERT INTO feedback (name, email, message, regarding, code, rating ) VALUES (?, ?, ?, ?, ?, ?)";
	            PS = con.prepareStatement(sql);
	            PS.setString(1, c.getName());
	            PS.setString(2, c.getEmail());
	            PS.setString(3, c.getMessage());
	            PS.setInt(4, c.getRegarding());
	            PS.setString(5, c.getCode());
	            PS.setInt(6, c.getRating());
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (PS != null) {
	                    PS.close();
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	            try {
	                if (con != null) {
	                    con.close();
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}
	


	
