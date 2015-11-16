package com.krp.android.navigationdrawer;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by purushottam.kumar on 11/6/2015.
 */
public class MainDrawerFragment extends Fragment {
    public static final String TAG = MainDrawerFragment.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main_drawer, container, false);

        View fab = rootView.findViewById(R.id.fab);
        fab.setTag(TAG);
        fab.setOnClickListener((View.OnClickListener) getActivity());
        return rootView;
    }
}
