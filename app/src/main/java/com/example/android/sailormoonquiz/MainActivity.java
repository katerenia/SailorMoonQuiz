package com.example.android.sailormoonquiz;


import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // declaring global values
    int score = 0;
    RadioButton firstQuestion;
    RadioButton secondQuestion;
    RadioButton thirdQuestion;
    RadioButton fourthQuestion;
    RadioButton fifthQuestion;
    RadioButton sixthQuestion;
    EditText seventhQuestion;
    EditText eighthQuestion;
    CheckBox ninthQuestionA;
    CheckBox ninthQuestionC;
    CheckBox ninthQuestionD;
    CheckBox tenthQuestionB;
    CheckBox tenthQuestionC;
    CheckBox tenthQuestionD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //receiving the data we will need in order to calculate the score in the next method
        firstQuestion = findViewById(R.id.q1_answer_b);
        secondQuestion = findViewById(R.id.q2_answer_c);
        thirdQuestion = findViewById(R.id.q3_answer_c);
        fourthQuestion = findViewById(R.id.q4_answer_b);
        fifthQuestion = findViewById(R.id.q5_answer_c);
        sixthQuestion = findViewById(R.id.q6_answer_c);
        seventhQuestion = findViewById(R.id.q7_edit_text);
        eighthQuestion = findViewById(R.id.q8_edit_text);
        ninthQuestionA = findViewById(R.id.q9_answer_a);
        ninthQuestionC = findViewById(R.id.q9_answer_c);
        ninthQuestionD = findViewById(R.id.q9_answer_d);
        tenthQuestionB = findViewById(R.id.q10_answer_b);
        tenthQuestionC = findViewById(R.id.q10_answer_c);
        tenthQuestionD = findViewById(R.id.q10_answer_d);


    }

    /**
     * This method calculates the score based on the chosen answers*
     */
    public int calculateScore(int score) {
        boolean question1 = firstQuestion.isChecked();
        if (question1) {
            score += 1;
        }
        boolean question2 = secondQuestion.isChecked();
        if (question2) {
            score += 1;
        }
        boolean question3 = thirdQuestion.isChecked();
        if (question3) {
            score += 1;
        }
        boolean question4 = fourthQuestion.isChecked();
        if (question4) {
            score += 1;
        }
        boolean question5 = fifthQuestion.isChecked();
        if (question5) {
            score += 1;
        }
        boolean question6 = sixthQuestion.isChecked();
        if (question6) {
            score += 1;
        }
        String question7 = seventhQuestion.getText().toString();
        if (question7.equalsIgnoreCase("Star Seed")) {
            score += 1;
        }
        String question8 = eighthQuestion.getText().toString();
        if (question8.equalsIgnoreCase("Mamoru Chiba") || question8.equalsIgnoreCase("Mamoru")) {
            score += 1;
        }
        Boolean question9a = ninthQuestionA.isChecked();
        Boolean question9c = ninthQuestionC.isChecked();
        Boolean question9d = ninthQuestionD.isChecked();
        if (question9a && question9c && question9d) {
            score += 1;
        }
        Boolean question10b = tenthQuestionB.isChecked();
        Boolean question10c = tenthQuestionC.isChecked();
        Boolean question10d = tenthQuestionD.isChecked();
        if (question10b && question10c && question10d) {
            score += 1;
        }


        return (score);
    }


    //** This method is called when the See your results button is clicked. It gets the value of the score from calculate score method, gives a toaster message*
      /* informing the user about the number of the question and after that starts a new activity depending on the score*
       */
    public void button(View view) {
        int getScore = calculateScore(score);
        Toast.makeText(this, "You answered " + getScore + " out of 10 questions correctly", Toast.LENGTH_LONG).show();
        if (getScore<4) {
            Intent intent = new Intent(this, lowActivity.class);
            startActivity(intent);
            Intent newIntent = new Intent(this, lowActivity.class);
            newIntent.putExtra("Score", getScore);
            startActivity(newIntent);
        }
        if (getScore>=4) {
            Intent intent2 = new Intent(this, midActivity.class);
            startActivity(intent2);
            Intent newIntent = new Intent(this, midActivity.class);
            newIntent.putExtra("Score", getScore);
            startActivity(newIntent);
        }
        if (getScore>6) {
            Intent intent3 = new Intent(this, highActivity.class);
            startActivity(intent3);
            Intent newIntent = new Intent(this, highActivity.class);
            newIntent.putExtra("Score", getScore);
            startActivity(newIntent);
        }

    }

}



