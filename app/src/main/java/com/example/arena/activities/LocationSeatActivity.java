package com.example.arena.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.arena.R;

public class LocationSeatActivity extends BaseActivity {

    private ImageView e1v1;
    private ImageView e1v2;
    private ImageView e1v3;
    private ImageView e1v4;
    private ImageView e1v5;
    private ImageView e1v6;
    private ImageView e1v7;
    private ImageView e1v8;
    private ImageView e2v1;
    private ImageView e2v2;
    private ImageView e2v3;
    private ImageView e2v4;
    private ImageView e2v5;
    private ImageView e2v6;
    private ImageView e2v7;
    private ImageView e2v8;
    private ImageView e3v1;
    private ImageView e3v2;
    private ImageView e3v3;
    private ImageView e3v4;
    private ImageView e3v5;
    private ImageView e3v6;
    private ImageView e3v7;
    private ImageView e3v8;
    private ImageView e4v1;
    private ImageView e4v2;
    private ImageView e4v3;
    private ImageView e4v4;
    private ImageView e4v5;
    private ImageView e4v6;
    private ImageView e4v7;
    private ImageView e4v8;
    private ImageView e5v1;
    private ImageView e5v2;
    private ImageView e5v3;
    private ImageView e5v4;
    private ImageView e5v5;
    private ImageView e5v6;
    private ImageView e5v7;
    private ImageView e5v8;
    private ImageView e5v9;
    private ImageView e6v1;
    private ImageView e6v2;
    private ImageView e6v3;
    private ImageView e6v4;
    private ImageView e6v5;
    private ImageView e6v6;
    private ImageView e6v7;
    private ImageView e6v8;
    private ImageView e6v9;
    private ImageView e7v1;
    private ImageView e7v2;
    private ImageView e7v3;
    private ImageView e7v4;
    private ImageView e7v5;
    private ImageView e7v6;
    private ImageView e7v7;
    private ImageView e7v8;
    private ImageView e7v9;
    private ImageView e8v1;
    private ImageView e8v2;
    private ImageView e8v3;
    private ImageView e8v4;
    private ImageView e8v5;
    private ImageView e8v6;
    private ImageView e8v7;
    private ImageView e8v8;
    private ImageView e8v9;
    private ImageView e9v1;
    private ImageView e9v2;
    private ImageView e9v3;
    private ImageView e9v4;
    private ImageView e9v5;
    private ImageView e9v6;
    private ImageView e9v7;
    private ImageView e9v8;
    private ImageView e9v9;
    private ImageView e9v10;
    private ImageView e10v1;
    private ImageView e10v2;
    private ImageView e10v3;
    private ImageView e10v4;
    private ImageView e10v5;
    private ImageView e10v6;
    private ImageView e10v7;
    private ImageView e10v8;
    private ImageView e10v9;
    private ImageView e10v10;
    private ImageView e11v1;
    private ImageView e11v2;
    private ImageView e11v3;
    private ImageView e11v4;
    private ImageView e11v5;
    private ImageView e11v6;
    private ImageView e11v7;
    private ImageView e11v8;
    private ImageView e11v9;
    private ImageView e11v10;
    private ImageView e12v1;
    private ImageView e12v2;
    private ImageView e12v3;
    private ImageView e12v4;
    private ImageView e12v5;
    private ImageView e12v6;
    private ImageView e12v7;
    private ImageView e12v8;
    private ImageView e12v9;
    private ImageView e12v10;
    private ImageView e13v1;
    private ImageView e13v2;
    private ImageView e13v3;
    private ImageView e13v4;
    private ImageView e13v5;
    private ImageView e13v6;
    private ImageView e13v7;
    private ImageView e13v8;
    private ImageView e13v9;
    private ImageView e13v10;
    private ImageView e13v11;
    private ImageView e14v1;
    private ImageView e14v2;
    private ImageView e14v3;
    private ImageView e14v4;
    private ImageView e14v5;
    private ImageView e14v6;
    private ImageView e14v7;
    private ImageView e14v8;
    private ImageView e14v9;
    private ImageView e14v10;
    private ImageView e14v11;
    private TextView rowNumber;
    private TextView seatNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_seat);

        TextView sectorNumber = findViewById(R.id.textView62);
        rowNumber = findViewById(R.id.textView71);
        seatNumber = findViewById(R.id.textView72);
        e14v1 = findViewById(R.id.imageView_14_1);
        e14v2 = findViewById(R.id.imageView_14_2);
        e14v3 = findViewById(R.id.imageView_14_3);
        e14v4 = findViewById(R.id.imageView_14_4);
        e14v5 = findViewById(R.id.imageView_14_5);
        e14v6 = findViewById(R.id.imageView_14_6);
        e14v7 = findViewById(R.id.imageView_14_7);
        e14v8 = findViewById(R.id.imageView_14_8);
        e14v9 = findViewById(R.id.imageView_14_9);
        e14v10 = findViewById(R.id.imageView_14_10);
        e14v11 = findViewById(R.id.imageView_14_11);
        e13v1 = findViewById(R.id.imageView_13_1);
        e13v2 = findViewById(R.id.imageView_13_2);
        e13v3 = findViewById(R.id.imageView_13_3);
        e13v4 = findViewById(R.id.imageView_13_4);
        e13v5 = findViewById(R.id.imageView_13_5);
        e13v6 = findViewById(R.id.imageView_13_6);
        e13v7 = findViewById(R.id.imageView_13_7);
        e13v8 = findViewById(R.id.imageView_13_8);
        e13v9 = findViewById(R.id.imageView_13_9);
        e13v10 = findViewById(R.id.imageView_13_10);
        e13v11 = findViewById(R.id.imageView_13_11);
        e12v1 = findViewById(R.id.imageView_12_1);
        e12v2 = findViewById(R.id.imageView_12_2);
        e12v3 = findViewById(R.id.imageView_12_3);
        e12v4 = findViewById(R.id.imageView_12_4);
        e12v5 = findViewById(R.id.imageView_12_5);
        e12v6 = findViewById(R.id.imageView_12_6);
        e12v7 = findViewById(R.id.imageView_12_7);
        e12v8 = findViewById(R.id.imageView_12_8);
        e12v9 = findViewById(R.id.imageView_12_9);
        e12v10 = findViewById(R.id.imageView_12_10);
        e11v1 = findViewById(R.id.imageView_11_1);
        e11v2 = findViewById(R.id.imageView_11_2);
        e11v3 = findViewById(R.id.imageView_11_3);
        e11v4 = findViewById(R.id.imageView_11_4);
        e11v5 = findViewById(R.id.imageView_11_5);
        e11v6 = findViewById(R.id.imageView_11_6);
        e11v7 = findViewById(R.id.imageView_11_7);
        e11v8 = findViewById(R.id.imageView_11_8);
        e11v9 = findViewById(R.id.imageView_11_9);
        e11v10 = findViewById(R.id.imageView_11_10);
        e10v1 = findViewById(R.id.imageView_10_1);
        e10v2 = findViewById(R.id.imageView_10_2);
        e10v3 = findViewById(R.id.imageView_10_3);
        e10v4 = findViewById(R.id.imageView_10_4);
        e10v5 = findViewById(R.id.imageView_10_5);
        e10v6 = findViewById(R.id.imageView_10_6);
        e10v7 = findViewById(R.id.imageView_10_7);
        e10v8 = findViewById(R.id.imageView_10_8);
        e10v9 = findViewById(R.id.imageView_10_9);
        e10v10 = findViewById(R.id.imageView_10_10);
        e9v1 = findViewById(R.id.imageView_9_1);
        e9v2 = findViewById(R.id.imageView_9_2);
        e9v3 = findViewById(R.id.imageView_9_3);
        e9v4 = findViewById(R.id.imageView_9_4);
        e9v5 = findViewById(R.id.imageView_9_5);
        e9v6 = findViewById(R.id.imageView_9_6);
        e9v7 = findViewById(R.id.imageView_9_7);
        e9v8 = findViewById(R.id.imageView_9_8);
        e9v9 = findViewById(R.id.imageView_9_9);
        e9v10 = findViewById(R.id.imageView_9_10);
        e8v1 = findViewById(R.id.imageView_8_1);
        e8v2 = findViewById(R.id.imageView_8_2);
        e8v3 = findViewById(R.id.imageView_8_3);
        e8v4 = findViewById(R.id.imageView_8_4);
        e8v5 = findViewById(R.id.imageView_8_5);
        e8v6 = findViewById(R.id.imageView_8_6);
        e8v7 = findViewById(R.id.imageView_8_7);
        e8v8 = findViewById(R.id.imageView_8_8);
        e8v9 = findViewById(R.id.imageView_8_9);
        e7v1 = findViewById(R.id.imageView_7_1);
        e7v2 = findViewById(R.id.imageView_7_2);
        e7v3 = findViewById(R.id.imageView_7_3);
        e7v4 = findViewById(R.id.imageView_7_4);
        e7v5 = findViewById(R.id.imageView_7_5);
        e7v6 = findViewById(R.id.imageView_7_6);
        e7v7 = findViewById(R.id.imageView_7_7);
        e7v8 = findViewById(R.id.imageView_7_8);
        e7v9 = findViewById(R.id.imageView_7_9);
        e6v1 = findViewById(R.id.imageView_6_1);
        e6v2 = findViewById(R.id.imageView_6_2);
        e6v3 = findViewById(R.id.imageView_6_3);
        e6v4 = findViewById(R.id.imageView_6_4);
        e6v5 = findViewById(R.id.imageView_6_5);
        e6v6 = findViewById(R.id.imageView_6_6);
        e6v7 = findViewById(R.id.imageView_6_7);
        e6v8 = findViewById(R.id.imageView_6_8);
        e6v9 = findViewById(R.id.imageView_6_9);
        e5v1 = findViewById(R.id.imageView_5_1);
        e5v2 = findViewById(R.id.imageView_5_2);
        e5v3 = findViewById(R.id.imageView_5_3);
        e5v4 = findViewById(R.id.imageView_5_4);
        e5v5 = findViewById(R.id.imageView_5_5);
        e5v6 = findViewById(R.id.imageView_5_6);
        e5v7 = findViewById(R.id.imageView_5_7);
        e5v8 = findViewById(R.id.imageView_5_8);
        e5v9 = findViewById(R.id.imageView_5_9);
        e4v1 = findViewById(R.id.imageView_4_1);
        e4v2 = findViewById(R.id.imageView_4_2);
        e4v3 = findViewById(R.id.imageView_4_3);
        e4v4 = findViewById(R.id.imageView_4_4);
        e4v5 = findViewById(R.id.imageView_4_5);
        e4v6 = findViewById(R.id.imageView_4_6);
        e4v7 = findViewById(R.id.imageView_4_7);
        e4v8 = findViewById(R.id.imageView_4_8);
        e3v1 = findViewById(R.id.imageView_3_1);
        e3v2 = findViewById(R.id.imageView_3_2);
        e3v3 = findViewById(R.id.imageView_3_3);
        e3v4 = findViewById(R.id.imageView_3_4);
        e3v5 = findViewById(R.id.imageView_3_5);
        e3v6 = findViewById(R.id.imageView_3_6);
        e3v7 = findViewById(R.id.imageView_3_7);
        e3v8 = findViewById(R.id.imageView_3_8);
        e2v1 = findViewById(R.id.imageView_2_1);
        e2v2 = findViewById(R.id.imageView_2_2);
        e2v3 = findViewById(R.id.imageView_2_3);
        e2v4 = findViewById(R.id.imageView_2_4);
        e2v5 = findViewById(R.id.imageView_2_5);
        e2v6 = findViewById(R.id.imageView_2_6);
        e2v7 = findViewById(R.id.imageView_2_7);
        e2v8 = findViewById(R.id.imageView_2_8);
        e1v1 = findViewById(R.id.imageView_1_1);
        e1v2 = findViewById(R.id.imageView_1_2);
        e1v3 = findViewById(R.id.imageView_1_3);
        e1v4 = findViewById(R.id.imageView_1_4);
        e1v5 = findViewById(R.id.imageView_1_5);
        e1v6 = findViewById(R.id.imageView_1_6);
        e1v7 = findViewById(R.id.imageView_1_7);
        e1v8 = findViewById(R.id.imageView_1_8);







        Button button = findViewById(R.id.button);
        ImageView goBack = findViewById(R.id.imageView6);

        sectorNumber.setText(getSectorNumber());
        rowNumber.setText(getRowNumber());
        seatNumber.setText(getSeatNumber());
        localStorage.setSeatImage(R.drawable.taskas_raudonas);

        SeatImageColor();

        seatClickListener();

        button.setOnClickListener(v -> {
            Intent intent = new Intent(this, CheckoutPersonalActivity.class);
            startActivity(intent);
        });
        goBack.setOnClickListener(v -> {
            Intent intent = new Intent(this, LocationActivity.class);
            startActivity(intent);
        });


    }

    private void SeatImageColor() {
        if (getRowNumber().equals("1") && getSeatNumber().equals("1")) e1v1.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("1") && getSeatNumber().equals("2")) e1v2.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("1") && getSeatNumber().equals("3")) e1v3.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("1") && getSeatNumber().equals("4")) e1v4.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("1") && getSeatNumber().equals("5")) e1v5.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("1") && getSeatNumber().equals("6")) e1v6.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("1") && getSeatNumber().equals("7")) e1v7.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("1") && getSeatNumber().equals("8")) e1v8.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("2") && getSeatNumber().equals("1")) e2v1.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("2") && getSeatNumber().equals("2")) e2v2.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("2") && getSeatNumber().equals("3")) e2v3.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("2") && getSeatNumber().equals("4")) e2v4.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("2") && getSeatNumber().equals("5")) e2v5.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("2") && getSeatNumber().equals("6")) e2v6.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("2") && getSeatNumber().equals("7")) e2v7.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("2") && getSeatNumber().equals("8")) e2v8.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("3") && getSeatNumber().equals("1")) e3v1.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("3") && getSeatNumber().equals("2")) e3v2.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("3") && getSeatNumber().equals("3")) e3v3.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("3") && getSeatNumber().equals("4")) e3v4.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("3") && getSeatNumber().equals("5")) e3v5.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("3") && getSeatNumber().equals("6")) e3v6.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("3") && getSeatNumber().equals("7")) e3v7.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("3") && getSeatNumber().equals("8")) e3v8.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("4") && getSeatNumber().equals("1")) e4v1.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("4") && getSeatNumber().equals("2")) e4v2.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("4") && getSeatNumber().equals("3")) e4v3.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("4") && getSeatNumber().equals("4")) e4v4.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("4") && getSeatNumber().equals("5")) e4v5.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("4") && getSeatNumber().equals("6")) e4v6.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("4") && getSeatNumber().equals("7")) e4v7.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("4") && getSeatNumber().equals("8")) e4v8.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("5") && getSeatNumber().equals("1")) e5v1.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("5") && getSeatNumber().equals("2")) e5v2.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("5") && getSeatNumber().equals("3")) e5v3.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("5") && getSeatNumber().equals("4")) e5v4.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("5") && getSeatNumber().equals("5")) e5v5.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("5") && getSeatNumber().equals("6")) e5v6.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("5") && getSeatNumber().equals("7")) e5v7.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("5") && getSeatNumber().equals("8")) e5v8.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("5") && getSeatNumber().equals("9")) e5v9.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("6") && getSeatNumber().equals("1")) e6v1.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("6") && getSeatNumber().equals("2")) e6v2.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("6") && getSeatNumber().equals("3")) e6v3.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("6") && getSeatNumber().equals("4")) e6v4.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("6") && getSeatNumber().equals("5")) e6v5.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("6") && getSeatNumber().equals("6")) e6v6.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("6") && getSeatNumber().equals("7")) e6v7.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("6") && getSeatNumber().equals("8")) e6v8.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("6") && getSeatNumber().equals("9")) e6v9.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("7") && getSeatNumber().equals("1")) e7v1.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("7") && getSeatNumber().equals("2")) e7v2.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("7") && getSeatNumber().equals("3")) e7v3.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("7") && getSeatNumber().equals("4")) e7v4.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("7") && getSeatNumber().equals("5")) e7v5.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("7") && getSeatNumber().equals("6")) e7v6.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("7") && getSeatNumber().equals("7")) e7v7.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("7") && getSeatNumber().equals("8")) e7v8.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("7") && getSeatNumber().equals("9")) e7v9.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("8") && getSeatNumber().equals("1")) e8v1.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("8") && getSeatNumber().equals("2")) e8v2.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("8") && getSeatNumber().equals("3")) e8v3.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("8") && getSeatNumber().equals("4")) e8v4.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("8") && getSeatNumber().equals("5")) e8v5.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("8") && getSeatNumber().equals("6")) e8v6.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("8") && getSeatNumber().equals("7")) e8v7.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("8") && getSeatNumber().equals("8")) e8v8.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("8") && getSeatNumber().equals("9")) e8v9.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("9") && getSeatNumber().equals("1")) e9v1.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("9") && getSeatNumber().equals("2")) e9v2.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("9") && getSeatNumber().equals("3")) e9v3.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("9") && getSeatNumber().equals("4")) e9v4.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("9") && getSeatNumber().equals("5")) e9v5.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("9") && getSeatNumber().equals("6")) e9v6.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("9") && getSeatNumber().equals("7")) e9v7.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("9") && getSeatNumber().equals("8")) e9v8.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("9") && getSeatNumber().equals("9")) e9v9.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("9") && getSeatNumber().equals("10")) e9v10.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("10") && getSeatNumber().equals("1")) e10v1.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("10") && getSeatNumber().equals("2")) e10v2.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("10") && getSeatNumber().equals("3")) e10v3.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("10") && getSeatNumber().equals("4")) e10v4.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("10") && getSeatNumber().equals("5")) e10v5.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("10") && getSeatNumber().equals("6")) e10v6.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("10") && getSeatNumber().equals("7")) e10v7.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("10") && getSeatNumber().equals("8")) e10v8.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("10") && getSeatNumber().equals("9")) e10v9.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("10") && getSeatNumber().equals("10")) e10v10.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("11") && getSeatNumber().equals("1")) e11v1.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("11") && getSeatNumber().equals("2")) e11v2.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("11") && getSeatNumber().equals("3")) e11v3.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("11") && getSeatNumber().equals("4")) e11v4.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("11") && getSeatNumber().equals("5")) e11v5.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("11") && getSeatNumber().equals("6")) e11v6.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("11") && getSeatNumber().equals("7")) e11v7.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("11") && getSeatNumber().equals("8")) e11v8.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("11") && getSeatNumber().equals("9")) e11v9.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("11") && getSeatNumber().equals("10")) e11v10.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("12") && getSeatNumber().equals("1")) e12v1.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("12") && getSeatNumber().equals("2")) e12v2.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("12") && getSeatNumber().equals("3")) e12v3.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("12") && getSeatNumber().equals("4")) e12v4.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("12") && getSeatNumber().equals("5")) e12v5.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("12") && getSeatNumber().equals("6")) e12v6.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("12") && getSeatNumber().equals("7")) e12v7.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("12") && getSeatNumber().equals("8")) e12v8.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("12") && getSeatNumber().equals("9")) e12v9.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("12") && getSeatNumber().equals("10")) e12v10.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("13") && getSeatNumber().equals("1")) e13v1.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("13") && getSeatNumber().equals("2")) e13v2.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("13") && getSeatNumber().equals("3")) e13v3.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("13") && getSeatNumber().equals("4")) e13v4.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("13") && getSeatNumber().equals("5")) e13v5.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("13") && getSeatNumber().equals("6")) e13v6.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("13") && getSeatNumber().equals("7")) e13v7.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("13") && getSeatNumber().equals("8")) e13v8.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("13") && getSeatNumber().equals("9")) e13v9.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("13") && getSeatNumber().equals("10")) e13v10.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("13") && getSeatNumber().equals("11")) e13v11.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("14") && getSeatNumber().equals("1")) e14v1.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("14") && getSeatNumber().equals("2")) e14v2.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("14") && getSeatNumber().equals("3")) e14v3.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("14") && getSeatNumber().equals("4")) e14v4.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("14") && getSeatNumber().equals("5")) e14v5.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("14") && getSeatNumber().equals("6")) e14v6.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("14") && getSeatNumber().equals("7")) e14v7.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("14") && getSeatNumber().equals("8")) e14v8.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("14") && getSeatNumber().equals("9")) e14v9.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("14") && getSeatNumber().equals("10")) e14v10.setImageResource(localStorage.getSeatImage());
        if (getRowNumber().equals("14") && getSeatNumber().equals("11")) e14v11.setImageResource(localStorage.getSeatImage());
    }

    @SuppressLint("SetTextI18n")
    private void seatClickListener() {
        e1v1.setOnClickListener(v -> {
            resetImageColor();

            e1v1.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("1");
            seatNumber.setText("1");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e1v2.setOnClickListener(v -> {
            resetImageColor();

            e1v2.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("1");
            seatNumber.setText("2");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e1v3.setOnClickListener(v -> {
            resetImageColor();

            e1v3.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("1");
            seatNumber.setText("3");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e1v4.setOnClickListener(v -> {
            resetImageColor();

            e1v4.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("1");
            seatNumber.setText("4");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e1v5.setOnClickListener(v -> {
            resetImageColor();

            e1v5.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("1");
            seatNumber.setText("5");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e1v6.setOnClickListener(v -> {
            resetImageColor();

            e1v6.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("1");
            seatNumber.setText("6");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e1v7.setOnClickListener(v -> {
            resetImageColor();

            e1v7.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("1");
            seatNumber.setText("7");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e1v8.setOnClickListener(v -> {
            resetImageColor();

            e1v8.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("1");
            seatNumber.setText("8");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e2v1.setOnClickListener(v -> {
            resetImageColor();

            e2v1.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("2");
            seatNumber.setText("1");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e2v2.setOnClickListener(v -> {
            resetImageColor();

            e2v2.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("2");
            seatNumber.setText("2");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e2v3.setOnClickListener(v -> {
            resetImageColor();

            e2v3.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("2");
            seatNumber.setText("3");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e2v4.setOnClickListener(v -> {
            resetImageColor();

            e2v4.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("2");
            seatNumber.setText("4");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e2v5.setOnClickListener(v -> {
            resetImageColor();

            e2v5.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("2");
            seatNumber.setText("5");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e2v6.setOnClickListener(v -> {
            resetImageColor();

            e2v6.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("2");
            seatNumber.setText("6");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e2v7.setOnClickListener(v -> {
            resetImageColor();

            e2v7.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("2");
            seatNumber.setText("7");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e2v8.setOnClickListener(v -> {
            resetImageColor();

            e2v8.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("2");
            seatNumber.setText("8");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e3v1.setOnClickListener(v -> {
            resetImageColor();

            e3v1.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("3");
            seatNumber.setText("1");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e3v2.setOnClickListener(v -> {
            resetImageColor();

            e3v2.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("3");
            seatNumber.setText("2");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e3v3.setOnClickListener(v -> {
            resetImageColor();

            e3v3.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("3");
            seatNumber.setText("3");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e3v4.setOnClickListener(v -> {
            resetImageColor();

            e3v4.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("3");
            seatNumber.setText("4");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e3v5.setOnClickListener(v -> {
            resetImageColor();

            e3v5.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("3");
            seatNumber.setText("5");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e3v6.setOnClickListener(v -> {
            resetImageColor();

            e3v6.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("3");
            seatNumber.setText("6");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e3v7.setOnClickListener(v -> {
            resetImageColor();

            e3v7.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("3");
            seatNumber.setText("7");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e3v8.setOnClickListener(v -> {
            resetImageColor();

            e3v8.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("3");
            seatNumber.setText("8");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e4v1.setOnClickListener(v -> {
            resetImageColor();

            e4v1.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("4");
            seatNumber.setText("1");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e4v2.setOnClickListener(v -> {
            resetImageColor();

            e4v2.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("4");
            seatNumber.setText("2");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e4v3.setOnClickListener(v -> {
            resetImageColor();

            e4v3.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("4");
            seatNumber.setText("3");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e4v4.setOnClickListener(v -> {
            resetImageColor();

            e4v4.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("4");
            seatNumber.setText("4");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e4v5.setOnClickListener(v -> {
            resetImageColor();

            e4v5.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("4");
            seatNumber.setText("5");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e4v6.setOnClickListener(v -> {
            resetImageColor();

            e4v6.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("4");
            seatNumber.setText("6");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e4v7.setOnClickListener(v -> {
            resetImageColor();

            e4v7.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("4");
            seatNumber.setText("7");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e4v8.setOnClickListener(v -> {
            resetImageColor();

            e4v8.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("4");
            seatNumber.setText("8");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e5v1.setOnClickListener(v -> {
            resetImageColor();

            e5v1.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("5");
            seatNumber.setText("1");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e5v2.setOnClickListener(v -> {
            resetImageColor();

            e5v2.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("5");
            seatNumber.setText("2");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e5v2.setOnClickListener(v -> {
            resetImageColor();

            e5v2.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("5");
            seatNumber.setText("2");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e5v3.setOnClickListener(v -> {
            resetImageColor();

            e5v3.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("5");
            seatNumber.setText("3");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e5v4.setOnClickListener(v -> {
            resetImageColor();

            e5v4.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("5");
            seatNumber.setText("4");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e5v5.setOnClickListener(v -> {
            resetImageColor();

            e5v5.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("5");
            seatNumber.setText("5");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e5v6.setOnClickListener(v -> {
            resetImageColor();

            e5v6.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("5");
            seatNumber.setText("6");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e5v7.setOnClickListener(v -> {
            resetImageColor();

            e5v7.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("5");
            seatNumber.setText("7");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e5v8.setOnClickListener(v -> {
            resetImageColor();

            e5v8.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("5");
            seatNumber.setText("8");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e5v9.setOnClickListener(v -> {
            resetImageColor();

            e5v9.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("5");
            seatNumber.setText("9");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e6v1.setOnClickListener(v -> {
            resetImageColor();

            e6v1.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("6");
            seatNumber.setText("1");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e6v2.setOnClickListener(v -> {
            resetImageColor();

            e6v2.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("6");
            seatNumber.setText("2");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e6v3.setOnClickListener(v -> {
            resetImageColor();

            e6v3.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("6");
            seatNumber.setText("3");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e6v4.setOnClickListener(v -> {
            resetImageColor();

            e6v4.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("6");
            seatNumber.setText("4");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e6v5.setOnClickListener(v -> {
            resetImageColor();

            e6v5.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("6");
            seatNumber.setText("5");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e6v6.setOnClickListener(v -> {
            resetImageColor();

            e6v6.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("6");
            seatNumber.setText("6");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e6v7.setOnClickListener(v -> {
            resetImageColor();

            e6v7.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("6");
            seatNumber.setText("7");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e6v8.setOnClickListener(v -> {
            resetImageColor();

            e6v8.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("6");
            seatNumber.setText("8");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e6v9.setOnClickListener(v -> {
            resetImageColor();

            e6v9.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("6");
            seatNumber.setText("9");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e7v1.setOnClickListener(v -> {
            resetImageColor();

            e7v1.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("7");
            seatNumber.setText("1");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e7v2.setOnClickListener(v -> {
            resetImageColor();

            e7v2.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("7");
            seatNumber.setText("2");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e7v3.setOnClickListener(v -> {
            resetImageColor();

            e7v3.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("7");
            seatNumber.setText("3");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e7v4.setOnClickListener(v -> {
            resetImageColor();

            e7v4.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("7");
            seatNumber.setText("4");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e7v5.setOnClickListener(v -> {
            resetImageColor();

            e7v5.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("7");
            seatNumber.setText("5");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e7v6.setOnClickListener(v -> {
            resetImageColor();

            e7v6.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("7");
            seatNumber.setText("6");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e7v7.setOnClickListener(v -> {
            resetImageColor();

            e7v7.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("7");
            seatNumber.setText("7");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e7v8.setOnClickListener(v -> {
            resetImageColor();

            e7v8.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("7");
            seatNumber.setText("8");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e7v9.setOnClickListener(v -> {
            resetImageColor();

            e7v9.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("7");
            seatNumber.setText("9");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e8v1.setOnClickListener(v -> {
            resetImageColor();

            e8v1.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("8");
            seatNumber.setText("1");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e8v2.setOnClickListener(v -> {
            resetImageColor();

            e8v2.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("8");
            seatNumber.setText("2");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e8v3.setOnClickListener(v -> {
            resetImageColor();

            e8v3.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("8");
            seatNumber.setText("3");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e8v4.setOnClickListener(v -> {
            resetImageColor();

            e8v4.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("8");
            seatNumber.setText("4");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e8v5.setOnClickListener(v -> {
            resetImageColor();

            e8v5.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("8");
            seatNumber.setText("5");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e8v6.setOnClickListener(v -> {
            resetImageColor();

            e8v6.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("8");
            seatNumber.setText("6");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e8v7.setOnClickListener(v -> {
            resetImageColor();

            e8v7.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("8");
            seatNumber.setText("7");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e8v8.setOnClickListener(v -> {
            resetImageColor();

            e8v8.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("8");
            seatNumber.setText("8");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e8v9.setOnClickListener(v -> {
            resetImageColor();

            e8v9.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("8");
            seatNumber.setText("9");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e9v1.setOnClickListener(v -> {
            resetImageColor();

            e9v1.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("9");
            seatNumber.setText("1");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e9v2.setOnClickListener(v -> {
            resetImageColor();

            e9v2.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("9");
            seatNumber.setText("2");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e9v3.setOnClickListener(v -> {
            resetImageColor();

            e9v3.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("9");
            seatNumber.setText("3");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e9v4.setOnClickListener(v -> {
            resetImageColor();

            e9v4.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("9");
            seatNumber.setText("4");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e9v5.setOnClickListener(v -> {
            resetImageColor();

            e9v5.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("9");
            seatNumber.setText("5");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e9v6.setOnClickListener(v -> {
            resetImageColor();

            e9v6.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("9");
            seatNumber.setText("6");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e9v7.setOnClickListener(v -> {
            resetImageColor();

            e9v7.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("9");
            seatNumber.setText("7");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e9v8.setOnClickListener(v -> {
            resetImageColor();

            e9v8.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("9");
            seatNumber.setText("8");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e9v9.setOnClickListener(v -> {
            resetImageColor();

            e9v9.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("9");
            seatNumber.setText("9");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e9v10.setOnClickListener(v -> {
            resetImageColor();

            e9v10.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("9");
            seatNumber.setText("10");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e10v1.setOnClickListener(v -> {
            resetImageColor();

            e10v1.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("10");
            seatNumber.setText("1");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e10v2.setOnClickListener(v -> {
            resetImageColor();

            e10v2.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("10");
            seatNumber.setText("2");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e10v3.setOnClickListener(v -> {
            resetImageColor();

            e10v3.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("10");
            seatNumber.setText("3");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e10v4.setOnClickListener(v -> {
            resetImageColor();

            e10v4.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("10");
            seatNumber.setText("4");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e10v5.setOnClickListener(v -> {
            resetImageColor();

            e10v5.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("10");
            seatNumber.setText("5");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e10v6.setOnClickListener(v -> {
            resetImageColor();

            e10v6.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("10");
            seatNumber.setText("6");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e10v7.setOnClickListener(v -> {
            resetImageColor();

            e10v7.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("10");
            seatNumber.setText("7");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e10v8.setOnClickListener(v -> {
            resetImageColor();

            e10v8.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("10");
            seatNumber.setText("8");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e10v9.setOnClickListener(v -> {
            resetImageColor();

            e10v9.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("10");
            seatNumber.setText("9");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e10v10.setOnClickListener(v -> {
            resetImageColor();

            e10v10.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("10");
            seatNumber.setText("10");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e11v1.setOnClickListener(v -> {
            resetImageColor();

            e11v1.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("11");
            seatNumber.setText("1");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e11v2.setOnClickListener(v -> {
            resetImageColor();

            e11v2.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("11");
            seatNumber.setText("2");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e11v3.setOnClickListener(v -> {
            resetImageColor();

            e11v3.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("11");
            seatNumber.setText("3");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e11v4.setOnClickListener(v -> {
            resetImageColor();

            e11v4.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("11");
            seatNumber.setText("4");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e11v5.setOnClickListener(v -> {
            resetImageColor();

            e11v5.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("11");
            seatNumber.setText("5");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e11v6.setOnClickListener(v -> {
            resetImageColor();

            e11v6.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("11");
            seatNumber.setText("6");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e11v7.setOnClickListener(v -> {
            resetImageColor();

            e11v7.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("11");
            seatNumber.setText("7");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e11v8.setOnClickListener(v -> {
            resetImageColor();

            e11v8.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("11");
            seatNumber.setText("8");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e11v9.setOnClickListener(v -> {
            resetImageColor();

            e11v9.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("11");
            seatNumber.setText("9");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e11v10.setOnClickListener(v -> {
            resetImageColor();

            e11v10.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("11");
            seatNumber.setText("10");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e12v1.setOnClickListener(v -> {
            resetImageColor();

            e12v1.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("12");
            seatNumber.setText("1");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });


        e12v2.setOnClickListener(v -> {
            resetImageColor();

            e12v2.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("12");
            seatNumber.setText("2");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });


        e12v3.setOnClickListener(v -> {
            resetImageColor();

            e12v3.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("12");
            seatNumber.setText("3");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });


        e12v4.setOnClickListener(v -> {
            resetImageColor();

            e12v4.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("12");
            seatNumber.setText("4");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });


        e12v5.setOnClickListener(v -> {
            resetImageColor();

            e12v5.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("12");
            seatNumber.setText("5");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });


        e12v6.setOnClickListener(v -> {
            resetImageColor();

            e12v6.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("12");
            seatNumber.setText("6");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });


        e12v7.setOnClickListener(v -> {
            resetImageColor();

            e12v7.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("12");
            seatNumber.setText("7");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });


        e12v8.setOnClickListener(v -> {
            resetImageColor();

            e12v8.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("12");
            seatNumber.setText("8");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });


        e12v9.setOnClickListener(v -> {
            resetImageColor();

            e12v9.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("12");
            seatNumber.setText("9");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });


        e12v10.setOnClickListener(v -> {
            resetImageColor();

            e12v10.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("12");
            seatNumber.setText("10");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });


        e13v1.setOnClickListener(v -> {
            resetImageColor();

            e13v1.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("13");
            seatNumber.setText("1");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e13v2.setOnClickListener(v -> {
            resetImageColor();

            e13v2.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("13");
            seatNumber.setText("2");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e13v3.setOnClickListener(v -> {
            resetImageColor();

            e13v3.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("13");
            seatNumber.setText("3");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e13v4.setOnClickListener(v -> {
            resetImageColor();

            e13v4.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("13");
            seatNumber.setText("4");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e13v5.setOnClickListener(v -> {
            resetImageColor();

            e13v5.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("13");
            seatNumber.setText("5");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e13v6.setOnClickListener(v -> {
            resetImageColor();

            e13v6.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("13");
            seatNumber.setText("6");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e13v7.setOnClickListener(v -> {
            resetImageColor();

            e13v7.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("13");
            seatNumber.setText("7");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e13v8.setOnClickListener(v -> {
            resetImageColor();

            e13v8.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("13");
            seatNumber.setText("8");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e13v9.setOnClickListener(v -> {
            resetImageColor();

            e13v9.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("13");
            seatNumber.setText("9");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e13v10.setOnClickListener(v -> {
            resetImageColor();

            e13v10.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("13");
            seatNumber.setText("10");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e13v11.setOnClickListener(v -> {
            resetImageColor();

            e13v11.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("13");
            seatNumber.setText("11");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e14v1.setOnClickListener(v -> {
            resetImageColor();

            e14v1.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("14");
            seatNumber.setText("1");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e14v2.setOnClickListener(v -> {
            resetImageColor();

            e14v2.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("14");
            seatNumber.setText("2");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e14v3.setOnClickListener(v -> {
            resetImageColor();

            e14v3.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("14");
            seatNumber.setText("3");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e14v4.setOnClickListener(v -> {
            resetImageColor();

            e14v4.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("14");
            seatNumber.setText("4");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e14v5.setOnClickListener(v -> {
            resetImageColor();

            e14v5.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("14");
            seatNumber.setText("5");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e14v6.setOnClickListener(v -> {
            resetImageColor();

            e14v6.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("14");
            seatNumber.setText("6");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e14v7.setOnClickListener(v -> {
            resetImageColor();

            e14v7.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("14");
            seatNumber.setText("7");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e14v8.setOnClickListener(v -> {
            resetImageColor();

            e14v8.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("14");
            seatNumber.setText("8");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e14v9.setOnClickListener(v -> {
            resetImageColor();

            e14v9.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("14");
            seatNumber.setText("9");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e14v10.setOnClickListener(v -> {
            resetImageColor();

            e14v10.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("14");
            seatNumber.setText("10");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });

        e14v11.setOnClickListener(v -> {
            resetImageColor();

            e14v11.setImageResource(R.drawable.taskas_raudonas);

            rowNumber.setText("14");
            seatNumber.setText("11");

            localStorage.setRow(rowNumber.getText().toString());
            localStorage.setSeat(seatNumber.getText().toString());
        });
    }

    private void resetImageColor() {
        e1v1.setImageResource(R.drawable.taskas);
        e1v2.setImageResource(R.drawable.taskas);
        e1v3.setImageResource(R.drawable.taskas);
        e1v4.setImageResource(R.drawable.taskas);
        e1v5.setImageResource(R.drawable.taskas);
        e1v6.setImageResource(R.drawable.taskas);
        e1v7.setImageResource(R.drawable.taskas);
        e1v8.setImageResource(R.drawable.taskas);
        e2v1.setImageResource(R.drawable.taskas);
        e2v2.setImageResource(R.drawable.taskas);
        e2v3.setImageResource(R.drawable.taskas);
        e2v4.setImageResource(R.drawable.taskas);
        e2v5.setImageResource(R.drawable.taskas);
        e2v6.setImageResource(R.drawable.taskas);
        e2v7.setImageResource(R.drawable.taskas);
        e2v8.setImageResource(R.drawable.taskas);
        e3v1.setImageResource(R.drawable.taskas);
        e3v2.setImageResource(R.drawable.taskas);
        e3v3.setImageResource(R.drawable.taskas);
        e3v4.setImageResource(R.drawable.taskas);
        e3v5.setImageResource(R.drawable.taskas);
        e3v6.setImageResource(R.drawable.taskas);
        e3v7.setImageResource(R.drawable.taskas);
        e3v8.setImageResource(R.drawable.taskas);
        e4v1.setImageResource(R.drawable.taskas);
        e4v2.setImageResource(R.drawable.taskas);
        e4v3.setImageResource(R.drawable.taskas);
        e4v4.setImageResource(R.drawable.taskas);
        e4v5.setImageResource(R.drawable.taskas);
        e4v6.setImageResource(R.drawable.taskas);
        e4v7.setImageResource(R.drawable.taskas);
        e4v8.setImageResource(R.drawable.taskas);
        e5v1.setImageResource(R.drawable.taskas);
        e5v2.setImageResource(R.drawable.taskas);
        e5v3.setImageResource(R.drawable.taskas);
        e5v4.setImageResource(R.drawable.taskas);
        e5v5.setImageResource(R.drawable.taskas);
        e5v6.setImageResource(R.drawable.taskas);
        e5v7.setImageResource(R.drawable.taskas);
        e5v8.setImageResource(R.drawable.taskas);
        e5v9.setImageResource(R.drawable.taskas);
        e6v1.setImageResource(R.drawable.taskas);
        e6v2.setImageResource(R.drawable.taskas);
        e6v3.setImageResource(R.drawable.taskas);
        e6v4.setImageResource(R.drawable.taskas);
        e6v5.setImageResource(R.drawable.taskas);
        e6v6.setImageResource(R.drawable.taskas);
        e6v7.setImageResource(R.drawable.taskas);
        e6v8.setImageResource(R.drawable.taskas);
        e6v9.setImageResource(R.drawable.taskas);
        e7v1.setImageResource(R.drawable.taskas);
        e7v2.setImageResource(R.drawable.taskas);
        e7v3.setImageResource(R.drawable.taskas);
        e7v4.setImageResource(R.drawable.taskas);
        e7v5.setImageResource(R.drawable.taskas);
        e7v6.setImageResource(R.drawable.taskas);
        e7v7.setImageResource(R.drawable.taskas);
        e7v8.setImageResource(R.drawable.taskas);
        e7v9.setImageResource(R.drawable.taskas);
        e8v1.setImageResource(R.drawable.taskas);
        e8v2.setImageResource(R.drawable.taskas);
        e8v3.setImageResource(R.drawable.taskas);
        e8v4.setImageResource(R.drawable.taskas);
        e8v5.setImageResource(R.drawable.taskas);
        e8v6.setImageResource(R.drawable.taskas);
        e8v7.setImageResource(R.drawable.taskas);
        e8v8.setImageResource(R.drawable.taskas);
        e8v9.setImageResource(R.drawable.taskas);
        e9v1.setImageResource(R.drawable.taskas);
        e9v2.setImageResource(R.drawable.taskas);
        e9v3.setImageResource(R.drawable.taskas);
        e9v4.setImageResource(R.drawable.taskas);
        e9v5.setImageResource(R.drawable.taskas);
        e9v6.setImageResource(R.drawable.taskas);
        e9v7.setImageResource(R.drawable.taskas);
        e9v8.setImageResource(R.drawable.taskas);
        e9v9.setImageResource(R.drawable.taskas);
        e9v10.setImageResource(R.drawable.taskas);
        e10v1.setImageResource(R.drawable.taskas);
        e10v2.setImageResource(R.drawable.taskas);
        e10v3.setImageResource(R.drawable.taskas);
        e10v4.setImageResource(R.drawable.taskas);
        e10v5.setImageResource(R.drawable.taskas);
        e10v6.setImageResource(R.drawable.taskas);
        e10v7.setImageResource(R.drawable.taskas);
        e10v8.setImageResource(R.drawable.taskas);
        e10v9.setImageResource(R.drawable.taskas);
        e10v10.setImageResource(R.drawable.taskas);
        e11v1.setImageResource(R.drawable.taskas);
        e11v2.setImageResource(R.drawable.taskas);
        e11v3.setImageResource(R.drawable.taskas);
        e11v4.setImageResource(R.drawable.taskas);
        e11v5.setImageResource(R.drawable.taskas);
        e11v6.setImageResource(R.drawable.taskas);
        e11v7.setImageResource(R.drawable.taskas);
        e11v8.setImageResource(R.drawable.taskas);
        e11v9.setImageResource(R.drawable.taskas);
        e11v10.setImageResource(R.drawable.taskas);
        e12v1.setImageResource(R.drawable.taskas);
        e12v2.setImageResource(R.drawable.taskas);
        e12v3.setImageResource(R.drawable.taskas);
        e12v4.setImageResource(R.drawable.taskas);
        e12v5.setImageResource(R.drawable.taskas);
        e12v6.setImageResource(R.drawable.taskas);
        e12v7.setImageResource(R.drawable.taskas);
        e12v8.setImageResource(R.drawable.taskas);
        e12v9.setImageResource(R.drawable.taskas);
        e12v10.setImageResource(R.drawable.taskas);
        e13v1.setImageResource(R.drawable.taskas);
        e13v2.setImageResource(R.drawable.taskas);
        e13v3.setImageResource(R.drawable.taskas);
        e13v4.setImageResource(R.drawable.taskas);
        e13v5.setImageResource(R.drawable.taskas);
        e13v6.setImageResource(R.drawable.taskas);
        e13v7.setImageResource(R.drawable.taskas);
        e13v8.setImageResource(R.drawable.taskas);
        e13v9.setImageResource(R.drawable.taskas);
        e13v10.setImageResource(R.drawable.taskas);
        e13v11.setImageResource(R.drawable.taskas);
        e14v1.setImageResource(R.drawable.taskas);
        e14v2.setImageResource(R.drawable.taskas);
        e14v3.setImageResource(R.drawable.taskas);
        e14v4.setImageResource(R.drawable.taskas);
        e14v5.setImageResource(R.drawable.taskas);
        e14v6.setImageResource(R.drawable.taskas);
        e14v7.setImageResource(R.drawable.taskas);
        e14v8.setImageResource(R.drawable.taskas);
        e14v9.setImageResource(R.drawable.taskas);
        e14v10.setImageResource(R.drawable.taskas);
        e14v11.setImageResource(R.drawable.taskas);
    }

    @Override
    public void updateTotalPrice() {

    }
}