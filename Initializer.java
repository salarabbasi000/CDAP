import java.rmi.RemoteException;

import javax.naming.CommunicationException;

public class Initializer {

	public static void main(String[]args) throws CommunicationException, RemoteException, UnknownAccountException
	{
		IBankRMITargetAdapter tA;
		IBank b;

		b=new Bank();

		tA=new BankRMITargetAdapter(b);
		
	}
}
