package com.example.hounorte.vestibulares;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.hounorte.R;
import com.google.android.material.button.MaterialButton;

public class Ifam extends AppCompatActivity {

    private MaterialButton backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ifam);
        InitComponents();

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    private void InitComponents(){
        backButton = findViewById(R.id.btn_back_vstb);
    }
}