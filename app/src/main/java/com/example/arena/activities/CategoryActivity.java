package com.example.arena.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.arena.models.Category;
import com.example.arena.adapters.CategoryAdapter;
import com.example.arena.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Category> categories;

    private static String JSON_URL = "http://10.0.2.2/ArenaServer/food.json";

    private int foodImage;

    CategoryAdapter adapter;





    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        recyclerView = findViewById(R.id.mRecyclerView);
        categories = new ArrayList<>();

        foodImage = R.drawable.food_image_empty;

        addItemsFromJSON();

    }


    private void addItemsFromJSON() {
        RequestQueue queue = Volley.newRequestQueue(this);
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

                    String categoryName = getIntent().getStringExtra("category");
                    if (categoryName.equals(category.getCategory())) {
                         categories.add(category);
                    }


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
            adapter = new CategoryAdapter(getApplicationContext(), categories);
            recyclerView.setAdapter(adapter);
        }, error -> Log.d("tag", "onErrorResponse: " + error.getMessage()));
        queue.add(jsonArrayRequest);
    }

}

