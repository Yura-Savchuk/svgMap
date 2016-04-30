package com.coulddog.svgmap.support;

import com.coulddog.svgmap.R;
import com.coulddog.svgmap.map.MapRegionValueModel;
import com.coulddog.svgmap.map.MapRegionValueModelsHolder;

/**
 * Created by macbookpro on 30.04.16.
 */
public interface DataBaseEmulation {
    MapRegionValueModelsHolder[] mapRegionValueModelsHolders = new MapRegionValueModelsHolder[]{
            new MapRegionValueModelsHolder(
                    new MapRegionValueModel(10, R.style.SimpherolRedColor, R.style.SimpherolYellowColor, R.style.SimpherolRedColor),
                    new MapRegionValueModel(51, R.style.ChernigovRedColor, R.style.ChernigovYellowColor, R.style.ChernigovGreenColor),
                    new MapRegionValueModel(80, R.style.NicolaevRedColor, R.style.NicolaevYellowColor, R.style.NicolaevGreenColor)
            ),
            new MapRegionValueModelsHolder(
                    new MapRegionValueModel(9, R.style.SimpherolRedColor, R.style.SimpherolYellowColor, R.style.SimpherolRedColor),
                    new MapRegionValueModel(2, R.style.ChernigovRedColor, R.style.ChernigovYellowColor, R.style.ChernigovGreenColor),
                    new MapRegionValueModel(14, R.style.NicolaevRedColor, R.style.NicolaevYellowColor, R.style.NicolaevGreenColor)
            ),
            new MapRegionValueModelsHolder(
                    new MapRegionValueModel(0, R.style.SimpherolRedColor, R.style.SimpherolYellowColor, R.style.SimpherolRedColor),
                    new MapRegionValueModel(4, R.style.ChernigovRedColor, R.style.ChernigovYellowColor, R.style.ChernigovGreenColor),
                    new MapRegionValueModel(9, R.style.NicolaevRedColor, R.style.NicolaevYellowColor, R.style.NicolaevGreenColor)
            ),
            new MapRegionValueModelsHolder(
                    new MapRegionValueModel(3, R.style.SimpherolRedColor, R.style.SimpherolYellowColor, R.style.SimpherolRedColor),
                    new MapRegionValueModel(11, R.style.ChernigovRedColor, R.style.ChernigovYellowColor, R.style.ChernigovGreenColor),
                    new MapRegionValueModel(15, R.style.NicolaevRedColor, R.style.NicolaevYellowColor, R.style.NicolaevGreenColor)
            ),
            new MapRegionValueModelsHolder(
                    new MapRegionValueModel(43, R.style.SimpherolRedColor, R.style.SimpherolYellowColor, R.style.SimpherolRedColor),
                    new MapRegionValueModel(176, R.style.ChernigovRedColor, R.style.ChernigovYellowColor, R.style.ChernigovGreenColor),
                    new MapRegionValueModel(200, R.style.NicolaevRedColor, R.style.NicolaevYellowColor, R.style.NicolaevGreenColor)
            ),
            new MapRegionValueModelsHolder(
                    new MapRegionValueModel(10, R.style.SimpherolRedColor, R.style.SimpherolYellowColor, R.style.SimpherolRedColor),
                    new MapRegionValueModel(10, R.style.ChernigovRedColor, R.style.ChernigovYellowColor, R.style.ChernigovGreenColor),
                    new MapRegionValueModel(5, R.style.NicolaevRedColor, R.style.NicolaevYellowColor, R.style.NicolaevGreenColor)
            ),
            new MapRegionValueModelsHolder(
                    new MapRegionValueModel(4, R.style.SimpherolRedColor, R.style.SimpherolYellowColor, R.style.SimpherolRedColor),
                    new MapRegionValueModel(4, R.style.ChernigovRedColor, R.style.ChernigovYellowColor, R.style.ChernigovGreenColor),
                    new MapRegionValueModel(8, R.style.NicolaevRedColor, R.style.NicolaevYellowColor, R.style.NicolaevGreenColor)
            )
    };
}
