package gamev3.entity.creature;

import java.awt.Color;
import java.awt.Graphics;

import gamev3.Handler;
import gamev3.gfx.Assets;

public class boot_rock extends Rocks{
	
	
	public boot_rock(Handler handler, float x, float y) {
		super(handler, x, y);
		damage = 0;
		rock_point = 5;
		rock_speed = getRockSpeed();
		rock_size = 50;
		effect = 2;
		
		bounds.x = 10;
		bounds.y = 12;
		bounds.width = rock_size - bounds.x * 2;
		bounds.height = rock_size - bounds.y * 2;
	}


	public int getEffect() {
		return 2;
	}

	
	public float getRockSpeed() {
		return (float)(Math.random() * (5 - 3 + 1) + 3);
	}
	

	@Override
	public void tick() {
		//random speed per rock
		move();
	}

	@Override
	public void render(Graphics g) {
		//render out graphics for each rock with random sizes
		g.drawImage(Assets.bootRocks, (int)x,(int)y,rock_size,rock_size,null);
		/*
		g.setColor(Color.RED);
		g.fillRect((int)(x + bounds.x),(int)(y+bounds.y),
				bounds.width,bounds.height);*/
	}
}
