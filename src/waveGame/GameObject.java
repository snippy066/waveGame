package waveGame;

import java.awt.Graphics;

public abstract class GameObject {

	protected int x,y;
	protected ID id;
	protected int spdX,spdY;
	
	public GameObject(int x,int y,ID id) {
		this.x=x;
		this.y=y;
		this.id=id;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	public void setX(int x) {
		this.x=x;
	}
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	public int getY() {
		return y;
	}
	
	public void setId(ID id) {
		this.id=id;
	}
	public ID getId() {
		return id;
	}
	
	
	public void setSpeedX(int speedx) {
		this.spdX=speedx;
	}
	public int getSpeedx() {
		return spdX;
	}
	
	public void setSpeedY(int speedy) {
		this.spdY=speedy;
	}
	public int getSpeedy() {
		return spdY;
	}
	
}
