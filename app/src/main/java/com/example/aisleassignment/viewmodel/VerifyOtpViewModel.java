package com.example.aisleassignment.viewmodel;

import androidx.lifecycle.ViewModel;

import com.example.aisleassignment.ApiCallbacks;
import com.example.aisleassignment.service.Service;
import com.example.aisleassignment.models.VerifyOtpRequestModel;
import com.example.aisleassignment.models.VerifyOtpResponseModel;

public class VerifyOtpViewModel extends ViewModel {
    private Service service = new Service();
    public VerifyOtpRequestModel verifyOtpRequestModel = new VerifyOtpRequestModel();
    public VerifyOtpResponseModel verifyOtpResponseModel = new VerifyOtpResponseModel();

    public void verifyOtp(ApiCallbacks callbacks) {
        verifyOtpRequestModel.setNumber("+919876543212");
        verifyOtpRequestModel.setOtp("1234");
        service.verifyOtp(verifyOtpRequestModel,callbacks);
    }
}
