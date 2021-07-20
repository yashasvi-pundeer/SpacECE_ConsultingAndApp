package com.sphydro.spaece_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class UserSignupActivity extends AppCompatActivity {

    TextInputEditText name, username, email, phone, password;
    Button signup;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


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
        name = findViewById(R.id.textInputEditText);
        username = findViewById(R.id.textInputEditText2);
        email = findViewById(R.id.textInputEditText3);
        phone = findViewById(R.id.textInputEditText4);
        password = findViewById(R.id.textInputEditText5);


        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                String RegName, RegUser, RegMail, RegPhone, RegPassword;

                RegUser = username.getText().toString();
                RegName = name.getText().toString();
                RegMail = email.getText().toString();
                RegPhone = phone.getText().toString();
                RegPassword = password.getText().toString();

                if (!RegName.equals("") && !RegPassword.equals("") && !RegPhone.equals("") && !RegMail.equals("") && !RegUser.equals("")) {

                    String[] field = new String[5];
                    field[0] = "username";
                    field[1] = "name";
                    field[2] = "email";
                    field[3] = "phone";
                    field[4] = "password";
                    //Creating array for data
                    String[] data = new String[5];
                    data[0] = RegUser;
                    data[1] = RegName;
                    data[2] = RegMail;
                    data[3] = RegPhone;
                    data[4] = RegPassword;
    //                    PutData putData = new PutData("https://projects.vishnusivadas.com/AdvancedHttpURLConnection/putDataTest.php", "POST", field, data);
    //                    if (putData.startPut()) {
    //                        if (putData.onComplete()) {
    //                            String result = putData.getResult();
    //                        }
    //                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "All fields mandatory!", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }

    private void openLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}