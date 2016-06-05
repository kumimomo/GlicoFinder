package com.example.momo.glicofinder.service;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;

import com.example.momo.glicofinder.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by Momo on 3/6/2559.
 */
public class LocationService implements LocationListener{

    private GoogleMap googleMap;
    private Marker userPosMark;
    private LocationManager lm;
    private static LocationService instance = null;
    private double lat,lng;

    private LocationService(Context context,GoogleMap googleMap) {
        initLocationService(context);
        this.googleMap = googleMap;
    }

    public static LocationService getLocationManager(Context context,GoogleMap googleMap){
        if(instance==null){
            instance = new LocationService(context,googleMap);
        }
        return instance;
    }

    public void initLocationService(Context context){
        if ( Build.VERSION.SDK_INT >= 23 &&
                ContextCompat.checkSelfPermission( context, android.Manifest.permission.ACCESS_FINE_LOCATION ) != PackageManager.PERMISSION_GRANTED &&
                ContextCompat.checkSelfPermission( context, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return  ;
        }

        lm = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
        boolean isNetwork = lm.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
        boolean isGPS = lm.isProviderEnabled(LocationManager.GPS_PROVIDER);

        if(isNetwork){
            lm.requestLocationUpdates(LocationManager.NETWORK_PROVIDER,5000,10,this);
            Location loc = lm.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
            if(loc != null){
                lat = loc.getLatitude();
                lng = loc.getLongitude();
            }
        }
        if(isGPS){
            lm.requestLocationUpdates(LocationManager.GPS_PROVIDER,5000,10,this);
            Location loc = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
            if(loc != null){
                lat = loc.getLatitude();
                lng = loc.getLongitude();
            }
        }
    }
    @Override
    public void onLocationChanged(Location location) {
        LatLng coordinate = new LatLng(location.getLatitude(),location.getLongitude());

        lat = location.getLatitude();
        lng = location.getLongitude();

        System.out.println("lat :"+lat);
        System.out.println("lng :"+lng);

        if(userPosMark != null){
            userPosMark.remove();
        }
        userPosMark = googleMap.addMarker(new MarkerOptions().position(new LatLng(lat,lng))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.user_icon)));
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinate,16));
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
    }

    @Override
    public void onProviderEnabled(String provider) {
    }

    @Override
    public void onProviderDisabled(String provider) {
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}
