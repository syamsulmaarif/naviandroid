package com.caunk94.oprekabisnavi.fragment.angkotk32;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.caunk94.oprekabisnavi.R;

public class FragMaps extends Fragment implements OnMapReadyCallback {
    private GoogleMap mMap;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_frag_maps, container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MapFragment fragment = (MapFragment)getChildFragmentManager().findFragmentById(R.id.map);
        fragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng sgc = new LatLng(-6.258288, 107.146708);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sgc, 13));

        mMap.addMarker(new MarkerOptions().title("Hello Google Maps!").position(sgc));
        mMap.getUiSettings().setZoomGesturesEnabled(true);
    }
}
