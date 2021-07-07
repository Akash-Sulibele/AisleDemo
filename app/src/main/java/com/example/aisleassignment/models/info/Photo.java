
package com.example.aisleassignment.models.info;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Photo {

    @SerializedName("photo")
    private String mPhoto;
    @SerializedName("photo_id")
    private Long mPhotoId;
    @SerializedName("selected")
    private Boolean mSelected;
    @SerializedName("status")
    private String mStatus;

    public String getPhoto() {
        return mPhoto;
    }

    public void setPhoto(String photo) {
        mPhoto = photo;
    }

    public Long getPhotoId() {
        return mPhotoId;
    }

    public void setPhotoId(Long photoId) {
        mPhotoId = photoId;
    }

    public Boolean getSelected() {
        return mSelected;
    }

    public void setSelected(Boolean selected) {
        mSelected = selected;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

}
