import java.awt.*;
//
//  Class author:  Bella
//  Date created:  12/3
//  General description: related to the xposition and yposition etc of the Ball
//

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int xPos;
	private int yPos;
	private int size;
	private int xVelocity;
	private int yVelocity;
	
	//constructor(s):
//
//  Pre-condition: must be in the range of coordinates on the screen, size shouldn't be too big that it takes up the screen or too small that you cant see it also size shouldn't be negative
//  Post-condition: creates a ball object at the specified location with the specified size
//

	public Ball(int x, int y, int s){
		xPos = x;
		yPos = y;
		size = s;
	}
	
	//methods:


	//getters and setters
	int getYpos(){return this.yPos;}

	int getXpos(){return this.xPos;}

	int getSize(){return this.size;}

	int getXVel(){return this.xVelocity;}

	int getYVel(){return this.yVelocity;}

	void setXVelocity(int x){this.xVelocity = x;}

	void setYVelocity(int x){this.yVelocity = x;}

	void setX(int x){this.xPos = x;}
	void setY(int y){this.yPos = y;}



//
//  Pre-condition: g is not null
//  Post-condition: draws an oval shape in the specified colour at where the ball should be
//
	void draw(Graphics g){
		g.setColor(Color.blue); // call first to set the desired color
		g.fillOval(getXpos(), getYpos(), getSize(), getSize()); // draws an oval (ball)
	}

//
//  Pre-condition: n/a
//  Post-condition: makes the y velocity go in the opposite direction
//
	void reverseY(){
		setYVelocity(getYVel()*(-1));
	}
//
//  Pre-condition: n/a
//  Post-condition: makes the x velocity go in the opposite direction
//
	void reverseX(){
		setXVelocity(getXVel()*(-1));
	}
//
//  Pre-condition: n/a
//  Post-condition: makes the ball move in the direction specified by the x and y velocity variables
//
	void move(){
		setX(getXpos()+getXVel());
		setY(getYpos()+getYVel());
	}



}
