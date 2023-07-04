package org.example.classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintQuestion {
    Scanner scanner = new Scanner(System.in);

    public void printSingleQuestion(Question question, Player player) {

        System.out.println("Ready to answer the next question? ");

        try {
            Thread.sleep(2000);
            System.out.println(question.question);
            Thread.sleep(2000);

            for (int i = 0; i < question.answers.length; i++) {
                System.out.println("-" + question.answers[i] + " [" + i + "] ");
            }

            int answer = scanner.nextInt();

            if (answer == question.getCorrectAnswerIndex()) {
                System.out.println("Correct!");
                player.setScore(player.getScore() + 1);
            } else {
                System.out.println("Incorrect!");
            }
        } catch (InterruptedException e) {
            // Handle InterruptedException
            e.printStackTrace();
        } catch (InputMismatchException e) {
            // Handle InputMismatchException
            e.printStackTrace();
        }
    }


}
