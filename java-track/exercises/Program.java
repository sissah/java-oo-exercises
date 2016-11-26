package uwstout.cs144.labs.lab08;

/**
 *  stores information about a Program on the computer. 
 * @author Joseph Sissac
 *@version 11/15/2016
 */
public class Program {

	private String name;
	private int id;
	
	
	public Program(String newName, int newId){
		name = newName;
		id = newId;
	}
	
	public String getName(){
		return name;
	}
	
	public int getId(){
		return id;
	}
	
}
