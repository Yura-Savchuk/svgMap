package com.coulddog.svgmap;

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

import com.coulddog.svgmap.map.MapRegionColorModel;
import com.coulddog.svgmap.map.MapRegionsColorController;

public class MapFragment extends Fragment {

    private static int chernigovPopulation = 100;
    private static int nicolaevPopulation = 70;

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
        mapImageView.setOnClickListener(mMapImageViewClickListener);
        //set drawable
        ContextThemeWrapper wrapper = new ContextThemeWrapper(getContext(), R.style.DefaultMapTheme);
        changeMapTheme(wrapper.getTheme());
        return rootView;
    }

    private View.OnClickListener mMapImageViewClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
//            Resources.Theme theme = getResources().newTheme();
//            theme.applyStyle(R.style.NicalaevRedColor, false);
//            theme.applyStyle(R.style.ChernigovBlueColor, false);
            changeMapTheme(util.getMapTheme(new MapRegionColorModel(chernigovPopulation, nicolaevPopulation)));
        }
    };

    private void changeMapTheme(@StyleRes final Resources.Theme theme) {
        final Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.ua, theme);
        mapImageView.setImageDrawable(drawable);
    }
}
