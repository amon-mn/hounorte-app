package com.example.hounorte.model;

public class Question {
    public String question;
    public String alt1;
    public String alt2;
    public String alt3;
    public String alt4;
    public String alt5;
    public String answer;
    public String fontId;
    public String questId;

    public Question(String question, String alt1, String alt2, String alt3, String alt4, String alt5, String answer, String fonteId, String questId) {
        this.question = question;
        this.alt1 = alt1;
        this.alt2 = alt2;
        this.alt3 = alt3;
        this.alt4 = alt4;
        this.alt5 = alt5;
        this.answer = answer;
        this.fontId = fonteId;
        this.questId = questId;
    }


    public Question(){}

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAlt1() {
        return alt1;
    }

    public void setAlt1(String alt1) {
        this.alt1 = alt1;
    }

    public String getAlt2() {
        return alt2;
    }

    public void setAlt2(String alt2) {
        this.alt2 = alt2;
    }

    public String getAlt3() {
        return alt3;
    }

    public void setAlt3(String alt3) {
        this.alt3 = alt3;
    }

    public String getAlt4() {
        return alt4;
    }

    public void setAlt4(String alt4) {
        this.alt4 = alt4;
    }

    public String getAlt5() {
        return alt5;
    }

    public void setAlt5(String alt5) {
        this.alt5 = alt5;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getFonteId() {
        return fontId;
    }

    public void setFonteId(String fonteId) {
        this.fontId = fonteId;
    }

    public String getQuestId() {
        return questId;
    }

    public void setQuestId(String questId) {
        this.questId = questId;
    }

}
