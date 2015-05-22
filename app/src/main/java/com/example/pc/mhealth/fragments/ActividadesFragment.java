package com.example.pc.mhealth.fragments;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pc.mhealth.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 03/05/2015.
 */
public class ActividadesFragment extends Fragment{

    ViewPager pager;
    List<TitleFragment> data;
    PagerAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.actividades_fragment,container,false);

        pager = (ViewPager) v.findViewById(R.id.pager);
        data = new ArrayList<>();

        data.add(new EntrenamientoFragment());
        data.add(new HackathonFragment());
        data.add(new CursoSanaFragment());
        data.add(new IncubacionFragment());


        adapter = new com.example.pc.mhealth.adapters.PagerAdapter(getFragmentManager(),data);
        pager.setAdapter(adapter);

        return v;
    }


}
