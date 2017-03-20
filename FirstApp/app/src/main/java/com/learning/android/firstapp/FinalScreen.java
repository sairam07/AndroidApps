package com.learning.android.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FinalScreen extends AppCompatActivity {

    TextView userName;
    TextView password;
    TextView headerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_screen);
        Bundle b = getIntent().getExtras();

        userName = (TextView)findViewById(R.id.user_userName);
        password = (TextView)findViewById(R.id.user_password);
        headerText = (TextView)findViewById(R.id.headertext);
        headerText.setText("Your Credentials are");

        userName.setText (b.getString("uName"));
        password.setText(b.getString("password"));

    }
}
