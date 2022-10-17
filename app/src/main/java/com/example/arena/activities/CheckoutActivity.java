package com.example.arena.activities;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.arena.R;
import com.example.arena.adapters.CheckoutAdapter;
import com.example.arena.models.Cart;
import com.example.arena.utils.LocalStorage;
import com.google.gson.Gson;

import java.util.List;

public class CheckoutActivity extends BaseActivity {

    private TextView priceWithoutPVM, pricePVM21, priceTotal;
    private ConstraintLayout constraintLayout1;
    private ConstraintLayout constraintLayout2;
    private Button button;
    private TextView orderDetails;

    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        localStorage = new LocalStorage(getApplicationContext());
        gson = new Gson();

        constraintLayout1 = findViewById(R.id.constraintLayout12);
        constraintLayout2 = findViewById(R.id.constraintLayout15);
        orderDetails = findViewById(R.id.textView21);
        TextView closeButton = findViewById(R.id.textView11);
        priceWithoutPVM = findViewById(R.id.priceWithoutPVM);
        pricePVM21 = findViewById(R.id.pricePVM21);
        priceTotal = findViewById(R.id.priceTotal);
        button = findViewById(R.id.button8);

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
        button.setOnClickListener(v -> {
            if (cartList.size() != 0) openActivityCheckoutPersonal();
            else {
                Toast.makeText(this, "Krepšelis tuščias, pridėkite prekių", Toast.LENGTH_SHORT).show();
            }
        });
        if (cartList.size() == 0) {
            constraintLayout1.setVisibility(View.GONE);
            constraintLayout2.setVisibility(View.GONE);
            button.setVisibility(View.GONE);
            orderDetails.setText("Jūsų prekių krepšelis tuščias");
        }

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


    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    @Override
    public void updateTotalPrice() {
        priceWithoutPVM.setText(String.format("%.2f", getPriceWithoutPVM()));
        pricePVM21.setText(String.format("%.2f", getPriceWithoutPVM() * 0.21));
        priceTotal.setText(String.format("%.2f", getPriceWithoutPVM() * 0.21 + getPriceWithoutPVM()));

        if (getPriceWithoutPVM() == 0.00) {
            invalidateOptionsMenu();

            constraintLayout1.setVisibility(View.GONE);
            constraintLayout2.setVisibility(View.GONE);
            button.setVisibility(View.GONE);
            orderDetails.setText("Jūsų prekių krepšelis tuščias");

        }
    }
}