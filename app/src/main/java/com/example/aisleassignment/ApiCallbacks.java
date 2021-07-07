package com.example.aisleassignment;

import com.example.aisleassignment.models.info.NotesInfoModel;

public interface ApiCallbacks {
    void didGetOtpSucceed(boolean isSuccess);
    void didVerifyOtp(boolean isSuccess,String authToken);
    void didGetNotes(boolean isSuccess, NotesInfoModel responseModel);
}
