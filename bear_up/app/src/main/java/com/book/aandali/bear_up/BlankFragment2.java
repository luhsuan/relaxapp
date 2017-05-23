package com.book.aandali.bear_up;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment2 extends Fragment {

    public static BlankFragment2 newInstance(int instance) {
        Bundle args = new Bundle();
        args.putInt("argsInstance", instance);
        BlankFragment2 firstFragment = new BlankFragment2();
        firstFragment.setArguments(args);
        return firstFragment;
    }


    public BlankFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank2, container, false);
    }

}
