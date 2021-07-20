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

public class ConsultantSignupActivity extends AppCompatActivity {

    TextInputEditText local_license, local_username, local_email, local_phone, local_CAT2, local_CAT3, local_CAT4, local_password;
    Button Register;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultant_signup);

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

        local_license = findViewById(R.id.License);
        local_username= findViewById(R.id.username);
        local_email = findViewById(R.id.email);
        local_phone = findViewById(R.id.mobile);
        local_password = findViewById(R.id.password);
        local_CAT2 = findViewById(R.id.CAT2);
        local_CAT3 = findViewById(R.id.CAT3);
        local_CAT4 = findViewById(R.id.CAT4);


        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                String RegUser, RegLicense, RegMail, RegPhone, RegPassword, RegCAT2, RegCAT3, RegCAT4;

                RegLicense = local_license.getText().toString();
                RegUser = local_username.getText().toString();
                RegMail = local_email.getText().toString();
                RegPhone = local_phone.getText().toString();
                RegPassword = local_password.getText().toString();
                RegCAT2 = local_CAT2.getText().toString();
                RegCAT3 = local_CAT3.getText().toString();
                RegCAT4 = local_CAT4.getText().toString();

                if (!RegPassword.equals("") && !RegPhone.equals("") && !RegMail.equals("") && !RegUser.equals("") && !RegCAT3.equals("") && !RegCAT2.equals("") && !RegCAT4.equals("")) {

                    String[] field = new String[8];
                    field[0] = "license";
                    field[1] = "username";
                    field[2] = "email";
                    field[3] = "phone";
                    field[4] = "password";
                    field[5] = "CAT2";
                    field[6] = "CAT3";
                    field[7] = "CAT4";
                    //Creating array for data
                    String[] data = new String[8];
                    data[0] = RegLicense;
                    data[1] = RegUser;
                    data[2] = RegMail;
                    data[3] = RegPhone;
                    data[4] = RegPassword;
                    data[5] = RegCAT2;
                    data[6] = RegCAT3;
                    data[7] = RegCAT4;
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