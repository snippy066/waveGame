package waveGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Player extends GameObject {
	
	Random r=new Random();

	public Player(int x, int y, ID id) {
		super(x, y, id);
	
		
	}
	

	@Override
	public void tick() {
		x+=spdX;
		y+=spdY;
		
		x=gameMain.clamp(x, 3, gameMain.w-48);
		y=gameMain.clamp(y, 3, gameMain.h-72);
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y,32, 32);
		
	}


	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
