package com.coulddog.svgmap;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

/**
 * Created by macbookpro on 25.04.16.
 */
public class ControlsFragment extends Fragment {

    private static final String[] elements = new String[]{"First","Second","Third","Fourth","Five"};
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
        spinner.setAdapter(new ArrayAdapter<String>(getContext(), R.layout.spinner_layout_item, elements));
        return rootView;
    }

}
