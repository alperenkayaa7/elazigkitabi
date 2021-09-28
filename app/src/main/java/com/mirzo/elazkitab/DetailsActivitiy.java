package com.mirzo.elazkitab;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;

import com.mirzo.elazkitab.databinding.ActivityDetailsActivitiyBinding;

import java.util.ArrayList;

public class DetailsActivitiy extends AppCompatActivity {
    private ActivityDetailsActivitiyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsActivitiyBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Detaylar selectedLandmark = (Detaylar) getIntent().getSerializableExtra("landmark");

        binding.il.setText(selectedLandmark.getIl());
        binding.ilce.setText(selectedLandmark.getIlce());
        binding.imageView.setImageResource(selectedLandmark.getImage());


        /*

        Bundle extras = getIntent().getExtras() ;
        extras.getParcelableArrayList("detaylar");
        ArrayList<Parcelable> detay =  extras.getParcelableArrayList("detaylar");

         */




    }
}