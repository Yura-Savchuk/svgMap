package com.coulddog.svgmap.fragment;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.v4.app.Fragment;
import android.support.v4.content.res.ResourcesCompat;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.coulddog.svgmap.R;
import com.coulddog.svgmap.activity.SelectedMapItem;
import com.coulddog.svgmap.map.MapRegionsColorController;
import com.coulddog.svgmap.support.DataBaseEmulation;

public class MapFragment extends Fragment implements SelectedMapItem {

    private ImageView mapImageView;
    private MapRegionsColorController util;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
        util = new MapRegionsColorController(getContext());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.map_fragment, container, false);
        //init imageView
        mapImageView = (ImageView) rootView.findViewById(R.id.mapImageView);
        //set drawable
        changeMapTheme(util.getMapTheme(DataBaseEmulation.mapRegionValueModelsHolders[0]));
        return rootView;
    }

    private void changeMapTheme(@StyleRes final Resources.Theme theme) {
        final Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.ua, theme);
        mapImageView.setImageDrawable(drawable);
    }

    @Override
    public void onSelectedMapItem(int item) {
        changeMapTheme(util.getMapTheme(DataBaseEmulation.mapRegionValueModelsHolders[item]));
    }
}
