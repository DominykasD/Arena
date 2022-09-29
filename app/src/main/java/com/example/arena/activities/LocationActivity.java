package com.example.arena.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.arena.R;
import com.google.gson.Gson;

public class LocationActivity extends BaseActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        ImageView sector101 = findViewById(R.id.imageView8);
        ImageView sector103 = findViewById(R.id.imageView10);
        ImageView closeButton = findViewById(R.id.imageView6);
        TextView sectorNumber = findViewById(R.id.textView26);

        sectorNumber.setText(getSectorNumber());

        sector101.setOnClickListener(v -> {
            sector101.setImageResource(R.drawable.sector101_red);
            sector103.setImageResource(R.drawable.sector103);
            sectorNumber.setText("101");

            localStorage.setSector("101");

        });

        sector103.setOnClickListener(v -> {
            sector103.setImageResource(R.drawable.sector103_red);
            sector101.setImageResource(R.drawable.sector101);
            sectorNumber.setText("103");

            localStorage.setSector("103");
        });

        closeButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, CheckoutPersonalActivity.class);
            startActivity(intent);
        });
    }

    @Override
    public void updateTotalPrice() {

    }
}