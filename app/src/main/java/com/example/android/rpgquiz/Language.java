package com.example.android.rpgquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Language extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
    }

    public void arabic(View view){

    }

    public void czech(View view){

    }

    public void english(View view){

    }

    public void french(View view){

    }

    public void german(View view){

    }

    public void hebrew(View view){

    }

    public void italian(View view){

    }

    public void lithuanian(View view){

    }

    public void portuguese(View view){

    }

    public void spanish(View view){

    }

    public void turkish(View view){

    }

    public void goBack(View view){
        Intent goBack = new Intent(this, MainActivity.class);
        startActivity(goBack);
    }
}
