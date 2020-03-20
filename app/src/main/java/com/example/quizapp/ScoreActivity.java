package com.example.quizapp;


import android.app.Activity;

import android.content.Intent;

import android.os.Bundle;

import android.widget.TextView;

public class ScoreActivity extends Activity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        String score = intent.getStringExtra("SCORE");
        textView.setText(score);
    }
}