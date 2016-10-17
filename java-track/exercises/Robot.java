
public class Robot {
	
	private String name, orientation;
	private int x,y,speed;
	
	public int setSpeed(){
		this.speed = this.speed+1;
		return this.speed;
	}
	public String TurnLeft(){
		if (this.orientation == "Up"){
			this.orientation = "Left";
		}
		else if (this.orientation == "Left"){
			this.orientation = "Down";
		}
		else if (this.orientation == "Down"){
			this.orientation = "Right";
		}
		else {
			this.orientation = "Up";
		}
		return this.orientation;
	}
	public String TurnRight(){
		if (this.orientation == "Up"){
			this.orientation = "Right";
		}
		else if (this.orientation == "Left"){
			this.orientation = "Up";
		}
		else if (this.orientation == "Down"){
			this.orientation = "Left";
		}
		else {
			this.orientation = "Down";
		}
		return this.orientation;
	}
	public int forward(){
		if (this.orientation == "Up"){
			this.x = this.x+this.speed;
			return this.x;
		}
		else if (this.orientation == "Left"){
			this.y = this.y-this.speed;
			return this.y;
		}
		else if (this.orientation == "Down"){
			this.x = this.x-this.speed;
			return this.x;
		}
		else {
			this.y = this.y+this.speed;
			return this.y;
		}
	}
	public int backward(){
		if (this.orientation == "Up"){
			this.x = this.x-this.speed;
			return this.x;
		}
		else if (this.orientation == "Left"){
			this.y = this.y+this.speed;
			return this.y;
		}
		else if (this.orientation == "Down"){
			this.x = this.x+this.speed;
			return this.x;
		}
		else {
			this.y = this.y-this.speed;
			return this.y;
		}
	}
	public String Distance(Robot R){
		int xPos = this.x;
		int countX = 0;
		int yPos = this.y;
		int countY = 0;
		if(xPos >= R.x){
			while (countX != (xPos - R.x)){
				countX = countX + 1;
			}
		}
		else {
			while (countX != (R.x - xPos)){
				countX = countX + 1;
			}
		}
		if(yPos >= R.y){
			while (countY != (yPos - R.y)){
				countY = countY + 1;
			}
		}
		else {
			while (countY != (R.y - yPos)){
				countY = countY + 1;
			}
		}
		return this.name+" is "+countY+" points in the y direction and "+countX+" points in the x direction from "+R.name+".";
	}
	public void info(){
		System.out.println(this.name+" is facing "+this.orientation+" at position ("+this.x+","+this.y+") at a speed of "+this.speed+".");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot COLD = new Robot("COLD", "Up", 0, 0, 0);
		COLD.info();
		COLD.setSpeed();
		COLD.setSpeed();
		COLD.backward();
		COLD.forward();
		COLD.TurnRight();
		COLD.info();
		System.out.println(COLD.name);
		
		Robot TheHotz = new Robot("TheHotz", "Down", 10, 10, 0);
		TheHotz.info();
		TheHotz.setSpeed();
		TheHotz.setSpeed();
		TheHotz.backward();
		TheHotz.TurnLeft();
		TheHotz.info();
		TheHotz.forward();
		TheHotz.TurnLeft();
		TheHotz.info();
		System.out.println(TheHotz.Distance(COLD));
		System.out.println(TheHotz.name);
		
	}
	
	public Robot(String name, String orientation, int x, int y, int speed){
		this.name = name;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.orientation = orientation;
	}
}