package com.example.hounorte.fragments;

import android.content.Intent;
import android.os.Bundle;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hounorte.FormLogin;
import com.example.hounorte.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;

public class PaginaPerfilFragment extends Fragment {

    private TextView nomeUsuario, emailUsuario;
    private MaterialButton bt_deslogar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pagina_perfil, container, false);

        nomeUsuario = view.findViewById(R.id.perfil_nome);
        emailUsuario = view.findViewById(R.id.perfil_email);
        bt_deslogar = view.findViewById(R.id.btn_logout);

        bt_deslogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getActivity(), FormLogin.class);
                startActivity(intent);
                getActivity().finish();
            }
        });

        return view;
    }

}
