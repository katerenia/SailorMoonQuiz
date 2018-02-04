package com.example.android.sailormoonquiz;

import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Nehelenia on 31/1/2018.
 */

public class lowActivity extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.low);
        int number = getIntent().getExtras().getInt("Score");
        TextView scoreView = (TextView) findViewById(R.id.score_low);
        scoreView.setText(String.valueOf(number * 10 + "%"));
    }


}

