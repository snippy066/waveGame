package waveGame;

import java.awt.Canvas;

public class gameMain extends Canvas implements Runnable {
	
	private static final long serialVersionUID = 7006633468047331596L;
	
	public static final int w=800;
	public static final int d=w/12*9;
	public static final String tit="Wave";

	public synchronized void start() {
		new Window(w,d,tit,this);
	}
	public void run() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
