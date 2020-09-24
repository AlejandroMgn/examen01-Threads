
public class ATM_A {
	public String name="";
	public String address="";
	public int branchType=0;
	
	public void doDeposit() {
		System.out.println("Depositando....");
	}
	
	public void doRetirement() {
		System.out.println("Retirando.....");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getBranchType() {
		return branchType;
	}

	public void setBranchType(int branchType) {
		this.branchType = branchType;
	}
}
