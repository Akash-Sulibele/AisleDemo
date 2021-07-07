
package com.example.aisleassignment.models.info;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Preference {

    @SerializedName("answer")
    private String mAnswer;
    @SerializedName("answer_id")
    private Long mAnswerId;
    @SerializedName("first_choice")
    private String mFirstChoice;
    @SerializedName("id")
    private Long mId;
    @SerializedName("preference_question")
    private PreferenceQuestion mPreferenceQuestion;
    @SerializedName("second_choice")
    private String mSecondChoice;
    @SerializedName("value")
    private Long mValue;

    public String getAnswer() {
        return mAnswer;
    }

    public void setAnswer(String answer) {
        mAnswer = answer;
    }

    public Long getAnswerId() {
        return mAnswerId;
    }

    public void setAnswerId(Long answerId) {
        mAnswerId = answerId;
    }

    public String getFirstChoice() {
        return mFirstChoice;
    }

    public void setFirstChoice(String firstChoice) {
        mFirstChoice = firstChoice;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public PreferenceQuestion getPreferenceQuestion() {
        return mPreferenceQuestion;
    }

    public void setPreferenceQuestion(PreferenceQuestion preferenceQuestion) {
        mPreferenceQuestion = preferenceQuestion;
    }

    public String getSecondChoice() {
        return mSecondChoice;
    }

    public void setSecondChoice(String secondChoice) {
        mSecondChoice = secondChoice;
    }

    public Long getValue() {
        return mValue;
    }

    public void setValue(Long value) {
        mValue = value;
    }

}
