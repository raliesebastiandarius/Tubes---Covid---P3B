package com.example.tubes_covid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class PerawatanFragment extends Fragment {
    protected FragmentListener listener;
    protected MainActivity activity;
    protected TextView perawatan1, perawatan2, perawatan3;
    protected ImageView makanan, bersih;

    public PerawatanFragment(MainActivity activity) {
        this.activity = activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_perawatan, container, false);
        this.perawatan1 = view.findViewById(R.id.perawatan1);
        this.perawatan2 = view.findViewById(R.id.perawatan2);
        this.perawatan3 = view.findViewById(R.id.perawatan3);

        this.makanan= view.findViewById(R.id.iv_makanan);
        this.bersih = view.findViewById(R.id.iv_bersih);

        return view;
    }
}