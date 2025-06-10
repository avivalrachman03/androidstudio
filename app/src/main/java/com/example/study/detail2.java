package com.example.study;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class detail2 extends AppCompatActivity {
    Intent intent;
    Button btn_kembali;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail2);
        btn_kembali = findViewById(R.id.kembali2);

        btn_kembali.setOnClickListener(v -> {
            intent = new Intent(detail2.this, home.class);
            startActivity(intent);
            finish();
        });
    }
}