package waveGame;

import java.awt.Canvas;

public class gameMain extends Canvas implements Runnable {
	
	private static final long serialVersionUID = 7006633468047331596L;
	
	public static final int w=800;     //width
	public static final int d=w/12*9;	//height
	public static final String tit="Wave";	//title 
	
	private Thread thread;
	private boolean running=false;
	
	public gameMain() {
		new Window(w,d,tit,this);
		System.out.println("game started");
	}

	public synchronized void start() {
		thread=new Thread();
		thread.start();
		running=true;
		
	}
	
	public synchronized void stop() {
		try {
			
			thread.join();
			running=false;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	 public void run() {
	        long lastTime = System.nanoTime();
	        double nsPerTick = 1000000000D / 64;
	        
	        int ticks = 0;
	        int frames = 0;
	        
	        long lastTimer = System.currentTimeMillis();
	        double delta = 0;
	        
	        while (running) {
	            long now = System.nanoTime();
	            delta += (now - lastTime) / nsPerTick;
	            lastTime = now;
	            boolean shouldRender = true;
	            
	            while (delta >= 1) {
	                ticks++;
	                tick();
	                delta -= 1;
	                shouldRender = true;
	            }
	            
	            try {
	                Thread.sleep(2);
	            } catch (InterruptedException ex) {
	                ex.printStackTrace();
	            }
	            
	            if (shouldRender) {
	                frames++;
	                render();
	            }
	            
	            if (System.currentTimeMillis() - lastTimer >= 1000) {
	                lastTimer += 1000;
	                System.out.println(ticks + " ticks, " + frames + " frames");
	                frames = 0;
	                ticks = 0;
	            }
	        }
	 }
	public static void main(String[] args) {
		new gameMain();

	}

}
