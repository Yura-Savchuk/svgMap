package com.coulddog.svgmap.map;

import android.content.Context;
import android.content.res.Resources;

/**
 * Created by macbookpro on 26.04.16.
 */
public class MapRegionsColorController {

    private Context context;

    public MapRegionsColorController(Context context) {
        this.context = context;
    }

    public Resources.Theme getMapTheme(MapRegionValueModelsHolder model) {

        int maxValue = 0;
        maxValue = Math.max(model.getSimpheropolValue().getValue(), maxValue);
        maxValue = Math.max(model.getChernigovValue().getValue(), maxValue);
        maxValue = Math.max(model.getNicolaevValue().getValue(), maxValue);

        int minValue = maxValue;
        minValue = Math.min(model.getSimpheropolValue().getValue(), minValue);
        minValue = Math.min(model.getChernigovValue().getValue(), minValue);
        minValue = Math.min(model.getNicolaevValue().getValue(), minValue);

        Resources.Theme theme = context.getResources().newTheme();

        theme.applyStyle(getRegionStyle(model.getSimpheropolValue(), maxValue, minValue), false);
        theme.applyStyle(getRegionStyle(model.getChernigovValue(), maxValue, minValue), false);
        theme.applyStyle(getRegionStyle(model.getNicolaevValue(), maxValue, minValue), false);

        return theme;
    }

    private int getRegionStyle(MapRegionValueModel region, int maxValue, int minValue) {
        int distance = maxValue - minValue;
        double step = (double) distance / MapRegionValueModelsHolder.VALUE_STEPS_COUNT;

        int style = region.getStyleMinValue();
        for (int i=1; i<MapRegionValueModelsHolder.VALUE_STEPS_COUNT + 1; i++) {
            if (step * i >= region.getValue()) {
                style = i == 1 ? region.getStyleMinValue() : (i == 2 ? region.getStyleMiddleValue() : region.getStyleMaxValue());
            }
        }
        return style;
    }

}
