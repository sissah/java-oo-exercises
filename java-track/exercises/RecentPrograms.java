package uwstout.cs144.labs.lab08;

/**
 *  records the last 5 programs run on the 
 *  computer and orders them by the most recently used
 * @author Joseph Sissac
 *@version 11/15/2016
 */
public class RecentPrograms {

	private Program[] programs;
	private int count = 0;
	private static final int INT_SIZE = 5;
	
	
	
	public RecentPrograms() {
		programs = new Program[INT_SIZE];
	}
	public int getCount() {
		return count;
	}
	
	public Program getProgram(int pos){
		if(programs[pos].getName() != null ) {
		return programs[pos]; 
		}
		return null;
	}
	
	private void shift(int endPosition){
		if(endPosition > 0){
		for (int i = endPosition; i >= endPosition - 1; i--){
			programs[i + 1] = programs[i];
		}
	}
	}
	
	public int findId(int id){
		for(int i = 0; i < programs.length; i++){
			if(programs[i].getId() == id){
				return programs[i].getId();
			}
		}
		return -1;
	}
	
	public void insert(Program newProg){
		if(newProg != null){
			for(int i = 0; i < programs.length; i++){
			if(newProg.getId() == programs[i].getId()){
				shift(newProg.getId());
			}
			if(programs[i].getName() != null){
				count++;
				if(count != programs.length){
					count++;
					for ( i = count - 1; i >= count; i++){
						programs[i - 1] = programs[i];
					}
				}
				if(count == programs.length){
					programs[4] = programs[i];
				}
			}
		}
	}
		programs[0] = newProg;
		return;
	}
	
	public String toString(){
	String str = "";
	
	for(int i = 0; i < programs.length; i++)
		if(programs[i] != null){
			str += programs[i];
			
			if(i != programs.length-1){
				str += ", ";
			}
		}
	
	
	return str;
	}
	
}
