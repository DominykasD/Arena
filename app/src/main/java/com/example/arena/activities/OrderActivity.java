package com.example.arena.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.arena.R;
import com.example.arena.adapters.CheckoutConfirmAdapter;
import com.example.arena.adapters.OrderAdapter;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        ImageView closeButton = findViewById(R.id.imageView10);

        closeButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainMenuActivity.class);
            startActivity(intent);
        });


        //TODO: orderList
        /*RecyclerView recyclerView = findViewById(R.id.rec_view_orders);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        OrderAdapter orderAdapter = new OrderAdapter(this, orderList);
        recyclerView.setAdapter(orderAdapter);*/
    }
}