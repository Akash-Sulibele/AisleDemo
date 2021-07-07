
package com.example.aisleassignment.models.info;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Location {

    @SerializedName("full")
    private String mFull;
    @SerializedName("summary")
    private String mSummary;

    public String getFull() {
        return mFull;
    }

    public void setFull(String full) {
        mFull = full;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

}
