package com.example.mobileproject;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ModifFragment#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class ModifFragment extends Fragment {

    private EditText hotelNameEditText;
    private EditText hotelAddressEditText;
    private EditText hotelDescriptionEditText;
    private Button saveButton;
    private Button cancelButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_modif, container, false);


        hotelNameEditText = view.findViewById(R.id.editTextHotelName);
        hotelAddressEditText = view.findViewById(R.id.editTextHotelAddress);
        hotelDescriptionEditText = view.findViewById(R.id.editTextHotelDescription);
        saveButton = view.findViewById(R.id.buttonSave);
        cancelButton = view.findViewById(R.id.buttonCancel);


        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtenez les valeurs saisies dans les EditText
                String newName = hotelNameEditText.getText().toString();
                String newAddress = hotelAddressEditText.getText().toString();
                String newDescription = hotelDescriptionEditText.getText().toString();

                // Effectuez ici les opérations de modification des données de l'hôtel
                // Par exemple, enregistrez les nouvelles données dans une base de données ou utilisez une API.

                // Une fois la modification terminée, vous pouvez naviguer vers une autre vue ou effectuer d'autres actions.

                // Par exemple, pour revenir en arrière après avoir enregistré :
                // getActivity().onBackPressed();
            }
        });


        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return view;
    }
}