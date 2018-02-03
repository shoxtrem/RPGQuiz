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


    /**
     * Template: Class SomeClassVariableName =  SomeActivityName.class;
     * <p>
     * Hint:
     * to change a variable name on all instances
     * use *right click* --> Refactor --> Rename
     * or keyboard shortcut Shift + F6
     */

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


}
