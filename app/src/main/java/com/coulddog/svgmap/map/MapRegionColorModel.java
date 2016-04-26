package com.coulddog.svgmap.map;

/**
 * Created by macbookpro on 26.04.16.
 */
public class MapRegionColorModel {
    int chernigovValue;
    int nicolaevValue;
    public MapRegionColorModel (int chernigovValue, int nicolaevValue) {
        this.chernigovValue = chernigovValue;
        this.nicolaevValue = nicolaevValue;
    }

    public int getChernigovValue() {
        return chernigovValue;
    }

    public int getNicolaevValue() {
        return nicolaevValue;
    }
}
