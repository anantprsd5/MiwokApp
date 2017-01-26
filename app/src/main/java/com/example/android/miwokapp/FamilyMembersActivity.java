package com.example.android.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);

        ArrayList<Word> members = new ArrayList<Word>();
        members.add(new Word("apa","father"));
        members.add(new Word("ama","father"));
    }
}
