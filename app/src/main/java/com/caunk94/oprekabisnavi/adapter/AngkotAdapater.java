package com.caunk94.oprekabisnavi.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.caunk94.oprekabisnavi.R;
import com.caunk94.oprekabisnavi.Angkot;

import java.util.List;

/**
 * Created by syamms on 9/7/16.
 */
public class AngkotAdapater extends RecyclerView.Adapter<AngkotHolder> {
    private List<Angkot> items;

    public AngkotAdapater(List<Angkot> items) {
        this.items = items;
    }

    @Override
    public AngkotHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.model, viewGroup, false);
        return new AngkotHolder(v);
    }

    @Override
    public void onBindViewHolder(AngkotHolder viewHolder, int i) {
        viewHolder.imagen.setImageResource(items.get(i).getImagen());
        viewHolder.nomor.setText(items.get(i).getNomor());
        viewHolder.rute.setText(items.get(i).getRute());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}

