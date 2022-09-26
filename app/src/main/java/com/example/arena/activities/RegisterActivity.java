package com.example.arena.activities;

import androidx.appcompat.app.AppCompatActivity;

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

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {

    private final String URL = "http://10.0.2.2/ArenaServer/register.php";
    private EditText email, password, phoneNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TextView login = findViewById(R.id.textLogin);
        email = findViewById(R.id.editEmailreg);
        password = findViewById(R.id.editPswreg);
        phoneNumber = findViewById(R.id.editTelreg);
        Button button = findViewById(R.id.buttRegister);

        login.setOnClickListener(v -> openMainActivity());

        button.setOnClickListener(v -> {
            if (!email.getText().toString().trim().equals("") && !password.getText().toString().trim().equals("") && !phoneNumber.getText().toString().trim().equals("")) {
                StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, response -> {
                    if (response.equals("success")) {
                        Toast.makeText(getApplicationContext(), "Paskyra sukurta!", Toast.LENGTH_SHORT).show();
                        openMainActivity();
                    } else if (response.equals("failure")) {
                        Toast.makeText(getApplicationContext(), "Įvyko klaida, bandykite dar kartą", Toast.LENGTH_SHORT).show();
                    }
                }, error -> Toast.makeText(getApplicationContext(), error.toString().trim(), Toast.LENGTH_SHORT).show()) {
                    @Override
                    protected Map<String, String> getParams() {
                        Map<String, String> data = new HashMap<>();
                        data.put("email", email.getText().toString().trim());
                        data.put("phoneNumber", phoneNumber.getText().toString().trim());
                        data.put("password", password.getText().toString().trim());
                        return data;
                    }
                };
                RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
                requestQueue.add(stringRequest);
            }

        });
    }

    private void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}