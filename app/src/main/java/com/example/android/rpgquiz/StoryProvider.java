package com.example.android.rpgquiz;

import android.util.SparseArray;

public class StoryProvider {

    /**
     * Holds reference to the single instance
     */
    private static StoryProvider INSTANCE;

    private SparseArray<Story> mStories = new SparseArray<>();

    /**
     * private constructor to forbid the creation
     */
    private StoryProvider() {
    }

    /**
     * Creates the instance if it does not yet exist(lazy instantiation).
     *
     * @return a reference to the single instance.
     */
    public static StoryProvider getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new StoryProvider();
            INSTANCE.initStories();
        }
        return INSTANCE;
    }

    /**
     * Add a story
     *
     * @param story to add
     */
    private void addStory(Story story) {
        mStories.put(story.mId, story);
    }

    /**
     * get a Story from his id
     *
     * @param id of the Story wanted
     * @return the story with the corresponding id
     */
    public Story getStory(int id) {
        return mStories.get(id);
    }

    /**
     * Initialize the stories.
     */
    private void initStories() {
        // Add first story
        Story story = new Story(1, R.string.questionNumberOne);
        story.addChoice(new StoryChoice(R.string.radioButtonChoice1MainActivity, 2));
        story.addChoice(new StoryChoice(R.string.radioButtonChoice2MainActivity, 3));
        addStory(story);

        // Add story 2
        story = new Story(2, R.string.questionActivity2);
        story.addChoice(new StoryChoice(R.string.radioButtonChoice1SecondActivity, 1));
        story.addChoice(new StoryChoice(R.string.radioButtonChoice2SecondActivity, 3));
        addStory(story);

        // Add story 3
        story = new Story(3, R.string.questionActivity3);
        story.addChoice(new StoryChoice(R.string.radioButtonChoice1ThirdActivity, 1));
        story.addChoice(new StoryChoice(R.string.radioButtonChoice2ThirdActivity, 4));
        addStory(story);

        // Add story 4
        story = new Story(4, R.string.questionActivity4);
        story.addChoice(new StoryChoice(R.string.radioButtonChoice1FourthActivity, 2));
        story.addChoice(new StoryChoice(R.string.radioButtonChoice2FourthActivity, 3));
        story.addChoice(new StoryChoice(R.string.radioButtonChoice3FourthActivity, 1));
        story.addChoice(new StoryChoice(R.string.radioButtonChoice4FourthActivity, 4));
        addStory(story);
    }
}
