package com.example.tubes_covid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class PencegahanFragment extends Fragment {
    protected FragmentListener listener;
    protected MainActivity activity;
    protected TextView judulPencegahan,pencegahan1,mencegah,cuciTangan,jagaJarak,pakeMasker,sentuh,tutup,janganKeluar,medis,masker;
    protected ImageView gambarMasker, gambarStay, gambarCuci, gambarJagaJarak;

    public PencegahanFragment(MainActivity activity) {
        this.activity = activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_penanganan, container, false);

        this.judulPencegahan = view.findViewById(R.id.judul_pencegahan);
        this.pencegahan1 = view.findViewById(R.id.tv_pencegahan);
        this.mencegah = view.findViewById(R.id.tv_mencegah);
        this.cuciTangan = view.findViewById(R.id.tv_cuci);
        this.jagaJarak = view.findViewById(R.id.tv_jagaJarak);
        this.pakeMasker = view.findViewById(R.id.tv_kenakanMasker);

        this.sentuh= view.findViewById(R.id.tv_sentuh);
        this.tutup = view.findViewById(R.id.tv_tutup);
        this.janganKeluar = view.findViewById(R.id.tv_keluar);
        this.medis = view.findViewById(R.id.tv_medis);
        this.masker = view.findViewById(R.id.tv_masker);

        this.gambarMasker = view.findViewById(R.id.iv_masker);
        this.gambarStay = view.findViewById(R.id.iv_stay);
        this.gambarCuci = view.findViewById(R.id.iv_cuci);
        this.gambarJagaJarak = view.findViewById(R.id.iv_jaga);

        return view;
    }
}