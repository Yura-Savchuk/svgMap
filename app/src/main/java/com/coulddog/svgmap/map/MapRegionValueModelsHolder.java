package com.coulddog.svgmap.map;

/**
 * Created by macbookpro on 26.04.16.
 */
public class MapRegionValueModelsHolder {

    public static final int VALUE_STEPS_COUNT = 3;

    private MapRegionValueModel simpheropolValue;
    private MapRegionValueModel chernigovValue;
    private MapRegionValueModel nicolaevValue;

    public MapRegionValueModelsHolder(MapRegionValueModel simpheropolValue, MapRegionValueModel chernigovValue, MapRegionValueModel nicolaevValue) {
        this.simpheropolValue = simpheropolValue;
        this.chernigovValue = chernigovValue;
        this.nicolaevValue = nicolaevValue;
    }

    public MapRegionValueModel getSimpheropolValue() {
        return simpheropolValue;
    }

    public MapRegionValueModel getChernigovValue() {
        return chernigovValue;
    }

    public MapRegionValueModel getNicolaevValue() {
        return nicolaevValue;
    }
}
