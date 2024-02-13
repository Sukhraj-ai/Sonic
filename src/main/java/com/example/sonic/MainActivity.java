package com.example.sonic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void speech(View view){
        Intent intent= new Intent(this, Speech_To_Text.class);
        startActivity(intent);
    }
    public void text(View view){
        Intent intent= new Intent(this, Text_To_Speech.class);
        startActivity(intent);
    }
}