package com.conectmaster.dto.conversion;



import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Question {

    private String questionId;
    private String question;
    private String dataType;
    private String uiControlType;
    private List<String> values;
    private String answer;
    public Question(){

    }

    public Question(String questionId, String question, String dataType, String uiControlType, List<String> values, String answer) {
        this.questionId = questionId;
        this.question = question;
        this.dataType = dataType;
        this.uiControlType = uiControlType;
        this.values = values;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getDataType() {
        return dataType;
    }

    public String getUiControlType() {
        return uiControlType;
    }

    public List<String> getValues() {
        return values;
    }

    public String getAnswer() {
        return answer;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public void setUiControlType(String uiControlType) {
        this.uiControlType = uiControlType;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
