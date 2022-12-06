package com.example.hounorte;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.content.Intent;
import android.os.Bundle;

public class Resultados extends AppCompatActivity {

    private AppCompatButton btn_pagina_principal;
    private AppCompatButton btn_refazer_teste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        InitComponents();

        btn_pagina_principal.setOnClickListener(v -> {
            Intent intent = new Intent(Resultados.this, PaginaInicial.class);
        });

        btn_refazer_teste.setOnClickListener(v -> onBackPressed());
    }

    private void InitComponents(){
        btn_pagina_principal = findViewById(R.id.btn_pagina_principal);
        btn_refazer_teste = findViewById(R.id.btn_refazer_teste);
    }
}