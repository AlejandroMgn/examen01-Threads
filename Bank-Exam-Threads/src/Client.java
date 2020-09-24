
public class Client implements iPerson {
	public String name="";
	public String address="";
	public int clientType = 0; //utilizaremos 0 1 2 para clasificar los tipos de clientes

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void requestDeposit() {
		System.out.println("Depositando...");
	}
	
	public void requestRetirement() {
		System.out.println("Retirando....");
	}

}
