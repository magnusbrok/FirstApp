package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button enKnap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        enKnap = findViewById(R.id.button1);

        enKnap.setOnClickListener(this);

    }

    public void onClick(View v) {
        // Vis et tal der skifter så vi kan se hver gang der trykkes
        long etTal = System.currentTimeMillis();

        // Skriv meddelelse på knappen (kan på skærmen)
        enKnap.setText("Du trykkede på mig. Tak! \n" + etTal);

        // Skriv meddelelse til loggen (loggen kan ses med adb logcat)
        System.out.println("Der blev trykket på knappen");

        Log.d("BenytEnKnap", "Knap trykket");
    }

}
