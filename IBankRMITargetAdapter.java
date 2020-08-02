import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.naming.CommunicationException;

public interface IBankRMITargetAdapter extends Remote {
	void deposit(String accountNumber, double value)
	throws CommunicationException, UnknownAccountException,RemoteException;
}
