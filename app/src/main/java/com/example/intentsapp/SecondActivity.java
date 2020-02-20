package com.example.intentsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = findViewById(R.id.txtShowText);
        // TODO - Get passed information from intent bundle.
        String text = getIntent().getStringExtra(MainActivity.ARG);
        textView.setText(text);
        Toast.makeText(this, "First Activity says:" + text, Toast.LENGTH_SHORT).show();
    }
}
