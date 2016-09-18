package com.caunk94.oprekabisnavi;


import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.caunk94.oprekabisnavi.adapter.AngkotAdapater;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager linearLayoutManager;
    Toolbar toolbar;
    CollapsingToolbarLayout collapsingToolbarLayout;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        List<Angkot> items = new ArrayList<>();

        items.add(new Angkot(R.drawable.ai, "Angkot K 32A", "Terminal Cikarang – Cibitung – MM2100"));
        items.add(new Angkot(R.drawable.ps, "Angkot K 32", "Terminal Cikarang – Sukadanau"));
        items.add(new Angkot(R.drawable.chrome, "Angkot K33", "Terminal Cikarang – Lemahabang"));
        items.add(new Angkot(R.drawable.safari, "Angkot K 34", "Rawa Kalong – Terminal Bekasi"));
        items.add(new Angkot(R.drawable.sketch, "Angkot K 33A", "Karang Satria – Alamanda – Terminal Bekasi"));

        // Obtener el Recycler
        recycler = (RecyclerView) view.findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        linearLayoutManager = new LinearLayoutManager(getActivity());
        recycler.setLayoutManager(linearLayoutManager);

        // Crear un nuevo adaptador
        adapter = new AngkotAdapater(items);
        recycler.setAdapter(adapter);

    }
}
