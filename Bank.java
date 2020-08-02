class Bank implements IBank
{
	private AccountRecord accounts;
	public Bank()
	{
		accounts=new AccountRecord();
	}
	public void deposit(String accountNumber, double value)throws UnknownAccountException
	{
		
		accounts.deposit(accountNumber,value);
	}
}