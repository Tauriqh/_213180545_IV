package za.ac.cput;

/**
 * @(#)BalanceInquiry.java
 *
 *
 * @author
 * @version 1.00 2018/4/13
 */


public class BalanceInquiry extends Transaction {

    public BalanceInquiry() {
    }

    public BalanceInquiry(int accNo) {
        super(accNo);
    }

    public String execute() {
        return getAccountNumber() + ": executing BalanceInquiry";
    }

    public String transactionType() {
        return "Balance Inquiry";
    }
}