package com.example.tubes_covid;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import java.util.List;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements FragmentListener {

    protected MainFragment fragment1;
    protected FragmentManager fragmentManager;
    protected CountryFragment fragmentCountry;
    protected NewsFragment fragmentNews;
    protected PencegahanFragment pencegahanFragment;
    protected PerawatanFragment perawatanFragment;
    protected GejalaFragment gejalaFragment;
    Toolbar toolbar;
    protected DrawerLayout drawer;
    TextView responseText;
    APIInterface apiInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.fragment1 = new MainFragment();
        this.fragmentCountry = new CountryFragment(this);
        this.fragmentNews = new NewsFragment(this);
        this.fragmentManager = this.getSupportFragmentManager();
        this.pencegahanFragment = new PencegahanFragment(this);
        this.perawatanFragment = new PerawatanFragment(this);
        this.gejalaFragment = new GejalaFragment(this);
//        responseText = (TextView) findViewById(R.id.responseText);
//        apiInterface = APIClient.getClient().create(APIInterface.class);
//        Call<MultipleResource> call = apiInterface.doGetListResources();
//        call.enqueue(new Callback<MultipleResource>() {
//            @Override
//            public void onResponse(Call<MultipleResource> call, Response<MultipleResource> response) {
//                Log.d("TAG",response.code()+"");
//
//                String displayResponse = "";
//
//                MultipleResource resource = response.body();
//                String id = resource.iD;
//                String message = resource.message;
//                Global global = resource.global;
//                List<MultipleResource.Country2> country2List = resource.countries;
//                String date = resource.date;
//                for (MultipleResource.Country2 country2 : country2List){
//                    displayResponse += country2.country + " " + country2.countryCode + " " +  country2.totalConfirmed + " " +  country2.totalDeaths + " " +  country2.totalRecovered + "\n";
//                }
//                responseText.setText(displayResponse);
//            }
//
//            @Override
//            public void onFailure(Call<MultipleResource> call, Throwable t) {
//                call.cancel();
//            }
//        });
//
//        Call<CountryList> call2 = apiInterface.doGetCountryList("2");
//        call2.enqueue(new Callback<CountryList>() {
//            @Override
//            public void onResponse(Call<CountryList> call, Response<CountryList> response) {
//                CountryList countryList = response.body();
//                String id = countryList.iD;
//                String message = countryList.message;
//                Global global = countryList.global;
//                List<CountryList.Country2> country2List = countryList.countries;
//                String date = countryList.date;
//                for (CountryList.Country2 country22 : country2List){
//                    Toast.makeText(getApplicationContext(), "negara : " + country22.country,Toast.LENGTH_SHORT).show();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<CountryList> call, Throwable t) {
//                call.cancel();
//            }
//        });

        this.toolbar = this.findViewById(R.id.toolbar);
        this.setSupportActionBar(toolbar);

        this.drawer = this.findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle abdt = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.openDrawer, R.string.closeDrawer);
        drawer.addDrawerListener(abdt);
        abdt.syncState();
    }



    public void setSupportActionBar(Toolbar toolbar) {
        this.toolbar = toolbar;
    }

    @Override
    public void changePage(int page, String input) {
        FragmentTransaction ft = this.fragmentManager.beginTransaction();
        if (page == 1) {
            if (this.fragment1.isAdded()) {
                ft.show(this.fragment1);
            } else {
                ft.add(R.id.fragment_container, this.fragment1);
            }
            ft.hide(this.fragmentCountry);
            ft.hide(this.fragmentNews);
            ft.hide(this.perawatanFragment);
            ft.hide(this.gejalaFragment);
            ft.hide(this.pencegahanFragment);
        }  else if (page == 2) {
            if (this.fragmentCountry.isAdded()) {
                ft.show(this.fragmentCountry);
            } else {
                ft.add(R.id.fragment_container, this.fragmentCountry);
            }
            ft.hide(this.fragmentNews);
            ft.hide(this.fragment1);
            ft.hide(this.perawatanFragment);
            ft.hide(this.gejalaFragment);
            ft.hide(this.pencegahanFragment);
        }  else if (page == 3) {
            if (this.fragmentNews.isAdded()) {
                ft.show(this.fragmentNews);
            } else {
                ft.add(R.id.fragment_container, this.fragmentNews);
            }
            ft.hide(this.fragmentCountry);
            ft.hide(this.fragment1);
            ft.hide(this.perawatanFragment);
            ft.hide(this.gejalaFragment);
            ft.hide(this.pencegahanFragment);
        } else if (page == 4) {
            this.closeApplication();
        }
        else if(page == 5){
            if(this.gejalaFragment.isAdded()){
                ft.show(this.gejalaFragment);
            }else{
                ft.add(R.id.fragment_container,this.gejalaFragment).addToBackStack(null);
            }
            ft.hide(this.fragment1);
            ft.hide(this.pencegahanFragment);
            ft.hide(this.fragmentCountry);
            ft.hide(this.perawatanFragment);
            ft.hide(this.fragmentNews);
        } else if(page == 6){
            if(this.perawatanFragment.isAdded()){
                ft.show(this.perawatanFragment);
            }else{
                ft.add(R.id.fragment_container,this.perawatanFragment).addToBackStack(null);
            }
            ft.hide(this.fragment1);
            ft.hide(this.pencegahanFragment);
            ft.hide(this.fragmentCountry);
            ft.hide(this.gejalaFragment);
            ft.hide(this.fragmentNews);
        }
        else if(page == 7){
            if(this.pencegahanFragment.isAdded()){
                ft.show(this.pencegahanFragment);
            }else{
                ft.add(R.id.fragment_container,this.pencegahanFragment).addToBackStack(null);
            }
            ft.hide(this.fragment1);
            ft.hide(this.gejalaFragment);
            ft.hide(this.fragmentCountry);
            ft.hide(this.perawatanFragment);
            ft.hide(this.fragmentNews);
        }

        ft.commit();
        this.drawer.closeDrawers();
    }

    @Override
    public void closeApplication() {
        this.moveTaskToBack(true);
        this.finish();}



}