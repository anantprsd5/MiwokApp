package com.example.android.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<String> words = new ArrayList<>();
        TextView textview[] = new TextView[10];
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        LinearLayout rootview = (LinearLayout)findViewById(R.id.list);
        for(int i=0;i<10;i++)
        textview[i] = new TextView(this);
        for(int i=0;i<words.size();i++) {
            textview[i].setText(words.get(i));
            rootview.addView(textview[i]);
        }
    }
}
