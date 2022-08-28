package com.example.arena;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private TextView register;
    private Button button;
    private EditText email, password, telephone;
    private String URL = "http://10.0.2.2/ArenaServer/login.php";


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Open Register activity
        register = (TextView) findViewById(R.id.textRegister);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterActivity();
            }
        });

        email = (EditText) findViewById(R.id.editEmail);
        password = (EditText) findViewById(R.id.editPsw);
        button = (Button) findViewById(R.id.buttLogin);

        // setText for testing purposes
        email.setText("test@arena.com");
        password.setText("test");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!email.getText().toString().trim().equals("") && !password.getText().toString().trim().equals("")) {
                    StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            if (response.equals("success")) {
                                openMainMenuActivity();
                            } else if (response.equals("failure")) {
                                Toast.makeText(MainActivity.this, "Neteisingas įvestas paštas arba slaptažodis!", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(MainActivity.this, error.toString().trim(), Toast.LENGTH_SHORT).show();
                        }
                    }) {
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {
                            Map<String, String> data = new HashMap<>();
                            data.put("email", email.getText().toString().trim());
                            data.put("password", password.getText().toString().trim());
                            return data;
                        }
                    };
                    RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
                    requestQueue.add(stringRequest);
                }
            }
        });
    }



    private void openRegisterActivity() {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }

    private void openMainMenuActivity() {
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
    }
}
