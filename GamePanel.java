package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
    
    // SCREEN SETTINGS
    final int originalTileSize = 16; // 16 x 16 tile
    final int scale = 3; 

    final int tileSize = originalTileSize * scale; // 48 x 48 tile
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenHeight = tileSize * maxScreenCol; // 768px
    final int screenWidth = tileSize * maxScreenRow; // 576px

    Thread gameThread;

    public GamePanel() {
        
        this.setPreferredSize(new Dimension(screenHeight, screenWidth));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }

    public void startGameThread() { 

        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        
        while(gameThread != null) {

            // 1 UPDATE: update information such as characters, graphics, ect.
            update();

            // 2 DRAW: draw the screen with the updated information.
            repaint();
        }

    }

    public void update() {

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;

        g2.setColor(Color.yellow);

        g2.fillRect(100, 100, tileSize, tileSize);

        g2.dispose();
    }

}
