package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, TextView.OnEditorActionListener {

    Button enKnap, enKnap2;
    TextView userInfo;
    EditText userInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInfo = findViewById(R.id.textView2);
        userInput = findViewById(R.id.editText);
        enKnap = findViewById(R.id.button1);
        enKnap2 = findViewById(R.id.button2);

        enKnap.setOnClickListener(this);
        enKnap2.setOnClickListener(this);
        userInput.setOnEditorActionListener(this);
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

    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

        if (v == userInput) {
            String userName = userInput.getText().toString();
            userInfo.setText("User: " + userName);

        }
        return true;
    }
}
