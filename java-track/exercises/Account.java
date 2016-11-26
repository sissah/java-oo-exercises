package uwstout.cs144.projects.project2.account;

/**
 * represents an account and all its transaction
 * 
 * @author Joseph Sissac
 * @version 11/18/2016
 *
 */
public class Account {

	int accountId;
	boolean savings; // if true it's a savings account, if not its checkings
	Transaction[] transList;
	int numOfTrans;

	/**
	 * 
	 * @param newAccountId
	 * @param nSavings
	 */
	public Account(int newAccountId, boolean nSavings) {
		accountId = newAccountId;
		savings = nSavings;

		transList = new Transaction[10];
		for (int i = 0; i < transList.length; i++) {

		}
	}

	/**
	 * 
	 * @return
	 */
	public int getAccountId() {
		return accountId;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isSavings() {
		if (savings) {

			return true;

		}
		return isChecking();
	}

	/**
	 * 
	 * @return
	 */
	public boolean isChecking() {
		if (!savings) {
			return true;
		}
		return isSavings();
	}

	/**
	 * 
	 * @param transId
	 * @param transDate
	 * @param amount
	 */
	public void addTransaction(int transId, String transDate, double amount) {
		Transaction newTrans = new Transaction(transId, transDate, amount);
		if (transDate != null && transId > 0) {

			for (int i = 0; i < transList.length; i++) {
				if (numOfTrans == transList.length) {

					transList = doubleSize(transList, transList.length * 2);
				}

				if (transList[i] != null) {
					transList[i] = newTrans;
					numOfTrans++;

				}
			}
		}
		return;
	}

	/**
	 * 
	 * @param oldVals
	 * @param newSize
	 * @return
	 */
	public Transaction[] doubleSize(Transaction[] oldVals, int newSize) {
		Transaction[] bigArray = new Transaction[newSize];

		for (int i = 0; i < oldVals.length; i++) {
			bigArray[i] = oldVals[i];
		}

		return bigArray;
	}

	/**
	 * 
	 * @param pos
	 * @return
	 */
	public Transaction getTransaction(int pos) {
		if (transList[pos] != null) {
			return transList[pos];
		}
		return null;
	}

	/**
	 * 
	 * @return
	 */
	public int getTransactionCount() {
		return numOfTrans;
	}

	/**
	 * 
	 * @return
	 */
	public double getBalance() {
		double transAmt = 0.0;
		for (int i = 0; i < transList.length; i++) {
			transAmt += transList[i].getAmount();
		}
		return transAmt;

	}

	/**
	 * 
	 * @return
	 */
	public double getFees() {

		if (getBalance() >= 0) {
			return 0;
		}
		return Math.max(15.00, getBalance() * .15);

	}

	/**
	 * 
	 * @param nTransId
	 * @return
	 */
	public Transaction findTransaction(int nTransId) {

		for (int i = 0; i < transList.length; i++) {
			if (nTransId == transList[i].getId()) {
				return transList[i];
			}
		}

		return null;
	}

}
