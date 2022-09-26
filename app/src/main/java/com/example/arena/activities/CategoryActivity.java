package com.example.arena.activities;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.arena.models.Category;
import com.example.arena.adapters.CategoryAdapter;
import com.example.arena.R;
import com.example.arena.utils.LocalStorage;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends BaseActivity {

    private RecyclerView recyclerView;
    private List<Category> categories;
    private CategoryAdapter adapter;

    private int foodImage;
    private TextView categoryText;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        localStorage = new LocalStorage(getApplicationContext());
        gson = new Gson();

        categories = new ArrayList<>();

        foodImage = R.drawable.food_image_empty;
        categoryText = findViewById(R.id.categoryText);

        Toolbar toolbar = findViewById(R.id.toolbar_category);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(v -> finish());

        addItemsFromJSON();
    }


    private void addItemsFromJSON() {
        RequestQueue queue = Volley.newRequestQueue(this);
        String JSON_URL = "http://10.0.2.2/ArenaServer/food.json";
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, JSON_URL, null, response -> {
            for (int i = 0; i < response.length(); i++) {
                try {
                    JSONObject categoryObject = response.getJSONObject(i);

                    Category category = new Category();
                    category.setId(categoryObject.getString("id"));
                    category.setName(categoryObject.getString("name"));
                    category.setDescription(categoryObject.getString("description"));
                    category.setPrice(categoryObject.getString("price"));
                    category.setCategory(categoryObject.getString("type"));
                    category.setFoodImage(foodImage);
                    category.setItemQuantity("0");

                    String categoryName = getIntent().getStringExtra("category");
                    String categoryText = getIntent().getStringExtra("category_name");
                    if (categoryName.equals(category.getCategory())) {
                         categories.add(category);
                         this.categoryText.setText(categoryText);
                    }


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            recyclerView = findViewById(R.id.mRecyclerView);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            adapter = new CategoryAdapter(this, categories);
            recyclerView.setAdapter(adapter);
        }, error -> Log.d("tag", "onErrorResponse: " + error.getMessage()));
        queue.add(jsonArrayRequest);
    }


    @Override
    public void updateTotalPrice() {

    }
}

