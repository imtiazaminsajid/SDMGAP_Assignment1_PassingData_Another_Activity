package com.example.imtiazaminsajid.sdmgap_assignment1_passingdata_another_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Email extends AppCompatActivity {

    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        String email = intent.getStringExtra(MainActivity.MESSAGE_STRING);
        textView.setText(email);
    }
}
