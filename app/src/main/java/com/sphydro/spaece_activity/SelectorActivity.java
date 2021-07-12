package com.sphydro.spaece_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;

public class SelectorActivity extends AppCompatActivity {

    Button consultant, user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);

        consultant = findViewById(R.id.consultant_signup);
        user = findViewById(R.id.user_signup);

        user.setOnClickListener(v -> {
            openUserSignUp();
        });

        consultant.setOnClickListener(v -> {
            openConsultantSignUp();
        });
    }

    private void openConsultantSignUp() {
        Intent intent = new Intent(this, ConsultantSignupActivity.class);
        startActivity(intent);
    }

    private void openUserSignUp() {
        Intent intent = new Intent(this, UserSignupActivity.class);
        startActivity(intent);
    }


}