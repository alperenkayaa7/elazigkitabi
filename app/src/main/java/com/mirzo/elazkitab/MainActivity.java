package com.mirzo.elazkitab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.mirzo.elazkitab.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    ArrayList<Detaylar> detaylarArrayList;
    private ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        detaylarArrayList = new ArrayList<>();

        //DATA
        Detaylar harput =new Detaylar("ELAZIĞ","HARPUT",R.drawable.harput);
        Detaylar keban= new Detaylar("ELAZIĞ","KEBAN",R.drawable.keban);
        Detaylar sivrice= new Detaylar("ELAZIĞ","SİVRİCE", R.drawable.sivrice);
        Detaylar candikan= new Detaylar("ELAZIĞ","ÇANDİKAN",R.drawable.candikan);
        detaylarArrayList.add(harput);
        detaylarArrayList.add(keban);
        detaylarArrayList.add(sivrice);
        detaylarArrayList.add(candikan);

        binding.recylerView.setLayoutManager(new LinearLayoutManager(this));
        DetaylarAdapter detaylarAdapter = new DetaylarAdapter(detaylarArrayList);
        binding.recylerView.setAdapter(detaylarAdapter);




    }
}