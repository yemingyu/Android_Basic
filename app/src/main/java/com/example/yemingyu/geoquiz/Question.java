package com.example.yemingyu.geoquiz;

/**
 * Created by yemingyu on 27/06/2017.
 */

public class Question {

    private int mTextResId;
    private boolean nAnswerTrue;

    public Question(int textResId, boolean answerTue) {
        mTextResId = textResId;
        nAnswerTrue = answerTue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isnAnswerTrue() {
        return nAnswerTrue;
    }

    public void setnAnswerTrue(boolean nAnswerTrue) {
        this.nAnswerTrue = nAnswerTrue;
    }
}
