package com.example.mobileproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ActivityHotelDetail extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_detail);

        // Récupérez les informations de l'hôtel depuis l'intent
        String hotelName = getIntent().getStringExtra("hotel_name");
        String hotelDescription = getIntent().getStringExtra("hotel_description");

        // Affichez les informations dans les TextView de votre mise en page
        TextView nameTextView = findViewById(R.id.hotel_name);
        TextView descriptionTextView = findViewById(R.id.hotel_description);

        nameTextView.setText(hotelName);
        descriptionTextView.setText(hotelDescription);
    }
}