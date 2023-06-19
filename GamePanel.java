package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import entity.Player;

public class GamePanel extends JPanel implements Runnable {

    final int originalTileSize = 16; 
    final int scale = 3; 

    public final int tileSize = originalTileSize * scale; 
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenHeight = tileSize * maxScreenCol; 
    final int screenWidth = tileSize * maxScreenRow; 

    int FPS = 115;

    KeyHandler keyH = new KeyHandler();
    Thread gameThread;
    Player player = new Player(this, keyH);

    int x = 100;
    int y = 100;
    int speed = 4;


    public GamePanel() {
        
        this.setPreferredSize(new Dimension(screenHeight, screenWidth));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);

        this.addKeyListener(keyH);
        this.setFocusable(true);
    }

    public void startGameThread() { 

        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        
        long lastTime = System.nanoTime();
            double drawInterval = 1000000000 / FPS;
            double delta = 0;
		    long currentTime;

        while(gameThread != null) {
            
            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;
            
            lastTime = currentTime;

            if(delta >= 1) {
            update();
            repaint();
            delta--;
            }
        }

    }

    public void update() {
       
        player.update();
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;

        player.draw(g2);

        g2.dispose();
    }

}
