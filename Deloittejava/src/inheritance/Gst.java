package inheritance;

public class Gst extends IncomeTax{
	
	@Override
	public int calculateTax(int income) {
		
		int tax = super.calculateTax(income);
		if(income > 500000) {
			int newTax = income/10;
			tax = tax + newTax;
		}
		return tax;
	}

}
