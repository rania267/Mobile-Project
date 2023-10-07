package com.example.mobileproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class AjouterFragment extends Fragment {
    private EditText nomEditText;
    private EditText adresseEditText;
    private Button ajouterButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ajout, container, false);

        nomEditText = view.findViewById(R.id.editTextNom);
        adresseEditText = view.findViewById(R.id.editTextAdresse);
        ajouterButton = view.findViewById(R.id.buttonAjouter);


        

        ajouterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Récupérer les valeurs saisies par l'utilisateur
                String nom = nomEditText.getText().toString();
                String adresse = adresseEditText.getText().toString();


                Toast.makeText(getActivity(), "Hôtel ajouté avec succès", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {

            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            fragmentManager.popBackStack();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
