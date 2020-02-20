package com.example.intentsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String ARG = "text";
    private EditText inputEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputEditText = findViewById(R.id.edtInput);
        Button launchButton = findViewById(R.id.btnLaunch);
        launchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   launchInternalActivity();
                launchExternalActivity();
            }
        });

    }

    private void launchInternalActivity() {
        // TODO - Create explicit intent and start second activity
        String text = inputEditText.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(ARG, text);

        startActivity(intent);
    }

    private void launchExternalActivity() {
        // TODO - Create implicit intent and launch external email app
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        String[] emails = {"JohnDoe@example.com", "foo@bar.com"};
        intent.putExtra(Intent.EXTRA_EMAIL, emails);
        intent.putExtra(Intent.EXTRA_SUBJECT, "Hello World!");

        // Verify if there is an app that can fulfill the intent before launching
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
