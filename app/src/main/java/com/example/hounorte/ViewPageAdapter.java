package com.example.hounorte;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.hounorte.fragments.ListasExerciciosFragment;
import com.example.hounorte.fragments.PaginaInicialFragment;
import com.example.hounorte.fragments.VestibularesFragment;

public class ViewPageAdapter extends FragmentStateAdapter {


    public ViewPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = null;
        if (position == 0)
        {
            fragment = new PaginaInicialFragment();
        }
        else if (position == 1)
        {
            fragment = new ListasExerciciosFragment();
        }
        else if (position == 2)
        {
            fragment = new VestibularesFragment();
        }
        else if (position == 3)
        {
            fragment = new PaginaPerfilFragment();
        }
        assert fragment != null;
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
