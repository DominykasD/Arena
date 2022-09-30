package com.example.arena.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.arena.R;
import com.example.arena.adapters.NewsAdapter;
import com.example.arena.models.Category;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.Objects;

public class MainMenuActivity extends AppCompatActivity {

    private DrawerLayout mDrawer;
    private NavigationView navDraw;
    private Category category;
    private TextView categoryName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        category = new Category();

        Toolbar toolbar = findViewById(R.id.toolbarMain);
        mDrawer = findViewById(R.id.drawer_layout);
        navDraw = findViewById(R.id.nav_view);
        categoryName = findViewById(R.id.categoryText);
        ImageView imageCheckout = findViewById(R.id.imageCheckout);

        // Set a Toolbar to replace Actionbar
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
        // Setup drawer view click listeners
        setupDrawerContent(navDraw);


        // Open Category activity
        categoryName = new TextView(getApplicationContext());
        categoryActivity();

        // Open Checkout activity
        imageCheckout.setOnClickListener(v -> openCheckoutActivity());

        ArrayList<String> foodNew = new ArrayList<>();
        foodNew.add("food1");
        foodNew.add("food2");
        foodNew.add("food3");
        foodNew.add("food4");
        foodNew.add("food5");
        foodNew.add("food6");


        // Set up News recycler view
        RecyclerView recyclerView = findViewById(R.id.recview_news);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        NewsAdapter newsAdapter = new NewsAdapter(this, foodNew);
        recyclerView.setAdapter(newsAdapter);

    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(item -> {
            selectDrawerItem(item);
            return true;
        });
    }

    private void selectDrawerItem(MenuItem item) {
        if (item.getItemId() == R.id.item_orders) {
            Intent intent = new Intent(this, OrderActivity.class);
            startActivity(intent);
        }
        if (item.getItemId() == R.id.item_information) {
            Intent intent = new Intent(this, InfoActivity.class);
            startActivity(intent);
        }
        mDrawer.closeDrawers();
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