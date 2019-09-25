package com.example.customcopy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class tpAdapter extends BaseAdapter {
    private Context ctx;
    private int layout;
    private List<tp> tpList;

    public tpAdapter(Context ctx, int layout, List<tp> tpList) {
        this.ctx = ctx;
        this.layout = layout;
        this.tpList = tpList;
    }


    @Override
    public int getCount() {
        return tpList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=(LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);

        // anhs xa:
        TextView txtTen=(TextView)view.findViewById(R.id.txtTen);
        ImageView imgHinh=(ImageView) view.findViewById(R.id.imgHinh);
        TextView txtSo=(TextView) view.findViewById(R.id.txtSo);

        // gans gia tri
        tp t=tpList.get(i);
        txtTen.setText(t.getTen());
        imgHinh.setImageResource(t.getHinh());
        txtSo.setText(t.getSo());

        return view;
    }
}
