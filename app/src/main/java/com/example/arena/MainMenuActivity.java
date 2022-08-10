package com.example.arena;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;

import com.google.android.material.appbar.AppBarLayout;

public class MainMenuActivity extends AppCompatActivity {

    private SearchView searchView;
    private Toolbar toolbar, topAppBar;
    private AppBarConfiguration mAppBarConfiguration;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        /// Searchview text
//        searchView = (SearchView) findViewById(R.id.searchView);
//        searchView.setQueryHint("Ką galėtume pasiūlyti?");

//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        toolbar.setNavigationContentDescription("asd");

//        topAppBar = (Toolbar) findViewById(R.id.topAppBar);
//        setSupportActionBar(toolbar);
//        topAppBar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });



    }

}