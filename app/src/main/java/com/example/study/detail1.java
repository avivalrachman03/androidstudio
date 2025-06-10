package com.example.study;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class detail1 extends AppCompatActivity {
    Intent intent;
    Button btn_pesan ,btn_kembali;
    CheckBox cb_double_bed, cb_swimm;
    TextView tv_result;
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail1);
        btn_kembali = findViewById(R.id.kembali1);
        btn_pesan = findViewById(R.id.bPesan);
        cb_double_bed= findViewById(R.id.cbDoubleBed);
        cb_swimm = findViewById(R.id.cbSwimm);
        tv_result = findViewById(R.id.result);
        btn_pesan.setOnClickListener(v -> {
            StringBuilder result = new StringBuilder("Layanan yang dipilih \n");
                if(cb_double_bed.isChecked()){
                    result.append("\n > Double Bad");
                }
                if(cb_swimm.isChecked()){
                    result.append("\n > Swimming Poll");
                }
                if(!cb_double_bed.isChecked() && !cb_swimm.isChecked()){
                    result.append("\nTanpa paket tambahan");
                }
            tv_result.setText(result.toString());
        });
        btn_kembali.setOnClickListener(v -> {
            intent = new Intent(detail1.this, home.class);
            startActivity(intent);
            finish();
        });

    }
}