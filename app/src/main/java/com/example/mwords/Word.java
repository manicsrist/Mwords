package com.example.mwords;

public class Word {

    private String mDefaultTranslation;
    private String mHindiTranslation;
    private int imageResourceId;
    private int mAudioResourceId;

    public Word(String defaultTranslation ,String hindiTranslation,int audioResourceId){
        mDefaultTranslation =defaultTranslation;
        mHindiTranslation=hindiTranslation;
        mAudioResourceId=audioResourceId;
    }

    public Word(String defaultTranslation ,String hindiTranslation,int imageResourceId,int audioResourceId){
        mDefaultTranslation =defaultTranslation;
        mHindiTranslation=hindiTranslation;
        this.imageResourceId=imageResourceId;
        this.mAudioResourceId=audioResourceId;
    }
    public String getmHindiTranslation(){
        return mHindiTranslation;
    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public int getImageResourceId() { return imageResourceId; }

    public int getmAudioResourceId(){ return mAudioResourceId;}
}
