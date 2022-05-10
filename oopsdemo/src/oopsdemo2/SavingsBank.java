package oopsdemo2;

public class SavingsBank extends Account{ // child class of an account

	private int min_bal;
	protected int balance;
	
	public SavingsBank(int accNo, String name,int mb, int b) {
		super(accNo, name);
		this.min_bal=mb;  // can access only within the class
		this.balance = b;     //can access within the class & in the sub class
		
	}
	void display()
    {
            super.display(); // invoke super class method
            System.out.println ("Minimum Balance: "+min_bal);
            System.out.println ("Saving Balance: "+balance);
    }
	

}
