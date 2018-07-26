package com.example.imtiazaminsajid.sdmgap_assignment1_passingdata_another_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Phone extends AppCompatActivity {

    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        textView = findViewById(R.id.textView);

        String phone = getIntent().getStringExtra("Phone");
        textView.setText(phone);
    }
}
