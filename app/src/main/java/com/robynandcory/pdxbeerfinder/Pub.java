package com.robynandcory.pdxbeerfinder;

/**
 * Creates a new class called Pub, which holds information about Portland establishments
 * that serve Beer.
 */
public class Pub {
    private String mPubName;
    private String mPubType;
    private Boolean mIsStarred;
    private int mImageResource = NO_ICON;
    private static final int NO_ICON = -1;

    public Pub(String pubName, String pubType, Boolean isStarred, int imageResourceID) {
        mPubName = pubName;
        mPubType = pubType;
        mIsStarred = isStarred;
        mImageResource = imageResourceID;
    }


    // returns the assigned Pub name
    public String getPubName() {
        return mPubName;
    }
    // returns the assigned pub type
    public String getPubType() {
        return mPubType;
    }
    // returns the Boolean true or false for whether the pub is starred (favorite)
    public boolean hasStar() {return mIsStarred;}
    // returns the ID for the image resource in the drawable folder
    public int getImageResource() {return mImageResource; }
    // returns whether or not there is an image for the
    public boolean hasImage(){
        return mImageResource != NO_ICON;
    }
}
