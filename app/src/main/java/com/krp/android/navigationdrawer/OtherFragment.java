package com.krp.android.navigationdrawer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by purushottam.kumar on 11/16/2015.
 */
public class OtherFragment extends Fragment {
    public static final String TAG = OtherFragment.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        TextView titleView = (TextView) rootView.findViewById(R.id.title);
        titleView.setText("Other Fragment");

        View fab = rootView.findViewById(R.id.fab);
        fab.setTag(TAG);
        fab.setOnClickListener((View.OnClickListener) getActivity());
        return rootView;
    }
}
