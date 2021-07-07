
package com.example.aisleassignment.models.info;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Invites {

    @SerializedName("pending_invitations_count")
    private Long mPendingInvitationsCount;
    @SerializedName("profiles")
    private List<Profile> mProfiles;
    @SerializedName("totalPages")
    private Long mTotalPages;

    public Long getPendingInvitationsCount() {
        return mPendingInvitationsCount;
    }

    public void setPendingInvitationsCount(Long pendingInvitationsCount) {
        mPendingInvitationsCount = pendingInvitationsCount;
    }

    public List<Profile> getProfiles() {
        return mProfiles;
    }

    public void setProfiles(List<Profile> profiles) {
        mProfiles = profiles;
    }

    public Long getTotalPages() {
        return mTotalPages;
    }

    public void setTotalPages(Long totalPages) {
        mTotalPages = totalPages;
    }

}
