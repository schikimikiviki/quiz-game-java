package org.example.Forms;

import org.example.classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm implements ActionListener {

    private Player player;
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    Quiz quiz = new Quiz();

    JButton exitGameButton = new JButton("Exit the game");
    JButton startGameButton = new JButton("Start the game");
    JLabel label = new JLabel("Welcome to the quizzz");

    JLabel questionLabel = new JLabel("");
    JButton answerOne = new JButton("");
    JButton answerTwo = new JButton("");
    JButton answerThree = new JButton("");
    JButton answerFour = new JButton("");
    JLabel feedbackLabel = new JLabel("", SwingConstants.CENTER);
    JLabel score = new JLabel("", SwingConstants.CENTER);

    public MainForm() {

        player = new Player("player", 0);

        exitGameButton.addActionListener(this);
        startGameButton.addActionListener(this);

        // Make font bigger
        Font baseFont = UIManager.getFont("Label.font");
        float fontSizeBig = 30f;
        float fontSizeMedium = 20f;

        Font mediumFont = baseFont.deriveFont(baseFont.getSize2D() + fontSizeMedium);
        Font bigFont = baseFont.deriveFont(baseFont.getSize2D() + fontSizeBig);

        startGameButton.setFont(mediumFont);
        exitGameButton.setFont(mediumFont);
        label.setFont(bigFont);
        score.setFont(mediumFont);
        questionLabel.setFont(mediumFont);
        answerOne.setFont(mediumFont);
        answerTwo.setFont(mediumFont);
        answerThree.setFont(mediumFont);
        answerFour.setFont(mediumFont);
        feedbackLabel.setFont(mediumFont);


        panel.setLayout(new GridLayout(10, 2));

        // Create nested panel with FlowLayout for margin/padding around the label
        JPanel labelPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        labelPanel.add(label);

        // Create nested panel with FlowLayout for margin/padding around the buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(startGameButton);
        buttonPanel.add(exitGameButton);

        //set answers to invisible
        answerOne.setVisible(false);
        answerTwo.setVisible(false);
        answerThree.setVisible(false);
        answerFour.setVisible(false);
        feedbackLabel.setVisible(false);

        panel.add(labelPanel);
        panel.add(score);
        panel.add(questionLabel);
        panel.add(answerOne);
        panel.add(answerTwo);
        panel.add(answerThree);
        panel.add(answerFour);
        panel.add(buttonPanel);
        panel.add(feedbackLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    private void startGame(Player player) {
        label.setText("Game started!");

        Question question = quiz.getRandomQuestion();
        score.setText("Score: " + Integer.toString(player.getScore()));

        startGameButton.setVisible(false);
        exitGameButton.setVisible(false);
        feedbackLabel.setVisible(true);
        answerOne.setVisible(true);
        answerTwo.setVisible(true);
        answerThree.setVisible(true);
        answerFour.setVisible(true);

        QuestionManager questionManager = new QuestionManager();


        ActionListener answerListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton answerButton = (JButton) actionEvent.getSource();


                int selectedAnswerIndex;
                if (answerButton == answerOne) {
                    selectedAnswerIndex = 0;
                } else if (answerButton == answerTwo) {
                    selectedAnswerIndex = 1;
                } else if (answerButton == answerThree) {
                    selectedAnswerIndex = 2;
                } else {
                    selectedAnswerIndex = 3;
                }

                int correctIndex = question.getCorrectAnswerIndex();
                if (selectedAnswerIndex == correctIndex) {
                    feedbackLabel.setText("Correct!");
                    player.setScore(player.getScore() + 1);
                } else {
                    feedbackLabel.setText("Incorrect!");
                    player.setScore(player.getScore() - 1);
                }
                score.setText("Score: " + player.getScore());

                //disable other buttons

                answerOne.setEnabled(false);
                answerTwo.setEnabled(false);
                answerThree.setEnabled(false);
                answerFour.setEnabled(false);

                startGameButton.setText("Next question");
                startGameButton.setVisible(true);
                exitGameButton.setVisible(true);
                startGameButton.addActionListener(this);
            }
        };

        int newScore = questionManager.printSingleQuestion(question, player, questionLabel, answerOne, answerTwo, answerThree, answerFour, feedbackLabel, answerListener);

        player.setScore(newScore);
        score.setText("Score: " + Integer.toString(player.getScore()));
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();
        if (source == exitGameButton) {
            // do some fun shit
        } else if (source == startGameButton) {
            startGame(player);


            //TODO: implement next question
        }
    }


}
