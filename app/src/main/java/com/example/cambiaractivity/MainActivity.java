package com.example.cambiaractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    TextView mostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mostrar=findViewById(R.id.variable);
        btn1=findViewById(R.id.btn1);
        Bundle b=new Bundle();
        b=getIntent().getExtras();
        String nom=b.getString("nombre");
        String ape=b.getString("apellido");
        mostrar.setText(nom + " " + ape);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirpagina=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hermosaprogramacion.com/2015/08/tutorial-layouts-en-android/"));
                startActivity(abrirpagina);
            }
        });


    }

}