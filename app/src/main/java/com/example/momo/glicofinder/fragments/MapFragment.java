package com.example.momo.glicofinder.fragments;

import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.momo.glicofinder.model.Shop;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

/**
 * Created by TAWEESOFT on 2/23/16 AD.
 */
public class MapFragment extends SupportMapFragment implements GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener,
        GoogleMap.OnInfoWindowClickListener,
        GoogleMap.OnMapLongClickListener,
        GoogleMap.OnMapClickListener,
        GoogleMap.OnMarkerClickListener {

    private GoogleApiClient mGoogleApiClient;
    private Location mCurrentLocation;
    private boolean isViewCurrentLocation = false;

    private final int[] MAP_TYPES = { GoogleMap.MAP_TYPE_SATELLITE,
            GoogleMap.MAP_TYPE_NORMAL,
            GoogleMap.MAP_TYPE_HYBRID,
            GoogleMap.MAP_TYPE_TERRAIN,
            GoogleMap.MAP_TYPE_NONE };
    private int curMapTypeIndex = 1;

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setHasOptionsMenu(true);

        mGoogleApiClient = new GoogleApiClient.Builder( getActivity() )
                .addConnectionCallbacks( this )
                .addOnConnectionFailedListener( this )
                .addApi( LocationServices.API )
                .build();

        initListeners();
    }

    public void initCurrentLocation() {
    }

    private void initListeners() {
        getMap().setOnMarkerClickListener(this);
        getMap().setOnMapLongClickListener(this);
        getMap().setOnInfoWindowClickListener(this);
        getMap().setOnMapClickListener(this);
    }
    @Override
    public void onStart() {
        super.onStart();
        mGoogleApiClient.connect();
    }

    @Override
    public void onStop() {
        super.onStop();
        if( mGoogleApiClient != null && mGoogleApiClient.isConnected() ) {
            mGoogleApiClient.disconnect();
        }
    }

    @Override
    public void onConnected(Bundle bundle) {
        mCurrentLocation = LocationServices
                .FusedLocationApi
                .getLastLocation( mGoogleApiClient );
        if(isViewCurrentLocation)
            initCameraCurrentLocation(mCurrentLocation);
    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    public void setIsViewOnCurrentLocation(boolean isView) {
        isViewCurrentLocation = isView;
    }

    public void initCameraCurrentLocation(Location location) {
        CameraPosition position = CameraPosition.builder()
                .target( new LatLng( mCurrentLocation.getLatitude(),
                        mCurrentLocation.getLongitude() ) )
                .zoom( 13f )
                .bearing( 0.0f )
                .tilt( 0.0f )
                .build();
        getMap().animateCamera( CameraUpdateFactory
                .newCameraPosition(position), null );
        getMap().setMapType( MAP_TYPES[curMapTypeIndex] );
        getMap().setTrafficEnabled( true );
        getMap().setMyLocationEnabled( true );
        getMap().getUiSettings().setZoomControlsEnabled(true);
    }

    public void initCamera( LatLng latLng , String name) {
        CameraPosition position = CameraPosition.builder()
                .target( new LatLng( latLng.latitude,
                        latLng.longitude ) )
                .zoom( 15f )
                .bearing( 0.0f )
                .tilt( 0.0f )
                .build();
        getMap().animateCamera( CameraUpdateFactory
                .newCameraPosition(position), null );

        getMap().setMapType( MAP_TYPES[curMapTypeIndex] );
        getMap().setTrafficEnabled( true );
        getMap().setMyLocationEnabled( true );
        getMap().getUiSettings().setZoomControlsEnabled(true);
    }


    public void initShopLocations(List<Shop> shops) {
        for(Shop shop : shops) {
            LatLng latLng = new LatLng(shop.getPosX(),shop.getPosY());
            MarkerOptions options = new MarkerOptions().position( latLng );
            options.title(shop.getName());
            //options.icon( BitmapDescriptorFactory.defaultMarker() );
            getMap().addMarker( options );
        }

    }

    public void clearMap(){
        getMap().clear();
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        System.out.println("Marker name " + marker.getTitle());
        marker.showInfoWindow();
        return true;
    }

    public Location getCurrentLocation() {
        return mCurrentLocation;
    }

    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {

    }

    @Override
    public void onInfoWindowClick(Marker marker) {

    }

    @Override
    public void onMapClick(LatLng latLng) {

    }

    @Override
    public void onMapLongClick(LatLng latLng) {

    }
}