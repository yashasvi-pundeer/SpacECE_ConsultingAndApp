package com.sphydro.spaece_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class ConsultantSignupActivity extends AppCompatActivity {

    TextInputEditText license, username, email, phone, CAT2, CAT3, CAT4, Password;
    Button Register;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultant_signup);

        license = findViewById(R.id.License);
        username = findViewById(R.id.username);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.mobile);
        Password = findViewById(R.id.password);
        CAT2 = findViewById(R.id.License);
        CAT3 = findViewById(R.id.License);
        CAT4 = findViewById(R.id.License);
        Register = findViewById(R.id.button_register_consultant);
        tv1 = findViewById(R.id.switch_login);

        tv1.setOnClickListener(v -> {
            openLogin();
        });

        Register.setOnClickListener(v -> {
            registerConsultant();
        });
    }

    private void registerConsultant() {

    }

    private void openLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}