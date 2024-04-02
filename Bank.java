import java.util.*;
class InSufficientFundsException extends Exception{
	String msg;
	InSufficientFundsException(String msg)
	{
		super(msg);
	}
}


public class Bank {
	private int amount=1000;
	int tamount;
	int wamt;
	Scanner sc=new Scanner(System.in);
	void deposit() {
		int damt;
		System.out.println("enter the amount you want to deposit");
		damt=sc.nextInt();
		tamount=amount+damt;
		System.out.println("total amount after deposit is"+ tamount);
	}
	void withdraw() {
		int wamt;
		System.out.println("enter the amount you want to withdraw");
		wamt=sc.nextInt();
		tamount=tamount-wamt;
	}
	void balancecheck() throws InSufficientFundsException {
		if(tamount<wamt) {
			throw new InSufficientFundsException("insufficient balance");
		}
		else {
			System.out.println("total amount after withdraw is" +tamount);
		}
		
	}

	public static void main(String[] args) {
		Bank ob=new Bank();
		ob.deposit();
		ob.withdraw();
		try {
			ob.balancecheck();
		}
		catch(Exception e) {
			System.out.println(e.getMessage()+e);
		}
		// TODO Auto-generated method stub

	}

}
