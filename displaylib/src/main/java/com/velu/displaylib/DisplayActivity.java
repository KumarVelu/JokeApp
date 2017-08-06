package com.velu.displaylib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    private TextView mTvJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        mTvJoke = (TextView) findViewById(R.id.joke);

        String joke = getIntent().getStringExtra("joke");

        mTvJoke.setText(joke);
    }
}
