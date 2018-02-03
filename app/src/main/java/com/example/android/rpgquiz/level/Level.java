package com.example.android.rpgquiz.level;

import com.example.android.rpgquiz.question.Question;

import java.util.ArrayList;



public class Level {

    //Instance members
    private String name;// Level textual name
    private ArrayList<Question> questions;// Questions list belonging to this level
    private int score;// Level score
    private boolean locked;// Level locked state

    /**
     * This method set up this level name
     **/
    public void setLevelName(String name) {
        this.name = name;
    }

    /**
     * This method set up this level score
     **/
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * This method set up the locked state
     **/
    public void setLocked(boolean locked) {
        this.locked = locked;
    }


}
