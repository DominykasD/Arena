package com.example.arena;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Category> categories;
    private static String JSON_URL = "http://10.0.2.2/ArenaServer/food.json";
    CategoryAdapter adapter;

//    private String burgerImage = "C\\User\\Dominykas\\Desktop\\burger.jpg";
   private ImageView imageView;

    int image = R.drawable.food_image_empty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        recyclerView = findViewById(R.id.mRecyclerView);
        categories = new ArrayList<>();

        addItemsFromJSON();

        imageView = (ImageView) findViewById(R.id.foodImage);
//
//        loadImageWithResize();
    }

//    private void loadImageWithResize() {
//        Picasso.get()
//                .load(burgerImage)
//                .resize(200, 200)
//                .into(imageView);
//    }

    private void addItemsFromJSON() {
        RequestQueue queue = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, JSON_URL, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject categoryObject = response.getJSONObject(i);

                        Category category = new Category();
                        category.setId(categoryObject.getString("id").toString());
                        category.setName(categoryObject.getString("name").toString());
                        category.setDescription(categoryObject.getString("description").toString());
                        category.setPrice(categoryObject.getString("price").toString());
                        category.setFavorite(categoryObject.getString("favorite").toString());
                        category.setImage(image);
                        categories.add(category);


                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                adapter = new CategoryAdapter(getApplicationContext(), categories);
                recyclerView.setAdapter(adapter);
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("tag", "onErrorResponse: " + error.getMessage());
            }
        });
        queue.add(jsonArrayRequest);
    }
}

