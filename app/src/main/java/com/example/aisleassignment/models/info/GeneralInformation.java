
package com.example.aisleassignment.models.info;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class GeneralInformation {

    @SerializedName("age")
    private Long mAge;
    @SerializedName("cast")
    private Object mCast;
    @SerializedName("date_of_birth")
    private String mDateOfBirth;
    @SerializedName("date_of_birth_v1")
    private String mDateOfBirthV1;
    @SerializedName("diet")
    private Object mDiet;
    @SerializedName("drinking")
    private String mDrinking;
    @SerializedName("drinking_v1")
    private DrinkingV1 mDrinkingV1;
    @SerializedName("faith")
    private Faith mFaith;
    @SerializedName("first_name")
    private String mFirstName;
    @SerializedName("gender")
    private String mGender;
    @SerializedName("height")
    private Long mHeight;
    @SerializedName("kid")
    private Object mKid;
    @SerializedName("location")
    private Location mLocation;
    @SerializedName("marital_status")
    private String mMaritalStatus;
    @SerializedName("marital_status_v1")
    private MaritalStatusV1 mMaritalStatusV1;
    @SerializedName("mother_tongue")
    private MotherTongue mMotherTongue;
    @SerializedName("pet")
    private Object mPet;
    @SerializedName("politics")
    private Object mPolitics;
    @SerializedName("ref_id")
    private String mRefId;
    @SerializedName("settle")
    private Object mSettle;
    @SerializedName("smoking")
    private String mSmoking;
    @SerializedName("smoking_v1")
    private SmokingV1 mSmokingV1;
    @SerializedName("sun_sign")
    private String mSunSign;
    @SerializedName("sun_sign_v1")
    private SunSignV1 mSunSignV1;

    public Long getAge() {
        return mAge;
    }

    public void setAge(Long age) {
        mAge = age;
    }

    public Object getCast() {
        return mCast;
    }

    public void setCast(Object cast) {
        mCast = cast;
    }

    public String getDateOfBirth() {
        return mDateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        mDateOfBirth = dateOfBirth;
    }

    public String getDateOfBirthV1() {
        return mDateOfBirthV1;
    }

    public void setDateOfBirthV1(String dateOfBirthV1) {
        mDateOfBirthV1 = dateOfBirthV1;
    }

    public Object getDiet() {
        return mDiet;
    }

    public void setDiet(Object diet) {
        mDiet = diet;
    }

    public String getDrinking() {
        return mDrinking;
    }

    public void setDrinking(String drinking) {
        mDrinking = drinking;
    }

    public DrinkingV1 getDrinkingV1() {
        return mDrinkingV1;
    }

    public void setDrinkingV1(DrinkingV1 drinkingV1) {
        mDrinkingV1 = drinkingV1;
    }

    public Faith getFaith() {
        return mFaith;
    }

    public void setFaith(Faith faith) {
        mFaith = faith;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getGender() {
        return mGender;
    }

    public void setGender(String gender) {
        mGender = gender;
    }

    public Long getHeight() {
        return mHeight;
    }

    public void setHeight(Long height) {
        mHeight = height;
    }

    public Object getKid() {
        return mKid;
    }

    public void setKid(Object kid) {
        mKid = kid;
    }

    public Location getLocation() {
        return mLocation;
    }

    public void setLocation(Location location) {
        mLocation = location;
    }

    public String getMaritalStatus() {
        return mMaritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        mMaritalStatus = maritalStatus;
    }

    public MaritalStatusV1 getMaritalStatusV1() {
        return mMaritalStatusV1;
    }

    public void setMaritalStatusV1(MaritalStatusV1 maritalStatusV1) {
        mMaritalStatusV1 = maritalStatusV1;
    }

    public MotherTongue getMotherTongue() {
        return mMotherTongue;
    }

    public void setMotherTongue(MotherTongue motherTongue) {
        mMotherTongue = motherTongue;
    }

    public Object getPet() {
        return mPet;
    }

    public void setPet(Object pet) {
        mPet = pet;
    }

    public Object getPolitics() {
        return mPolitics;
    }

    public void setPolitics(Object politics) {
        mPolitics = politics;
    }

    public String getRefId() {
        return mRefId;
    }

    public void setRefId(String refId) {
        mRefId = refId;
    }

    public Object getSettle() {
        return mSettle;
    }

    public void setSettle(Object settle) {
        mSettle = settle;
    }

    public String getSmoking() {
        return mSmoking;
    }

    public void setSmoking(String smoking) {
        mSmoking = smoking;
    }

    public SmokingV1 getSmokingV1() {
        return mSmokingV1;
    }

    public void setSmokingV1(SmokingV1 smokingV1) {
        mSmokingV1 = smokingV1;
    }

    public String getSunSign() {
        return mSunSign;
    }

    public void setSunSign(String sunSign) {
        mSunSign = sunSign;
    }

    public SunSignV1 getSunSignV1() {
        return mSunSignV1;
    }

    public void setSunSignV1(SunSignV1 sunSignV1) {
        mSunSignV1 = sunSignV1;
    }

}
