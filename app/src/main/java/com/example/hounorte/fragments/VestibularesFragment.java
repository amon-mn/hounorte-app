package com.example.hounorte.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.hounorte.R;
import com.example.hounorte.Vestibular;


public class VestibularesFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_vestibulares, container, false);

        CardView cv_vest1 = (CardView) view.findViewById(R.id.cv_vest1);

        cv_vest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Vestibular.class);
                startActivity(in);
            }
        });





        return view;
    }
}