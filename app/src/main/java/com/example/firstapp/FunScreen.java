package com.example.firstapp;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;


public class FunScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_screen);
    }

    public class BenytWebView1 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            WebView webView = new WebView(this);
            webView.loadUrl("http://javabog.dk");
            setContentView(webView);
        }
    }

}
