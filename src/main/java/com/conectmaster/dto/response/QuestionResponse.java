package com.conectmaster.dto.response;

public class QuestionResponse {
    private String message;
    public QuestionResponse(){

    }
    public QuestionResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
