package com.example.criccards;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener{

    Button Run1;
    Button Run2;
    Button Run3;
    Button Run4;
    Button Run6;
    Button Dot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Run1 = findViewById(R.id._1Run);
        Run2 = findViewById(R.id.button2);

        setOnClick_listener();
    }
    private void setOnClick_listener(){
        Run1.setOnClickListener(this);
        Run2.setOnClickListener(this);
    }
    public void onClickStatsBtn(View view){
        Intent myIntent = new Intent(MainActivity.this, StatsActivity.class);
        this.startActivity(myIntent);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id._1Run:
                Toast.makeText(getApplicationContext(),"1",Toast.LENGTH_LONG).show();
                break;
            default:
                Toast.makeText(getApplicationContext(),"Invalid Request Made, check the debugger for info",Toast.LENGTH_LONG).show();
                break;
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
}
