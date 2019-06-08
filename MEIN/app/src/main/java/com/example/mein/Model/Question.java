package com.example.mein.Model;

public class Question{
    public String Question;
    public String choice1;
    public String choice2;
    public String choice3;
    public String choice4;

    public int[] correctAnswers;

    public Question(String question, String c1, String c2, String c3, String c4, int[] correctAnswers){
        Question=question;
        choice1=c1;
        choice2=c2;
        choice3=c3;
        choice4=c4;
        this.correctAnswers=correctAnswers;
    }
}