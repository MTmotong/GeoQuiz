package com.dzy.geoquiz;

/**
 * Created by dzy on 2018/1/30.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswer;

    public int getmTextResId() {
        return mTextResId;
    }

    public void setmTextResId(int mTextResId) {
        this.mTextResId = mTextResId;
    }

    public boolean ismAnswer() {
        return mAnswer;
    }

    public void setmAnswer(boolean mAnswer) {
        this.mAnswer = mAnswer;
    }

    public Question(int textResId, boolean answer) {
        mTextResId = textResId;
        mAnswer = answer;
    }
}
