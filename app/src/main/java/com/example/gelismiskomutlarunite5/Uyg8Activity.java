package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg8Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg8_activity);
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg8Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
