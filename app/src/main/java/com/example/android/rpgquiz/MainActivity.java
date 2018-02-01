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

    // Class name for the activity you'll load based on results of radioButton
    private RadioGroup questionRadioGroup;
    private Button btnDisplay;
    private RadioButton submitAnswersRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Views initialization
        questionRadioGroup = (RadioGroup) findViewById(R.id.choose_something);
        btnDisplay = (Button) findViewById(R.id.submitButton);

        addListenerOnButton();

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

    public void addListenerOnButton() {

        btnDisplay.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                // get selected radioButton from radioGroup
                int selectedId = questionRadioGroup.getCheckedRadioButtonId();

                // find the radioButton by returned id
                submitAnswersRadioButton = (RadioButton) findViewById(selectedId);

                // Check what Radio button was chosen to change to the right activity
                // if none are selected, do nothing.
                if (questionRadioGroup.getCheckedRadioButtonId() == -1) {
                    return;
                } else if (submitAnswersRadioButton.getId() == R.id.first_choice_radioButton) {
                    goToNextActivity(1);
                } else if (submitAnswersRadioButton.getId() == R.id.second_choice_radioButton) {
                    goToNextActivity(2);
                }
//                Toast.makeText(MainActivity.this,
//                        submitAnswersRadioButton.getText(), Toast.LENGTH_SHORT).show();

            }

        });
    }

    /**
     * Loads a new activity
     *
     * @param activityReference 
                a {@code int} value representing activity to go to and load.
     */

    public void goToNextActivity(Class activityReference) {

        if(activityReference == 1)
            startActivity(new Intent(this, SecondActivity.class));
        else
            startActivity(new Intent(this, ThirdActivity.class));
    }
}
