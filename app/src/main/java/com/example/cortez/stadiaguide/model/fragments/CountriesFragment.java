package com.example.cortez.stadiaguide.model.fragments;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.cortez.stadiaguide.R;

public class CountriesFragment extends ListFragment {
    ListView listView;

    public CountriesFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_countrylist, container, false);

        return rootView;
    }
}