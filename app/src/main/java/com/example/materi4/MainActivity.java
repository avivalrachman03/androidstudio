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

public class MainActivity extends AppCompatActivity {

    //deklarasi komponen
    Intent intent;
    Button btn_Home;
    Button btn_About;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        //inisialisasi komponen
        btn_Home = findViewById(R.id.bHome);

        //event set on click listener
        btn_Home.setOnClickListener(v -> {
            intent = new Intent(MainActivity.this, home.class);
            startActivity(intent);
            //untuk mengakhiri sesi halaman sebelumnya
            finish();
        });
        //inisialisasi komponen
        btn_About = findViewById(R.id.bAbout);

        //event set on click listener
        btn_About.setOnClickListener(v -> {
            intent = new Intent(MainActivity.this, about.class);
            startActivity(intent);
            //untuk mengakhiri sesi halaman sebelumnya
            finish();
        });
    }
}