package com.example.mobileproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


public class ReservationFragment extends Fragment {
    private EditText fullNameEditText;
    private EditText emailEditText;
    private EditText checkInDateEditText;
    private Button confirmReservationButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_reservation, container, false);
        // Ajouter un écouteur de clic au bouton de retour
        // Obtenir une référence au bouton de retour par son ID
        ImageView backButton = view.findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lorsque le bouton de retour est cliqué, revenir à l'interface de liste des hôtels
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                fragmentManager.popBackStack(); // Retour à l'écran précédent dans la pile des fragments
            }
        });
        // Initialize UI elements
        fullNameEditText = view.findViewById(R.id.full_name_edittext);
        emailEditText = view.findViewById(R.id.email_edittext);
        checkInDateEditText = view.findViewById(R.id.check_in_date_edittext);
        confirmReservationButton = view.findViewById(R.id.confirm_reservation_button);

        // Set click listener for the confirm reservation button
        confirmReservationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle reservation confirmation here
                String fullName = fullNameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String checkInDate = checkInDateEditText.getText().toString();

                // Perform reservation logic (e.g., send data to a server, save to a database, etc.)

                // You can also navigate back to the hotel details or another fragment/activity here
            }
        });

        return view;
    }

}