package com.learning.android.sairam.basiccalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainScreen extends AppCompatActivity {

    EditText result;
    EditText first;
    EditText second;
    Button sum;
    TextView graphic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        first=(EditText)findViewById(R.id.number1);
        second=(EditText)findViewById(R.id.number2);
        result=(EditText)findViewById(R.id.result);
        sum = (Button)findViewById(R.id.sum);
        graphic = (TextView)findViewById(R.id.GraphicResult);
    }

    public void sum_click(View view) {
        if(!(first.getText().toString().isEmpty()) && !(second.getText().toString().isEmpty())  ) {
        Double a= Double.parseDouble(first.getText().toString());
        Double b = Double.parseDouble(second.getText().toString());

            Double r = a + b;
            result.setText("Sum :" + r);
            graphic.setText("SUCCESS");
            graphic.setTextSize(30);
        }else{
            graphic.setText("Please Enter Numbers");
        }
    }

    public void mul_click(View view) {
        if(!(first.getText().toString().isEmpty()) && !(second.getText().toString().isEmpty())  ) {
            float a = Float.parseFloat(first.getText().toString());
            float b = Float.parseFloat(second.getText().toString());
            float r = a * b;
            result.setText("Multiplication:" + r);
            graphic.setText("SUCCESS");
            graphic.setTextSize(30);
        }else{
            graphic.setText("Please Enter Numbers");
        }

    }

    public void div_click(View view) {
        if(!(first.getText().toString().isEmpty()) && !(second.getText().toString().isEmpty())  ) {
            float a = Float.parseFloat(first.getText().toString());
            float b = Float.parseFloat(second.getText().toString());
            float r = a / b;
            result.setText("Division:" + r);
            graphic.setText("SUCCESS");
            graphic.setTextSize(30);
        }else{
            graphic.setText("Please Enter Numbers");
        }
    }

    public void sub_click(View view) {
        if(!(first.getText().toString().isEmpty()) && !(second.getText().toString().isEmpty())  ) {
            float a = Float.parseFloat(first.getText().toString());
            float b = Float.parseFloat(second.getText().toString());
            float r = a - b;
            result.setText("Subtraction" + r);
            graphic.setText("SUCCESS");
            graphic.setTextSize(30);
        }else{
            graphic.setText("Please Enter Numbers");
        }
    }
}
