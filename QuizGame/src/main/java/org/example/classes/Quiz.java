package org.example.classes;

import org.example.data.QuestionProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Quiz {

    public List<Question> getNQuestions(int numberOfQuestions) {

        int count = 0;
        List<Question> listOfQuestions = new ArrayList<>();
        while (count < numberOfQuestions){

            listOfQuestions.add(getRandomQuestion());
            count ++;
        }
        return listOfQuestions;
    }

    public Question getRandomQuestion() {
        QuestionProvider questionProvider = new QuestionProvider();
        Question[] questionArray = questionProvider.generateQuestions();

        Random generator = new Random();
        int randomIndex = generator.nextInt(questionArray.length);
        Question randomQuestion = questionArray[randomIndex];

        return randomQuestion;
    }
}
