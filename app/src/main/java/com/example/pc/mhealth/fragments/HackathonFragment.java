package com.example.pc.mhealth.fragments;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pc.mhealth.R;



public class HackathonFragment extends TitleFragment {

    private final String title = "Hackaton";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hackathon, container, false);
    }


    @Override
    public String getTitle() {
        return title;
    }
}
