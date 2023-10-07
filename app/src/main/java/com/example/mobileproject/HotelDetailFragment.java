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


public class HotelDetailFragment extends Fragment {
    // ...


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hotel_detail, container, false);

        // Obtenir une référence au bouton de retour par son ID
        Button backButton = view.findViewById(R.id.backButton);

        // Ajouter un écouteur de clic au bouton de retour
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lorsque le bouton de retour est cliqué, revenir à l'interface de liste des hôtels
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                fragmentManager.popBackStack(); // Retour à l'écran précédent dans la pile des fragments
            }
        });


        // Obtenir une référence au bouton de réserver par son ID
        Button reserveButton = view.findViewById(R.id.reservation_button);

        // Ajouter un écouteur de clic au bouton de réserver
        reserveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lorsque le bouton est cliqué, naviguer vers le fragment des détails de l'hôtel
                ReservationFragment reservationFragment = new ReservationFragment();

                // Utiliser le gestionnaire de fragments pour remplacer le fragment actuel par le fragment des détails
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.fragment_container, reservationFragment);
                transaction.addToBackStack(null); // Ajouter au back stack pour la navigation de retour
                transaction.commit();
            }
        });

        return view;
    }


    // ...
}
