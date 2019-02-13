package za.ac.cput;
/**
 * @(#)RunBank.java
 *
 *
 * @author
 * @version 1.00 2018/4/13
 */

public class RunBank {

	private static final int limit = 5;

    public RunBank() {
    }

    public static void main(String[] args) {
        Transaction[] transaction = new Transaction[limit];

        int transactionInstance = 0;
        transaction[transactionInstance++] = new Deposit(16241, 500.00);
        transaction[transactionInstance++] = new Withdrawal(16241, 250.00);
        transaction[transactionInstance++] = new BalanceInquiry(16241);

        for (int i = 0; i < transactionInstance; i++) {
        	System.out.println("Transaction type: " + transaction[i].transactionType());
        	System.out.println("Transaction that was made: " + transaction[i].execute());
        	System.out.println();
        }
    }
}
