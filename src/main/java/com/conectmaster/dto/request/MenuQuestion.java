package com.conectmaster.dto.request;

import com.conectmaster.dto.conversion.Question;

import java.util.List;

public class MenuQuestion {
    private String id;
    private List<Question> questions;

    public MenuQuestion(){

    }
    public MenuQuestion(String id, List<Question> questions) {
        this.id = id;
        this.questions = questions;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public String getId() {
        return id;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
