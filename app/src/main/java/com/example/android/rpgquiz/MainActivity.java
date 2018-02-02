package com.example.android.rpgquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    // Remember to add your activity to the AndroidManifest.xml
    /**
     * ID for the current layout used in the onCreate() method
     * to load the right XML layout
     */
    int currentActivityLayoutId = R.layout.activity_main;

    /**
     * Template: int someIdVariableName = R.id.some_id_name;
     * <p>
     * Hint:
     * to change a variable name on all instances
     * use *right click* --> Refactor --> Rename
     * or keyboard shortcut Shift + F6
     */

    // ID for the different radioButton choices.
    int firstChoiceRadioButtonId = R.id.first_choice_radioButton;
    int secondChoiceRadioButtonId = R.id.second_choice_radioButton;
    /**
     * Template: Class SomeClassVariableName =  SomeActivityName.class;
     * <p>
     * Hint:
     * to change a variable name on all instances
     * use *right click* --> Refactor --> Rename
     * or keyboard shortcut Shift + F6
     */

    Class firstChoiceRadioButtonClass = SecondActivity.class;
    Class secondChoiceRadioButtonClass = ThirdActivity.class;

    // Class name for the activity you'll load based on results of radioButton
    private RadioGroup questionRadioGroup;
    private RadioButton submitAnswersRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(currentActivityLayoutId);

        //addListenerOnButton();
        Button help_button = (Button) findViewById(R.id.help_button);
        help_button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent helpIntent = new Intent(MainActivity.this, HelpActivity.class);
                startActivity(helpIntent);
            }
        });


    }

    /**
     * Template to add new options :
     * Add else if statements to add more choices :
     * <p>
     * <p>
     * else if (submitAnswersRadioButton.getId() == someIdVariableName){
     * goToNextActivity(SomeClassVariableName);
     * }
     */

//    public void addListenerOnButton() {
//
//        questionRadioGroup = (RadioGroup) findViewById(R.id.choose_something);
//        Button btnDisplay = (Button) findViewById(R.id.submitButton);
//
//       btnDisplay.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//                // get selected radioButton from radioGroup
//                int selectedId = questionRadioGroup.getCheckedRadioButtonId();
//
//                // find the radioButton by returned id
//                submitAnswersRadioButton = (RadioButton) findViewById(selectedId);
//
//                // Check what Radio button was chosen to change to the right activity
//                // if none are selected, do nothing.
//                if (questionRadioGroup.getCheckedRadioButtonId() == -1) {
//                    return;
//                } else if (submitAnswersRadioButton.getId() == firstChoiceRadioButtonId) {
//                    goToNextActivity(firstChoiceRadioButtonClass);
//                } else if (submitAnswersRadioButton.getId() == secondChoiceRadioButtonId) {
//                    goToNextActivity(secondChoiceRadioButtonClass);
//                }
////                Toast.makeText(MainActivity.this,
////                        submitAnswersRadioButton.getText(), Toast.LENGTH_SHORT).show();
//
//            }
//
//        });
//    }




    /**
     * Loads a new activity and kills the current one
     *
     * @param NextActivity activity to go to and load
     */

    public void goToNextActivity(Class NextActivity) {

        Intent nextAct = new Intent(this, NextActivity);
        if (nextAct.resolveActivity(getPackageManager()) != null) {
            startActivity(nextAct);
            // Don't kill this activity as it is the main one
        }

    }

}
