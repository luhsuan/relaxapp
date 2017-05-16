package com.book.aandali.bear_up;


import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment3 extends Fragment {


    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    public BlankFragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_blank3, container, false);
        String[] menuitem={"輕音樂1","輕音樂2","輕音樂3"};
        ListView listView=(ListView) view.findViewById(R.id.list);
        ArrayAdapter<String> ListViewAdapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,menuitem);
        listView.setAdapter(ListViewAdapter);
        return view;
    }

}
