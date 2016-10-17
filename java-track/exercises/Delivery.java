//package uwstout.cs144.projects.project1.material;

import java.util.Scanner;

/**
 * This will read in information about the material to be delivered and will
 * output the costs associated with it.
 * 
 * @author Student
 * @version 10/12/2016
 * 
 */
public class Delivery {

	/**
	 * This will read in information about the material to be delivered and will
	 * output the costs associated with it.
	 * 
	 * @param args reads the body
	 */
	public static void main(String[] args) { 
		//the try part allows this to close automatically when everything is encapsulated within.
		try(Scanner scan = new Scanner(System.in)){

			System.out.println("enter the material name: ");
			String name = scan.nextLine();
			//System.out.println(name);
	
			System.out.println("enter the weight in pounds: ");
			int pounds = scan.nextInt();
			//System.out.println(pounds);
	
			System.out.println("enter the cost per pound: ");
			double cost = scan.nextDouble();
			//System.out.println(cost);
	
			System.out.println("enter the tax: ");
			double tax = scan.nextDouble();
	
			System.out.println(name+" "+pounds+" "+cost+" "+tax);
	
			MaterialDelivery md = new MaterialDelivery(name, pounds, cost);
			System.out.println("Material: " + name);
			System.out.println("Pounds: " + pounds);
			System.out.println("Cost per pound: $" + cost);
	
			int numberOfTrucks = md.getNumberOfTrucks();
			System.out.println("Number of trucks: " + numberOfTrucks);
	
			double materialCost = md.getMaterialCost();
			System.out.println("Material cost: $" + materialCost);
	
			double totalCost = md.getTotalCost(tax);
			System.out.println("Total cost: $" + totalCost);
		}
	}

}
