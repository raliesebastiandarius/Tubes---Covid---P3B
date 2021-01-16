package com.example.tubes_covid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class GejalaFragment extends Fragment {
    protected FragmentListener listener;
    protected MainActivity activity;
    protected TextView gejala,awal,umum,demam,batuk,lelah,gejalaSerius,sesakNafas,nyeriDada,hilang,gejala3;
    protected ImageView gambarBatuk, gambarSesak, gambarNyeri;

    public GejalaFragment(MainActivity activity) {
        this.activity = activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gejala, container, false);

        this.gejala = view.findViewById(R.id.tv_gejala);
        this.awal = view.findViewById(R.id.awal);
        this.umum = view.findViewById(R.id.umum);
        this.demam = view.findViewById(R.id.demam);
        this.batuk = view.findViewById(R.id.batukKering);
        this.lelah = view.findViewById(R.id.kelelahan);

        this.gejalaSerius = view.findViewById(R.id.tv_gejala2);
        this.sesakNafas = view.findViewById(R.id.tv_sesakNafas);
        this.nyeriDada = view.findViewById(R.id.tv_nyeriDada);
        this.hilang = view.findViewById(R.id.tv_hilang);
        this.gejala3 = view.findViewById(R.id.tv_gejala3);

        this.gambarBatuk = view.findViewById(R.id.iv_batuk);
        this.gambarSesak = view.findViewById(R.id.iv_sesak);
        this.gambarNyeri= view.findViewById(R.id.iv_nyeri);

        return view;
    }
}
