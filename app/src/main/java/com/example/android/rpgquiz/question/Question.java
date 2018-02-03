package com.example.android.rpgquiz.question;



public class Question {

    //Instance private members
    private String question; //Textual question
    private String[] possibleAnswer; // Array of possible answers
    private boolean[] possibleAnswerState; //Array of possible answers state
    private boolean passed; //Question passed state


    /**
     * Returns a {@code String} representing this textual question.
     *
     * @return a <tt>String</tt> representing this textual question.
     */
    public String getQuestion() {
        return question;
    }

    /**
     * This method set up a new textual question
     **/
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * Returns a {@code boolean} representing the question passed state, true = passed / false = not passed.
     *
     * @return a <tt>boolean</tt> representing the question passed state.
     */
    public boolean passed() {
        return passed;
    }

    /**
     * This method change the passed state
     **/
    public void setPassed(boolean passed) {
        this.passed = passed;
    }
}
