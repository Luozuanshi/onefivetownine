package com.domo.BallGame;

import javax.swing.JFrame;

public class BallGame extends JFrame{
	void launchFrame() {
		setSize(300,300);
		setLocation(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		BallGame game =new BallGame();
		game.launchFrame();
		
	}
}
