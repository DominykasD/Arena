package com.example.arena.activities;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.arena.R;
import com.example.arena.adapters.CheckoutAdapter;
import com.example.arena.models.Cart;
import com.example.arena.utils.LocalStorage;
import com.google.gson.Gson;

import java.util.List;

public class CheckoutActivity extends BaseActivity {

    private TextView priceWithoutPVM, pricePVM21, priceTotal;

    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        localStorage = new LocalStorage(getApplicationContext());
        gson = new Gson();

        TextView closeButton = findViewById(R.id.textView11);
        priceWithoutPVM = findViewById(R.id.priceWithoutPVM);
        pricePVM21 = findViewById(R.id.pricePVM21);
        priceTotal = findViewById(R.id.priceTotal);
        Button button = findViewById(R.id.button8);

        List<Cart> cartList;

        cartList = getCartList();

        Double pricePVM = getPriceWithoutPVM() * 0.21;
        Double priceTotalWithPVM = pricePVM + getPriceWithoutPVM();
        priceWithoutPVM.setText(String.format("%.2f", getPriceWithoutPVM()));
        pricePVM21.setText(String.format("%.2f", pricePVM));
        priceTotal.setText(String.format("%.2f", priceTotalWithPVM));

        closeButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainMenuActivity.class);
            startActivity(intent);
        });
        button.setOnClickListener(v -> openActivityCheckoutPersonal());

        // Set up recycler view
        RecyclerView recyclerView = findViewById(R.id.recyclerViewCheckout);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CheckoutAdapter checkoutAdapter = new CheckoutAdapter(this, cartList);
        recyclerView.setAdapter(checkoutAdapter);
    }

    private void openActivityCheckoutPersonal() {
        Intent intent = new Intent(this, CheckoutPersonalActivity.class);
        startActivity(intent);
    }


    @SuppressLint("DefaultLocale")
    @Override
    public void updateTotalPrice() {
        priceWithoutPVM.setText(String.format("%.2f", getPriceWithoutPVM()));
        pricePVM21.setText(String.format("%.2f", getPriceWithoutPVM() * 0.21));
        priceTotal.setText(String.format("%.2f", getPriceWithoutPVM() * 0.21 + getPriceWithoutPVM()));

        if (getPriceWithoutPVM() == 0.0) {
            invalidateOptionsMenu();
            pricePVM21.setText("0.0");
            priceTotal.setText("0.0");

        }
    }
}