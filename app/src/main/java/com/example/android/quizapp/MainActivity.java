package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score = 0;
    public void submitTest(View view) {
        RadioButton question1Check = (RadioButton) findViewById(R.id.question1D);
        RadioButton question2Check = (RadioButton) findViewById(R.id.question2D);
        RadioButton question3Check = (RadioButton) findViewById(R.id.question3A);
        CheckBox question4Check_1 = (CheckBox) findViewById(R.id.question4B);
        CheckBox question4Check_2 = (CheckBox) findViewById(R.id.question4D);
        EditText question5Check = (EditText) findViewById(R.id.question5answer);

        if (question1Check.isChecked()) {
            score += 20;
        }
        if (question2Check.isChecked()) {
            score += 20;
        }
        if (question3Check.isChecked()) {
            score += 20;
        }
        if (question4Check_1.isChecked()) {
            score += 10;
        }
        if (question4Check_2.isChecked()) {
            score += 10;
        }
        if(question5Check.getText().toString().trim().length() != 0) {
            score += 20;
        }
        if (score == 0) {
            score = 0;
        }

        Intent intent = new Intent("com.example.android.quizapp.ScoreActivity");
        intent.putExtra("score", String.valueOf(score));
        startActivity(intent);
    }

}
