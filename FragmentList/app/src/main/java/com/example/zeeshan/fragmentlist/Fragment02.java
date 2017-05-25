package com.example.zeeshan.fragmentlist;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment02 extends Fragment {
    View rootView;
    MainActivity activity = (MainActivity) getActivity();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /** Inflating the layout for this fragment **/
        rootView = inflater.inflate(R.layout.my_fragment02, container, false);

        return rootView;
    }
}