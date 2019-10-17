package day1;

public class Assignment4 {

	private String customerID;
	private String customerName;
	private String address;
	private int pinCode;
	public static void main(String[] args) {
		
		Assignment4 customer = new Assignment4();
		customer.customerID = "1234";
		customer.customerName = "Jamy";
		customer.address ="1115 Oregon Avn, Apt#2,Beaumont,TX";
		customer.pinCode = 110015;
		System.out.println("Customer ID:"+customer.customerID);
		System.out.println("Customer Name:"+customer.customerName);
		System.out.println("Customer Address:"+customer.address);
		System.out.println("Customer Pin Code:"+customer.pinCode);
	}

}
