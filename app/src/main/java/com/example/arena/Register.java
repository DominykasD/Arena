package com.example.arena;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.arena.activities.MainActivity;

import java.util.HashMap;
import java.util.Map;

public class Register extends AppCompatActivity {

    private TextView login;
    private Button button;
    private EditText email, password, phoneNumber;
    private String URL = "http://10.0.2.2/ArenaServer/register.php";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        login = (TextView) findViewById(R.id.textLogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        email = (EditText) findViewById(R.id.editEmailreg);
        password = (EditText) findViewById(R.id.editPswreg);
        phoneNumber = (EditText) findViewById(R.id.editTelreg);
        button = (Button) findViewById(R.id.buttRegister);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!email.getText().toString().trim().equals("") && !password.getText().toString().trim().equals("") && !phoneNumber.getText().toString().trim().equals("")) {
                    StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            if (response.equals("success")) {
                                Toast.makeText(getApplicationContext(), "Paskyra sukurta!", Toast.LENGTH_SHORT).show();
//                                openMainActivity();
                            } else if (response.equals("failure")) {
                                Toast.makeText(getApplicationContext(), "Įvyko klaida, bandykite dar kartą", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(getApplicationContext(), error.toString().trim(), Toast.LENGTH_SHORT).show();
                        }
                    }) {
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {
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

            }
        });
    }

    private void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}