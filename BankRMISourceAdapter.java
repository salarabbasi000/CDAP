import java.rmi.Naming;
import java.rmi.RemoteException;
import javax.naming.CommunicationException;

public class BankRMISourceAdapter// implements IBank
{
	private IBankRMITargetAdapter bank;
	
	private static BankRMISourceAdapter instance=new BankRMISourceAdapter();
		
	public static BankRMISourceAdapter getInstance() throws CommunicationException
	{
		return instance;
	}
	
	private BankRMISourceAdapter(){}
	
	public void RMIConnect(String whereServer)
	throws CommunicationException
	{
		System.err.println("Source Adapter ready");
		connect(whereServer);
	}
	
	private void connect(String server) throws CommunicationException
	{
		try
		{
			bank = (IBankRMITargetAdapter) Naming.lookup(server);
			System.err.println("Remote connection with Target Adapter successful"); 
		}
		catch (Exception e)
		{
			System.err.println("Server not found."); 
			throw new CommunicationException();
		}

	}
	
	public void deposit (String accountNumber, double value)throws CommunicationException,UnknownAccountException
	{
		try
		{
			bank.deposit(accountNumber,value);
		}
		catch (RemoteException e)
		{
				throw new CommunicationException();
		}
	}

}
