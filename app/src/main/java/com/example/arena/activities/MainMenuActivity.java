package com.example.arena.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.ui.AppBarConfiguration;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

import com.example.arena.R;
import com.example.arena.models.Category;

public class MainMenuActivity extends AppCompatActivity {

    private SearchView searchView;
    private Toolbar toolbar, topAppBar;
    private AppBarConfiguration mAppBarConfiguration;
    private DrawerLayout mDrawer;
    private ImageView imagepizza, imageHamburger, imageDrinks, imageDeserts,
            imageKebab, imageSalad, imageSnacks, imageSpaghetti, imageCheckout;
    private Category category;
    private TextView categoryName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        category = new Category();

        // Set a Toolbar to replace Actionbar
        toolbar = (Toolbar) findViewById(R.id.toolbarCheckout);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(false);

//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        // Open Category activity
        categoryName = findViewById(R.id.categoryText);
        categoryName = new TextView(getApplicationContext());
        categoryActivity();


        // Open Checkout activity
        imageCheckout = (ImageView) findViewById(R.id.imageCheckout);
        imageCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCheckoutActivity();
            }
        });

    }

    private void categoryActivity() {
        imagepizza = findViewById(R.id.category_pizza);
        imagepizza.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                category.setCategory("picos");
                categoryName.setText("Picos");
                openCategoryActivity();
            }
        });

        imageHamburger = findViewById(R.id.category_hamburger);
        imageHamburger.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                category.setCategory("mėsainiai");
                categoryName.setText("Mėsainiai");
                openCategoryActivity();
            }
        });

        imageDrinks = findViewById(R.id.category_drinks);
        imageDrinks.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                category.setCategory("gėrimai");
                categoryName.setText("Gėrimai");
                openCategoryActivity();
            }
        });

        imageDeserts = findViewById(R.id.category_deserts);
        imageDeserts.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                category.setCategory("desertai");
                categoryName.setText("Desertai");
                openCategoryActivity();
            }
        });

        imageKebab = findViewById(R.id.category_kebab);
        imageKebab.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                category.setCategory("kebabai");
                categoryName.setText("Kebabai");
                openCategoryActivity();
            }
        });

        imageSalad = findViewById(R.id.category_salad);
        imageSalad.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                category.setCategory("salotos");
                categoryName.setText("Salotos");
                openCategoryActivity();
            }
        });

        imageSnacks = findViewById(R.id.category_snacks);
        imageSnacks.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                category.setCategory("užkandžiai");
                categoryName.setText("Užkandžiai");
                openCategoryActivity();
            }
        });

        imageSpaghetti = findViewById(R.id.category_spaghetti);
        imageSpaghetti.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                category.setCategory("makaronai");
                categoryName.setText("Makaronai");
                openCategoryActivity();
            }
        });
    }

    private void openCheckoutActivity() {
        Intent intent = new Intent(this, CheckoutActivity.class);
        startActivity(intent);
    }

    private void openCategoryActivity() {
        Intent intent = new Intent(this, CategoryActivity.class);
        intent.putExtra("category", category.getCategory());
        intent.putExtra("category_name", categoryName.getText());
        startActivity(intent);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // The action bar home/up action should open or close the drawer.
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawer.openDrawer(GravityCompat.START);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

}