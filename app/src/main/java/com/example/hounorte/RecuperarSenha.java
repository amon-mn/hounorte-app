package com.example.hounorte;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;

public class RecuperarSenha extends AppCompatActivity {


    private FloatingActionButton arrow_back;
    private FirebaseAuth firebaseAuth;
    private EditText email;
    private AppCompatButton bt_recuperar;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_senha);

        firebaseAuth = FirebaseAuth.getInstance();
        IniciarComponentes();

        arrow_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onBackPressed();
            }
        });

        bt_recuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                firebaseAuth.sendPasswordResetEmail(email.getText().toString()).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(RecuperarSenha.this,"Recuperação de acesso iniciado. Email Enviado",
                                    Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(RecuperarSenha.this,"Falhou, Tente Novamente",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }
        });

    }
    private void IniciarComponentes(){

        arrow_back = findViewById(R.id.fab_arrow_back_recuperar);
        email = findViewById(R.id.edit_email);
        bt_recuperar = findViewById(R.id.bt_recuperar);

    }


}


