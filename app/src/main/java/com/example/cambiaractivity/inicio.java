package com.example.cambiaractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

public class inicio extends AppCompatActivity implements View.OnClickListener{
    TextView pantalla;
    Intent i=new Intent(getApplicationContext(),MainActivity.class);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        findViewById(R.id.btn1).setOnClickListener(this);
        pantalla=findViewById(R.id.cuenta);
    }

    @Override
    public void onClick(View v) {
        CountDownTimer cdt=new CountDownTimer(5000,1000) {
            @Override
            public void onTick(long segundos) {
                pantalla.setText(String.valueOf(segundos/1000));
            }
            @Override
            public void onFinish() {
            startActivity(i);
            finish();
            }
        };
        cdt.start();
    }
}