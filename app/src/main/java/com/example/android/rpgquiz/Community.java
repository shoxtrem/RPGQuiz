package com.example.android.rpgquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Community extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);

        contribution();
    }

    //displays name of all the people working on the project that contributed to it
    public void contribution() {

        TextView mainIdea = this.findViewById(R.id.mainIdea);
        TextView listOfUsers = this.findViewById(R.id.usersName);

        String creator = getString(R.string.mainTextList) + "\n";
        creator += "\t" + getString(R.string.idea);

        String users = getString(R.string.contribution) + "\n" + "\t";
        users += getString(R.string.user1) + "\n" + "\t";
        users += getString(R.string.user2) + "\n" + "\t";
        users += getString(R.string.user3) + "\n" + "\t";
        users += getString(R.string.user4) + "\n" + "\t";
        users += getString(R.string.user5) + "\n" + "\t";
        users += getString(R.string.user6) + "\n" + "\t";
        users += getString(R.string.user7) + "\n" + "\t";
        users += getString(R.string.user8) + "\n" + "\t";
        users += getString(R.string.user9) + "\n" + "\t";
        users += getString(R.string.user10) + "\n" + "\t";
        users += getString(R.string.user11) + "\n" + "\t";
        users += getString(R.string.user12) + "\n" + "\t";
        users += getString(R.string.user13) + "\n" + "\t";
        users += getString(R.string.user14) + "\n" + "\t";
        users += getString(R.string.user15) + "\n" + "\t";
        users += getString(R.string.user16) + "\n" + "\t";
        users += getString(R.string.user17) + "\n" + "\t";
        users += getString(R.string.user18) + "\n" + "\t";
        users += getString(R.string.user19) + "\n" + "\t";
        users += getString(R.string.user20) + "\n" + "\t";

        mainIdea.setText(creator);
        listOfUsers.setText(users);

    }

    //goes back to the main menu
    public void goBack(View view) {
        Intent goBack = new Intent(this, MainActivity.class);
        startActivity(goBack);
    }

}
