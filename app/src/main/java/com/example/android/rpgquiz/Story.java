package com.example.android.rpgquiz;

import java.util.ArrayList;
import java.util.List;

public class Story {

    /**
     * Unique id of the story
     */
    public int mId;

    /**
     * The ressource Id of the text
     */
    public int mTextId;

    /**
     * The list of choices of the story
     */
    public List<StoryChoice> mChoicesList;

    public Story(int id, int textId) {
        this.mId = id;
        this.mTextId = textId;
        mChoicesList = new ArrayList<>();
    }

    /**
     * Add a StoryChoice to the Story
     *
     * @param choice a new StoryChoice
     */
    public void addChoice(StoryChoice choice) {
        mChoicesList.add(choice);
    }
}
