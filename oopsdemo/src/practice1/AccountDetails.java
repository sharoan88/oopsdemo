package practice1;
/**
 * Multi Level inheritance
 * Account--> Savings bank-->AccountDetails
 */

//child class of savings  Bank
public class AccountDetails extends SavingsBank{
	
	int withdrawl,deposit,finalBalance;

	public AccountDetails(int accNo, String name, int mb, int b,int w,int d) {
		super(accNo, name, mb, b);
		this.withdrawl=w;
		this.deposit=d;
	}
	
	void display()
	{
		super.display();//invoke savings bank display method
		System.out.println("Deposit : "+deposit);
		System.out.println("Withdrawl : "+withdrawl);
		finalBalance= (balance+deposit)-withdrawl;
		System.out.println("Final Balance :"+finalBalance);
		
	}

}
