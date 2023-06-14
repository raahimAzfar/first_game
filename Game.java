package FirstGame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Game {
    // Defines the window, container, title panel, and title.
    JFrame titleWindow;
    Container con;
    JPanel titlePanel, startButtonPanel;
    JLabel titleLabel;
    JButton startButton;
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);

    public static void main(String[] args) {
        // Initializes the game
        new Game();
    }

    public Game() {

        /*  
        Creates a window, sets the size, allows you to close it, disables default layout,
        and makes it visible
        */
        titleWindow = new JFrame();
        titleWindow.setSize(800, 600);
        titleWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        titleWindow.getContentPane().setBackground(Color.black);
        titleWindow.setLayout(null);
        titleWindow.setVisible(true);

        // Makes container
        con = titleWindow.getContentPane();

        // Creates a new JPanel, sets it's bounds and it's color.
        titlePanel = new JPanel();
        titlePanel.setBounds(100, 100, 600, 150);
        titlePanel.setBackground(Color.black);

        // Creates a title.
        titleLabel = new JLabel("My first game");
        titleLabel.setForeground(Color.white);
        titleLabel.setFont(titleFont);

        // Creates a panel for the start button.
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);

        // Creates the start button.
        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);

        // Adds everything to the window
        titlePanel.add(titleLabel);
        startButtonPanel.add(startButton);
        con.add(titlePanel);
        con.add(startButtonPanel);
    }

}