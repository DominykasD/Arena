package com.example.arena.activities;

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

public class CheckoutCardActivity extends BaseActivity {

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ckeckout_add_card_info);

        TextView sum = findViewById(R.id.textView38);
        TextView date = findViewById(R.id.textView37);
        ImageView backButton = findViewById(R.id.imageView5);
        ImageView closeButton = findViewById(R.id.imageView4);
        Button butCardC = findViewById(R.id.button3);
        Button butCardD = findViewById(R.id.button4);
        Button butPayPal = findViewById(R.id.button5);
        Button button = findViewById(R.id.button);
        Button addCard = findViewById(R.id.button6);

        backButton.setOnClickListener(v -> finish());
        closeButton.setOnClickListener(v -> openCheckoutActivity());

        butCardC.setSelected(true);

        butCardC.setOnClickListener(v -> {
            if(butCardC.isSelected()) {
//                butCardC.setSelected(false);
            }
            else {
                butCardC.setSelected(true);

                butCardD.setSelected(false);
                butPayPal.setSelected(false);
            }
        });

        butCardD.setOnClickListener(v -> {
            if(butCardD.isSelected()) {
//                butCardD.setSelected(false);
            }
            else {
                butCardD.setSelected(true);

                butCardC.setSelected(false);
                butPayPal.setSelected(false);
            }
        });

        butPayPal.setOnClickListener(v -> {
            if(butPayPal.isSelected()) {
//                butPayPal.setSelected(false);
            }
            else {
                butPayPal.setSelected(true);

                butCardC.setSelected(false);
                butCardD.setSelected(false);
            }
        });

        addCard.setOnClickListener(v -> {
            Intent intent = new Intent(this, AddCardInfoActivity.class);
            startActivity(intent);
        });

        button.setOnClickListener(v -> openCheckoutConfirmActivity());

        Double pricePVM = getPriceWithoutPVM() * 0.21;
        Double priceTotalWithPVM = pricePVM + getPriceWithoutPVM();
        sum.setText(String.format("%.2f", priceTotalWithPVM));

        Date date1 = Calendar.getInstance().getTime();
        @SuppressLint("SimpleDateFormat") SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(date1);
        date.setText(formattedDate);

    }

    private void openCheckoutConfirmActivity() {
        Intent intent = new Intent(this, CheckoutConfirmActivity.class);
        startActivity(intent);
    }

    private void openCheckoutActivity() {
        Intent intent = new Intent(this, CheckoutActivity.class);
        startActivity(intent);
    }

    @Override
    public void updateTotalPrice() {

    }
}