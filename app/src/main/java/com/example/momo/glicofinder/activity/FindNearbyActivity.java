package com.example.momo.glicofinder.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.momo.glicofinder.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

/**
 * Created by Momo on 3/6/2559.
 */
public class FindNearbyActivity extends AppCompatActivity implements OnMapReadyCallback{
    private GoogleMap googleMap;
    protected void onCreate(Bundle savedInstancestate){
        super.onCreate(savedInstancestate);
        setContentView(R.layout.activity_find_nearby);


        googleMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }
}
