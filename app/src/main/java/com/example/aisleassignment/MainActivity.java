package com.example.aisleassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.aisleassignment.models.info.NotesInfoModel;
import com.example.aisleassignment.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity implements ApiCallbacks {

    private EditText countryCodeEt = null;
    private EditText phoneEt = null;
    private Button continueBtn = null;
    private MainViewModel viewModel = null;
    ViewModelProvider.Factory factory = new ViewModelProvider.NewInstanceFactory();
    private ApiCallbacks callbacks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = new ViewModelProvider(this,factory).get(MainViewModel.class);
        callbacks = this;
        setupUI();
    }

    private void setupUI() {
        countryCodeEt = findViewById(R.id.country_code_tv);
        continueBtn = findViewById(R.id.continue_btn);
        phoneEt = findViewById(R.id.phone_tv);
        setupListeners();
    }

    private void setupListeners() {
        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.getOtp(callbacks);
            }
        });

        countryCodeEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                viewModel.countryCode = editable.toString();
            }
        });

        phoneEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                viewModel.phoneNumber = editable.toString();
            }
        });
    }


    @Override
    public void didGetOtpSucceed(boolean isSuccess) {
        if (isSuccess) {
            Toast.makeText(this,"Otp sent Successfully!",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this,VerifyOtpActivity.class);
            intent.putExtra("phone",viewModel.requestModel.getNumber());
            this.startActivity(intent);
        } else {
            Toast.makeText(this,"Otp Sending Failed.",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void didVerifyOtp(boolean isSuccess, String authToken) {

    }

    @Override
    public void didGetNotes(boolean isSuccess, NotesInfoModel responseModel) {

    }
}
