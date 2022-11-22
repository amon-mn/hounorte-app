package com.example.hounorte.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hounorte.R;
import com.example.hounorte.Vestibular;
import com.example.hounorte.school.Portugues;
import com.example.hounorte.vestibulares.Enem;


public class PaginaInicialFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pagina_inicial, container, false);

        CardView cv_enem = (CardView) view.findViewById(R.id.cv_enem);
        CardView cv_portugues = (CardView) view.findViewById(R.id.cv_portugues);


        cv_enem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Enem.class);
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
}