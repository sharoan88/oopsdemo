package practice1;

public class SavingsBank extends Account {
	
	private int min_bal;
	protected int balance;
	
	public SavingsBank(int accNo, String name,int mb,int b) {
		super(accNo, name);
		this.min_bal=mb;
		this.balance=b;	
	}
	
	void display()
	{
		super.display();
		System.out.println("Minimum balance :"+min_bal);
		System.out.println("Saving balance : "+balance);
	}
	
	
	
	

}
