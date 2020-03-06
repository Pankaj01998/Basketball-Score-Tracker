package com.example.android.scoretracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scrA = 0;
    int scrB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void incr1 (View view){
        scrA += 3;
        display(scrA);
    }

    public void incr2 (View view){
        scrA += 2;
        display(scrA);
    }

    public void incr3 (View view){
        scrA += 1;
        display(scrA);
    }

    public void reset(View v){
        scrA = 0;
        scrB = 0;
        display(scrA);
        displayb(scrB);
    }

    public void display(int number){
        TextView cscr = (TextView) findViewById(R.id.scr);
        cscr.setText("" + number);
     }


    public void incrb1 (View view){
        scrB += 3;
        displayb(scrB);
    }

    public void incrb2 (View view){
        scrB += 2;
        displayb(scrB);
    }

    public void incrb3 (View view){
        scrB += 1;
        displayb(scrB);
    }


    public void displayb(int number){
        TextView cscr = (TextView) findViewById(R.id.scrb);
        cscr.setText("" + number);
    }


}
