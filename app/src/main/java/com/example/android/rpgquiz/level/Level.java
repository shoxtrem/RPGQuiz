package com.example.android.rpgquiz.level;

import com.example.android.rpgquiz.question.Question;

import java.util.ArrayList;

/**
 * The {@link Level} class represents a level in game with a infinite number of questions, this level has capabilities
 * to know when all it's questions was passed, also can return it's name, score, etc...
 *
 * @author Fábio Gouveia
 * @version 1.0
 * @see ArrayList
 * @see Question
 */

public class Level {

    //Instance members
    private String name;// Level textual name
    private ArrayList<Question> questions;// Questions list belonging to this level
    private int score;// Level score
    private boolean locked;// Level locked state

    public Level(String name, ArrayList<Question> questions, int score, boolean locked) {
        this.name = name;
        this.questions = questions;
        this.score = score;
        this.locked = locked;
    }

    /**
     * This method set up this level name
     **/
    public void setLevelName(String name) {
        this.name = name;
    }

    /**
     * Return a {@code String} representing this level textual name.
     *
     * @return a <tt>String</tt> representing this level textual name.
     */
    public String getName() {
        return name;
    }

    /**
     * Return a {@link ArrayList} of {@link Question} objects, this questions belonging to this level.
     *
     * @return a <tt>ArrayList</tt> of <tt>Question</tt> objects.
     */
    public ArrayList<Question> getQuestions() {
        return questions;
    }

    /**
     * Return a {@code int} representing this level actual score.
     *
     * @return a <tt>int</tt> representing this level score.
     */
    public int getScore() {
        return score;
    }

    /**
     * This method set up this level score
     **/
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * Return a {@code boolean} representing if the level is locked, true = locked / false = unlocked.
     *
     * @return a <tt>boolean</tt> representing if the level is locked.
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * This method set up the locked state
     **/
    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    /**
     * Return if the level was passed, {@code true} = passed / {@code false} = not passed
     *
     * @return a <tt>boolean</tt> representing the level passed state.
     */
    public boolean passed() {
        //Initialize variable to true and let the iterator do the rest
        boolean passed = true;
        //Iterate over questions array
        for (Question question : questions) {
            //We find a not passed question...Break immediately and return false
            if (!question.passed()) {
                passed = false;
                break;
            }
        }
        return passed;
    }
}
