package com.example.hounorte.fragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.hounorte.R;
import com.example.hounorte.vestibulares.Enem;
import com.example.hounorte.vestibulares.Ifam;
import com.example.hounorte.vestibulares.Macro;
import com.example.hounorte.vestibulares.Psc;
import com.example.hounorte.vestibulares.Sis;


public class VestibularesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_vestibulares, container, false);

        CardView cv_ifam, cv_macro, cv_enem, cv_psc, cv_sis;

        cv_ifam = (CardView) view.findViewById(R.id.cv_ifam);
        cv_macro = (CardView) view.findViewById(R.id.cv_macro);
        cv_enem = (CardView) view.findViewById(R.id.cv_enem);
        cv_psc = (CardView) view.findViewById(R.id.cv_psc);
        cv_sis = (CardView) view.findViewById(R.id.cv_sis);

        cv_ifam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Ifam.class);
                startActivity(in);
            }
        });

        cv_macro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new Intent(getActivity(), Macro.class);
                startActivity(in2);
            }
        });

        cv_enem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3 = new Intent(getActivity(), Enem.class);
                startActivity(in3);
            }
        });

        cv_psc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4 = new Intent(getActivity(), Psc.class);
                startActivity(in4);
            }
        });

        cv_sis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in5 = new Intent(getActivity(), Sis.class);
                startActivity(in5);
            }
        });

        return view;
    }
}