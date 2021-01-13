package com.example.tubes_covid;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentListener {

    protected MainFragment fragment1;
    protected FragmentManager fragmentManager;
    protected CountryFragment fragmentCountry;
    protected NewsFragment fragmentNews;
    Toolbar toolbar;
    protected DrawerLayout drawer;
    protected String url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.fragment1 = new MainFragment();
        this.fragmentCountry = new CountryFragment(this);
        this.fragmentNews = new NewsFragment(this);
        this.fragmentManager = this.getSupportFragmentManager();
        FragmentTransaction ft = this.fragmentManager.beginTransaction();
        ft.add(R.id.fragment_container, this.fragment1).addToBackStack(null).commit();
//        this.toolbar = this.findViewById(R.id.toolbar);
//        this.setSupportActionBar(toolbar);
        this.drawer = this.findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle abdt = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.openDrawer, R.string.closeDrawer);
        drawer.addDrawerListener(abdt);
        abdt.syncState();
        this.url ="https://api.covid19api.com/";

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
        }  else if (page == 2) {
            if (this.fragmentCountry.isAdded()) {
                ft.show(this.fragmentCountry);
            } else {
                ft.add(R.id.fragment_container, this.fragmentCountry);
            }
            ft.hide(this.fragmentNews);
            ft.hide(this.fragment1);
        }  else if (page == 3) {
            if (this.fragmentNews.isAdded()) {
                ft.show(this.fragmentNews);
            } else {
                ft.add(R.id.fragment_container, this.fragmentNews);
            }
            ft.hide(this.fragmentCountry);
            ft.hide(this.fragment1);
        } else if (page == 4) {
            this.closeApplication();
        }
        ft.commit();
        this.drawer.closeDrawers();
    }

    @Override
    public void closeApplication() {
        this.moveTaskToBack(true);
        this.finish();}



}