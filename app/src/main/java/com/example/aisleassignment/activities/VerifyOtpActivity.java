package com.example.aisleassignment.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aisleassignment.ApiCallbacks;
import com.example.aisleassignment.R;
import com.example.aisleassignment.models.info.NotesInfoModel;
import com.example.aisleassignment.viewmodel.VerifyOtpViewModel;

public class VerifyOtpActivity extends AppCompatActivity implements ApiCallbacks {

    private TextView timerTv;
    private TextView phoneTv;
    private ImageView editBtn;
    private Button continueBtn;
    private VerifyOtpViewModel viewModel;
    ViewModelProvider.Factory factory = new ViewModelProvider.NewInstanceFactory();
    private ApiCallbacks callbacks = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_otp);
        Bundle bundle = getIntent().getExtras();
        String phone = bundle.getString("phone");
        phoneTv = (TextView) findViewById(R.id.phone_tv);
        editBtn = (ImageView) findViewById(R.id.edit_btn);
        continueBtn = (Button) findViewById(R.id.continue_btn);
        viewModel = new ViewModelProvider(this,factory).get(VerifyOtpViewModel.class);
        phoneTv.setText(phone);
        setupTimer();
        setupListener();
    }

    private void setupListener() {
        Context ctx = this;
        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ctx,MainActivity.class);
                ctx.startActivity(intent);
            }
        });

        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.verifyOtp(callbacks);
            }
        });
    }

    private void setupTimer() {
        final int[] time = {59};
        TextView textTimer = (TextView)findViewById(R.id.timer);

        new CountDownTimer(59000, 1000) {

            public void onTick(long millisUntilFinished) {
                textTimer.setText("00:"+checkDigit(time[0]));
                time[0]--;
            }

            public void onFinish() {
                time[0] = 59;
                start();
            }

        }.start();
    }



    public String checkDigit(int number) {
        return number <= 9 ? "0" + number : String.valueOf(number);
    }

    @Override
    public void didGetOtpSucceed(boolean isSuccess) {

    }

    @Override
    public void didVerifyOtp(boolean isSuccess, String authToken) {
        if (isSuccess) {
            Toast.makeText(this,"Otp verified Successfully!",Toast.LENGTH_LONG).show();
            viewModel.verifyOtpResponseModel.setAuthToken(authToken);
            Intent intent = new Intent(this,NotesActivity.class);
            intent.putExtra("authToken",viewModel.verifyOtpResponseModel.getAuthToken());
            this.startActivity(intent);
        } else {
            Toast.makeText(this,"Otp verification Failed.",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void didGetNotes(boolean isSuccess, NotesInfoModel responseModel) {

    }
}