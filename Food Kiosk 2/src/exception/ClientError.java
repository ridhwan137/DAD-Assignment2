package exception;

@SuppressWarnings("serial")
public class ClientError extends Exception {

	public ClientError()
	{
		super();
	}
	
	void displayMessage()
	{
		System.out.println("Client Error");
	}
}
