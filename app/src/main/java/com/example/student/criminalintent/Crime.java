package com.example.student.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by student on 9/16/2014.
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public UUID getId() {

        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();
    }
}
