package org.example.data;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;




public class FileWriterExample {

    public static void readFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String question = reader.readLine();
            String[] answers = new String[4];
            for (int i = 0; i < 4; i++) {
                answers[i] = reader.readLine();
            }
            String correctAnswer = reader.readLine();

            // Process the question, answers, and correct answer as needed
            // For example, you could create a Question object and store the data

            // Example: Print the question, answers, and correct answer
            System.out.println("Question: " + question);
            System.out.println("Answers:");
            for (String answer : answers) {
                System.out.println(answer);
            }
            System.out.println("Correct Answer: " + correctAnswer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
