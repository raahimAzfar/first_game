package FirstGame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Game {
    // Defines the window, container, title panel, and title.
    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel;
    JLabel titleNameLabel;
    JButton startButton;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 28);

    public static void main(String[] args) {
        // Initializes the game
        new Game();
    }

    public Game() {

        /*  
        Creates a window, sets the size, allows you to close it, disables default layout,
        and makes it visible
        */
        window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);

        // Makes container
        con = window.getContentPane();

        // Creates a new JPanel, sets it's bounds and it's color.
        titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 600, 150);
		titleNamePanel.setBackground(Color.black);

        // Creates a title
		titleNameLabel = new JLabel("ADVENTURE");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);	

        // Creates a panel for the start button.
        startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(Color.black);

        // Creates the start button.
        startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		startButton.setFocusPainted(false);

        // Adds everything to the window
        titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
		
		con.add(titleNamePanel);
		con.add(startButtonPanel);
		
		window.setVisible(true);
    }

}