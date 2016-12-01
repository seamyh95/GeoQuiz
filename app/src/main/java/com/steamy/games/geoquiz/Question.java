package com.steamy.games.geoquiz;

/**
 * Created by sherr on 20/11/2016.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;


    public Question(int textResId, boolean answerTrue){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;

    }


    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }


    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }


}
