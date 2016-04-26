package com.coulddog.svgmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.mapContainer, new MapFragment(), MapFragment.class.getName())
                    .commit();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.controlsContainer, new ControlsFragment(), ControlsFragment.class.getName())
                    .commit();
        }
    }
}
