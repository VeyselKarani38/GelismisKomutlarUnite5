package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class Uyg6Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg6_activity);
        EditText editTextkisakenar = findViewById(R.id.kisakenar);
        EditText editTextuzunkenar = findViewById(R.id.uzunkenar);
        Button buttonkarealani = findViewById(R.id.karealanı);
        Button buttondikdortgenalani = findViewById(R.id.dortgenalanı);
        TextView textViewalan = findViewById(R.id.textalan);
        buttonkarealani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int kisaKenar = Integer.parseInt(editTextkisakenar.getText().toString());
                Uyg6Hesapla sa = new Uyg6Hesapla(kisaKenar);
                textViewalan.setText("Sonuç = " + sa.deger);
            }
        });
        buttondikdortgenalani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int uzunKenar = Integer.parseInt(editTextuzunkenar.getText().toString());
                int kisaKenar = Integer.parseInt(editTextkisakenar.getText().toString());
                Uyg6Hesapla sa = new Uyg6Hesapla(kisaKenar,uzunKenar);
                textViewalan.setText("Sonuç = " + sa.deger);
            }
        });
    }

        public void btnBack(View view) {
            Intent uyg = new Intent(Uyg6Activity.this, MainActivity.class);
            startActivity(uyg);
        }

}
