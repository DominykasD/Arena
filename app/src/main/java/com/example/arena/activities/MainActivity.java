package com.example.arena.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.arena.R;
import com.example.arena.models.User;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends BaseActivity {

    private final String URL = "http://10.0.2.2/ArenaServer/login.php";

    private EditText email, password;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView register = findViewById(R.id.textRegister);
        email = findViewById(R.id.editEmail);
        password = findViewById(R.id.editPsw);
        Button button = findViewById(R.id.buttLogin);


        // Open Register activity
        register.setOnClickListener(v -> openRegisterActivity());


        // setText for testing purposes
        email.setText("test@arena.com");
        password.setText("test");

        button.setOnClickListener(v -> {
            if (!email.getText().toString().trim().equals("") && !password.getText().toString().trim().equals("")) {
                StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, response -> {
                    if (response.equals("success")) {
                        openMainMenuActivity();
                    } else if (response.equals("failure")) {
                        Toast.makeText(MainActivity.this, "Neteisingas įvestas paštas arba slaptažodis!", Toast.LENGTH_SHORT).show();
                    }
                }, error -> Toast.makeText(MainActivity.this, error.toString().trim(), Toast.LENGTH_SHORT).show()) {
                    @Override
                    protected Map<String, String> getParams() {
                        Map<String, String> data = new HashMap<>();
                        data.put("email", email.getText().toString().trim());
                        data.put("password", password.getText().toString().trim());
                        return data;
                    }
                };
                RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
                requestQueue.add(stringRequest);
            }


            User user = new User();
            user.setEmail(email.getText().toString());

            localStorage.setUser(user.getEmail());
        });
    }



    private void openRegisterActivity() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    private void openMainMenuActivity() {
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
    }

    @Override
    public void updateTotalPrice() {

    }
}
