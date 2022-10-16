package com.example.hounorte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FormLogin extends AppCompatActivity {

    private TextView txt_cadastre_se;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        IniciarComponentes();

        txt_cadastre_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), FormCadastro.class);
                startActivity(intent);
            }
        });
    }

    private void IniciarComponentes(){
        txt_cadastre_se = findViewById(R.id.txt_cadastre_se);
    }

}