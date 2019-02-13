package za.ac.cput;
/**
 * @(#)Deposit.java
 *
 *
 * @author
 * @version 1.00 2018/4/13
 */


public class Deposit extends Transaction {

	private static double amount;

    public Deposit() {
    }

    public Deposit(int accNo, double amnt) {
    	super(accNo);
    	setAmount(amnt);
    }

    public void setAmount(double amnt){
    	amount = amnt;
    }

    public double getAmount() {
    	return amount;
    }

    public String execute() {
		return "You've deposited R" + getAmount() + " into Account: " + getAccountNumber();
    }

	public String transactionType() {
		return "Deposit";
	}
}