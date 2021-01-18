package com.example.tubes_covid;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class NewsFragment extends Fragment{
    protected FragmentListener listener;
    protected MainActivity activity;
    protected TextView berita1, berita2, berita3, berita4, berita5;
    protected ImageView gambarBerita1, gambarBerita2, gambarBerita3, gambarBerita4, gambarBerita5;

    public NewsFragment(MainActivity activity) {
        this.activity = activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);

        this.berita1 = view.findViewById(R.id.berita1);
        this.berita2 = view.findViewById(R.id.berita2);
        this.berita3 = view.findViewById(R.id.berita3);
        this.berita4 = view.findViewById(R.id.berita4);
        this.berita5 = view.findViewById(R.id.berita5);

        this.gambarBerita1 = view.findViewById(R.id.gambar1);
        this.gambarBerita2 = view.findViewById(R.id.gambar2);
        this.gambarBerita3 = view.findViewById(R.id.gambar3);
        this.gambarBerita4 = view.findViewById(R.id.gambar4);
        this.gambarBerita5 = view.findViewById(R.id.gambar5);

        berita1.setText(Html.fromHtml(

                        "<a href=\"https://covid19.go.id/p/berita/menu-makanan-pasien-rs-darurat-wisma-atlet-jadi-perhatian-ketua-gugasnas\">Menu Makanan Pasien RS Darurat Wisma Atlet Jadi Perhatian Ketua Gugasnas</a> "));
        berita1.setMovementMethod(LinkMovementMethod.getInstance());

        berita2.setText(Html.fromHtml(

                "<a href=\"https://covid19.go.id/p/berita/covid-19-mewabah-doni-monardo-ingatkan-pentingnya-disiplin-kolektif\">Covid-19 Mewabah, Doni Monardo Ingatkan Pentingnya Disiplin Kolektif</a> "));
        berita2.setMovementMethod(LinkMovementMethod.getInstance());

        berita3.setText(Html.fromHtml(

                "<a href=\"https://covid19.go.id/p/berita/lima-arahan-presiden-terkait-penerapan-adaptasi-kebiasaan-baru\">Lima Arahan Presiden terkait Penerapan Adaptasi Kebiasaan Baru</a> "));
        berita3.setMovementMethod(LinkMovementMethod.getInstance());

        berita4.setText(Html.fromHtml(

                "<a href=\"https://covid19.go.id/p/berita/dokter-reisa-penggunaan-rapid-test-tidak-digunakan-untuk-kepentingan-diagnostik\">Dokter Reisa: Penggunaan Rapid Test Tidak Digunakan Untuk Kepentingan Diagnostik</a> "));
        berita4.setMovementMethod(LinkMovementMethod.getInstance());

        berita5.setText(Html.fromHtml(

                "<a href=\"https://covid19.go.id/p/berita/presiden-ingatkan-daerah-untuk-terus-kendalikan-penyebaran-covid-19\">Presiden Ingatkan Daerah untuk Terus Kendalikan Penyebaran Covid-19</a> "));
        berita5.setMovementMethod(LinkMovementMethod.getInstance());


        return view;
    }

}
