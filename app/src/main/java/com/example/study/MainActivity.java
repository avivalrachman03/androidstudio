package com.example.study;


import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn_Mulai;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

//        inisialisasi komponen
        btn_Mulai = findViewById(R.id.bMulai);

        //event set on click listener
        btn_Mulai.setOnClickListener(v -> {
            intent = new Intent(MainActivity.this, home.class);
            startActivity(intent);
            //untuk mengakhiri sesi halaman sebelumnya
            finish();
        });

    }
}