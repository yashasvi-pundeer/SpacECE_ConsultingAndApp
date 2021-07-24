package com.sphydro.spaece_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    TextInputEditText username, password;
    Button login_b;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.textInputEditText5);
        login_b = findViewById(R.id.login_button);
        tv = findViewById(R.id.switch_signup_button);

        tv.setOnClickListener(v -> {
            openRegister();
            });

        login_b.setOnClickListener(v -> {
            checkUser();
        });
    }

    private void checkUser() {

    }


    private void openRegister() {
            Intent intent = new Intent(this, SelectorActivity.class);
            startActivity(intent);
    }
}