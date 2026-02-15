package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;


public class ResourceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.resource_library);

        Button backBtn = findViewById(R.id.backButton);
        Button logoutBtn = findViewById(R.id.logout_button);

        backBtn.setOnClickListener(v ->{
            Intent intent = new Intent(ResourceActivity.this, DashboardActivity.class);
            startActivity(intent);
        });

        logoutBtn.setOnClickListener(v ->{
            Intent intent = new Intent(ResourceActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
