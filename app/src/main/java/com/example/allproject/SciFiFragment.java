package com.example.allproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SciFiFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_scifi, container, false);

        // Find the ImageButton by ID within the inflated view
        ImageButton imageButton = view.findViewById(R.id.imageButton_int);

        // Set an OnClickListener for the ImageButton
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open embed1.class when the ImageButton is clicked
                startActivity(new Intent(getActivity(), embed2.class));
            }
        });

        return view;
    }
}
