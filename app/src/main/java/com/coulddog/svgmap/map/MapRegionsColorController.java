package com.coulddog.svgmap.map;

import android.content.Context;
import android.content.res.Resources;

import com.coulddog.svgmap.R;

/**
 * Created by macbookpro on 26.04.16.
 */
public class MapRegionsColorController {

    private static final int STEPS_COUNT = 3;

    private Context context;

    public MapRegionsColorController(Context context) {
        this.context = context;
    }

    public Resources.Theme getMapTheme(MapRegionColorModel model) {

        int maxValue = Math.max(model.getChernigovValue(), model.getNicolaevValue());

        double stepValue = (double) maxValue / STEPS_COUNT;

        Resources.Theme theme = context.getResources().newTheme();

        int regionLevel, regionStyle;

        //init theme for chernigov
        regionLevel = getLevel(model.getChernigovValue(), stepValue);
        regionStyle = regionLevel == 3 ? MapRegionColorConstants.CHERNIGOV_GREEN_COLOR :
                maxValue == 2 ? MapRegionColorConstants.CHERNIGOV_YELLOW_COLOR : MapRegionColorConstants.CHERNIGOV_RED_COLOR;
        theme.applyStyle(regionStyle, false);



        //init theme for nicolaev
        regionLevel = getLevel(model.getNicolaevValue(), stepValue);
        regionStyle = regionLevel == 3 ? MapRegionColorConstants.NICOLAEV_GREEN_COLOR :
                maxValue == 2 ? MapRegionColorConstants.NICOLAEV_YELLOW_COLOR : MapRegionColorConstants.NICOLAEV_RED_COLOR;
        theme.applyStyle(regionStyle, false);
        return theme;
    }

    private int getLevel(int value, double stepValue) {
        return (int) (value/stepValue);
    }

}
