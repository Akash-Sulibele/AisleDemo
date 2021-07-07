
package com.example.aisleassignment.models;

import com.google.gson.annotations.SerializedName;

public class VerifyOtpRequestModel {

    @SerializedName("number")
    private String mNumber;
    @SerializedName("otp")
    private String mOtp;

    public String getNumber() {
        return mNumber;
    }

    public void setNumber(String number) {
        mNumber = number;
    }

    public String getOtp() {
        return mOtp;
    }

    public void setOtp(String otp) {
        mOtp = otp;
    }

}
