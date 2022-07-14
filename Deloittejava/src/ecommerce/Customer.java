package ecommerce;

public class Customer {
	int cid;
	String cName;
	String cShippingAddress;
	int phno;
	
	
	
	public Customer(int cid, String cName, String cShippingAddress, int phno) {
		
		this.cid = cid;
		this.cName = cName;
		this.cShippingAddress = cShippingAddress;
		this.phno = phno;
	}
	
	
	public void login() {
		System.out.println("customer is logging in song");
	}
	public void browse() {
		System.out.println("customer is browsing -- dancing");
	}
	public void shop(Product p) {
		System.out.println("custoemr is shopping -- fighting--"+p.pName);
	}
}
