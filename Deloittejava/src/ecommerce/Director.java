package ecommerce;

public class Director {
	public static void main(String[] args) {
		Customer abdulCustomer = new Customer(12, "ansari", "bangalore", 123);
		abdulCustomer.login();
		abdulCustomer.browse();
		Product someProduct = new Product(9,123,"shampoo");
		abdulCustomer.shop(someProduct);
	}

}
