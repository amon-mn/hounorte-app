package com.example.hounorte.fragments;
 
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.hounorte.FormLogin;
import com.example.hounorte.R;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.io.IOException;

public class PaginaPerfilFragment extends Fragment {

    private TextView nomeUsuario , sobreNomeUsuario, emailUsuario, senhaUsuario, tituloNomeUsuario, tituloSobrenomeUsuario;
    private MaterialButton bt_deslogar;
    private Button btn_edit_photo;
    private ImageView imageView5;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    String usuarioID;
    private Uri mSelectedUri;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pagina_perfil, container, false);

        nomeUsuario = view.findViewById(R.id.perfil_nome);
        sobreNomeUsuario = view.findViewById(R.id.perfil_sobrenome);
        emailUsuario = view.findViewById(R.id.perfil_email);
        bt_deslogar = view.findViewById(R.id.btn_logout);
        tituloNomeUsuario = view.findViewById(R.id.tituloNomeUsuario);
        tituloSobrenomeUsuario = view.findViewById(R.id.tituloSobreomeUsuario);
        btn_edit_photo = view.findViewById(R.id.btn_edit_photo);
        imageView5 = view.findViewById(R.id.imageView5);

        btn_edit_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectPhoto();
            }
        });


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

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 0) {
            assert data != null;
            mSelectedUri = data.getData();

            Bitmap bitmap = null;
            try{
                bitmap = MediaStore.Images.Media.getBitmap(getActivity().getContentResolver(),mSelectedUri);
                imageView5.setImageDrawable(new BitmapDrawable(bitmap));
                btn_edit_photo.setAlpha(0);
            } catch (IOException e) {

            }

        }
    }


    private  void selectPhoto(){
        Intent intente = new Intent(Intent.ACTION_PICK);
        intente.setType("image/*");
        startActivityForResult(intente,0);
    }


    @Override
    public void onStart() {
        super.onStart();

        usuarioID = FirebaseAuth.getInstance().getCurrentUser().getUid();

        DocumentReference documentReference = db.collection("Usuarios").document(usuarioID);
        documentReference.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException error) {
                if (documentSnapshot != null){
                    nomeUsuario.setText(documentSnapshot.getString("nome"));
                    sobreNomeUsuario.setText(documentSnapshot.getString("sobrenome"));
                    emailUsuario.setText(documentSnapshot.getString("email"));
                    tituloNomeUsuario.setText(documentSnapshot.getString("nome"));
                    tituloSobrenomeUsuario.setText((documentSnapshot.getString("sobrenome")));
                }
            }
        });

    }
    
}
