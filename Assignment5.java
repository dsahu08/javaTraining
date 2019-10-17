package day1;

class Customer{
	String firstName;
	String middleName;
	String lastName;
	String emailId;
	String accountType;
	String dob;
	char gender;
	String maritalStatus;
	
	
	
	void setFirstName(String fName){
		this.firstName = fName;
	}
	void setMiddleName(String mName){
		this.middleName = mName;
	}
	void setLastName(String lName){
		this.lastName = lName;
	}
	void setEmailId(String emailId){
		this.emailId = emailId;
	}
	void setAccountType(String accType){
		this.accountType = accType;
	}
	void setDateOfBirth(String dob){
		this.dob = dob;
	}
	void setGender(char gender){
		this.gender = gender;
	}
	void setMaritalStatus(String mStatus){
		this.maritalStatus = mStatus;
	}
	
	
	String getFirstName(){
		 return firstName;
	}
	String getMiddleName(){
		 return middleName;
	}
	String getLastName(){
		return lastName;
	}
	String getEmailId(){
		return emailId;
	}
	String getAccountType(){
		return accountType;
	}
	String getDateOfBirth(){
		return dob;
	}
	char getGender(){
		return gender;
	}
	String getMaritalStatus(){
		return maritalStatus;
	}
	
}

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setFirstName("Paul");
		customer.setMiddleName("J");
		customer.setLastName("Anderson");
		customer.setDateOfBirth("3 jan 1985");
		customer.setEmailId("paul@wellfargo.com");
		customer.setAccountType("Salary");
		customer.setGender('M');
		customer.setMaritalStatus("Single");
		
		System.out.println("Employee 1\n"+customer.getFirstName()+" "+customer.getMiddleName()+" "+customer.getLastName()+"\n"+customer.getDateOfBirth()+"\n"+customer.getEmailId()+"\n"+customer.getAccountType()+"\n"+customer.getGender()+"\n"+customer.getMaritalStatus());	
	}

}
