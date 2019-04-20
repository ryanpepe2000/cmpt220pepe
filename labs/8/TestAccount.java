
public class TestAccount {

	public static void main(String[] args) {
		CheckingAccount chkAcct = new CheckingAccount(1, 2000);
		SavingsAccount savAcct = new SavingsAccount(2, 6000);
		
		chkAcct.withdraw(4000);
		System.out.println(chkAcct.toString());
		
		savAcct.withdraw(5999);
		System.out.println(savAcct.toString());
		
	}

}
