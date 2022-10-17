package com.example.arena.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class LocalStorage {
    private static final String CART = "CART";
    private static final String SECTOR = "SECTOR";
    private static final String SECTORIMG = "SECTORIMG";
    private static final String ROW = "ROW";
    private static final String SEAT = "SEAT";
    private static final String SEATIMG = "SEATIMG";
    private static final String USER = "USER";
    private static final String NAME = "NAME";
    private static final String SURNAME = "SURNAME";
    private static final String TEL = "TEL";

    private final SharedPreferences sharedPreferences;

    public LocalStorage(Context context) {
        sharedPreferences = context.getSharedPreferences("Preferences", 0);
    }

    public String getUserInfoName() {
        if(sharedPreferences.contains(NAME))
            return sharedPreferences.getString(NAME, null);
        else return null;
    }

    public String getUserInfoSurname() {
        if(sharedPreferences.contains(SURNAME))
            return sharedPreferences.getString(SURNAME, null);
        else return null;
    }

    public String getUserInfoTel() {
        if(sharedPreferences.contains(TEL))
            return sharedPreferences.getString(TEL, null);
        else return null;
    }

    public void setUserInfo(String name, String surname, String tel) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(NAME, name);
        editor.putString(SURNAME, surname);
        editor.putString(TEL, tel);
        editor.apply();
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

    public void deleteCart() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(CART);
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


    public void setSeatImage(int seatImage) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(SEATIMG, seatImage);
        editor.apply();
    }

    public int getSeatImage() {
        if(sharedPreferences.contains(SEATIMG))
            return sharedPreferences.getInt(SEATIMG, 0);
        else return 0;
    }
}
