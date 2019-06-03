package database;
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class Connector {
		
	    private static final String url = "jdbc:mysql://localhost:3306/npbase";
	    private static final String user = "root";
	    private static final String password = "root";

	    private static Connection con;
	    private static Statement stmt;
	    private static ResultSet rs;
	    
	    public static void printAllData() {
	    	System.out.println("printing");
	    	String query = "select count(*) from items";
	    	
	        try {
	        	
	        	try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
	        	
	            con = DriverManager.getConnection(url, user, password);
	            stmt = con.createStatement();
	            rs = stmt.executeQuery(query);
	            
	            while (rs.next()) {
	                int count = rs.getInt(1);
	                System.out.println("Total number of books in the table : " + count);
	            }

	        } catch (SQLException sqlEx) {
	            sqlEx.printStackTrace();
	        } finally {
	            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
	            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
	            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
	        }
	    }

	}

