package com.example.arena.activities;

import androidx.appcompat.app.AppCompatActivity;

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
        e1v1 = findViewById(R.id.imageView_1_1);
        e1v2 = findViewById(R.id.imageView_1_2);
        e1v3 = findViewById(R.id.imageView_1_3);
        e2v1 = findViewById(R.id.imageView_2_1);
        e2v2 = findViewById(R.id.imageView_2_2);
        e2v3 = findViewById(R.id.imageView_2_3);
        e3v1 = findViewById(R.id.imageView_3_1);
        e3v2 = findViewById(R.id.imageView_3_2);
        e3v3 = findViewById(R.id.imageView_3_3);

        Button button = findViewById(R.id.button);

        sectorNumber.setText(getSectorNumber());
        rowNumber.setText(getRowNumber());
        seatNumber.setText(getSeatNumber());

        seatClickListener();

        button.setOnClickListener(v -> {
            Intent intent = new Intent(this, CheckoutPersonalActivity.class);
            startActivity(intent);
        });


    }

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
    }

    private void resetImageColor() {
        e1v1.setImageResource(R.drawable.taskas);
        e1v2.setImageResource(R.drawable.taskas);
        e1v3.setImageResource(R.drawable.taskas);
        e2v1.setImageResource(R.drawable.taskas);
        e2v2.setImageResource(R.drawable.taskas);
        e2v3.setImageResource(R.drawable.taskas);
        e3v1.setImageResource(R.drawable.taskas);
        e3v2.setImageResource(R.drawable.taskas);
        e3v3.setImageResource(R.drawable.taskas);
    }

    @Override
    public void updateTotalPrice() {

    }
}