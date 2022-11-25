package com.example.hounorte.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hounorte.R;
import com.example.hounorte.school.Biologia;
import com.example.hounorte.school.Geografia;
import com.example.hounorte.school.Historia;
import com.example.hounorte.school.Matematica;
import com.example.hounorte.school.Portugues;
import com.example.hounorte.school.Quimica;
import com.example.hounorte.vestibulares.Enem;
import com.example.hounorte.vestibulares.Macro;
import com.example.hounorte.vestibulares.Psc;
import com.example.hounorte.vestibulares.Sis;


public class PaginaInicialFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pagina_inicial, container, false);

        CardView cv_historia, cv_geografia, cv_portugues, cv_matematica, cv_quimica, cv_biologia;

        cv_portugues = (CardView) view.findViewById(R.id.cv_portugues);
        cv_historia = (CardView) view.findViewById(R.id.cv_historia);
        cv_geografia = (CardView) view.findViewById(R.id.cv_geografia);
        cv_matematica = (CardView) view.findViewById(R.id.cv_matematica);
        cv_quimica = (CardView) view.findViewById(R.id.cv_quimica);
        cv_biologia = (CardView) view.findViewById(R.id.cv_biologia);

        cv_portugues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Portugues.class);
                startActivity(in);
            }
        });

        cv_matematica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new Intent(getActivity(), Matematica.class);
                startActivity(in2);
            }
        });

        cv_historia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3 = new Intent(getActivity(), Historia.class);
                startActivity(in3);
            }
        });

        cv_geografia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4 = new Intent(getActivity(), Geografia.class);
                startActivity(in4);
            }
        });

        cv_quimica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in5 = new Intent(getActivity(), Quimica.class);
                startActivity(in5);
            }
        });

        cv_biologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in6 = new Intent(getActivity(), Biologia.class);
                startActivity(in6);
            }
        });

        CardView cv_enem, cv_psc, cv_sis, cv_macro;

        cv_enem = (CardView) view.findViewById(R.id.cv_enem);
        cv_psc =  (CardView) view.findViewById(R.id.cv_psc);
        cv_sis = (CardView) view.findViewById(R.id.cv_sis);
        cv_macro = (CardView) view.findViewById(R.id.cv_macro);

        cv_enem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Enem.class);
                startActivity(in);
            }
        });

        cv_psc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new Intent(getActivity(), Psc.class);
                startActivity(in2);
            }
        });

        cv_sis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3 = new Intent(getActivity(), Sis.class);
                startActivity(in3);
            }
        });

        cv_macro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4 = new Intent(getActivity(), Macro.class);
                startActivity(in4);
            }
        });

        return view;
    }
}