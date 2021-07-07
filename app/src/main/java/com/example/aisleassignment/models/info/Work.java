
package com.example.aisleassignment.models.info;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Work {

    @SerializedName("experience")
    private String mExperience;
    @SerializedName("experience_v1")
    private ExperienceV1 mExperienceV1;
    @SerializedName("field_of_study")
    private String mFieldOfStudy;
    @SerializedName("field_of_study_v1")
    private FieldOfStudyV1 mFieldOfStudyV1;
    @SerializedName("highest_qualification")
    private String mHighestQualification;
    @SerializedName("highest_qualification_v1")
    private HighestQualificationV1 mHighestQualificationV1;
    @SerializedName("industry")
    private String mIndustry;
    @SerializedName("industry_v1")
    private IndustryV1 mIndustryV1;
    @SerializedName("monthly_income_v1")
    private Object mMonthlyIncomeV1;

    public String getExperience() {
        return mExperience;
    }

    public void setExperience(String experience) {
        mExperience = experience;
    }

    public ExperienceV1 getExperienceV1() {
        return mExperienceV1;
    }

    public void setExperienceV1(ExperienceV1 experienceV1) {
        mExperienceV1 = experienceV1;
    }

    public String getFieldOfStudy() {
        return mFieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        mFieldOfStudy = fieldOfStudy;
    }

    public FieldOfStudyV1 getFieldOfStudyV1() {
        return mFieldOfStudyV1;
    }

    public void setFieldOfStudyV1(FieldOfStudyV1 fieldOfStudyV1) {
        mFieldOfStudyV1 = fieldOfStudyV1;
    }

    public String getHighestQualification() {
        return mHighestQualification;
    }

    public void setHighestQualification(String highestQualification) {
        mHighestQualification = highestQualification;
    }

    public HighestQualificationV1 getHighestQualificationV1() {
        return mHighestQualificationV1;
    }

    public void setHighestQualificationV1(HighestQualificationV1 highestQualificationV1) {
        mHighestQualificationV1 = highestQualificationV1;
    }

    public String getIndustry() {
        return mIndustry;
    }

    public void setIndustry(String industry) {
        mIndustry = industry;
    }

    public IndustryV1 getIndustryV1() {
        return mIndustryV1;
    }

    public void setIndustryV1(IndustryV1 industryV1) {
        mIndustryV1 = industryV1;
    }

    public Object getMonthlyIncomeV1() {
        return mMonthlyIncomeV1;
    }

    public void setMonthlyIncomeV1(Object monthlyIncomeV1) {
        mMonthlyIncomeV1 = monthlyIncomeV1;
    }

}
