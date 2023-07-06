package org.example.classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;


public class QuestionManager {

//    private JFrame frame;
//    private JPanel panel;
//
//    public QuestionManager(JFrame frame, JPanel panel) {
//        this.frame = frame;
//        this.panel = panel;
//    }

    public void printSingleQuestion(Question question, Player player, JLabel questionLabel, JButton answerOne, JButton answerTwo, JButton answerThree, JButton answerFour, JLabel feedbackLabel) {


        try {
            Thread.sleep(2000);
            questionLabel.setText(question.question);
            Thread.sleep(2000);

            answerOne.setText(question.answers[0]);
            answerTwo.setText(question.answers[1]);
            answerThree.setText(question.answers[2]);
            answerFour.setText(question.answers[3]);

            int correctIndex = question.getCorrectAnswerIndex();


            answerOne.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {

                    if (correctIndex == 0) {
                        feedbackLabel.setText("Correct!");
                        player.setScore(player.getScore() + 1);
                    } else {
                        feedbackLabel.setText("Incorrect!");
                    }
                }
            });
            answerTwo.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    if (correctIndex == 1) {
                        feedbackLabel.setText("Correct!");
                        player.setScore(player.getScore() + 1);
                    } else {
                        feedbackLabel.setText("Incorrect!");
                    }
                }
            });
            answerThree.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    if (correctIndex == 2) {
                        feedbackLabel.setText("Correct!");
                        player.setScore(player.getScore() + 1);
                    } else {
                        feedbackLabel.setText("Incorrect!");
                    }
                }
            });
            answerFour.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    if (correctIndex == 3) {
                        feedbackLabel.setText("Correct!");
                        player.setScore(player.getScore() + 1);
                    } else {
                        feedbackLabel.setText("Incorrect!");
                    }
                }
            });


        } catch (InterruptedException e) {
            // Handle InterruptedException
            e.printStackTrace();
        } catch (InputMismatchException e) {
            // Handle InputMismatchException
            e.printStackTrace();
        }
    }


}
