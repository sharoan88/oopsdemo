package oopsdemo2;

public class AccountantTest {
	public static void main(String[] args) {
		
		Accountant ac1 = new Accountant(201, "Ghourav Sharma","Process salary of Employees" , "SAP");
		Accountant ac2 = new Accountant(205,"Mary John","Payment to Vendors","Tally");
		
		ac1.print();
		ac2.print();
	}

}
