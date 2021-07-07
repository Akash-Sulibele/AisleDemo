
package com.example.aisleassignment.models.info;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Likes {

    @SerializedName("can_see_profile")
    private Boolean mCanSeeProfile;
    @SerializedName("likes_received_count")
    private Long mLikesReceivedCount;
    @SerializedName("profiles")
    private List<Profile> mProfiles;

    public Boolean getCanSeeProfile() {
        return mCanSeeProfile;
    }

    public void setCanSeeProfile(Boolean canSeeProfile) {
        mCanSeeProfile = canSeeProfile;
    }

    public Long getLikesReceivedCount() {
        return mLikesReceivedCount;
    }

    public void setLikesReceivedCount(Long likesReceivedCount) {
        mLikesReceivedCount = likesReceivedCount;
    }

    public List<Profile> getProfiles() {
        return mProfiles;
    }

    public void setProfiles(List<Profile> profiles) {
        mProfiles = profiles;
    }

}
