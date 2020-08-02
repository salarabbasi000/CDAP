import java.util.concurrent.TimeUnit;

import javax.naming.CommunicationException;

public class Source {

	public static void main(String[] args) throws CommunicationException, UnknownAccountException {
		// TODO Auto-generated method stub
		
		BankRMISourceAdapter sA= BankRMISourceAdapter.getInstance();
		sA.RMIConnect(args[0]);

		sA.deposit("43203-4280420-1",100000);

	}
}


