class customer
{
	int accNo;
	String name;
	float bal;
	
	void insertCustomerDetail(int i, String nm, float f)
	{
		accNo=i;
		name=nm;
		bal=f;		
	}
	void customerInformationDisplay()
	{
		System.out.println(accNo+"---"+name+"---"+bal);
	}
	
	void deposit(float f)
	{
		bal=bal+f;
		System.out.println("Amount Deposited - "+f);
	}
	
	void withdraw(float f)
	{
		if(bal<f)
			System.out.println("Insuficent Fund can't withdraw");
		else
		{
			bal=bal-f;
			System.out.println("Amount Withdraw - "+f);
		}
		
	}
	void displayBalance()
	{
		System.out.println("Avaliable Balance is - "+bal);
	}
}

public class AccountDetail 
{

	public static void main(String[] args) 
	{
		customer a1=new customer();
		a1.insertCustomerDetail(123456, "Ram", 5000);
		a1.customerInformationDisplay();
		a1.deposit(1000);
		a1.customerInformationDisplay();
		a1.displayBalance();
		a1.withdraw(4000);
		a1.displayBalance();
		a1.customerInformationDisplay();
	}

}
