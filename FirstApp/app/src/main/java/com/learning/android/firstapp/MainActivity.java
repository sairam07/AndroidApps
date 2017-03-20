package com.learning.android.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText uName;
    EditText password;
    Button login;
    final String user_name = "admin";
    final String pass_word = "admin";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uName = (EditText)findViewById(R.id.et_userName);
        password = (EditText)findViewById(R.id.et_password);
        login = (Button)findViewById(R.id.bu_login);

    }


    public void login_onClick(View view) {
       /* textChange = (TextView) findViewById(R.id.textDisplay);
        textChange.setText("First Button ");*/
       if(uName.getText().toString().equals(user_name) &&
               password.getText().toString().equals(pass_word)){
           Intent mainActivity = new Intent(this,FinalScreen.class);
           mainActivity.putExtra("uName",uName.getText().toString());
           mainActivity.putExtra("password",password.getText().toString());
           startActivity(mainActivity);
       }
       else{
           Toast.makeText(this,"Credentials Dosen't Match",Toast.LENGTH_LONG).show();
       }
    }
}
