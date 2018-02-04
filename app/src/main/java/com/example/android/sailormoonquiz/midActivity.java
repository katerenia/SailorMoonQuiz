package com.example.android.sailormoonquiz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Nehelenia on 3/2/2018.
 */

public class midActivity extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mid);
        int number = getIntent().getExtras().getInt("Score");
        TextView scoreView = (TextView) findViewById(R.id.score_mid);
        scoreView.setText(String.valueOf(number * 10 + "%"));
    }


}
