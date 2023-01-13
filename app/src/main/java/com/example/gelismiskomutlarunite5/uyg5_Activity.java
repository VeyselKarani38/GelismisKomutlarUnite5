package com.example.gelismiskomutlarunite5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class uyg5_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnHesapla = findViewById(R.id.btnHesapla);
        btnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextCihazAdi = findViewById(R.id.editTextCihazAdi);
                EditText editTextKw = findViewById(R.id.editTextKW);
                EditText editTextGunlukkullanim = findViewById(R.id.editTextSaat);

                TextView textViewsonuc =findViewById(R.id.textViewSonuc);
                String cihazAdi = editTextCihazAdi.getText().toString();
                int kw =Integer.parseInt(editTextKw.getText().toString());
                int saat =Integer.parseInt(editTextGunlukkullanim.getText().toString());

                ELektirkliCihaz cihaz1 = new ELektirkliCihaz();
                cihaz1.cihazAdi=cihazAdi;
                cihaz1.cihazKW= kw;
                cihaz1.gunluksaaatkullanim=saat;
                int sonuc = cihaz1.aylikkullanim();
                textViewsonuc.setText(Integer.toString(sonuc));



            }
        });
    }
}
