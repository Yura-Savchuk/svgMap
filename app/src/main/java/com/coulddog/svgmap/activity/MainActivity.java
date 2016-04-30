package com.coulddog.svgmap.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.coulddog.svgmap.fragment.ControlsFragment;
import com.coulddog.svgmap.fragment.MapFragment;
import com.coulddog.svgmap.R;
import com.coulddog.svgmap.fragment.ResultFragment;
import com.coulddog.svgmap.map.MapRegionValueModel;
import com.coulddog.svgmap.map.MapRegionValueModelsHolder;

public class MainActivity extends AppCompatActivity implements SelectedMapItem {

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
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.resultContainer, new ResultFragment(), ResultFragment.class.getName())
                    .commit();
        }
    }

    @Override
    public void onSelectedMapItem(int item) {
        if (getSupportFragmentManager().findFragmentById(R.id.mapContainer) instanceof SelectedMapItem) {
            ((SelectedMapItem) getSupportFragmentManager().findFragmentById(R.id.mapContainer)).onSelectedMapItem(item);
        }
    }
}
