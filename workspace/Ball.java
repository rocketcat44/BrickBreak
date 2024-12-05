import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int xPos;
	private int yPos;
	private int size;
	private int xVelocity;
	private int yVelocity;
	
	//constructor(s):

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




	void draw(Graphics g){
		g.setColor(Color.blue); // call first to set the desired color
		g.fillOval(getXpos(), getYpos(), getSize(), getSize()); // draws an oval (ball)
	}

	void reverseY(){
		setYVelocity(getYVel()*(-1));
	}

	void reverseX(){
		setXVelocity(getXVel()*(-1));
	}

	void move(){
		setX(getXpos()+getXVel());
		setY(getYpos()+getYVel());
	}


}
