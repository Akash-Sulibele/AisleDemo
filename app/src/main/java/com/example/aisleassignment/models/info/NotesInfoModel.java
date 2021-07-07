
package com.example.aisleassignment.models.info;

import com.google.gson.annotations.SerializedName;

public class NotesInfoModel {

    @SerializedName("invites")
    private Invites mInvites;
    @SerializedName("likes")
    private Likes mLikes;

    public Invites getInvites() {
        return mInvites;
    }

    public void setInvites(Invites invites) {
        mInvites = invites;
    }

    public Likes getLikes() {
        return mLikes;
    }

    public void setLikes(Likes likes) {
        mLikes = likes;
    }

}
