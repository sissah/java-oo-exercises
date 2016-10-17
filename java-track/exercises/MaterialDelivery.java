/**
 * This class will represent an order of a specific amount (in pounds) of a
 * material at a specific cost per pound.
 * 
 * @author Student
 * @version 10/13/2016
 */
public class MaterialDelivery {
	
	private int pounds; // number of pounds for the material in, 
	                    //the max can only be
	private double cost; // cost per pound
	private String name;
/**
 * the cost per truck
 */
	public static final double TRUCK = 475.50; // cost per truck
/**
 * creates delivery
 * @param nName n of material
 * @param nPounds number of pounds
 * @param nCost cost per pound
 */
	public MaterialDelivery(String nName, int nPounds, double nCost) { // filler
		name = nName;
		pounds = Math.max(nPounds, 0);
		cost = Math.max(nCost, 2.75);

	}
/**
 * creates delivery
 * @param nName of material
 * @param nPounds number of pounds
 */
	public MaterialDelivery(String nName, int nPounds) { // filler
		pounds = Math.max(nPounds, 0);
		cost = 2.75;
		name = nName;
	}
/**
 * creates delivery copy
 * @param md copy construct
 */
	public MaterialDelivery(MaterialDelivery md) { // filler
		pounds = Math.max(md.pounds, 0);
		cost = Math.max(md.cost, 2.75);
	}
/**
 * material name
 * @return material name
 */
	public String getMaterial() { //filler
		return name;
	}
/**
 * creates pounds
 * @return number of pounds
 */
	public int getWeight() { // filler
		return Math.max(pounds, 0);
	}
/**
 * the cost
 * @return cost per pound
 */
	public double getCostPerPound() { //filler
		cost = Math.max(2.75, cost);
		return cost; 
	}
/**
 * new weight
 * @param nPounds new pounds
 */
	public void setWeight(int nPounds) { //filler
		pounds = Math.max(nPounds, 0);
	}
/**
 * the cost 
 * @param cPP new cost per pounds
 */
	public void setCostPerPound(double cPP) { //filler
		cost = Math.max(cPP, 2.75);
	}
/**
 * raw total
 * @return total cost without tax
 */
	public double getMaterialCost() { //filler
		double total = (Math.max(cost, 2.75) * Math.max(pounds, 0));
		return total;
	}
/**
 * # of trucks
 * @return gets the number of trucks
 */
	public int getNumberOfTrucks() { //filler
		int nTrucks = (int) (Math.ceil((double) Math.max(pounds, 0) / 14000));
		return nTrucks;
	}
/**
 * subtotal
 * @param tax applies the tax
 * @return final cost of delivery
 */
	public double getTotalCost(double tax) { //filler
		int trucks = getNumberOfTrucks();
		double raw = getMaterialCost(); 
		double taxedMaterialCost = raw + (raw * tax);
		double totalCost = (((double) trucks * TRUCK) + taxedMaterialCost);
        return totalCost;
	}
}

