package org.example.classes;

public class Question {

    public String question;
    public String [] answers;
    private int correctAnswerIndex;

    public Question (String question, String[] answers, int correctAnswerIndex){
        this.question = question;
        this.answers = answers;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public Boolean isCorrectAnswer (int questionIndex){
        return this.correctAnswerIndex == questionIndex;

    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
}
