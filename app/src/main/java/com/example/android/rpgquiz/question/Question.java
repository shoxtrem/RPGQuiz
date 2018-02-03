package com.example.android.rpgquiz.question;



public class Question {

    //Instance variables
    private String question; //Textual question
    private String[] possibleAnswer; // Array of possible answers
    private boolean[] possibleAnswerState; //Array of possible answers state
    private boolean passed; //Question passed state




    /* API public mutator's (Setters) */

    /**
     * This method set up a new textual question
     **/
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * This method change the passed state
     **/
    public void setPassed(boolean passed) {
        this.passed = passed;
    }
}
