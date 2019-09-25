package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button enKnap, enKnap2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        enKnap = findViewById(R.id.button1);
        enKnap2 = findViewById(R.id.button2);

        enKnap.setOnClickListener(this);
        enKnap2.setOnClickListener(this);
    }

    public void onClick(View v) {
        // Vis et tal der skifter så vi kan se hver gang der trykkes
        long etTal = System.currentTimeMillis();

        // Skriv meddelelse på knappen (kan på skærmen)
        if (v == enKnap) {
            enKnap.setText("Dette er tiden i millisekunder \n" + etTal);
        }
        if (v == enKnap2){
            enKnap2.setText("Går til google.com");
            openActivity();

        }

        // Skriv meddelelse til loggen (loggen kan ses med adb logcat)
        System.out.println("Der blev trykket på knappen");

        Log.d("BenytEnKnap", "Knap trykket");
    }

    public void openActivity() {
        Intent intent = new Intent(this, FunScreen.class);
        startActivity(intent);
    }

}
