package com.example.android.rpgquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int levelSaved = 1;
    int stageSaved = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //hides the level selection
    //shows the language options
    public void languageSelector(View view) {
        //top right button
        Button options = this.findViewById(R.id.options);

        //buttons below logo and logo
        Button logo = this.findViewById(R.id.logo);
        Button previous = this.findViewById(R.id.previous);
        Button level = this.findViewById(R.id.level);
        Button next = this.findViewById(R.id.next);

        options.setVisibility(View.GONE);

        logo.setVisibility(View.GONE);
        previous.setVisibility(View.GONE);
        level.setVisibility(View.GONE);
        next.setVisibility(View.GONE);

        //language display
        LinearLayout languageSelectionOne = this.findViewById(R.id.centerLanguage);
        LinearLayout languageSelectionTwo = this.findViewById(R.id.languageLineOne);
        LinearLayout languageSelectionThree = this.findViewById(R.id.languageLineTwo);
        Button languageReturn = this.findViewById(R.id.languageReturn);

        languageSelectionOne.setVisibility(View.VISIBLE);
        languageSelectionTwo.setVisibility(View.VISIBLE);
        languageSelectionThree.setVisibility(View.VISIBLE);
        languageReturn.setVisibility(View.VISIBLE);

    }

    public void community(View view) {
        Intent community = new Intent(this, Community.class);
        startActivity(community);
    }

    //code to take care of the numbers of the level displayed when pressed <
    //1-1 is the minimum available
    public void previousLevel(View view) {

        stageSaved -= 1;

        if (stageSaved < 1) {
            if (levelSaved != 1) {
                levelSaved -= 1;
                stageSaved = 9;
            } else {
                levelSaved = 1;
                if (stageSaved < 1) {
                    stageSaved = 1;
                }
            }
        }

        displayLevel();
    }

    //code to take care of the numbers of the level displayed when pressed >
    //max level for now is 9-9 (being optimistic)
    public void nextLevel(View view) {

        stageSaved += 1;

        if (stageSaved > 9) {
            if (levelSaved != 9) {
                stageSaved = 1;
                levelSaved += 1;
            } else {
                levelSaved = 9;
                if (stageSaved > 9) {
                    stageSaved = 9;
                }
            }
        }

        displayLevel();
    }

    public void displayLevel() {

        String currentLevel = "Level " + levelSaved + " - " + stageSaved;
        TextView thisLevel = this.findViewById(R.id.level);
        thisLevel.setText(currentLevel);


    }

    public void goLevel(View view){
        //code to go to desirable level
    }

}