package com.domo.BallGame;

import java.awt.*;
import javax.swing.JFrame;

public class BallGame extends JFrame{
	 Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	 Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	 double  x=100;    //小球的横坐标
	 double  y=100; //小球的纵坐标
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
