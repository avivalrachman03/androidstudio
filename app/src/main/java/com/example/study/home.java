package com.example.study;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {
    Button detail_1, detail_2;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        detail_1 = findViewById(R.id.detail1);
        detail_2 = findViewById(R.id.detail2);

        detail_1.setOnClickListener(v -> {
            intent = new Intent(home.this, detail1.class);
            startActivity(intent);
            finish();
        });

        detail_2.setOnClickListener(v -> {
            intent = new Intent(home.this, detail2.class);
            startActivity(intent);
            finish();
        });
    }
}