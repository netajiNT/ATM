package netaji.it.com;

public class AtmTransaction {
	private double balance;
	
	public void setBalance(double balance) {
		if(balance<=0) {
			System.out.println("insuficient balnance");
		}
		else
		{
			this.balance=balance;
		}
		System.out.println("AVAILABLE BALANCE");
	}
	double getBalance() {
		return balance;
	}
	public void setDiposit(double amount) {
		this.balance=balance+amount;
			
	}
	double getDiposit() {
		return balance;
		
	}
	public void setWithdraw(double amount) {
		this.balance=balance-amount;
	}
	double getWithdraw() {
		return balance;
	}
}
class User{
	public static void main(String[] args) {
		AtmTransaction at=new AtmTransaction();
		at.setBalance(100);
		System.out.println(at.getBalance());
		at.setDiposit(200);
		System.out.println("BALANCE DIPOSITED:\n"+"TOTAL BALANCE"+at.getDiposit());
		at.setWithdraw(200);
		System.out.println("BALANCE WITHDRAW:200\n"+"TOTAL BALANCE"+at.getWithdraw());
		
	}
}
