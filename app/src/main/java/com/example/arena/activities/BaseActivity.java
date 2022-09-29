package com.example.arena.activities;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.arena.models.Cart;
import com.example.arena.utils.Callbacks;
import com.example.arena.utils.LocalStorage;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseActivity extends AppCompatActivity implements Callbacks {
    List<Cart> cartList = new ArrayList<>();
    LocalStorage localStorage;
    Gson gson;
    String sector, row, seat;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        localStorage = new LocalStorage(getApplicationContext());
        gson = new Gson();

        cartCount();
    }

    public int cartCount() {

        gson = new Gson();
        if (localStorage.getCart() != null) {
            String jsonCart = localStorage.getCart();
            Type type = new TypeToken<List<Cart>>() {
            }.getType();
            cartList = gson.fromJson(jsonCart, type);
            return cartList.size();
        }
        return 0;
    }

    public String getSectorNumber() {
        gson = new Gson();
        if(localStorage.getSector() != null) {
            String jsonSector = localStorage.getSector();
            Type type = new TypeToken<String>() {}.getType();
            sector = gson.fromJson(jsonSector, type);
            return sector;
        }
        return sector;
    }

    public String getRowNumber() {
        gson = new Gson();
        if(localStorage.getRow() != null) {
            String jsonRow = localStorage.getRow();
            Type type = new TypeToken<String>() {}.getType();
            row = gson.fromJson(jsonRow, type);
            return row;
        }
        return row;
    }

    public String getSeatNumber() {
        gson = new Gson();
        if(localStorage.getSeat() != null) {
            String jsonSeat = localStorage.getSeat();
            Type type = new TypeToken<String>() {}.getType();
            seat = gson.fromJson(jsonSeat, type);
            return seat;
        }
        return seat;
    }

    public List<Cart> getCartList() {
        gson = new Gson();
        if(localStorage.getCart() != null) {
            String jsonCart = localStorage.getCart();
            Type type = new TypeToken<List<Cart>>() {}.getType();
            cartList = gson.fromJson(jsonCart, type);
            return cartList;
        }
        return cartList;
    }


    public Double getPriceWithoutPVM() {
        cartList = getCartList();
        double total = 0.0;
        if (cartCount() > 0) {
            for (int i = 0; i < cartList.size(); i++) {
                total = total + (double) cartList.get(i).getSubTotal();
            }
            return total;
        }
        return total;
    }


}
