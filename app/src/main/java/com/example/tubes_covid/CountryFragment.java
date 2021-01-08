package com.example.tubes_covid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class CountryFragment extends Fragment {
    protected FragmentListener listener;
    protected MainActivity activity;

    public CountryFragment(MainActivity activity)
    {
        this.activity = activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_country,container,false);

        return view;
    }


}

