package com.example.tubes_covid;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends BaseAdapter {
    private Activity activity;
    List<Countries> list;

    public ListAdapter(Activity activity) {
        this.activity = activity;
        this.list = new ArrayList<Countries>();
        Log.d("debug", "ListAdapter: asdfasdfasd");
    }

    public void setAllItems(ArrayList<Countries> data) {
        this.list = data;

    }

    public List<Countries> getAllItems() {
        return this.list;

    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int i) {
        return this.list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = this.activity.getLayoutInflater().inflate(R.layout.info, null);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.updateView((Countries) this.getItem(i), i);

        return view;
    }

    private class ViewHolder {
        protected TextView tv_pos, tv_sembuh, tv_meninggal, tv_content;

        public ViewHolder(View view) {
            Log.d("tes", "ViewHolder: Test");
            this.tv_content = view.findViewById(R.id.tv_content);
            this.tv_pos = view.findViewById(R.id.tv_Pos);
            this.tv_sembuh = view.findViewById(R.id.tv_sembuh);
            this.tv_meninggal = view.findViewById(R.id.tv_meninggal);
            final LinearLayout one = (LinearLayout) view.findViewById(R.id.accordion_parent);
            one.setVisibility(View.GONE);

            this.tv_content.setOnClickListener(new View.OnClickListener() {
                boolean isOpen = true;

                @Override
                public void onClick(View v) {
                    if (isOpen) {
                        one.setVisibility(View.VISIBLE);
                    } else {
                        one.setVisibility(View.GONE);
                    }
                    isOpen = !isOpen;


                }
            });
        }


        public void updateView(Countries countries, final int i) {
            Log.d("masuk ah", "updateView: asdf");
            this.tv_content.setText(countries.getNama());
            this.tv_pos.setText(countries.getJumlahPos());
            this.tv_sembuh.setText(countries.getSembuh());
            this.tv_meninggal.setText(countries.getMeninggal());

        }
    }

    public void addLine(String nama, String jumlahPos, String sembuh, String meninggal) {
        Countries countries = new Countries(nama, jumlahPos, sembuh, meninggal);
        this.list.add(countries);
        this.notifyDataSetChanged();
    }
}