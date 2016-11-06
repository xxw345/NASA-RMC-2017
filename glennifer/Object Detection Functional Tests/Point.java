
public class Point {
	int id; //unique identifier for each point
	int idCounter =0; //Probably need to move to a unique class! Will increment by 1 every time a new point is created
	
	long time; //time created/last updated
	
	float x; //x cord
	float y; //y cord
	float z; //z cord
	
	float red; //red value
	float green; //green value
	float blue; //blue value
	
	/**
	 * @param x
	 * @param y
	 * @param z
	 * @param red
	 * @param green
	 * @param blue
	 */
	public Point(float x, float y, float z, float red, float green, float blue) {
		super();
		this.id = idCounter; //see comment above. Sets ID to the idCounter value 
		
		this.x = x; //set x cord
		this.y = y; //set y cord
		this.z = z; //set z cord
		
		this.red = red; //set red value
		this.green = green; //set green value
		this.blue = blue; //set blue value
		
		this.time = System.currentTimeMillis(); //the time is set when a point is declared. 
		idCounter++; //Increment idCounter by 1
	}
	
	
	//Returns ID
	public int getId() {
		return id;
	}
	
	//Time Getter and Setter
	public long getTime() {
		return time;
	}
	
	public void setTime() {
		this.time = System.currentTimeMillis();;
	}

	//Position Getters and Setters
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public float getZ() {
		return z;
	}
	
	public void setPosition(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	//RGB Getters and Setters
	public float getRed() {
		return red;
	}
	
	public void setRed(float red) {
		this.red = red;
	}
	
	public float getGreen() {
		return green;
	}
	
	public void setGreen(float green) {
		this.green = green;
	}
	
	public float getBlue() {
		return blue;
	}
	
	public void setBlue(float blue) {
		this.blue = blue;
	}

}
