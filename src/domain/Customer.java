package domain;

import java.util.Date;




public class Customer {
	public int CustId;
	 public String CustomerName;
	 public String Password;
	 public String Address;
	 public String City;
	 public String State;
	 public String Country;
	 public int PinCode;
	 public String Email;
	 public String Gender;
	 public int Contact;
	 public Date DateOfBirth;
	public int getCustId() {
		return CustId;
	}
	public void setCustId(int custId) {
		CustId = custId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public int getPinCode() {
		return PinCode;
	}
	public void setPinCode(int pinCode) {
		PinCode = pinCode;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getContact() {
		return Contact;
	}
	public void setContact(int contact) {
		Contact = contact;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public Customer(int custId, String customerName, String password,
			String address, String city, String state, String country,
			int pinCode, String email, String gender, int contact,
			Date dateOfBirth) {
		super();
		CustId = custId;
		CustomerName = customerName;
		Password = password;
		Address = address;
		City = city;
		State = state;
		Country = country;
		PinCode = pinCode;
		Email = email;
		Gender = gender;
		Contact = contact;
		DateOfBirth = dateOfBirth;
	}
	 
	
    public Customer(String username2, String password2) {
		// TODO Auto-generated constructor stub
    	this.CustomerName = username2;
    	this.Password = password2;
	}
    
	
    public Customer(int username2, String password2) {
 		// TODO Auto-generated constructor stub
     	this.CustId = username2;
     	this.Password = password2;
 	}
     
	 
    public boolean equals(Object obj) {
    	 System.out.println("Successful equals");
    	if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (Password == null) {
			if (other.Password != null)
				return false;
		} else if (!Password.equals(other.Password))
			return false;
		if (CustId == 0) {
			if (other.CustId != 0)
				return false;
		} else if (CustId!=other.CustId)
			return false;
		 System.out.println("Successful...");
		return true;
	}
	 
	
	@Override
    public String toString() {
        return "Customer{" + "CustomerId=" + CustId + ", CustomerName=" + CustomerName + ", Password=" + Password + ", Address=" + Address + ", City=" + City + ", State=" + State + ", Country=" + Country +", PinCode=" + PinCode +", Email=" + Email + ", Gender=" + Gender + ", Contact=" + Contact + ", DateOfBirth=" + DateOfBirth +'}';
    }
    
	 
}
