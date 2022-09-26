package com.example.arena.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.arena.R;
import com.example.arena.models.Category;

import java.util.Objects;

public class MainMenuActivity extends AppCompatActivity {

    private DrawerLayout mDrawer;
    private Category category;
    private TextView categoryName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        category = new Category();

        Toolbar toolbar = findViewById(R.id.toolbarCheckout);
        mDrawer = findViewById(R.id.drawer_layout);
        categoryName = findViewById(R.id.categoryText);
        ImageView imageCheckout = findViewById(R.id.imageCheckout);

        // Set a Toolbar to replace Actionbar
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);


        // Open Category activity
        categoryName = new TextView(getApplicationContext());
        categoryActivity();

        // Open Checkout activity
        imageCheckout.setOnClickListener(v -> openCheckoutActivity());

    }

    @SuppressLint("SetTextI18n")
    private void categoryActivity() {
        ImageView imagepizza = findViewById(R.id.category_pizza);
        imagepizza.setOnClickListener(v -> {
            category.setCategory("picos");
            categoryName.setText("Picos");
            openCategoryActivity();
        });

        ImageView imageHamburger = findViewById(R.id.category_hamburger);
        imageHamburger.setOnClickListener(v -> {
            category.setCategory("mėsainiai");
            categoryName.setText("Mėsainiai");
            openCategoryActivity();
        });

        ImageView imageDrinks = findViewById(R.id.category_drinks);
        imageDrinks.setOnClickListener(v -> {
            category.setCategory("gėrimai");
            categoryName.setText("Gėrimai");
            openCategoryActivity();
        });

        ImageView imageDeserts = findViewById(R.id.category_deserts);
        imageDeserts.setOnClickListener(v -> {
            category.setCategory("desertai");
            categoryName.setText("Desertai");
            openCategoryActivity();
        });

        ImageView imageKebab = findViewById(R.id.category_kebab);
        imageKebab.setOnClickListener(v -> {
            category.setCategory("kebabai");
            categoryName.setText("Kebabai");
            openCategoryActivity();
        });

        ImageView imageSalad = findViewById(R.id.category_salad);
        imageSalad.setOnClickListener(v -> {
            category.setCategory("salotos");
            categoryName.setText("Salotos");
            openCategoryActivity();
        });

        ImageView imageSnacks = findViewById(R.id.category_snacks);
        imageSnacks.setOnClickListener(v -> {
            category.setCategory("užkandžiai");
            categoryName.setText("Užkandžiai");
            openCategoryActivity();
        });

        ImageView imageSpaghetti = findViewById(R.id.category_spaghetti);
        imageSpaghetti.setOnClickListener(v -> {
            category.setCategory("makaronai");
            categoryName.setText("Makaronai");
            openCategoryActivity();
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
        if (item.getItemId() == android.R.id.home) {
            mDrawer.openDrawer(GravityCompat.START);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}