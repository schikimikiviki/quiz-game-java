package org.example.Forms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm implements ActionListener {

    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();

    public MainForm() {
        JButton exitGameButton = new JButton("Exit the game");
        JButton startGameButton = new JButton("Start the game");
        exitGameButton.addActionListener(this);
        startGameButton.addActionListener(this);
        JLabel label = new JLabel("Welcome to the quiz");

        // Make font bigger
        Font currentFont = label.getFont();
        Font currentFontButton = exitGameButton.getFont();
        Font currentFontButton2 = startGameButton.getFont();
        Font biggerFont = currentFont.deriveFont(currentFont.getSize() + 30f);
        Font biggerButtonFont = currentFontButton.deriveFont(currentFontButton.getSize() + 20f);
        Font biggerButtonFont2 = currentFontButton2.deriveFont(currentFontButton2.getSize() + 20f);
        startGameButton.setFont(biggerButtonFont2);
        exitGameButton.setFont(biggerButtonFont);
        label.setFont(biggerFont);

        panel.setLayout(new GridLayout(5, 2));

        // Create nested panel with FlowLayout for margin/padding around the label
        JPanel labelPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        labelPanel.add(label);

        // Create nested panel with FlowLayout for margin/padding around the buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(startGameButton);
        buttonPanel.add(exitGameButton);

        panel.add(labelPanel);
        panel.add(new JPanel()); // Empty cell for whitespace
        panel.add(buttonPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        // Handle button actions here
    }
}
