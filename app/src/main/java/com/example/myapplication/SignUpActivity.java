package com.example.myapplication;

import android.widget.Button;
import android.os.Bundle;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        Button signUpBtn = findViewById(R.id.signUp_button);
        Button backBtn = findViewById(R.id.backButton);
        signUpBtn.setOnClickListener(v->{
            Intent intent = new Intent(SignUpActivity.this, DashboardActivity.class);
            startActivity(intent);
        });
        backBtn.setOnClickListener(v ->{
            Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
