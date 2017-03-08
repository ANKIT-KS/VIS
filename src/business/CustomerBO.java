package business;




import java.util.Date;

import dataaccess.CustomerDAO;
import domain.Customer;

public class CustomerBO{
	
	
	public boolean validateLogin(int userid,String password) throws Exception {
		
		Customer user = new CustomerDAO().getByID(userid);
		 System.out.println("Successful2");
		return new Customer(userid,password).equals(user)?true:false;
	}
	
	
	public boolean register(String c_name, String c_pass,String c_add , String c_city,String c_state,String c_country,int c_pin, String c_email , String c_gender, int c_no,String c_dob) throws Exception {
		
		int c_id=105;
		boolean z=false;
		int result =0;
		result= new CustomerDAO().insert(c_id, c_name,c_pass,c_add,c_city,c_state,c_country,c_pin,c_email,c_gender,c_no,c_dob);
		 System.out.println(result);
		 if(result==1)
		 {
	return true;
	
	}
		 return z;
			 
	
	
}
}
