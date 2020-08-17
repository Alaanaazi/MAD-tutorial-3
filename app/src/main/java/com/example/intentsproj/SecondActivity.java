package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent=getIntent();

        final double num1= parseDouble(intent.getStringExtra(FirstActivity.Number1));
        final double num2= parseDouble(intent.getStringExtra(FirstActivity.Number2));

        EditText text1= (EditText) findViewById(R.id.Number1);
        EditText text2= (EditText) findViewById(R.id.Number2);

        text1.setText(num1 + " ");
        text2.setText(num2 + " ");

        final TextView res= (TextView) findViewById(R.id.result);
        res.setText("Result");

        Button plus = (Button) findViewById(R.id.buttonPlus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result= num1 + "  + " + num2 + " = " + (num1+num2);
                res.setText(result);
            }
        });

        Button minus = (Button) findViewById(R.id.buttonMinus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result= num1 + "  - " + num2 + " = " + (num1-num2);
                res.setText(result);
            }
        });

        Button multiply = (Button) findViewById(R.id.buttonMultiply);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result= num1 + "  * " + num2 + " = " + (num1*num2);
                res.setText(result);
            }
        });

        Button division = (Button) findViewById(R.id.buttonDivision);
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result= num1 + "  / " + num2 + " = " + (num1/num2);
                res.setText(result);
            }
        });



    }
}