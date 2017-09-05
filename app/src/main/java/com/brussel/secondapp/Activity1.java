package com.brussel.secondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
    }
    public void callAct1App1(View view){
        Intent intent = new Intent("com.brussel.firstapp.Activity2");
        startActivity(intent);


    }


}
