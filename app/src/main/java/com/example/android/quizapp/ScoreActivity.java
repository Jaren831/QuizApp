package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Jaren Lynch on 6/26/2016.
 */
public class ScoreActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score_main);
        Intent intent = getIntent();
        String score = intent.getStringExtra("score");

        TextView scoreDisplay = (TextView) findViewById(R.id.scoreDisplay);
        String scoreMessage = score + " out of 100";
        scoreDisplay.setText(scoreMessage);
        }
    public void tryAgain(View view) {
        Intent intent = new Intent(ScoreActivity.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

}

