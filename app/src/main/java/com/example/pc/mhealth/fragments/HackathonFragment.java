package com.example.pc.mhealth.fragments;


import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pc.mhealth.R;



public class HackathonFragment extends TitleFragment {

    private final String title = "Hackaton";
    TextView link_hackaton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_hackathon, container, false);
        link_hackaton = (TextView) v.findViewById(R.id.link_hackaton);
        link_hackaton.setMovementMethod(LinkMovementMethod.getInstance());
        link_hackaton.setText(Html.fromHtml("<a href='https://onedrive.live.com/survey?resid=BF82224653124AC1!124&authkey=!ANpkDgR-_7WF-Wg'>Incríbete aquí!</a>"));
        return v;
    }


    @Override
    public String getTitle() {
        return title;
    }
}
