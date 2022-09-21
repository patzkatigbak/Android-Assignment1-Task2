package com.example.mapd_711assignment1;

/*
    Project:     MAPD-711 Assignment 1
    Description: New Android application to get user input by filling up the form from Main Activity
                 then print the output into 2nd Activity when submit button is clicked
    Author:      Patrick Katigbak
    Date:        20-Sept 2022
*/

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Declaration of components in this source so we can link these to Screen components.
    private Button buttonSubmit;
    private EditText editTextName,editTextAddress,editTextProfession,editTextDreamJob,editTextFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign the declared editTexts and Button to the screen components.
        buttonSubmit = findViewById(R.id.buttonSubmit);
        editTextName = findViewById(R.id.editTextName);
        editTextAddress = findViewById(R.id.editTextAddress);
        editTextProfession = findViewById(R.id.editTextProfession);
        editTextDreamJob = findViewById(R.id.editTextDreamJob);
        editTextFood = findViewById(R.id.editTextFood);

    }

    /*
    Method to be triggered by Button submit when clicked. The calling of this method is coded in the property
    of button in Activity_main.xml (see onClick())
    */
    public void submitForm(View view)
    {
        //Store the value of Screen editText components to local String variables
        String s_name = editTextName.getText().toString();
        String s_address = editTextAddress.getText().toString();
        String s_profession = editTextProfession.getText().toString();
        String s_dreamJob = editTextDreamJob.getText().toString();
        String s_favoriteFood = editTextFood.getText().toString();


        //To save the data in Intent - to be passed on the next Activity
        Intent intent = new Intent(this, ResultActivity.class);

        intent.putExtra("Name",s_name);
        intent.putExtra("Address",s_address);
        intent.putExtra("Profession",s_profession);
        intent.putExtra("DreamJob",s_dreamJob);
        intent.putExtra("FavoriteFood",s_favoriteFood);

        //Run next Activity
        startActivity(intent);

    }
}