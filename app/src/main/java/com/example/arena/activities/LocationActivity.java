package com.example.arena.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.arena.R;

import java.util.ArrayList;

public class LocationActivity extends BaseActivity {

    ImageView sector101;
    ImageView sector103;
    ImageView sector105;
    ImageView sector107;
    ImageView sector109;
    ImageView sector111;
    ImageView sector113;
    ImageView sector119;
    ImageView sector121;
    ImageView sector123;
    ImageView sector125;
    ImageView sector127;
    ImageView sector129;
    ImageView sector131;
    ImageView sector133;
    ImageView sector135;
    ImageView sector301;
    ImageView sector303;
    ImageView sector305;
    ImageView sector307;
    ImageView sector309;
    ImageView sector311;
    ImageView sector313;
    ImageView sector315;
    ImageView sector317;
    ImageView sector319;
    ImageView sector321;
    ImageView sector323;
    ImageView sector325;
    ImageView sector327;
    ImageView sector329;
    ImageView sector331;
    ImageView sector333;
    ImageView sector335;
    ImageView sector337;
    ImageView sector339;
    ImageView sector341;
    ImageView sector343;
    private TextView sectorNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        sector101 = findViewById(R.id.imageView101);
        sector103 = findViewById(R.id.imageView103);
        sector105 = findViewById(R.id.imageView105);
        sector107 = findViewById(R.id.imageView107);
        sector109 = findViewById(R.id.imageView109);
        sector111 = findViewById(R.id.imageView111);
        sector113 = findViewById(R.id.imageView113);
        sector119 = findViewById(R.id.imageView119);
        sector121 = findViewById(R.id.imageView121);
        sector123 = findViewById(R.id.imageView123);
        sector125 = findViewById(R.id.imageView125);
        sector127 = findViewById(R.id.imageView127);
        sector129 = findViewById(R.id.imageView129);
        sector131 = findViewById(R.id.imageView131);
        sector133 = findViewById(R.id.imageView133);
        sector135 = findViewById(R.id.imageView135);
        sector301 = findViewById(R.id.imageView301);
        sector303 = findViewById(R.id.imageView303);
        sector305 = findViewById(R.id.imageView305);
        sector307 = findViewById(R.id.imageView307);
        sector309 = findViewById(R.id.imageView309);
        sector311 = findViewById(R.id.imageView311);
        sector313 = findViewById(R.id.imageView313);
        sector315 = findViewById(R.id.imageView315);
        sector317 = findViewById(R.id.imageView317);
        sector319 = findViewById(R.id.imageView319);
        sector321 = findViewById(R.id.imageView321);
        sector323 = findViewById(R.id.imageView323);
        sector325 = findViewById(R.id.imageView325);
        sector327 = findViewById(R.id.imageView327);
        sector329 = findViewById(R.id.imageView329);
        sector331 = findViewById(R.id.imageView331);
        sector333 = findViewById(R.id.imageView333);
        sector335 = findViewById(R.id.imageView335);
        sector337 = findViewById(R.id.imageView337);
        sector339 = findViewById(R.id.imageView339);
        sector341 = findViewById(R.id.imageView341);
        sector343 = findViewById(R.id.imageView343);

        ImageView closeButton = findViewById(R.id.imageView6);
        sectorNumber = findViewById(R.id.textView26);
        Button button = findViewById(R.id.button);

        sectorNumber.setText(getSectorNumber());
        SectorImageColor();

