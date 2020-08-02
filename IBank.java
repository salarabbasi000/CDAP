import javax.naming.CommunicationException;

interface IBank {
	void deposit(String accountNumber, double value)
			throws CommunicationException,UnknownAccountException;
}