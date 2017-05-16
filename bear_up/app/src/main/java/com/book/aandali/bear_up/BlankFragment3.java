package com.book.aandali.bear_up;


import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment3 extends DialogFragment{

    String[] songs={"輕音樂1","輕音樂2","輕音樂3"};
    int[]  imgbtn={R.drawable.ic_menu_gallery,R.drawable.ic_menu_camera};
    ListView listView;

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

       listView=(ListView) view.findViewById(R.id.list);
        Adapter adapter=new Ada
       // ArrayAdapter<String> ListViewAdapter=new ArrayAdapter<String>(getActivity(),songs,imgbtn);
        listView.setAdapter(adapter);
        listView.setOnClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int pos, long id) {
                Toast.makeText(getActivity(),songs[pos],Toast.LENGTH_SHORT).show();
            }


           });
        return view;
    }

}
