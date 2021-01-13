package com.example.tubes_covid;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment implements View.OnClickListener {
    protected FragmentListener listener;
    protected TextView halaman;
    protected Button click;
    protected TextView gejala, perawatan, pencegahan;

    public MainFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceStated) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);
        this.halaman = view.findViewById(R.id.tv_halaman);
        this.gejala = view.findViewById(R.id.tv_gejala);
        this.perawatan = view.findViewById(R.id.tv_perawatan);
        this.pencegahan = view.findViewById(R.id.tv_pencegahan);

        this.gejala.setOnClickListener(this);
        this.perawatan.setOnClickListener(this);
        this.pencegahan.setOnClickListener(this);
        return view;
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentListener) {
            this.listener = (FragmentListener) context;
        } else {
            throw new ClassCastException(context.toString()
                    + "must implement FragmentListener");
        }
    }


    @Override
    public void onClick(View view) {
//        if(this.click.getId()==view.getId()){
//            this.listener.changePage(3,"");
//        }
        if(this.gejala.getId()==view.getId()){
            this.listener.changePage(5,"");
        }
        else if(this.perawatan.getId()==view.getId()){
            this.listener.changePage(6,"");
        }
        else if(this.pencegahan.getId()==view.getId()){
            this.listener.changePage(7,"");
        }
    }



}
