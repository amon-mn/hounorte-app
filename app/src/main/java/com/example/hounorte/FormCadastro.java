package com.example.hounorte;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FormCadastro extends AppCompatActivity {

    private TextView txt_login;
    private AppCompatButton btn_criar_conta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        IniciarComponentes();

        txt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), FormLogin.class);
                startActivity(intent);
            }
        });

        btn_criar_conta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PaginaInicial.class);
                startActivity(intent);
            }
        });

    }

    private void IniciarComponentes(){
        txt_login = findViewById(R.id.txt_login);
        btn_criar_conta = findViewById(R.id.btn_criar_conta);
    }

}