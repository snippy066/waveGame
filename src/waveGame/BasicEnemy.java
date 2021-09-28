package waveGame;

import java.awt.Color;
import java.awt.Graphics;

public class BasicEnemy extends GameObject{

	public BasicEnemy(int x, int y, ID id) {
		super(x, y, id);
		//spdX=5;
		spdY=5;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		x+=spdX;
		y+=spdY;
		
		
		if(y<=0 || y>=gameMain.h-48)  spdY*=-1;
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.red);
		g.fillRect(x,y,16,16);
		
	}

}
