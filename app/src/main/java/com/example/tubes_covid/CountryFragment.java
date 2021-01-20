package com.example.tubes_covid;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class CountryFragment extends Fragment  {
    protected ListView listMenu;
    protected ListAdapter adapter;
    protected FragmentListener listener;
    protected MainActivity activity;

    public CountryFragment(MainActivity activity)
    {
        this.activity = activity;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentListener) {
            this.listener = (FragmentListener) context;
        }
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_country, container, false);

//       this.listMenu = view.findViewById(R.id.lv_item);
//            this.adapter = new ListAdapter(getActivity());
//            this.listMenu.setAdapter(this.adapter);
//            this.adapter.addLine("Indonesia", "100","100","0");
//            this.adapter.addLine("Indonesia", "100","100","0");
//            this.adapter.addLine("Indonesia", "100","100","0");

        return view;
    }


}
