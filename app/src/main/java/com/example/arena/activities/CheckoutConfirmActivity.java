package com.example.arena.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.arena.R;
import com.example.arena.adapters.CheckoutConfirmAdapter;
import com.example.arena.models.Cart;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CheckoutConfirmActivity extends BaseActivity {

    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ckeckout_confirm);

        List<Cart> cartList;

        TextView sum = findViewById(R.id.textView38);
        TextView date = findViewById(R.id.textView37);
        TextView sectorNumber = findViewById(R.id.textView41);
        ImageView backButton = findViewById(R.id.imageView5);
        ImageView closeButton = findViewById(R.id.imageView4);
        Button button = findViewById(R.id.button);

        sectorNumber.setText(getSectorNumber());
        cartList = getCartList();

        backButton.setOnClickListener(v -> finish());
        closeButton.setOnClickListener(v -> openCheckoutActivity());
        button.setOnClickListener(v -> showCustomDialog());

        Double pricePVM = getPriceWithoutPVM() * 0.21;
        Double priceTotalWithPVM = pricePVM + getPriceWithoutPVM();
        sum.setText(String.format("%.2f", priceTotalWithPVM));

        Date date1 = Calendar.getInstance().getTime();
        @SuppressLint("SimpleDateFormat") SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(date1);
        date.setText(formattedDate);

        // Set up recycler view
        RecyclerView recyclerView = findViewById(R.id.rcViewCheckoutConfirm);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CheckoutConfirmAdapter checkoutConfirmAdapter = new CheckoutConfirmAdapter(this, cartList);
        recyclerView.setAdapter(checkoutConfirmAdapter);

    }

    private void showCustomDialog() {
        final Dialog dialog = new Dialog(this);

        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_confirmation);

        TextView closeButton = dialog.findViewById(R.id.textView54);
        Button button = dialog.findViewById(R.id.button7);

        closeButton.setOnClickListener(v -> dialog.dismiss());




        dialog.show();
    }

    private void openCheckoutActivity() {
        Intent intent = new Intent(this, CheckoutActivity.class);
        startActivity(intent);
    }

    @Override
    public void updateTotalPrice() {

    }
}