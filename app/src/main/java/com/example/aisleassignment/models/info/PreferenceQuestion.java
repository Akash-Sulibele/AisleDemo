
package com.example.aisleassignment.models.info;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class PreferenceQuestion {

    @SerializedName("first_choice")
    private String mFirstChoice;
    @SerializedName("second_choice")
    private String mSecondChoice;

    public String getFirstChoice() {
        return mFirstChoice;
    }

    public void setFirstChoice(String firstChoice) {
        mFirstChoice = firstChoice;
    }

    public String getSecondChoice() {
        return mSecondChoice;
    }

    public void setSecondChoice(String secondChoice) {
        mSecondChoice = secondChoice;
    }

}
