package com.example.criccards;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickStatsBtn(View view){
        Intent myIntent = new Intent(MainActivity.this, StatsActivity.class);
        this.startActivity(myIntent);
    }
}
