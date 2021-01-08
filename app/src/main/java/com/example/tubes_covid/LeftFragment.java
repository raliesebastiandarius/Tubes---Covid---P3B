package com.example.tubes_covid;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class LeftFragment extends Fragment implements View.OnClickListener {

    protected TextView home,country,news,exit;
    protected FragmentListener listener;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_left, container, false);
        this.home=view.findViewById(R.id.home);
        this.country=view.findViewById(R.id.country);
        this.news=view.findViewById(R.id.news);
        this.exit=view.findViewById(R.id.exit);

        this.home.setOnClickListener(this);
        this.country.setOnClickListener(this);
        this.news.setOnClickListener(this);
        this.exit.setOnClickListener(this);
        return view;
    }



    @Override
    public void onClick(View view) {
        if(view.getId()==home.getId()){
            this.listener.changePage(1,"");
        }else if(view.getId()==country.getId()){
            this.listener.changePage(2,"");
        }else if(view.getId()==news.getId()){
            this.listener.changePage(3,"");
        }else if(view.getId()==exit.getId()){
            this.listener.changePage(4,"");
        }
    }

    public void onAttach(Context context){
        super.onAttach(context);
        if(context instanceof FragmentListener){
            this.listener= (FragmentListener) context;
        }
    }
}
