package com.example.mapd_711assignment1;

/*
    Project:     MAPD-711 Assignment  - Task 2
    Description: When Button is clicked, the ResultActivity will be opened and display the values from String.xml
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

    }

    /*
    Method to be triggered by Button submit when clicked. The calling of this method is coded in the property
    of button in Activity_main.xml (see onClick())
    */
    public void submitForm(View view)
    {

        //To save the data in Intent - to be passed on the next Activity
        Intent intent = new Intent(this, ResultActivity.class);
        String staticName = getString(R.string.staticName);
        String staticAddress = getString(R.string.staticAddress);
        String staticProfession = getString(R.string.staticProfession);
        String staticDreamJob = getString(R.string.staticDreamJob);
        String staticFood = getString(R.string.staticFood);


        intent.putExtra("Name",staticName);
        intent.putExtra("Address",staticAddress);
        intent.putExtra("Profession",staticProfession);
        intent.putExtra("DreamJob",staticDreamJob);
        intent.putExtra("Food",staticFood);


        //Run next Activity
        startActivity(intent);

    }
}