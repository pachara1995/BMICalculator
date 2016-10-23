package com.example.pachara.bmicalculator.human;

import android.widget.EditText;


public class human {

    private int bmi = 0;

    public String BMI(int x, int y){
        bmi = y/(x*x);
        return setString(bmi);
    }

    private String setString(int value){
        String str = Integer.toString(value);
            str = "0" + str;
        return str;
    }

    public String getstand(int x){
        if(x<18.5){
            return "น้ำหนักน้อยกว่าปกติ(ผอม)";
        }
        else if(x<25){
            return "น้ำหนักปกติ";
        }
        else if(x<30){
            return "น้ำหนักมากกว่าปกติ(ท้วม)";
        }
        else if(x>=30){
            return "น้ำหนักมากกว่าปกตมากิ(อ้วน)";
        }
        return "";
    }

}
