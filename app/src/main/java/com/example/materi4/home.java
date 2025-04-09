package com.example.materi4;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class home extends AppCompatActivity {

    //deklarasi komponen
    Intent intent;
    Button btn_back;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        //inisialisasi komponen
        btn_back = findViewById(R.id.bBack);

        //event set on click listener
        btn_back.setOnClickListener(v -> {
            intent = new Intent(home.this, MainActivity.class);
            startActivity(intent);
            //untuk mengakhiri sesi halaman sebelumnya
            finish();
        });
    }
}