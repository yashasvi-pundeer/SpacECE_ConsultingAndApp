package com.sphydro.spaece_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class UserSignupActivity extends AppCompatActivity {

    TextInputEditText name, username, email, phone, password;
    Button signup;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        name = findViewById(R.id.textInputEditText);
        username = findViewById(R.id.textInputEditText2);
        email = findViewById(R.id.textInputEditText3);
        phone = findViewById(R.id.textInputEditText4);
        password = findViewById(R.id.textInputEditText5);
        signup = (Button) findViewById(R.id.button_register_user);
        tv = findViewById(R.id.switch_login_button);

        tv.setOnClickListener(v -> {
            openLogin();
            });

        signup.setOnClickListener(v -> {
            registerUser();
        });
    }

    private void registerUser() {
    }

    private void openLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}