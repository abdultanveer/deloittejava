package inheritance;

public class DemoTax {
	public static void main(String[] args) {
		IncomeTax incomeTax = new IncomeTax();
		int tax = incomeTax.calculateTax(10000);
		System.out.println(tax);
		
		Gst gst = new Gst();
		int myGst = gst.calculateTax(600000);
		System.out.println("gst="+myGst);
	}

}
