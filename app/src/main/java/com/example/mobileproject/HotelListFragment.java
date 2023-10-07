package com.example.mobileproject;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class HotelListFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hotel_list, container, false);


        Button viewButton = view.findViewById(R.id.viewButton);


        viewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HotelDetailFragment detailsFragment = new HotelDetailFragment();


                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.fragment_container, detailsFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        Button addButton = view.findViewById(R.id.addButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AjouterFragment ajouterFragment = new AjouterFragment();


                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.fragment_container, ajouterFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        return view;
    }

}


