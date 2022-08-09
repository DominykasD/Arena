package com.example.arena;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.SearchView;

public class MainMenuActivity extends AppCompatActivity {

    private SearchView searchView;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        /// Searchview text
        searchView = (SearchView) findViewById(R.id.searchView);
        searchView.setQueryHint("Ką galėtume pasiūlyti?");

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationContentDescription("asd");
    }
}