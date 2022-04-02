package Exceptions;

public class AccountBalance {
	int balance=30000;	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		AccountBalance AB=new AccountBalance();
		AB.withdraw(40000);
	}
	void withdraw(int amount)  {
 	   if(balance>=amount) {
 		   balance=balance-amount;
 	   System.out.println("balance amount in Account is "+balance);
 		   }
	else 
	{
		throw new Account("Your Account Balance is Low");
	}
	}
}
