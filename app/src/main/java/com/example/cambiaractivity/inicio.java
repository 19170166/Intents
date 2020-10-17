package com.example.cambiaractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class inicio extends AppCompatActivity{
    TextView pantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        pantalla=(TextView) findViewById(R.id.cuenta);
        CountDownTimer cdt = new CountDownTimer(5000,10000) {
            @Override
            public void onTick(long segundos) {
                pantalla.setText(String.valueOf(segundos/1000));
            }

            @Override
            public void onFinish() {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();
            }
        };
        cdt.start();
    }

}