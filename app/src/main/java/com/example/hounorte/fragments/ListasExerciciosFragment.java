package com.example.hounorte.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hounorte.R;
import com.example.hounorte.school.Portugues;


public class ListasExerciciosFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_listas_exercicios, container, false);

        CardView cv_disciplina1 = (CardView) view.findViewById(R.id.cv_disciplina1);
        cv_disciplina1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Portugues.class);
                startActivity(in);
            }
        });



        return view;
    }
}