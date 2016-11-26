package uwstout.cs144.projects.project2.account;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This class will be able to read in account information and write an account
 * report.
 * 
 * @author Joseph Sissac
 * @version 11/20/2016
 */
public class AccountReport {

	Account val;

	/**
	 * 
	 */
	public AccountReport() {
		val = null;
	}

	/**
	 * gets the account
	 * 
	 * @return the account variable
	 */
	public Account getAccount() {
		return val;
	}

	public void readAccount(Scanner scan) {
		int actId;
		boolean sOC;
		val = null;

		if (scan.hasNextInt()) { //hasNextLine
			actId = scan.nextInt();
			if (scan.hasNextBoolean()) {
				sOC = scan.nextBoolean();
					if(scan.hasNextLine()){
						
				Account tranz = new Account(actId, sOC);

				val = tranz;
				
					}
			}
		}

		
		scan.close();

	}

	public void readAccount(String accountFile) {

		File inputFile = new File(accountFile);

		try {

			Scanner read = new Scanner(inputFile);

			while (read.hasNextLine()) {

				

				if (val != null) {
					
					
				}

			}
			read.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}

	}

	public void printReport(PrintWriter print) {

	}

	public void printReport(String report) {

	}

}
