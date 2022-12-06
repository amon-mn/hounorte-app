package com.example.hounorte;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.hounorte.school.Historia;

public class Resultados extends AppCompatActivity {

    private AppCompatButton btn_pagina_principal;
    TextView acerto, erro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        InitComponents();

        Intent i=getIntent();
        String correct = i.getStringExtra("correct");
        String wrong = i.getStringExtra("wrong");

        acerto.setText(correct);
        erro.setText(wrong);


        btn_pagina_principal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PaginaInicial.class);
                startActivity(intent);
            }
        });
    }




    private void InitComponents(){
        btn_pagina_principal = findViewById(R.id.btn_pagina_principal);
        acerto=findViewById(R.id.correct);
        erro=findViewById(R.id.wrong);
    }
}