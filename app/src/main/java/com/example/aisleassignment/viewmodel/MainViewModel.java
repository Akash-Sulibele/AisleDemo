package com.example.aisleassignment.viewmodel;

import androidx.lifecycle.ViewModel;

import com.example.aisleassignment.ApiCallbacks;
import com.example.aisleassignment.models.PhoneNumberRequestModel;
import com.example.aisleassignment.service.Service;

public class MainViewModel extends ViewModel {
    public String countryCode = "";
    public String phoneNumber = "";
    private Service service = new Service();
    public PhoneNumberRequestModel requestModel = new PhoneNumberRequestModel();

    public void getOtp(ApiCallbacks callbacks) {
        requestModel.setNumber("+919876543212");
        service.getOtp(requestModel,callbacks);
    }
}