        button.setOnClickListener(v -> {
            Intent intent = new Intent(this, LocationSeatActivity.class);
            startActivity(intent);
        });
        closeButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, CheckoutPersonalActivity.class);
            startActivity(intent);
        });

        sectorClickListeners();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, CheckoutPersonalActivity.class);
        startActivity(intent);
    }

    private void SectorImageColor(){

        if (getSectorImage() == R.drawable.sector101_red) {
            sector101.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector103_red) {
            sector103.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector105_red) {
            sector105.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector107_red) {
            sector107.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector109_red) {
            sector109.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector111_red) {
            sector111.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector113_red) {
            sector113.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector119_red) {
            sector119.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector121_red) {
            sector121.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector123_red) {
            sector123.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector125_red) {
            sector125.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector127_red) {
            sector127.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector129_red) {
            sector129.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector131_red) {
            sector131.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector133_red) {
            sector133.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector135_red) {
            sector135.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector301_red) {
            sector301.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector303_red) {
            sector303.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector305_red) {
            sector305.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector305_red) {
            sector307.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector309_red) {
            sector309.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector311_red) {
            sector311.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector313_red) {
            sector313.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector315_red) {
            sector315.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector317_red) {
            sector317.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector319_red) {
            sector319.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector321_red) {
            sector321.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector323_red) {
            sector323.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector325_red) {
            sector325.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector327_red) {
            sector327.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector329_red) {
            sector329.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector331_red) {
            sector331.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector333_red) {
            sector333.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector335_red) {
            sector335.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector337_red) {
            sector337.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector339_red) {
            sector339.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector341_red) {
            sector341.setImageResource(getSectorImage());
        }
        if (getSectorImage() == R.drawable.sector343_red) {
            sector343.setImageResource(getSectorImage());
        }
    }

    @SuppressLint("SetTextI18n")
    private void sectorClickListeners() {

        sector101.setOnClickListener(v -> {
            resetImageColor();

            sector101.setImageResource(R.drawable.sector101_red);
            sectorNumber.setText("101");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector101_red);
        });

        sector103.setOnClickListener(v -> {
            resetImageColor();

            sector103.setImageResource(R.drawable.sector103_red);
            sectorNumber.setText("103");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector103_red);
        });

        sector105.setOnClickListener(v -> {
            resetImageColor();

            sector105.setImageResource(R.drawable.sector105_red);
            sectorNumber.setText("105");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector105_red);
        });

        sector107.setOnClickListener(v -> {
            resetImageColor();

            sector107.setImageResource(R.drawable.sector107_red);
            sectorNumber.setText("107");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector107_red);
        });

        sector109.setOnClickListener(v -> {
            resetImageColor();

            sector109.setImageResource(R.drawable.sector109_red);
            sectorNumber.setText("109");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector109_red);
        });

        sector111.setOnClickListener(v -> {
            resetImageColor();

            sector111.setImageResource(R.drawable.sector111_red);
            sectorNumber.setText("111");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector111_red);
        });

        sector113.setOnClickListener(v -> {
            resetImageColor();

            sector113.setImageResource(R.drawable.sector113_red);
            sectorNumber.setText("113");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector113_red);
        });

        sector119.setOnClickListener(v -> {
            resetImageColor();

            sector119.setImageResource(R.drawable.sector119_red);
            sectorNumber.setText("119");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector119_red);
        });

        sector121.setOnClickListener(v -> {
            resetImageColor();

            sector121.setImageResource(R.drawable.sector121_red);
            sectorNumber.setText("121");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector121_red);
        });

        sector123.setOnClickListener(v -> {
            resetImageColor();

            sector123.setImageResource(R.drawable.sector123_red);
            sectorNumber.setText("123");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector123_red);
        });

        sector125.setOnClickListener(v -> {
            resetImageColor();

            sector125.setImageResource(R.drawable.sector125_red);
            sectorNumber.setText("125");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector125_red);
        });

        sector127.setOnClickListener(v -> {
            resetImageColor();

            sector127.setImageResource(R.drawable.sector127_red);
            sectorNumber.setText("127");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector127_red);
        });

        sector129.setOnClickListener(v -> {
            resetImageColor();

            sector129.setImageResource(R.drawable.sector129_red);
            sectorNumber.setText("129");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector129_red);
        });

        sector131.setOnClickListener(v -> {
            resetImageColor();

            sector131.setImageResource(R.drawable.sector131_red);
            sectorNumber.setText("131");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector131_red);
        });

        sector133.setOnClickListener(v -> {
            resetImageColor();

            sector133.setImageResource(R.drawable.sector133_red);
            sectorNumber.setText("133");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector133_red);
        });

        sector135.setOnClickListener(v -> {
            resetImageColor();

            sector135.setImageResource(R.drawable.sector135_red);
            sectorNumber.setText("135");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector135_red);
        });

        sector301.setOnClickListener(v -> {
            resetImageColor();

            sector301.setImageResource(R.drawable.sector301_red);
            sectorNumber.setText("301");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector301_red);
        });

        sector303.setOnClickListener(v -> {
            resetImageColor();

            sector303.setImageResource(R.drawable.sector303_red);
            sectorNumber.setText("303");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector303_red);
        });

        sector305.setOnClickListener(v -> {
            resetImageColor();

            sector305.setImageResource(R.drawable.sector305_red);
            sectorNumber.setText("305");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector305_red);
        });

        sector307.setOnClickListener(v -> {
            resetImageColor();

            sector307.setImageResource(R.drawable.sector305_red);
            sectorNumber.setText("307");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector305_red);
        });

        sector309.setOnClickListener(v -> {
            resetImageColor();

            sector309.setImageResource(R.drawable.sector309_red);
            sectorNumber.setText("309");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector309_red);
        });

        sector311.setOnClickListener(v -> {
            resetImageColor();

            sector311.setImageResource(R.drawable.sector311_red);
            sectorNumber.setText("311");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector311_red);
        });

        sector313.setOnClickListener(v -> {
            resetImageColor();

            sector313.setImageResource(R.drawable.sector313_red);
            sectorNumber.setText("313");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector313_red);
        });

        sector315.setOnClickListener(v -> {
            resetImageColor();

            sector315.setImageResource(R.drawable.sector315_red);
            sectorNumber.setText("315");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector315_red);
        });

        sector317.setOnClickListener(v -> {
            resetImageColor();

            sector317.setImageResource(R.drawable.sector317_red);
            sectorNumber.setText("317");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector317_red);
        });

        sector319.setOnClickListener(v -> {
            resetImageColor();

            sector319.setImageResource(R.drawable.sector319_red);
            sectorNumber.setText("319");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector319_red);
        });

        sector321.setOnClickListener(v -> {
            resetImageColor();

            sector321.setImageResource(R.drawable.sector321_red);
            sectorNumber.setText("321");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector321_red);
        });

        sector323.setOnClickListener(v -> {
            resetImageColor();

            sector323.setImageResource(R.drawable.sector323_red);
            sectorNumber.setText("323");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector323_red);
        });

        sector325.setOnClickListener(v -> {
            resetImageColor();

            sector325.setImageResource(R.drawable.sector325_red);
            sectorNumber.setText("325");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector325_red);
        });

        sector327.setOnClickListener(v -> {
            resetImageColor();

            sector327.setImageResource(R.drawable.sector327_red);
            sectorNumber.setText("327");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector327_red);
        });

        sector329.setOnClickListener(v -> {
            resetImageColor();

            sector329.setImageResource(R.drawable.sector329_red);
            sectorNumber.setText("329");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector329_red);
        });

        sector331.setOnClickListener(v -> {
            resetImageColor();

            sector331.setImageResource(R.drawable.sector331_red);
            sectorNumber.setText("331");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector331_red);
        });

        sector333.setOnClickListener(v -> {
            resetImageColor();

            sector333.setImageResource(R.drawable.sector333_red);
            sectorNumber.setText("333");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector333_red);
        });

        sector335.setOnClickListener(v -> {
            resetImageColor();

            sector335.setImageResource(R.drawable.sector335_red);
            sectorNumber.setText("335");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector335_red);
        });

        sector337.setOnClickListener(v -> {
            resetImageColor();

            sector337.setImageResource(R.drawable.sector337_red);
            sectorNumber.setText("337");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector337_red);
        });

        sector339.setOnClickListener(v -> {
            resetImageColor();

            sector339.setImageResource(R.drawable.sector339_red);
            sectorNumber.setText("339");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector339_red);
        });

        sector341.setOnClickListener(v -> {
            resetImageColor();

            sector341.setImageResource(R.drawable.sector341_red);
            sectorNumber.setText("341");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector341_red);
        });

        sector343.setOnClickListener(v -> {
            resetImageColor();

            sector343.setImageResource(R.drawable.sector343_red);
            sectorNumber.setText("343");

            localStorage.setSector(sectorNumber.getText().toString());
            localStorage.setSectorImage(R.drawable.sector343_red);
        });
    }

    private void resetImageColor() {
        sector101.setImageResource(R.drawable.sector101);
        sector103.setImageResource(R.drawable.sector103);
        sector105.setImageResource(R.drawable.sector105);
        sector107.setImageResource(R.drawable.sector107);
        sector109.setImageResource(R.drawable.sector109);
        sector111.setImageResource(R.drawable.sector111);
        sector113.setImageResource(R.drawable.sector113);
        sector119.setImageResource(R.drawable.sector119);
        sector121.setImageResource(R.drawable.sector121);
        sector123.setImageResource(R.drawable.sector123);
        sector125.setImageResource(R.drawable.sector125);
        sector127.setImageResource(R.drawable.sector127);
        sector129.setImageResource(R.drawable.sector129);
        sector131.setImageResource(R.drawable.sector131);
        sector133.setImageResource(R.drawable.sector133);
        sector135.setImageResource(R.drawable.sector135);
        sector301.setImageResource(R.drawable.sector301);
        sector303.setImageResource(R.drawable.sector303);
        sector305.setImageResource(R.drawable.sector305);
        sector307.setImageResource(R.drawable.sector305);
        sector309.setImageResource(R.drawable.sector309);
        sector311.setImageResource(R.drawable.sector311);
        sector313.setImageResource(R.drawable.sector313);
        sector315.setImageResource(R.drawable.sector315);
        sector317.setImageResource(R.drawable.sector317);
        sector319.setImageResource(R.drawable.sector319);
        sector321.setImageResource(R.drawable.sector321);
        sector323.setImageResource(R.drawable.sector323);
        sector325.setImageResource(R.drawable.sector325);
        sector327.setImageResource(R.drawable.sector327);
        sector329.setImageResource(R.drawable.sector329);
        sector331.setImageResource(R.drawable.sector331);
        sector333.setImageResource(R.drawable.sector333);
        sector335.setImageResource(R.drawable.sector335);
        sector337.setImageResource(R.drawable.sector337);
        sector339.setImageResource(R.drawable.sector339);
        sector341.setImageResource(R.drawable.sector341);
        sector343.setImageResource(R.drawable.sector343);
    }

    @Override
    public void updateTotalPrice() {

    }
}