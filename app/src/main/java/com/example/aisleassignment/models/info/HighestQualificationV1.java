
package com.example.aisleassignment.models.info;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class HighestQualificationV1 {

    @SerializedName("id")
    private Long mId;
    @SerializedName("is_open_to_all")
    private Boolean mIsOpenToAll;
    @SerializedName("is_selected")
    private Boolean mIsSelected;
    @SerializedName("name")
    private String mName;
    @SerializedName("preference_only")
    private Boolean mPreferenceOnly;

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Boolean getIsOpenToAll() {
        return mIsOpenToAll;
    }

    public void setIsOpenToAll(Boolean isOpenToAll) {
        mIsOpenToAll = isOpenToAll;
    }

    public Boolean getIsSelected() {
        return mIsSelected;
    }

    public void setIsSelected(Boolean isSelected) {
        mIsSelected = isSelected;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Boolean getPreferenceOnly() {
        return mPreferenceOnly;
    }

    public void setPreferenceOnly(Boolean preferenceOnly) {
        mPreferenceOnly = preferenceOnly;
    }

}
