package com.example.android.miwokapp;


/**
 * Created by anant on 26/1/17.
 */

public class Word {
    private String mDefaultTranslation;

    private String mMiwokTrasnaltion;

    private int mImageResourceId = NO_IMAGE;

    private int mSoundResourceId;
    private static final int NO_IMAGE = -1;

    public Word(String defaultTranslation, String miwokTrasnaltion, int imageResourceId ,int soundResourceId){
        mSoundResourceId = soundResourceId;
        mImageResourceId = imageResourceId;
        mDefaultTranslation = defaultTranslation;
        mMiwokTrasnaltion = miwokTrasnaltion;


    }

    public  Word(String defaultTranslation, String miwokTranslation, int soundResourceId){
        mSoundResourceId = soundResourceId;
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

    public int getSoundResourceId(){
        return mSoundResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE;
    }
}