package org.example;

import org.example.classes.Player;
import org.example.classes.PrintQuestion;
import org.example.classes.Question;
import org.example.classes.Quiz;
import org.example.data.FileWriterExample;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        Quiz quiz = new Quiz();
        Question question = quiz.getRandomQuestion();
        PrintQuestion printQuestion = new PrintQuestion();
        Player player = new Player("Viki", 0);
        printQuestion.printSingleQuestion(question, player);


    }
}