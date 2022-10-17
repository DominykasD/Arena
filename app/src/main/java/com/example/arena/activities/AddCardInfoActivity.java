package com.example.arena.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.example.arena.R;
import com.example.arena.models.Card;

public class AddCardInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card_info);

        ImageView backButton = findViewById(R.id.imageView5);
        Button button = findViewById(R.id.button);

        Card card = new Card();

        backButton.setOnClickListener(v -> finish());



    }
}