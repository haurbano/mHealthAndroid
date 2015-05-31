package com.example.pc.mhealth.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pc.mhealth.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class JuanFragment extends TitleFragment{

    private final String title = "Juan Osorio";

    public JuanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_juan, container, false);
    }


    @Override
    public String getTitle() {
        return title;
    }
}
