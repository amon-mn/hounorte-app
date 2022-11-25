package com.example.hounorte.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hounorte.R;
import com.example.hounorte.school.Artes;
import com.example.hounorte.school.Biologia;
import com.example.hounorte.school.Espanhol;
import com.example.hounorte.school.Filosofia;
import com.example.hounorte.school.Fisica;
import com.example.hounorte.school.Geografia;
import com.example.hounorte.school.Historia;
import com.example.hounorte.school.Ingles;
import com.example.hounorte.school.Matematica;
import com.example.hounorte.school.Portugues;
import com.example.hounorte.school.Quimica;
import com.example.hounorte.school.Sociologia;


public class ListasExerciciosFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        CardView cv_historia, cv_geografia, cv_filosofia, cv_sociologia, cv_artes, cv_portugues, cv_ingles, cv_espanhol, cv_fisica, cv_matematica, cv_quimica, cv_biologia;

        View view = inflater.inflate(R.layout.fragment_listas_exercicios, container, false);

        cv_historia = (CardView) view.findViewById(R.id.cv_historia);
        cv_geografia = (CardView) view.findViewById(R.id.cv_geografia);
        cv_filosofia = (CardView) view.findViewById(R.id.cv_filosofia);
        cv_sociologia = (CardView) view.findViewById(R.id.cv_sociologia);
        cv_artes = (CardView) view.findViewById(R.id.cv_artes);
        cv_portugues = (CardView) view.findViewById(R.id.cv_portugues);
        cv_ingles = (CardView) view.findViewById(R.id.cv_ingles);
        cv_espanhol = (CardView) view.findViewById(R.id.cv_espanhol);
        cv_fisica = (CardView) view.findViewById(R.id.cv_fisica);
        cv_matematica = (CardView) view.findViewById(R.id.cv_matematica);
        cv_quimica = (CardView) view.findViewById(R.id.cv_quimica);
        cv_biologia = (CardView) view.findViewById(R.id.cv_biologia);

        cv_historia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Historia.class);
                startActivity(in);
            }
        });

        cv_geografia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new Intent(getActivity(), Geografia.class);
                startActivity(in2);
            }
        });

        cv_filosofia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3 = new Intent(getActivity(), Filosofia.class);
                startActivity(in3);
            }
        });

        cv_sociologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4 = new Intent(getActivity(), Sociologia.class);
                startActivity(in4);
            }
        });

        cv_artes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in5 = new Intent(getActivity(), Artes.class);
                startActivity(in5);
            }
        });

        cv_portugues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in6 = new Intent(getActivity(), Portugues.class);
                startActivity(in6);
            }
        });

        cv_ingles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Ingles.class);
                startActivity(in);
            }
        });

        cv_espanhol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in7 = new Intent(getActivity(), Espanhol.class);
                startActivity(in7);
            }
        });

        cv_fisica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in8 = new Intent(getActivity(), Fisica.class);
                startActivity(in8);
            }
        });

        cv_matematica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in9 = new Intent(getActivity(), Matematica.class);
                startActivity(in9);
            }
        });

        cv_quimica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in10 = new Intent(getActivity(), Quimica.class);
                startActivity(in10);
            }
        });

        cv_biologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in11 = new Intent(getActivity(), Biologia.class);
                startActivity(in11);
            }
        });

        return view;
    }
}