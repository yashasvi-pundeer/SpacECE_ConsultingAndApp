package com.sphydro.spaece_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

public class LoginActivity extends AppCompatActivity {

    TextInputEditText username, password;
    Button login_b;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

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

        username = findViewById(R.id.username_view);
        password = findViewById(R.id.password_view);
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                String LoginName, LoginPasskey;
                LoginName = username.getText().toString();
                LoginPasskey = password.getText().toString();
                if (!LoginName.equals("") && !LoginPasskey.equals("")) {
                    //Starting Write and Read data with URL
                    //Creating array for parameters
                    String[] field = new String[2];
                    field[0] = "username ";
                    field[1] = "password";
                    //Creating array for data
                    String[] data = new String[2];
                    data[0] = LoginName;
                    data[1] = LoginPasskey;
//                    PutData putData = new PutData("https://projects.vishnusivadas.com/AdvancedHttpURLConnection/putDataTest.php", "POST", field, data);
//                    if (putData.startPut()) {
//                        if (putData.onComplete()) {
//                            String result = putData.getResult();
//                        }
//                    }
                    if (LoginName.equals("Nikhil") && LoginPasskey.equals("password")) {
                        openSearch();
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Invalid Username/Password", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "Fill all fields!", Toast.LENGTH_SHORT).show();
                }
            }

        });


    }


    private void openRegister() {
            Intent intent = new Intent(this, SelectorActivity.class);
            startActivity(intent);
    }
    private void openSearch(){
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);
    }
}