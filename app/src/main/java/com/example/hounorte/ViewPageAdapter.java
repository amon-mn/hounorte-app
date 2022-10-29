package com.example.hounorte;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

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
        assert fragment != null;
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
