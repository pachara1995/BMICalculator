package com.example.pachara.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pachara.bmicalculator.human.human;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private human pet;
    String x = "" ;
    String str = "" ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pet = new human();
        final EditText text1 = (EditText) findViewById(R.id.tell);
        final EditText text2 = (EditText) findViewById(R.id.weight);
        //x = new String((String) text1.getTag());

        Button btn1 = (Button)findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView text = (TextView) findViewById(R.id.ans);
                text.setText(x);
               /* Intent intent = new Intent(MainActivity.this,calculate.class);
                intent.putExtra("ans",pet.BMI(20,30));
                startActivity(intent);*/
            }
        }
        );



    }
}
