package za.ac.cput;
/**
 * @(#)Transaction.java
 *
 *
 * @author
 * @version 1.00 2018/4/13
 */


abstract public class Transaction {

	private static int accountNumber;

    public Transaction() {
    }

    public Transaction(int accNo) {
    	setAccountNumber(accNo);
    }

    public void setAccountNumber(int accNo) {
    	accountNumber = accNo;
    }

    public int getAccountNumber() {
    	return accountNumber;
    }

    public abstract String execute();

    public abstract String transactionType();
}