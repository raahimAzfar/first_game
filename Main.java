package main;

import javax.swing.JFrame;

public class Main { 

	public static void main(String[] args) {

		// New JFrame
		JFrame window = new JFrame();

		// Basic JFrame requirements
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Mohawk 360");

		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);

		// Packs everything into the window.
		window.pack();

		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		gamePanel.startGameThread();
	}

}
