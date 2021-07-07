
package com.example.aisleassignment.models.info;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Profile {

    @SerializedName("approved_time")
    private Double mApprovedTime;
    @SerializedName("avatar")
    private String mAvatar;
    @SerializedName("first_name")
    private String mFirstName;
    @SerializedName("general_information")
    private GeneralInformation mGeneralInformation;
    @SerializedName("has_active_subscription")
    private Boolean mHasActiveSubscription;
    @SerializedName("icebreakers")
    private Object mIcebreakers;
    @SerializedName("instagram_images")
    private Object mInstagramImages;
    @SerializedName("is_facebook_data_fetched")
    private Boolean mIsFacebookDataFetched;
    @SerializedName("last_seen")
    private String mLastSeen;
    @SerializedName("last_seen_window")
    private String mLastSeenWindow;
    @SerializedName("lat")
    private String mLat;
    @SerializedName("latest_poll")
    private Object mLatestPoll;
    @SerializedName("lng")
    private String mLng;
    @SerializedName("meetup")
    private Object mMeetup;
    @SerializedName("online_code")
    private Long mOnlineCode;
    @SerializedName("photos")
    private List<Photo> mPhotos;
    @SerializedName("poll_info")
    private Object mPollInfo;
    @SerializedName("preferences")
    private List<Preference> mPreferences;
    @SerializedName("profile_data_list")
    private List<ProfileDataList> mProfileDataList;
    @SerializedName("show_concierge_badge")
    private Boolean mShowConciergeBadge;
    @SerializedName("story")
    private Object mStory;
    @SerializedName("user_interests")
    private List<Object> mUserInterests;
    @SerializedName("verification_status")
    private String mVerificationStatus;
    @SerializedName("work")
    private Work mWork;

    public Double getApprovedTime() {
        return mApprovedTime;
    }

    public void setApprovedTime(Double approvedTime) {
        mApprovedTime = approvedTime;
    }

    public String getAvatar() {
        return mAvatar;
    }

    public void setAvatar(String avatar) {
        mAvatar = avatar;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public GeneralInformation getGeneralInformation() {
        return mGeneralInformation;
    }

    public void setGeneralInformation(GeneralInformation generalInformation) {
        mGeneralInformation = generalInformation;
    }

    public Boolean getHasActiveSubscription() {
        return mHasActiveSubscription;
    }

    public void setHasActiveSubscription(Boolean hasActiveSubscription) {
        mHasActiveSubscription = hasActiveSubscription;
    }

    public Object getIcebreakers() {
        return mIcebreakers;
    }

    public void setIcebreakers(Object icebreakers) {
        mIcebreakers = icebreakers;
    }

    public Object getInstagramImages() {
        return mInstagramImages;
    }

    public void setInstagramImages(Object instagramImages) {
        mInstagramImages = instagramImages;
    }

    public Boolean getIsFacebookDataFetched() {
        return mIsFacebookDataFetched;
    }

    public void setIsFacebookDataFetched(Boolean isFacebookDataFetched) {
        mIsFacebookDataFetched = isFacebookDataFetched;
    }

    public String getLastSeen() {
        return mLastSeen;
    }

    public void setLastSeen(String lastSeen) {
        mLastSeen = lastSeen;
    }

    public String getLastSeenWindow() {
        return mLastSeenWindow;
    }

    public void setLastSeenWindow(String lastSeenWindow) {
        mLastSeenWindow = lastSeenWindow;
    }

    public String getLat() {
        return mLat;
    }

    public void setLat(String lat) {
        mLat = lat;
    }

    public Object getLatestPoll() {
        return mLatestPoll;
    }

    public void setLatestPoll(Object latestPoll) {
        mLatestPoll = latestPoll;
    }

    public String getLng() {
        return mLng;
    }

    public void setLng(String lng) {
        mLng = lng;
    }

    public Object getMeetup() {
        return mMeetup;
    }

    public void setMeetup(Object meetup) {
        mMeetup = meetup;
    }

    public Long getOnlineCode() {
        return mOnlineCode;
    }

    public void setOnlineCode(Long onlineCode) {
        mOnlineCode = onlineCode;
    }

    public List<Photo> getPhotos() {
        return mPhotos;
    }

    public void setPhotos(List<Photo> photos) {
        mPhotos = photos;
    }

    public Object getPollInfo() {
        return mPollInfo;
    }

    public void setPollInfo(Object pollInfo) {
        mPollInfo = pollInfo;
    }

    public List<Preference> getPreferences() {
        return mPreferences;
    }

    public void setPreferences(List<Preference> preferences) {
        mPreferences = preferences;
    }

    public List<ProfileDataList> getProfileDataList() {
        return mProfileDataList;
    }

    public void setProfileDataList(List<ProfileDataList> profileDataList) {
        mProfileDataList = profileDataList;
    }

    public Boolean getShowConciergeBadge() {
        return mShowConciergeBadge;
    }

    public void setShowConciergeBadge(Boolean showConciergeBadge) {
        mShowConciergeBadge = showConciergeBadge;
    }

    public Object getStory() {
        return mStory;
    }

    public void setStory(Object story) {
        mStory = story;
    }

    public List<Object> getUserInterests() {
        return mUserInterests;
    }

    public void setUserInterests(List<Object> userInterests) {
        mUserInterests = userInterests;
    }

    public String getVerificationStatus() {
        return mVerificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        mVerificationStatus = verificationStatus;
    }

    public Work getWork() {
        return mWork;
    }

    public void setWork(Work work) {
        mWork = work;
    }

}
