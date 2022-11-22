package com.example.hounorte.fragments;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hounorte.R;
import com.example.hounorte.Vestibular;
import com.example.hounorte.school.Portugues;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;


public class PaginaInicialFragment extends Fragment {

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    private TextView nomeUsuario;
    String usuarioNome;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pagina_inicial, container, false);

        CardView cv_enem = (CardView) view.findViewById(R.id.cv_enem);
        CardView cv_portugues = (CardView) view.findViewById(R.id.cv_portugues);

        nomeUsuario = view.findViewById(R.id.nomeTelaInicial);

        cv_enem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Vestibular.class);
                startActivity(in);
            }
        });

        cv_portugues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Portugues.class);
                startActivity(in);
            }
        });



        return view;
    }

    @Override
    public void onStart() {
        super.onStart();

        usuarioNome = FirebaseAuth.getInstance().getCurrentUser().getUid();

        DocumentReference documentReference = db.collection("Usuarios").document(usuarioNome);
        documentReference.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException error) {
                if (documentSnapshot != null){
                    nomeUsuario.setText(documentSnapshot.getString("nome"));
                }
            }
        });

    }
}