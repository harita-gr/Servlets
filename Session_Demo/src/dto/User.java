package dto;

//Data Transfer Object -  dto


public class User {

	//Variables
	 private String fname;
	 private String lname;
	 private String email;
	 private String city;
	 private int contact;
	 private int age;
	 
	//Getters & Setters
	
	public String getEmail() {
		return email;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//ToString
	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", email=" + email + ", city=" + city + ", contact="
				+ contact + ", age=" + age + "]";
	}
	
	
     
	 
	 
	 
}
