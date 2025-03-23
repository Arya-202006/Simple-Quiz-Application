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
        questions.add("Which ocean is the largest?");
        options.add(new String[]{"1.Atlantic Ocean","2.Indian Ocean","3.Arctic Ocean","4.Pacific Ocean"});
        correctAnswers.add("4");

        questions.add("What is the tallest mountain in the world?");
        options.add(new String[]{"1.Mount Kilimanjaro","2.Mount Everest", "3.Mount Fuji ","4.Mount K2"});
        correctAnswers.add("2");

        questions.add("Which country is famous for the Eiffel Tower?");
        options.add(new String[]{"1. Italy","2.Spain","3.France","4.Germany"});
        correctAnswers.add("3");
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
