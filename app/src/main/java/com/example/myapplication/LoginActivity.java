package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        Button loginBtn = findViewById(R.id.login_button);
        Button logoutBtn = findViewById(R.id.backButton);
        loginBtn.setOnClickListener(v ->{
            Intent intent = new Intent(LoginActivity.this,DashboardActivity.class);
            startActivity(intent);
        });
        logoutBtn.setOnClickListener(v ->{
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
