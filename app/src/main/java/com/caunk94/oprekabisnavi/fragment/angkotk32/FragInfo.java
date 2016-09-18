package com.caunk94.oprekabisnavi.fragment.angkotk32;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.caunk94.oprekabisnavi.R;


public class FragInfo extends Fragment {

    CollapsingToolbarLayout collapsingToolbarLayout;
    Toolbar toolbar;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_frag_info, container,false);


    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        collapsingToolbarLayout = (CollapsingToolbarLayout)view.findViewById(R.id.collapsing_toolbar_info);
        collapsingToolbarLayout.setTitle("Info Angkot K32");
    }
}
