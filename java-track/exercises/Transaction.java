package uwstout.cs144.projects.project2.account;
/**
 * Shows one transaction on an account
 * @author Joseph Sissac
 * @version 11/18/2016
 *
 */
public class Transaction {

	int id;
	String date;
	double amount;
	/**
	 * 
	 * @param nId
	 * @param nString
	 * @param nAmount
	 */
	public Transaction(int nId, String nString, double nAmount){
		
	}
	
	/**
	 * 
	 * @return
	 */
	public int getId(){
		return id;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getDate(){
		return date;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getAmount(){
		return amount;
	}
}
