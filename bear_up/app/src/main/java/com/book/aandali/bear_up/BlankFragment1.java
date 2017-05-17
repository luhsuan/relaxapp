package com.book.aandali.bear_up;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */


public class BlankFragment1 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ListView listView;
        View view=inflater.inflate(R.layout.fragment_blank, container, false);
        listView=(ListView) view.findViewById(R.id.list1);
        String[] songs={"輕音樂1","輕音樂2","輕音樂3"};

        //voice adapter=new voice(getActivity(),songs);
        ArrayAdapter<String> listViewAdapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,songs);
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(),songs[position],Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_blank, container, false);
//    }




}