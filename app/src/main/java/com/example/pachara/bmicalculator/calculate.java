package com.example.pachara.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class calculate extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculate_view);

        Intent intent = getIntent();
        String str = intent.getStringExtra("ans");
        //String baiHuay = intent.getStringExtra("huay");

        TextView text = (TextView) findViewById(R.id.ans);
        text.setText(str);
        /*TextView huay1 = (TextView) findViewById(R.id.textView_2);
        huay1.setText(baiHuay);*/

    }

}


