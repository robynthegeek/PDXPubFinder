package com.robynandcory.pdxbeerfinder;

/**
 * Creates a new class called Pub, which holds information about Portland establishments
 * that serve Beer.
 */
public class Pub {
    private String mPubName;
    private Boolean mIsStarred;
    private int mImageResource;

    public Pub(String pubName, String pubType, Boolean isStarred, int imageResourceID) {
        mPubName = pubName;
        mIsStarred = isStarred;
        mImageResource = imageResourceID;
    }


    // returns the assigned Pub name
    public String getPubName() {
        return mPubName;
    }

    // returns the Boolean true or false for whether the pub is starred (favorite)
    public boolean getIsStarred() {
        return mIsStarred;
    }

    // returns the ID for the image resource in the drawable folder
    public int getImageResource() {
        return mImageResource;
    }
}
