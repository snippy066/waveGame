package waveGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class BasicEnemy extends GameObject{

	public BasicEnemy(int x, int y, ID id) {
		super(x, y, id);
		spdX=5;
		spdY=5;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		x+=spdX;
		y+=spdY;
		
		
		if(y<=0 || y>=gameMain.h-32)  spdY*=-1;
		if(x<=0 || x>=gameMain.w-64)  spdX*=-1;
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.red);
		g.fillRect(x,y,16,16);
		
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}

}
