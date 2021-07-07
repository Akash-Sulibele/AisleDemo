
package com.example.aisleassignment.models.info;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class ProfileDataList {

    @SerializedName("invitation_type")
    private String mInvitationType;
    @SerializedName("preferences")
    private List<Preference> mPreferences;
    @SerializedName("question")
    private String mQuestion;

    public String getInvitationType() {
        return mInvitationType;
    }

    public void setInvitationType(String invitationType) {
        mInvitationType = invitationType;
    }

    public List<Preference> getPreferences() {
        return mPreferences;
    }

    public void setPreferences(List<Preference> preferences) {
        mPreferences = preferences;
    }

    public String getQuestion() {
        return mQuestion;
    }

    public void setQuestion(String question) {
        mQuestion = question;
    }

}
