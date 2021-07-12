package com.sphydro.spaece_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    TextInputEditText username, password;
    Button login;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.textInputEditText5);
        login = (Button) findViewById(R.id.login_button);
        tv = findViewById(R.id.switch_signup_button);

        tv.setOnClickListener(v -> {
            openRegister();
            });
        }

    private void openRegister() {
            Intent intent = new Intent(this, SelectorActivity.class);
            startActivity(intent);
    }
}