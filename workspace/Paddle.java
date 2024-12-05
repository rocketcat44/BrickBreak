import java.awt.*;

public class Paddle {

	//your code here!
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private int xVelocity;
	
	//constructor(s):
	public Paddle(int x, int y, int w, int h){
		this.xPos = x;
		this.yPos = y;
		this.width = w;
		this.height = h;
	}
	//methods: getters and setters
	int getX(){return this.xPos;}

	int getY(){return this.yPos;}

	int getWidth(){return this.width;}

	int getHeight(){return this.height;}

	int getVelocity(){return this.xVelocity;}

	void setX(int x){this.xPos= x;}
	void setVelocity(int x){this.xVelocity = x;}


	// functions
	void move(){
		setX(getX()+getVelocity());
	}

	void addVelocity(int x){
		setVelocity(x);
	}

	
	void draw(Graphics g){
		g.setColor(Color.white); // call first to set the desired color
        g.fillRect(getX() , getY(), getWidth(), getHeight()); // draws a rectangle (paddle)
	}
	

	
}
