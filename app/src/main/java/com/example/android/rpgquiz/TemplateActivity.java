package com.example.android.rpgquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseArray;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class TemplateActivity extends AppCompatActivity {

    public static final String STORY_ID = "STORY_ID";

    // The story provider
    private StoryProvider storyProvider = StoryProvider.getInstance();

    // List of the current story choices
    private SparseArray<StoryChoice> choices = new SparseArray<>();

    // The RadioGroup of the choices
    private RadioGroup radioGroup;
    /**
     * The submit Button listener
     */
    View.OnClickListener submitClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Get the selected StoryChoice
            int selectedId = radioGroup.getCheckedRadioButtonId();
            if (selectedId != -1) {
                StoryChoice choice = choices.get(selectedId);

                Intent intent = new Intent(getApplicationContext(), TemplateActivity.class);
                intent.putExtra(STORY_ID, choice.mNextStory);
                startActivity(intent);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template);

        // Affect the listener to the button
        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(submitClickListener);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        int storyId = intent.getIntExtra(STORY_ID, -1);
        if (storyId == -1) {
            storyId = 1;
        }

        // Get the current story
        Story currentStory = storyProvider.getStory(storyId);

        // Set the text of the current story
        TextView storyText = findViewById(R.id.storyText);
        storyText.setText(currentStory.mTextId);

        // Construct the different choices of the current story
        radioGroup = findViewById(R.id.choose_something);
        for (StoryChoice choice : currentStory.mChoicesList) {
            RadioButton radio = new RadioButton(getApplicationContext());
            radio.setText(choice.mQuestionId);
            radioGroup.addView(radio);
            choices.put(radio.getId(), choice);
        }
    }
}
