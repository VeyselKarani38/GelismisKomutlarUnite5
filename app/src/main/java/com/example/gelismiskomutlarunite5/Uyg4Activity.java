package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg4Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg4_activity);
        EditText editText1 = findViewById(R.id.edittext1);
        EditText editText2 = findViewById(R.id.edittext2);
        EditText editText3 = findViewById(R.id.edittext3);
        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        TextView txt =findViewById(R.id.textView1);
        TextView txt2 =findViewById(R.id.textView2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1;
                sayi1 = Integer.parseInt(editText1.getText().toString());
                int sayi2;
                sayi2 = Integer.parseInt(editText2.getText().toString());
                txt.setText("sonuc " + topla(editText1,editText2));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1;
                sayi1 = Integer.parseInt(editText1.getText().toString());
                int sayi2;
                sayi2 = Integer.parseInt(editText2.getText().toString());
                int sayi3;
                sayi3 = Integer.parseInt(editText3.getText().toString());
                txt.setText("sonuc " + topla(editText1,editText2,editText3));
            }
        });
    }
    public int topla(EditText txt1, EditText txt2){
        return Integer.parseInt(txt1.getText().toString()) + Integer.parseInt(txt2.getText().toString());
    }
    public int topla(EditText txt1, EditText txt2, EditText txt3){
        return Integer.parseInt(txt1.getText().toString()) + Integer.parseInt(txt2.getText().toString())+ Integer.parseInt(txt3.getText().toString());
    }
}
