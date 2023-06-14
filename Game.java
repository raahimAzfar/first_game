package FirstGame;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Game {
    // Defines the window
    JFrame window;
    Container con;
    JPanel titlePanel;
    JLabel titleLabel;

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

        panel = new JPanel();
        panel.setBounds(100, 100, 600, 150);
        panel.setBackground(Color.blue);
        con.add(titlePanel);
    }

}