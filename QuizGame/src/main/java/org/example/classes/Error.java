package org.example.classes;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Error  {

    private void openErrorWindow(JFrame frame) {
        JFrame newFrame = new JFrame("Error");

        // Set a random Position
        int xRange = 1000;
        int yRange = 1000;

        int randomX = frame.getX()  + (int) (Math.random() * xRange);
        int randomY = frame.getY()  + (int) (Math.random() * yRange);

        newFrame.setLocation(randomX, randomY);
        newFrame.setSize(500, 400);

        JLabel errorMessage = new JLabel("Error", SwingConstants.CENTER);
        Font baseFont = UIManager.getFont("Label.font");
        float fontSizeBig = 30f;
        Font bigFont = baseFont.deriveFont(baseFont.getSize2D() + fontSizeBig);
        errorMessage.setFont(bigFont);
        newFrame.getContentPane().add(errorMessage);

        //add random color
        Color backgroundColor = generateRandomPastelColor();
        newFrame.getContentPane().setBackground(backgroundColor);

        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newFrame.setVisible(true);
    }

    private Color generateRandomPastelColor() {

        Random random = new Random();
        int red = 128 + random.nextInt(128);
        int green = 128 + random.nextInt(128);
        int blue = 128 + random.nextInt(128);

        return new Color(red, green, blue);
    }

    public void openMultipleWindowsWithDelay(int windowCount, int delayMillis, JFrame frame) {
        java.util.Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int count = 0;

            @Override
            public void run() {
                openErrorWindow(frame);
                count++;

                if (count >= windowCount) {
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, delayMillis, delayMillis);
    }
}
