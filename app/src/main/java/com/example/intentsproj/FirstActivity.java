package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class FirstActivity extends AppCompatActivity {
    public static final String Number1="com.example.IntentsProj.Number1";
    public static final String Number2="com.example.IntentsProj.Number2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
//Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.custom_toast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));
//Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();


    }



    public void nextPage(View view){

        //Default Toast implementation
        Context context=getApplicationContext();
        String message="You just clicked the OK button";
        int duration= Toast.LENGTH_SHORT;
        Toast toast=Toast.makeText(context,message,duration);
        toast.show();


        Intent intent=new Intent(this,SecondActivity.class);
        EditText t1= (EditText) findViewById(R.id.Num1);
        EditText t2= (EditText) findViewById(R.id.Num2);

        intent.putExtra(Number1,t1.getText().toString());
        intent.putExtra(Number2,t2.getText().toString());

        startActivity(intent);
    }

}