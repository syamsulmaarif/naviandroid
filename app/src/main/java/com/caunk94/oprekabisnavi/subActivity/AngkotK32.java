package com.caunk94.oprekabisnavi.subActivity;

import android.app.FragmentManager;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.caunk94.oprekabisnavi.R;
import com.caunk94.oprekabisnavi.fragment.angkotk32.FragGallery;
import com.caunk94.oprekabisnavi.fragment.angkotk32.FragInfo;
import com.caunk94.oprekabisnavi.fragment.angkotk32.FragMaps;


public class AngkotK32 extends AppCompatActivity implements AHBottomNavigation.OnTabSelectedListener {
    AHBottomNavigation bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angkot_k32);


        bottomNavigation= (AHBottomNavigation) findViewById(R.id.myBottomNavigation_ID);
        bottomNavigation.setOnTabSelectedListener(this);
        this.createNavItems();
    }

    private void createNavItems()
    {
        //CREATE ITEMS
        AHBottomNavigationItem crimeItem=new AHBottomNavigationItem("Info",R.drawable.info);
        AHBottomNavigationItem dramaItem=new AHBottomNavigationItem("Rute",R.drawable.maps);
        AHBottomNavigationItem docsItem=new AHBottomNavigationItem("Gallery",R.drawable.image);

        //ADD PROPERTIES
        bottomNavigation.addItem(crimeItem);
        bottomNavigation.addItem(dramaItem);
        bottomNavigation.addItem(docsItem);

        //SET PROPERTIES
        bottomNavigation.setDefaultBackgroundColor(Color.parseColor("#becbdc"));
        bottomNavigation.setCurrentItem(0);

    }
    @Override
    public void onTabSelected(int position, boolean wasSelected) {
        if(position==0)
        {
            FragmentManager fm1 = getFragmentManager();
            fm1.beginTransaction().replace(R.id.content_id, new FragInfo()).commit();
        }else  if(position==1)
        {
            FragmentManager fm2 = getFragmentManager();
            fm2.beginTransaction().replace(R.id.content_id, new FragMaps()).commit();
        }else  if(position==2)
        {
            FragmentManager fm3 = getFragmentManager();
            fm3.beginTransaction().replace(R.id.content_id, new FragGallery()).commit();
        }

    }
}
