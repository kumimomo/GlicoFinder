package com.example.momo.glicofinder.activity;

import android.content.Context;
import android.content.Intent;
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
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Momo on 3/6/2559.
 */
public class FindNearbyActivity extends AppCompatActivity implements GoogleMap.OnInfoWindowClickListener,OnMapReadyCallback{

    private GoogleMap googleMap;
    private Marker userPosMark;
    private LocationService locationService;
    private ShopService service;
    private AreaCalculator areaCal;
    private List<Shop> showShop;

    protected void onCreate(Bundle savedInstancestate){
        super.onCreate(savedInstancestate);
        setContentView(R.layout.activity_find_nearby);


        googleMap = ((SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
//        userPosMark = googleMap.addMarker(new MarkerOptions().position(new LatLng(13.846179, 100.568474)));
//        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(13.846179, 100.568474),16));
//
//        service = new ShopService();
//
//        locationService = LocationService.getLocationManager(this,googleMap);
//        areaCal = new AreaCalculator(locationService.getLat(),locationService.getLng(),service);
//        showShop = areaCal.getShopInArea(service.getShopList());
//        //googleMap.initShopLocations(showShop);
//        for(Shop shop: showShop){
//            googleMap.addMarker(new MarkerOptions().position(new LatLng(shop.getPosX(), shop.getPosY()))
//                    .title(shop.getName())
//                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.shop_icon)));
//        }
//        googleMap.setOnInfoWindowClickListener(this);

    }

    public void onStart(){
        super.onStart();
        service = new ShopService();

        locationService = LocationService.getLocationManager(this,googleMap);
        areaCal = new AreaCalculator(locationService.getLat(),locationService.getLng(),service);
        showShop = areaCal.getShopInArea(service.getShopList());
        //googleMap.initShopLocations(showShop);
        for(Shop shop: showShop){
            googleMap.addMarker(new MarkerOptions().position(new LatLng(shop.getPosX(), shop.getPosY()))
                    .title(shop.getName())
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.shop_icon)));
        }
        googleMap.setOnInfoWindowClickListener(this);
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

    @Override
    public void onInfoWindowClick(Marker marker) {
        Intent intent = new Intent(FindNearbyActivity.this,ShopInfoActivity.class);
        for(Shop shop : showShop){
            if(shop.getName().equalsIgnoreCase(marker.getTitle())){
                intent.putExtra("shop",shop);
            }
        }

        startActivity(intent);
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
