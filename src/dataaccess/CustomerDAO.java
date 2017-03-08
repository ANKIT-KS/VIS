package dataaccess;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




import java.text.ParseException;
import java.util.Date;

import dbconnection.DBConnection;
import domain.Customer;

public class CustomerDAO {
    public Customer getByUsername(String id) throws Exception {
        ResultSet rs = null;
        Connection connection = null;
        Statement statement = null; 
         
       Customer employee = null;
        String query = "SELECT * FROM customerregistration WHERE Customer_name =" + id ;
        try {           
            connection = DBConnection.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
             
            if (rs.next()) {
            	  System.out.println("Successful");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } System.out.println("Successful");
        return employee;
    }
    
    public Customer getByID(int id) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement s;
        Customer user = null;
        s = con.prepareStatement("SELECT * from customerregistration where Customer_id= " + id);
        try {
            ResultSet rSet = s.executeQuery();
            if (rSet.next()) {
                
                user = new Customer(rSet.getInt("Customer_id"), rSet.getString("Customer_name"), rSet.getString("Customer_password"), rSet.getString("Customer_address"), rSet.getString("Customer_city"),rSet.getString("Customer_state"),rSet.getString("Customer_country"),rSet.getInt("Customer_pincode"),rSet.getString("Customer_email"),rSet.getString("Customer_gender"),rSet.getInt("Customer_contact_no"),rSet.getDate("Customer_DOB"));//column label
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        con.close();
        return user;
    }
	
    public int insert(int c_id,String c_name, String c_pass,String c_add , String c_city,String c_state,String c_country,int c_pin, String c_email , String c_gender, int c_no,String c_dob) throws Exception {
		
		  int a=0;
		
		 try {
				Connection con=DBConnection.getConnection();
				if(con!=null)
				{
					
				
					String sql="INSERT INTO customerregistration (Customer_id, Customer_name, Customer_password, Customer_address,Customer_city, Customer_state, Customer_country, Customer_pincode, Customer_email, Customer_gender, Customer_contact_no, Customer_DOB) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
					
					PreparedStatement stmt=con.prepareStatement(sql);
					
				
					stmt.setInt(1, c_id);
					stmt.setString(2, c_name);
					stmt.setString(3, c_pass);
					stmt.setString(4, c_add);
					stmt.setString(5, c_city);
					stmt.setString(6, c_state);
					stmt.setString(7, c_country);
					stmt.setInt(8, c_pin);
					stmt.setString(9, c_email);
					stmt.setString(10, c_gender);
					stmt.setInt(11, c_id);
					stmt.setString(12, c_dob);
					 a= stmt.executeUpdate();
					
					
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
		return a;
			
		}
		
	
	
	
}


