package com.example.momo.glicofinder.activity;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.momo.glicofinder.R;
import com.example.momo.glicofinder.fragments.MapFragment;
import com.example.momo.glicofinder.model.AreaCalculator;
import com.example.momo.glicofinder.model.Shop;
import com.example.momo.glicofinder.service.LocationService;
import com.example.momo.glicofinder.service.ShopService;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Momo on 3/6/2559.
 */
public class FindNearbyActivity extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap googleMap;
    private Marker userPosMark;
    private LocationService locationService;
    private ShopService service;
    private AreaCalculator areaCal;

    protected void onCreate(Bundle savedInstancestate){
        super.onCreate(savedInstancestate);
        setContentView(R.layout.activity_find_nearby);


        googleMap = ((SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
//        userPosMark = googleMap.addMarker(new MarkerOptions().position(new LatLng(13.846179, 100.568474)));
//        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(13.846179, 100.568474),16));
//
        service = new ShopService();

        locationService = LocationService.getLocationManager(this,googleMap);
        areaCal = new AreaCalculator(locationService.getLat(),locationService.getLng(),service);
        List<Shop> showShop = areaCal.getShopInArea(service.getShopList());
        //googleMap.initShopLocations(showShop);
        for(Shop shop: showShop){
            googleMap.addMarker(new MarkerOptions().position(new LatLng(shop.getPosX(), shop.getPosY())).title(shop.getName()));
        }

    }

    public void onResume(){
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }

//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        if (googleMap != null) {
//            getSupportFragmentManager().beginTransaction()
//                    .remove(googleMap)
//                    .commit();
//        }
//    }
}
