package com.example.aisleassignment.viewmodel;

import androidx.lifecycle.ViewModel;

import com.example.aisleassignment.ApiCallbacks;
import com.example.aisleassignment.service.Service;
import com.example.aisleassignment.models.info.NotesInfoModel;

public class NotesViewModel extends ViewModel {
    private Service service = new Service();
    public String authToken = "";
    public NotesInfoModel model;

    public void getNotes(ApiCallbacks callbacks) {
        service.getNotes(authToken,callbacks);
    }
}
