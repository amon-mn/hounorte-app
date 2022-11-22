package com.example.hounorte.vestibulares;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.hounorte.R;
import com.google.android.material.button.MaterialButton;

public class Enem extends AppCompatActivity {

    private MaterialButton setaVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enem);
        IniciarComponentes();

        setaVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    private void IniciarComponentes(){
        setaVoltar = findViewById(R.id.btn_back_vstb);
    }
}