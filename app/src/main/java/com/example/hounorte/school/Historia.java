package com.example.hounorte.school;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.hounorte.R;
import com.google.android.material.button.MaterialButton;

public class Historia extends AppCompatActivity {

    private MaterialButton backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia);
        InitComponents();

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    private void InitComponents(){
        backButton = findViewById(R.id.btn_back_quiz);
    }
}