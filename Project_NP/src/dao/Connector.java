package dao;
	
	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Item;

	public class Connector {
		
	    private static final String url = "jdbc:mysql://localhost:3306/npbase";
	    private static final String user = "root";
	    private static final String password = "root";

	    private static Connection con;
	    private static Statement stmt;
	    private static ResultSet rs;
	    
	    public static String createDescriptionOfItems(List<Item> items) {
	    	
	    	StringBuilder s=new StringBuilder();
	    	String startRow="<tr><td>";
	    	String continueRow="</td><td>";
	    	String finishRow="</td></tr>";
	    	
	    	s.append("<table border=\"1\"><tr><th>getId</th><th>getMobile</th><th>getName</th> </tr>");
	    	
	    	for(Item item : items) {
	    		s.append(startRow).append(item.getId()).append(continueRow).
	    			append(item.getMobile()).append(continueRow).
	    				append(item.getName()).append(finishRow);
	    	}
	    	
	    	s.append("</table>");
	    	
	    	return s.toString();
	    }
	    
	    public static List<Item> retriveItemsByPhone(String mobile){
	    	if (mobile==null)
	    		return null;
	    	List<Item> items=new ArrayList<>();	    	
	    	System.out.println("retriveItemsByPhone");
	    	String query = "select * from items";
	    	
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
	            	String col3 = rs.getString(3);
	            	if (!col3.equals(mobile))
	            		continue;
	                String col1 = rs.getString(1);
	                String col2 = rs.getString(2);
	                
	                items.add(new Item(col1, col2, col3));
	                
	                System.out.println("new object found: "+col1+" "+col2+" "+col3);
	            }

	        } catch (SQLException sqlEx) {
	            sqlEx.printStackTrace();
	        } finally {
	            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
	            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
	            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
	        }
	    	
	    	return items;
	    }
	    
	    public static void printAllData() {
	    	System.out.println("printing");
	    	String query = "select name from items";
	    	
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
	                String col1 = rs.getString(1);
	                System.out.println(col1);
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

