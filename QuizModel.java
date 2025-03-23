package model;

import java.util.ArrayList;
import java.util.List;

public class QuizModel {

    private List<String> questions;
    private List<String[]> options;
    private List<String> correctAnswers;

    public QuizModel() {
    
        questions = new ArrayList<>();
        options = new ArrayList<>();
        correctAnswers = new ArrayList<>();
        questions.add("Which animal is known as the \"King of the Jungle\"?");
        options.add(new String[]{"1.Tiger","2.Elephant","3.Lion","4.Bear"});
        correctAnswers.add("3");

        questions.add("What is the smallest prime number?");
        options.add(new String[]{"1.0","2.1", "3.2 ","4.3"});
        correctAnswers.add("2");

        questions.add("What is the hardest natural substance on Earth??");
        options.add(new String[]{"1. Gold","2.Diamond","3.Iron","4.Steel"});
        correctAnswers.add("2");
    }
    public int getTotalQuestions() {
        return questions.size();
    }
    public String getQuestion(int index) {
        return questions.get(index);
    }
    public String[] getOptions(int index) {
        return options.get(index);
    }
    public String getCorrectAnswer(int index) {
        return correctAnswers.get(index);
    }
}