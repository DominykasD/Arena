package com.example.arena.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.arena.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class OrderStatusActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_status);

        TextView date = findViewById(R.id.textView37);
        ImageView closeButton = findViewById(R.id.imageView4);
        TextView sectorNumber = findViewById(R.id.textView41);
        TextView rowNumber = findViewById(R.id.textView42);
        TextView seatNumber = findViewById(R.id.textView43);

        Date date1 = Calendar.getInstance().getTime();
        @SuppressLint("SimpleDateFormat") SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(date1);
        date.setText(formattedDate);

        sectorNumber.setText(getSectorNumber());
        rowNumber.setText(getRowNumber());
        seatNumber.setText(getSeatNumber());


        closeButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainMenuActivity.class);
            startActivity(intent);
        });

    }

    @Override
    public void updateTotalPrice() {

    }
}