import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import javax.naming.CommunicationException;


public class BankRMITargetAdapter extends UnicastRemoteObject implements IBankRMITargetAdapter
{
	private IBank bank;

	public BankRMITargetAdapter(IBank bank)throws CommunicationException, RemoteException
	{
		try
		{
			this.bank = bank;
			Naming.rebind("BankServer",this);
			System.err.println("Target Adapter ready: "); 
		} 
		catch (Exception e)
		{
			throw new CommunicationException();
		}
	}
	
	@Override
	public void deposit(String accountNumber, double value)
	throws CommunicationException, RemoteException, UnknownAccountException
	{
			bank.deposit(accountNumber, value);
	} // end of BankRMITargetAdapter
}