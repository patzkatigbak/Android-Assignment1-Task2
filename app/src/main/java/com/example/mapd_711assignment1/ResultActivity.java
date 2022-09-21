package com.example.mapd_711assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    //Declare the Textview Components
    private TextView textOutputName,textOutputAddress,textOutputProfession,textOutputDreamJob,textOutputFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // To accept the Intent Data and field values from Previous Activity. Store the values to local variables
        Intent intent = getIntent();
        String s_name = intent.getStringExtra("Name");
        String s_address = intent.getStringExtra("Address");
        String s_profession = intent.getStringExtra("Profession");
        String s_dreamJob = intent.getStringExtra("DreamJob");
        String s_favoriteJob = intent.getStringExtra("FavoriteFood");

        //assign the declared textViews to the screen textViews
        textOutputName = findViewById(R.id.textOutputName);
        textOutputAddress = findViewById(R.id.textOutputAddress);
        textOutputProfession = findViewById(R.id.textOutputProfession);
        textOutputDreamJob = findViewById(R.id.textOutputDreamJob);
        textOutputFood = findViewById(R.id.textOutputFood);

        //populate the TextViews of the Screen from the local String variables above(in getIntent())
        textOutputName.setText(s_name);
        textOutputAddress.setText(s_address);
        textOutputProfession.setText(s_profession);
        textOutputDreamJob.setText(s_dreamJob);
        textOutputFood.setText(s_favoriteJob);

    }
}