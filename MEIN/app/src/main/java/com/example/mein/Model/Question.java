package com.example.mein.Model;

import java.util.LinkedList;

public class Question {
    public String Question;
    public String choice1;
    public String choice2;
    public String choice3;
    public String choice4;

    public LinkedList<Integer> correctAnswers;

    public Question(String question, String c1, String c2, String c3, String c4, LinkedList<Integer> correctAnswers) {
        Question = question;
        choice1 = c1;
        choice2 = c2;
        choice3 = c3;
        choice4 = c4;
        this.correctAnswers = correctAnswers;
    }
    //checks if the correct answers were selected
    public boolean isCorrectAnswer(int[] ans) {
        boolean correct = true;
        for (int i : ans) {
            if (!correctAnswers.contains(i))
                return false;
        }
    //all answers were right
        return correct;
    }
}