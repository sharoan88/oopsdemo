package practice1;

public class AccountantTest {
	
	public static void main(String[] args) {
		
		Accountant ac1 = new Accountant(101, "Ghavrau Sharma", "process salary of employees", "SAP");
		Accountant ac2 = new Accountant(201, "Maey john", "Payment to Vendors", "Tally");
		
		
		ac1.print();
		
		ac2.print();
	}

}
