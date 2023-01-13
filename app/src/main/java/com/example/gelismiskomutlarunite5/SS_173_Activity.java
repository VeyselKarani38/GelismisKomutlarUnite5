package com.example.gelismiskomutlarunite5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SS_173_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss_173_activity);
        EditText txt1 = findViewById(R.id.txt1);
        EditText txt2 = findViewById(R.id.txt2);
        Button btn1 =findViewById(R.id.merhaba1);
        Button btn2 = findViewById(R.id.merhaba2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SS_173_Activity.this, "merhaba "+adsoyad(txt1), Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SS_173_Activity.this, "iyi günler beyfendi "+adsoyad(txt1,txt2), Toast.LENGTH_SHORT).show();
            }
        });

    }
    public String adsoyad(EditText txt1){
        return txt1.getText().toString();
    }
    public String adsoyad(EditText txt1, EditText txt2){
        return txt1.getText().toString() + " " + txt2.getText().toString();
    }
}
