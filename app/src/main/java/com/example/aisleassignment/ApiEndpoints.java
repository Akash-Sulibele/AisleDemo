package com.example.aisleassignment;

import com.example.aisleassignment.models.info.NotesInfoModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiEndpoints {

    @Headers({"Content-Type: application/json", "Cookie: __cfduid=df9b865983bd04a5de2cf5017994bbbc71618565720"})
    @POST("phone_number_login")
    Call<PhoneNumberRequestModel> getOtp(@Body PhoneNumberRequestModel requestModel);

    @Headers({"Content-Type: application/json", "Cookie: __cfduid=df9b865983bd04a5de2cf5017994bbbc71618565720"})
    @POST("verify_otp")
    Call<VerifyOtpResponseModel> getOtp(@Body VerifyOtpRequestModel requestModel);

    @Headers({"Cookie: __cfduid=df9b865983bd04a5de2cf5017994bbbc71618565720"})
    @GET("test_profile_list")
    Call<NotesInfoModel> getNotes(@Header("Authorization") String authToken);
}
