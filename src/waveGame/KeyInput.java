package waveGame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
	
	private Handler handler;
	
	public KeyInput(Handler handler) {
		this.handler=handler;
	}
	
	public void keyPressed(KeyEvent e) {
		int key=e.getKeyCode();
		
		for(int i=0;i<handler.obj.size();i++) {
			GameObject temp=handler.obj.get(i);
			
			if(temp.getId()==ID.Player) {
				//key events for player
				if(key==KeyEvent.VK_W)
					temp.setSpeedY(-5);
				if(key==KeyEvent.VK_A) 
					temp.setSpeedX(-5);
				if(key==KeyEvent.VK_S) 
					temp.setSpeedY(5);
				if(key==KeyEvent.VK_D) 
					temp.setSpeedX(5);
				
			}
			
			//for player 2
			
		}
		
	}
	public void keyReleased(KeyEvent e) {
		int key=e.getKeyCode();
		
		for(int i=0;i<handler.obj.size();i++) {
			GameObject temp=handler.obj.get(i);
			
			if(temp.getId()==ID.Player) {
				//key events for player
				if(key==KeyEvent.VK_W)
					temp.setSpeedY(0);
				if(key==KeyEvent.VK_A) 
					temp.setSpeedX(0);
				if(key==KeyEvent.VK_S) 
					temp.setSpeedY(0);
				if(key==KeyEvent.VK_D) 
					temp.setSpeedX(0);
				
			}
			
			//for player 2
			
		
		}
	}
}
