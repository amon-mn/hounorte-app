package com.example.hounorte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;


import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class RecuperarSenha extends AppCompatActivity {


    private FloatingActionButton arrow_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_senha);
        IniciarComponentes();

        arrow_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    private void IniciarComponentes(){
        arrow_back = findViewById(R.id.fab_arrow_back_recuperar);
    }
}