package com.example.textmap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(final GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        //LatLng SEOUL = new LatLng(37.56, 126.97);

       // MarkerOptions markerOptions = new MarkerOptions();
        //markerOptions.position(SEOUL);
        //markerOptions.title("서울");
        //markerOptions.snippet("한국의 수도");
        //mMap.addMarker(markerOptions);



        //mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SEOUL,10));

        LatLng cafe= new LatLng(37.55022317323927, 126.93529864186772);
        mMap.addMarker(new MarkerOptions().position(cafe).title("댕과댕빵"));


        cafe = new LatLng(37.50473994930677, 126.8768549111792);
        mMap.addMarker(new MarkerOptions().position(cafe).title("귀여운주인"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(cafe));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cafe,14));
    }
}