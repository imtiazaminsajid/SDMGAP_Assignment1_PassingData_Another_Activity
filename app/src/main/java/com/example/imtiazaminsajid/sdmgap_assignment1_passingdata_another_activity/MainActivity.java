package com.example.imtiazaminsajid.sdmgap_assignment1_passingdata_another_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    public static final String MESSAGE_STRING = "com.example.imtiazaminsajid.sdmgap_assignment1_passingdata_another_activity.MESSAGE";

    public ImageButton nameBtn, phoneBtn, emailBtn, addressBtn;
    public EditText nameET, phoneET, emailET, addressET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameBtn = findViewById(R.id.nameButton);
        phoneBtn = findViewById(R.id.phoneButton);
        emailBtn = findViewById(R.id.emailButton);
        addressBtn = findViewById(R.id.addressButton);

        nameET = findViewById(R.id.name);
        phoneET = findViewById(R.id.phone);
        emailET = findViewById(R.id.email);
        addressET = findViewById(R.id.address);
    }

    public void name(View view) {


        String name = nameET.getText().toString();
        Intent intent = new Intent(this, Name.class);
        intent.putExtra( MESSAGE_STRING , name);
        startActivity(intent);


    }

    public void email(View view) {

        String email = emailET.getText().toString();
        Intent intent = new Intent(this, Email.class);
        intent.putExtra( MESSAGE_STRING , email);
        startActivity(intent);
    }

    public void phone(View view) {

        String phone = phoneET.getText().toString();
        Intent intent = new Intent(this, Phone.class);
        intent.putExtra( "Phone" , phone);
        startActivity(intent);


    }

    public void address(View view) {

        String address = addressET.getText().toString();
        Intent intent = new Intent(this, Address.class);
        intent.putExtra( "Address" , address);
        startActivity(intent);
    }
}
