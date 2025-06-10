package com.example.study;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

public class error extends AppCompatActivity {
    Button btn_kemabli;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_error);
        btn_kemabli = findViewById(R.id.btn_err_kemabali);
        btn_kemabli.setOnClickListener(v -> {
            intent = new Intent(error.this, home.class);
            finish();
        });
    }
}