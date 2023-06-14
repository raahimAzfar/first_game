package FirstGame;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class Game {
    // Defines the window
    JFrame window;
    Container con;
    public static void main(String[] args) {
        // Initializes the game
        new Game();
    }

    public Game() {

        // Creates a window
        window = new JFrame();
        // Sets the size of the window
        window.setSize(800, 600);
        // Allows you to close the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Sets the background color of the window
        window.getContentPane().setBackground(Color.black);
        // Disable default layout
        window.setLayout(null);
        // Makes the window visible
        window.setVisible(true);
        // 
        con = window.getContentPane();
    }

}