package com.example.aisleassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aisleassignment.models.info.NotesInfoModel;
import com.example.aisleassignment.viewmodel.NotesViewModel;
import com.squareup.picasso.Picasso;


public class NotesActivity extends AppCompatActivity implements ApiCallbacks {

    private NotesViewModel viewModel;
    private ViewModelProvider.Factory factory = new ViewModelProvider.NewInstanceFactory();
    private ApiCallbacks callbacks = this;
    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private TextView image1Name;
    private TextView image2Name;
    private TextView image3Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        viewModel = new ViewModelProvider(this,factory).get(NotesViewModel.class);
        Bundle extras = getIntent().getExtras();
        viewModel.authToken = extras.getString("authToken");
        image1 = (ImageView) findViewById(R.id.image1);
        image2 = (ImageView) findViewById(R.id.image2);
        image3 = (ImageView) findViewById(R.id.image3);
        image1Name = (TextView) findViewById(R.id.image1_name_age);
        image2Name = (TextView) findViewById(R.id.image2_name);
        image3Name = (TextView) findViewById(R.id.image3_name);
    }

    @Override
    protected void onResume() {
        super.onResume();
        viewModel.getNotes(callbacks);
    }

    @Override
    public void didGetOtpSucceed(boolean isSuccess) {

    }

    @Override
    public void didVerifyOtp(boolean isSuccess, String authToken) {

    }

    @Override
    public void didGetNotes(boolean isSuccess, NotesInfoModel responseModel) {
        if (isSuccess) {
            Toast.makeText(this,"Notes Fetched Successfully!",Toast.LENGTH_LONG).show();
            viewModel.model = responseModel;
            fetchPhotos();
        } else {
            Toast.makeText(this,"Notes Fetching Failed.",Toast.LENGTH_LONG).show();
        }
    }

    private void fetchPhotos() {
        String image1Url = viewModel.model.getInvites().getProfiles().get(0).getPhotos().get(0).getPhoto();
        String image2Url = viewModel.model.getLikes().getProfiles().get(0).getAvatar();
        String image3Url = viewModel.model.getLikes().getProfiles().get(1).getAvatar();
        if (image1Url != null) {
            Picasso.get().load(image1Url).fit().into(image1);
            image1Name.setText(viewModel.model.getInvites().getProfiles().get(0).getGeneralInformation().getFirstName());
        }
        if (image2Url != null) {
            Picasso.get().load(image2Url).fit().into(image2);
            image2Name.setText(viewModel.model.getLikes().getProfiles().get(0).getFirstName());
        }
        if (image3Url != null) {
            Picasso.get().load(image3Url).fit().into(image3);
            image3Name.setText(viewModel.model.getLikes().getProfiles().get(1).getFirstName());
        }
    }

}