package code;

public class HDFC extends Bank{

	@Override
	public void withdraw() {

		System.out.println("HDFC money withdrawn");
	}
	
	public static void main(String[] args) {
		HDFC hdfc=new HDFC();
		hdfc.deposit();
		hdfc.withdraw();
	}

}
