package com.coulddog.svgmap.map;

/**
 * Created by macbookpro on 30.04.16.
 */
public class MapRegionValueModel {

    private int value;
    private int styleMaxValue;
    private int styleMiddleValue;
    private int styleMinValue;

    public MapRegionValueModel(int value, int styleMaxValue, int styleMiddleValue, int styleMinValue) {
        this.value = value;
        this.styleMaxValue = styleMaxValue;
        this.styleMiddleValue = styleMiddleValue;
        this.styleMinValue = styleMinValue;
    }

    public int getValue() {
        return value;
    }

    public int getStyleMaxValue() {
        return styleMaxValue;
    }

    public int getStyleMiddleValue() {
        return styleMiddleValue;
    }

    public int getStyleMinValue() {
        return styleMinValue;
    }
}
