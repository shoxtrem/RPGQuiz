package com.example.android.rpgquiz;

public class StoryChoice {

    /**
     * The id of the choice's text
     */
    public int mQuestionId;

    /**
     * The id of the story pointed by the choice
     */
    public int mNextStory;

    /**
     * @param questionId the id of the choice's text
     * @param nextStory  activity pointed by the choice
     */
    public StoryChoice(int questionId, int nextStory) {
        this.mQuestionId = questionId;
        this.mNextStory = nextStory;
    }
}
