package com.example.android.rpgquiz.level;

import com.example.android.rpgquiz.question.Question;

import java.util.ArrayList;

/**
 * Created by Fábio Gouveia on 03-02-2018.
 */

public class Level {

    //Instance members
    private String levelName;// Level textual name
    private ArrayList<Question> questions;// Questions list belonging to this level
    private int score;// Level score
    private boolean locked;// Level locked state


}
