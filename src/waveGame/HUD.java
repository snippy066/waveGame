package waveGame;

import java.awt.Color;
import java.awt.Graphics;

public class HUD {
	
	public static int health=100;
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(3, 3, 200, 32);
	}

}
