package waveGame;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class BasicTrail extends GameObject {
	
	private float alpha=1;
	private Handler handler; 
	private Color color;

	public BasicTrail(int x, int y,Color color, ID id) {
		super(x, y, id);
		
		this.color=color;
		
		
	}

	@Override
	public void tick() {
		
		
	}

	@Override
	public void render(Graphics g) {
		Graphics2D g2d=(Graphics2D) g;
		g2d.setComposite(makeTrasparent(alpha));
	
		
	}
	
	private AlphaComposite makeTrasparent(float alpha) {
		int type=AlphaComposite.SRC_OVER;
		
		return(AlphaComposite.getInstance(type,alpha));
	}

	@Override
	public Rectangle getBounds() {
		
		return null;
	}

}
