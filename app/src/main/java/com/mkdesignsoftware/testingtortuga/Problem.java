package com.mkdesignsoftware.testingtortuga;

/**
 * Created by mkdesign on 5/14/15.
 */
class Problem {
    // set variables for class problem //
    private String question;
    private String ansA;
    private String ansB;
    private String ansC;
    private String ansD;
    private String ansE;
    private String correct;

    //constructor expects all inputs
    public Problem (String tQuestion, String tAnsA, String tAnsB,
                    String tAnsC, String tAnsD, String tAnsE,
                    String tCorrect){
        //copy parameters to instance variables
        question = tQuestion;
        ansA = tAnsA;
        ansB = tAnsB;
        ansC = tAnsC;
        ansD = tAnsD;
        ansE = tAnsE;
        correct = tCorrect;
    } // end problem constructor

    // Getters for all values in array //
    String getQuestion(){ return question; }
    String getAnsA(){ return ansA; }
    String getAnsB(){ return ansB; }
    String getAnsC(){ return ansC; }
    String getAnsD() { return ansD; }
    String getAnsE() { return ansE; }
    String getCorrect(){ return correct; }
}

