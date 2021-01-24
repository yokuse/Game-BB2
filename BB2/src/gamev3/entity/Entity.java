package gamev3.entity;

import java.awt.Graphics;

import gamev3.Handler;

//this is the main class where we can define players obstacles etc.
public abstract class Entity {
	//every entity need tick render x and y values.
	//we choose float for coords so that it is smooth when the players move
	protected Handler handler;
	protected float x, y;
	protected int width, height;
	
	
	public Entity (Handler handler, float x, float y, int width, int height) {
		this.handler = handler;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}


	
	
}
