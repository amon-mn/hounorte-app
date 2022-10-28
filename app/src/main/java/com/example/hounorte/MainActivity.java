package com.example.hounorte;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private AppCompatButton btn_cadastrar;
    private AppCompatButton btn_cadastrado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IniciarComponentes();

        btn_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( MainActivity.this, FormCadastro.class);
                startActivity(intent);
            }
        });

        btn_cadastrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, FormLogin.class);
                startActivity(intent);
            }
        });
    }

    private void IniciarComponentes(){
        btn_cadastrar = findViewById(R.id.btn_me_cadastrar);
        btn_cadastrado = findViewById(R.id.btn_sou_cadastrado);
    }
}