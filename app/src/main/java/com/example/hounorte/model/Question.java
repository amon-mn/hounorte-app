package com.example.hounorte.model;

public class Question {
    public String question, op1, op2, op3, op4, op5, answ;

    public Question(String question, String op1, String op2, String op3, String op4, String op5, String answ) {
        this.question = question;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
        this.op5 = op5;
        this.answ = answ;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public String getOp3() {
        return op3;
    }

    public void setOp3(String op3) {
        this.op3 = op3;
    }

    public String getOp4() {
        return op4;
    }

    public void setOp4(String op4) {
        this.op4 = op4;
    }

    public String getOp5() {
        return op5;
    }

    public void setOp5(String op5) {
        this.op5 = op5;
    }

    public String getAnsw() {
        return answ;
    }

    public void setAnsw(String answ) {
        this.answ = answ;
    }
}
