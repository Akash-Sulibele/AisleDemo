
package com.example.aisleassignment.models.info;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class SmokingV1 {

    @SerializedName("id")
    private Long mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("name_alias")
    private String mNameAlias;

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getNameAlias() {
        return mNameAlias;
    }

    public void setNameAlias(String nameAlias) {
        mNameAlias = nameAlias;
    }

}
