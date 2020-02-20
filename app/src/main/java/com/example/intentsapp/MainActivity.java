package com.example.intentsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText inputEditText = findViewById(R.id.edtInput);
        Button launchButton = findViewById(R.id.btnLaunch);

    }

    private void launchInternalActivity() {
        // TODO - Create explicit intent and start second activity

    }

    private void launchExternalActivity() {
        // TODO - Create explicit intent and launch external activity

    }
}
