package com.example.imtiazaminsajid.sdmgap_assignment1_passingdata_another_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Address extends AppCompatActivity {

    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);

        textView = findViewById(R.id.textView);

        String address = getIntent().getStringExtra("Address");

        textView.setText(address);
    }
}
