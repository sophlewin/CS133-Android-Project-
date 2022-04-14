package com.example.noughtscrosses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class winActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);
        Intent intent = getIntent();
        String XORO = intent.getStringExtra(MainActivity.EXTRA_XORO);

        TextView textview = findViewById(R.id.textView2);
        textview.setText(XORO);
    }


    public void restart(View view) {
        Intent t = new Intent(winActivity.this, MainActivity.class);
        startActivity(t);
        //finish();
    }
}