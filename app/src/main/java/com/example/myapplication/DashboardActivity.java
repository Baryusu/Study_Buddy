package com.example.myapplication;

import android.widget.Button;
import android.os.Bundle;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.card.MaterialCardView;

public class DashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.dashboard);

        Button logoutBtn = findViewById(R.id.logout_button);
        MaterialCardView cardView = findViewById(R.id.resource_card);

        logoutBtn.setOnClickListener(v ->{
            Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
            startActivity(intent);

        });
        cardView.setOnClickListener(v ->{
            Intent intent = new Intent(DashboardActivity.this, ResourceActivity.class);
            startActivity(intent);
        });
    }
}
