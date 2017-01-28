package com.example.android.miwokapp;


/**
 * Created by anant on 26/1/17.
 */

public class Word {
    private String mDefaultTranslation;

    private String mMiwokTrasnaltion;

    private int mImageResourceId = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    public Word(String defaultTranslation, String miwokTrasnaltion, int imageResourceId){
        mImageResourceId = imageResourceId;
        mDefaultTranslation = defaultTranslation;
        mMiwokTrasnaltion = miwokTrasnaltion;


    }

    public  Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTrasnaltion = miwokTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTrasnaltion(){
        return mMiwokTrasnaltion;
    }

    public int getmImageResourceId(){
        return  mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE;
    }
}