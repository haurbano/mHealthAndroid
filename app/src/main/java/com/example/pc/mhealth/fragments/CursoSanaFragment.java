package com.example.pc.mhealth.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pc.mhealth.R;

public class CursoSanaFragment extends TitleFragment {


    private final String title="Curso Sana";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_curso_sana, container, false);
        return v;


    }


    @Override
    public String getTitle() {
        return title;
    }
}
