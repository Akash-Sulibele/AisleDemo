package com.example.aisleassignment;

import com.example.aisleassignment.models.info.NotesInfoModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Service {
    public static final String BASE_URL = "https://testa2.aisle.co/V1/users/";
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private ApiEndpoints service = retrofit.create(ApiEndpoints.class);

    public void getOtp(PhoneNumberRequestModel requestModel, ApiCallbacks callbacks) {
        Call<PhoneNumberRequestModel> call = service.getOtp(requestModel);
        call.enqueue(new Callback<PhoneNumberRequestModel>() {
            @Override
            public void onResponse(Call<PhoneNumberRequestModel> call, Response<PhoneNumberRequestModel> response) {
                if (response.isSuccessful()) {
                   callbacks.didGetOtpSucceed(true);
                }
            }

            @Override
            public void onFailure(Call<PhoneNumberRequestModel> call, Throwable t) {
                callbacks.didGetOtpSucceed(false);
            }
        });
    }

    public void verifyOtp(VerifyOtpRequestModel requestModel, ApiCallbacks callbacks) {
        Call<VerifyOtpResponseModel> call = service.getOtp(requestModel);
        call.enqueue(new Callback<VerifyOtpResponseModel>() {
            @Override
            public void onResponse(Call<VerifyOtpResponseModel> call, Response<VerifyOtpResponseModel> response) {
                if (response.isSuccessful()) {
                    callbacks.didVerifyOtp(true,response.body().getAuthToken());
                }
            }

            @Override
            public void onFailure(Call<VerifyOtpResponseModel> call, Throwable t) {
                callbacks.didVerifyOtp(false,"");
            }
        });
    }

    public void getNotes(String authToken, ApiCallbacks callbacks) {
        Call<NotesInfoModel> call = service.getNotes(authToken);
        call.enqueue(new Callback<NotesInfoModel>() {
            @Override
            public void onResponse(Call<NotesInfoModel> call, Response<NotesInfoModel> response) {
                if (response.isSuccessful()) {
                    callbacks.didGetNotes(true,response.body());
                }
            }

            @Override
            public void onFailure(Call<NotesInfoModel> call, Throwable t) {
                callbacks.didGetNotes(false,new NotesInfoModel());
            }
        });
    }
}
