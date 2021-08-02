package waveGame;

import java.awt.Canvas;

public class gameMain extends Canvas implements Runnable {
	
	private static final long serialVersionUID = 7006633468047331596L;
	
	public static final int w=800;     //width
	public static final int d=w/12*9;	//height
	public static final String tit="Wave";	//title 
	
	public gameMain() {
		new Window(w,d,tit,this);
		System.out.println("game started");
	}

	public synchronized void start() {
		
	}
	public void run() {
		
	}

	public static void main(String[] args) {
		new gameMain();

	}

}
