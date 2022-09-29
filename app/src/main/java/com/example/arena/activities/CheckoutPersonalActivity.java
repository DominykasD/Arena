package com.example.arena.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.arena.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CheckoutPersonalActivity extends BaseActivity {

    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ckeckout_personal_info);

        TextView sum = findViewById(R.id.textView38);
        TextView date = findViewById(R.id.textView37);
        TextView changeLocation = findViewById(R.id.textView40);
        TextView sectorNumber = findViewById(R.id.textView41);
        TextView rowNumber = findViewById(R.id.textView42);
        TextView seatNumber = findViewById(R.id.textView43);
        ImageView backButton = findViewById(R.id.imageView5);
        ImageView closeButton = findViewById(R.id.imageView4);
        Button button = findViewById(R.id.button);

        sectorNumber.setText(getSectorNumber());
        rowNumber.setText(getRowNumber());
        seatNumber.setText(getSeatNumber());

        backButton.setOnClickListener(v -> finish());
        closeButton.setOnClickListener(v -> finish());
        button.setOnClickListener(v -> openCheckoutCardActivity());
        changeLocation.setOnClickListener(v -> openLocationActivity());

        Double pricePVM = getPriceWithoutPVM() * 0.21;
        Double priceTotalWithPVM = pricePVM + getPriceWithoutPVM();
        sum.setText(String.format("%.2f", priceTotalWithPVM));

        Date date1 = Calendar.getInstance().getTime();
        @SuppressLint("SimpleDateFormat") SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(date1);
        date.setText(formattedDate);
    }

    private void openLocationActivity() {
        Intent intent = new Intent(this, LocationActivity.class);
        startActivity(intent);
    }

    private void openCheckoutCardActivity() {
        Intent intent = new Intent(this, CheckoutCardActivity.class);
        startActivity(intent);
    }

    @Override
    public void updateTotalPrice() {

    }
}