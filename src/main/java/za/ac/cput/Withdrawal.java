package za.ac.cput;
/**
 * @(#)Withdraw.java
 *
 *
 * @author
 * @version 1.00 2018/4/13
 */


public class Withdrawal extends Transaction {

	private static double amount;

    public Withdrawal() {
    }

    public Withdrawal(int accNo, double amnt) {
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
		return "You've withdrawn R" + getAmount() + " into Account: " + getAccountNumber();
    }

	public String transactionType() {
		return "Withdrawal";
	}
}