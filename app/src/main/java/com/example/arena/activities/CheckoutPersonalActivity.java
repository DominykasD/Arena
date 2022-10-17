package com.example.arena.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.arena.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CheckoutPersonalActivity extends BaseActivity {

    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ckeckout_personal_info);

        EditText name = findViewById(R.id.editTextTextPersonName2);
        EditText surname = findViewById(R.id.editTextTextPersonName3);
        EditText telephone = findViewById(R.id.editTextPhone);
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

        name.setText(localStorage.getUserInfoName());
        surname.setText(localStorage.getUserInfoSurname());
        telephone.setText(localStorage.getUserInfoTel());
        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, CheckoutActivity.class);
            startActivity(intent);
        });
        closeButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, CheckoutActivity.class);
            startActivity(intent);
        });
        button.setOnClickListener(v -> {
            if (!name.getText().toString().trim().equals("") && !surname.getText().toString().trim().equals("") && !telephone.getText().toString().trim().equals("")) {
                if(containsLetters(name.getText().toString().trim())) {
                    String namee = name.getText().toString().trim();
                    if (containsLetters(surname.getText().toString().trim())) {
                        String surnamee = surname.getText().toString().trim();
                        if (telephoneCode(telephone.getText().toString().trim()) && telformat(telephone.getText().toString().trim())) {
                            String tel = telephone.getText().toString().trim();
                            localStorage.setUserInfo(namee, surnamee, tel);
                            openCheckoutCardActivity();
                        }
                        else {
                            Toast.makeText(this, "Telefonas neatitinka lietuvos kodo arba yra per ilgas", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        Toast.makeText(this, "Pavardė negali turėti skaičių, specalių simbolių", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(this, "Vardas negali turėti skaičių, specalių simbolių", Toast.LENGTH_SHORT).show();
                }
            }
            else {
                Toast.makeText(this, "Ne visi laukai užpildyti", Toast.LENGTH_SHORT).show();
            }

        });
        changeLocation.setOnClickListener(v -> {
            String namee = name.getText().toString().trim();
            String surnamee = surname.getText().toString().trim();
            String tel = telephone.getText().toString().trim();
            localStorage.setUserInfo(namee, surnamee, tel);
            openLocationActivity();
        });

        Double pricePVM = getPriceWithoutPVM() * 0.21;
        Double priceTotalWithPVM = pricePVM + getPriceWithoutPVM();
        sum.setText(String.format("%.2f", priceTotalWithPVM));

        Date date1 = Calendar.getInstance().getTime();
        @SuppressLint("SimpleDateFormat") SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(date1);
        date.setText(formattedDate);
    }

    private boolean telformat(String telephone) {
        if (telephone.length() != 12) return false;
        String tel = telephone.substring(4, Math.min(telephone.length(), 12));
        System.out.println(tel);
        char[] chars = tel.toCharArray();

        for (char c : chars) {
            if(!Character.isDigit(c)) return false;
        }
        return true;
    }

    private boolean telephoneCode(String telephone) {
        String tel = telephone.substring(0, Math.min(telephone.length(), 4));
        for (int i = 0; i < tel.length(); i++) {
            if (tel.equals("+370")) return true;
        }
        return false;
    }

    private Boolean containsLetters(String name) {
        char[] chars = name.toCharArray();

        for (char c : chars) {
            if(!Character.isLetter(c)) return false;
        }
        return true;
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