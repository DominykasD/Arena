package com.example.arena.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class LocalStorage {
    private static final String CART = "CART";
    private static final String SECTOR = "SECTOR";
    private static final String SECTORIMG = "SECTORIMG";
    private static final String ROW = "ROW";
    private static final String SEAT = "SEAT";
    private static final String USER = "USER";

    private final SharedPreferences sharedPreferences;

    public LocalStorage(Context context) {
        sharedPreferences = context.getSharedPreferences("Preferences", 0);
    }

    public String getUser() {
        if(sharedPreferences.contains(USER))
            return sharedPreferences.getString(USER, null);
        else return null;
    }

    public void setUser(String user) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(USER, user);
        editor.apply();
    }

    public String getCart() {
        if(sharedPreferences.contains(CART))
            return sharedPreferences.getString(CART, null);
        else return null;
    }

    public void setCart(String cart) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(CART, cart);
        editor.apply();
    }

    public String getSector() {
        if(sharedPreferences.contains(SECTOR))
            return sharedPreferences.getString(SECTOR, null);
        else return null;
    }

    public void setSector(String sector) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(SECTOR, sector);
        editor.apply();
    }

    public int getSectorImage() {
        if(sharedPreferences.contains(SECTORIMG))
            return sharedPreferences.getInt(SECTORIMG, 0);
        else return 0;
    }

    public void setSectorImage(int sectorImage) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(SECTORIMG, sectorImage);
        editor.apply();
    }

    public String getRow() {
        if(sharedPreferences.contains(ROW))
            return sharedPreferences.getString(ROW, null);
        else return null;
    }

    public void setRow(String row) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(ROW, row);
        editor.apply();
    }

    public String getSeat() {
        if(sharedPreferences.contains(SEAT))
            return sharedPreferences.getString(SEAT, null);
        else return null;
    }

    public void setSeat(String seat) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(SEAT, seat);
        editor.apply();
    }


}
