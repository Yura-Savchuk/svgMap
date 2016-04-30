package com.coulddog.svgmap.fragment;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import com.coulddog.svgmap.R;
import com.coulddog.svgmap.activity.SelectedMapItem;
import com.coulddog.svgmap.support.DataBaseEmulation;

/**
 * Created by macbookpro on 25.04.16.
 */
public class ControlsFragment extends Fragment {

    private Spinner spinner;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.controls_fragment, container, false);
        spinner = (Spinner) rootView.findViewById(R.id.spinner);
        String [] elements = new String[DataBaseEmulation.mapRegionValueModelsHolders.length];
        for (int i = 0; i<elements.length; i++) {
            elements[i] = "item " + i;
        }
        spinner.setAdapter(new ArrayAdapter<String>(getContext(), R.layout.spinner_layout_item, elements));
        spinner.setOnItemSelectedListener(onItemSelectedListener);
        return rootView;
    }

    AdapterView.OnItemSelectedListener onItemSelectedListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            if (getActivity() instanceof SelectedMapItem) {
                ((SelectedMapItem) getActivity()).onSelectedMapItem(i);
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

}
