

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class will store the prices of an item over time, provide access to the
 * current price to the maximum and average prices and to any of the previous
 * prices, store the name and list of the item.
 * 
 * @author Joseph
 * @version 10/26/2016
 *
 */
public class PriceHistory {

	private String name;
	private ArrayList<Double> priceList;

	/**
	 * name and type of list
	 * 
	 * @param listName
	 *            item name
	 * @return 
	 */
	public PriceHistory(String listName) {
		priceList = new ArrayList<Double>();
		name = listName;
		return;

	}

	/**
	 * item name
	 * 
	 * @return the item name
	 */
	public String getName() {
		return name;
	}

	/**
	 * returns the current price in the list
	 * 
	 * @return current price
	 */
	public double getCurrentPrice() {
		double nPrice = 0;
		if (priceList.size() != 0.0) {
			nPrice = priceList.get(priceList.size() - 1);
		} else {
			nPrice = 0;
		}
		return nPrice;
	}

	/**
	 * Gets the price at the specified position
	 * 
	 * @param pos
	 *            position in the list
	 * @return returns the specified price
	 */
	public double getPrice(int pos) {
		if (pos >= 0 && pos < priceList.size()) { // compare to 0 (start
													// position) and size (end
													// position)
			return priceList.get(pos);
		}
		return 0;

	}

	/**
	 * returns the number of items in a list.
	 * 
	 * @return all prices in list
	 */
	public int getNumberOfPrices() {
		return priceList.size();
	}

	/**
	 * adds a single price to the list
	 * 
	 * @param newPrice
	 *            the new price
	 */
	public void addPrice(double newPrice) {
		if (newPrice >= 0) {
			priceList.add(newPrice);
		}
	}

	/**
	 * adds multiple prices to the list
	 * 
	 * @param input
	 *            multiple prices
	 */
	public void addPrices(Scanner input) {
		//I learned a lot here. Anytime nextDouble is used,
		//it skips over the double before it.
		//so you have to create a variable and only call a double
		//once per loop.
		while (input.hasNextDouble()) {
			double nextprice = input.nextDouble();
			if (nextprice >= 0) {
				priceList.add(nextprice);
			}
		}
	}

	/**
	 * gets the highest price
	 * 
	 * @return the highest price
	 */
	public double getMaximumPrice() {
		double max = 0.0;
		// <= went over the boundary of array, quick fix
		for (int i = 0; i < priceList.size(); i++) {
			if (max == 0.0 || priceList.get(i).compareTo(max) > 0) {
				max = priceList.get(i);
			}

		}
		return max;
	}

	/**
	 * finds the average price of the list
	 * 
	 * @return the average
	 */
	public double getAveragePrice() {
		// basically just do what you did with Max
		double sum = 0;
		//Scanner input = null; (idk what you needed this for

		for (int i = 0; i < priceList.size(); i++) {
			sum += priceList.get(i);
		}

		if (priceList.isEmpty()) {
			return 0;
		} else {
			return sum / priceList.size();
		}

	}
	public static void main (String[] args){
		//int limit = 0;
		PriceHistory ist = new PriceHistory("Spaghet");
		Scanner data = new Scanner("3.50 3.75 3.65 3.25");
		/*
		do {
			
			// try to open the file
			try (Scanner in = new Scanner (System.in)){
				
				System.out.println("Enter some doubles");
				double relPath = in.nextDouble();
				
				
			} catch (RuntimeException e) {
				System.out.println("Could not open image: ");
			}
			
		} while(limit <= 8);
		*/
		ist.addPrices(data);
		System.out.println(ist.getAveragePrice());
		System.out.println(ist.getPrice(0));
	}
}
