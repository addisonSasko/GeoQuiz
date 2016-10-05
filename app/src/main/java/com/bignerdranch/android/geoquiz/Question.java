package com.bignerdranch.android.geoquiz;

/**
 * Created by AddisonSasko on 2016-10-03.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int textResId, boolean answerTrue){
        this.mTextResId = textResId;
        this.mAnswerTrue = answerTrue;
    }

    public void setTextResId(int textResId){
        mTextResId = textResId;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }
}
