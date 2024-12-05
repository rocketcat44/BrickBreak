import java.awt.*;
//
//  Class author:  Bella
//  Date created:  12/3
//  General description: related to the xposition and yposition etc of the Paddle/player
//
public class Paddle {

	//your code here!
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private int xVelocity;
	
	//constructor(s):
	//
//  Pre-condition: must be in the range of coordinates on the screen, width and height shouldn't be too big that it takes up the screen or too small that you cant see it, also it shouldn't be negative
//  Post-condition: creates a paddle object at the specified location with the specified size
//
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
	//
//  Pre-condition: n/a
//  Post-condition: makes the ball move in the direction specified by the x and y velocity variables
//
	void move(){
		setX(getX()+getVelocity());
	}

	//
//  Pre-condition: number shouldn't be too big or it may be too fast to see
//  Post-condition: increases/decreases the speed of the paddle
//
	void addVelocity(int x){
		setVelocity(getVelocity()+x);
	}

	//
//  Pre-condition: g is not null
//  Post-condition: draws an rectangle shape in the specified colour at where the paddle should be
//
	void draw(Graphics g){
		g.setColor(Color.white); // call first to set the desired color
        g.fillRect(getX() , getY(), getWidth(), getHeight()); // draws a rectangle (paddle)
	}
	

	
}
