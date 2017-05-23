package com.book.aandali.bear_up;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment4 extends Fragment {

    public static BlankFragment4 newInstance(int instance) {
        Bundle args = new Bundle();
        args.putInt("argsInstance", instance);
        BlankFragment4 firstFragment = new BlankFragment4();
        firstFragment.setArguments(args);
        return firstFragment;
    }


    public BlankFragment4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blankt4, container, false);
    }

}
