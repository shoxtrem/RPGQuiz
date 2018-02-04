package com.example.android.rpgquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void languageSelector(View view){
        //add code here to change languages
    }

    public void community(View view){
        Intent community = new Intent(this, Community.class);
        startActivity(community);
    }

    public void previousLevel(View view){
        //add code to swap images
        //images of numbers start with n<number>
        //e.g. image to number 1 is n1
        //image for the - separator is n_separator
        //we can make levels like 1-1, 9-3, 10-5, etc
    }

    public void nextLevel(View view){
        //add code to swap images
        //images of numbers start with n<number>
        //e.g. image to number 1 is n1
        //image for the - separator is n_separator
        //we can make levels like 1-1, 9-3, 10-5, etc
    }

}