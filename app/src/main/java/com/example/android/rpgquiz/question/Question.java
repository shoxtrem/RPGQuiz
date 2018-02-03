package com.example.android.rpgquiz.question;



public class Question {

    //Instance private members
    private String question;
    private String[] possibleAnswer;
    private boolean[] possibleAnswerState;
    private boolean passed;

    /**
     * This is a {@link Question} object public constructor, this object is used to instantiate a new {@link Question} object
     *
     * @param question            A {@code String} representing this textual question.
     * @param possibleAnswer      An {@code String} array with all the possible answers for this question.
     * @param possibleAnswerState A {@code boolean} array with all the possible answers state, true = correct / false = incorrect answer.
     * @param passed              A {@code boolean} representing if this question was passed.
     */
    public Question(String question, String[] possibleAnswer, boolean[] possibleAnswerState, boolean passed) {
        this.question = question;
        this.possibleAnswer = possibleAnswer;
        this.possibleAnswerState = possibleAnswerState;
        this.passed = passed;
    }


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
