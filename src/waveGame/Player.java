package waveGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Player extends GameObject {
	
	Random r=new Random();
	Handler handler;

	public Player(int x, int y, ID id,Handler handler) {
		super(x, y, id);
	    this.handler=handler;
	   
	}
	
	

	@Override
	public void tick() {
		x+=spdX;
		y+=spdY;
		
		x=gameMain.clamp(x, 3, gameMain.w-48);
		y=gameMain.clamp(y, 3, gameMain.h-72);
		
		  collision();
		
	}

	private void collision() {
		for(int i=0;i<handler.obj.size();i++) {
			
			GameObject temp=handler.obj.get(i);
			
			if(temp.getId()== ID.BasicEnemy) {
				if(getBounds().intersects(temp.getBounds())) {
					HUD.health-=2;
				}
			}
		}
	}
	@Override
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y,32, 32);
		
	}



	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return new Rectangle(x,y,32,32);
	}
}
