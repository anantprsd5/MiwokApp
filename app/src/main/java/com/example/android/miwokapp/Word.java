package com.example.android.miwokapp;

/**
 * Created by anant on 26/1/17.
 */

public class Word {
    private String mDefaultTranslation;

    private String mMiwokTrasnaltion;

    public Word(String defaultTranslation, String miwokTrasnaltion){
        mDefaultTranslation = defaultTranslation;
        mMiwokTrasnaltion = miwokTrasnaltion;

    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTrasnaltion(){
        return mMiwokTrasnaltion;
    }
}